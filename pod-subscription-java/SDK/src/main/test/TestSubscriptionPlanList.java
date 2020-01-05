import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.controller.PodSubscription;
import com.fanap.podSubscription.data.modelSrv.SubscriptionPlanSrv;
import com.fanap.podSubscription.data.modelVo.BaseInfoVo;
import com.fanap.podSubscription.data.modelVo.ResultVo;
import com.fanap.podSubscription.data.modelVo.SubscriptionPlanListVo;
import com.fanap.podSubscription.enums.Enum_Period_Type_Code;
import com.fanap.podSubscription.enums.Enum_Type;
import com.fanap.podSubscription.util.OnGetResponseListener;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by zahra.Gholinia on 11/16/2019.
 */

public class TestSubscriptionPlanList {


    private static String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void subscriptionPlanList_RequiredParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        List<Long> permittedBussinessId = new ArrayList<>();
        permittedBussinessId.add(4131L);

        List<Long> permittedProductId = new ArrayList<>();
        permittedProductId.add(16263L);

        try {
            SubscriptionPlanListVo subscriptionPlanListVo = new SubscriptionPlanListVo.Builder(baseInfoVo)
                    .setBaseInfoVo(baseInfoVo)
                    .setOffset(0L)
                    .setSize(10L)
                    .build();
            podSubscription.subscriptionPlanList(subscriptionPlanListVo, new OnGetResponseListener<List<SubscriptionPlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionPlanSrv>> result) {
                    System.out.println(result.getResult().size());
                    new Thread(() -> {
                        try {
                            assertEquals("نام پلن", result.getResult().get(0).getName());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @Order(1)
//    @DisplayName("")
    public void subscriptionPlanList_AllParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        List<Long> permittedBussinessId = new ArrayList<>();
        permittedBussinessId.add(4131L);

        List<Long> permittedProductId = new ArrayList<>();
        permittedProductId.add(16263L);

        try {
            SubscriptionPlanListVo subscriptionPlanListVo = new SubscriptionPlanListVo.Builder(baseInfoVo)
                    .setBaseInfoVo(baseInfoVo)
                    .setOffset(0L)
                    .setSize(10L)
                    .setCurrencyCode("1000")
                    .setEnable(true)
                    .setFromPrice(new BigDecimal(5))
                    .setId(5488L)
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setPeriodTypeCountFrom(8522L)
                    .setPeriodTypeCountTo(852L)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedProductId(permittedProductId)
                    .setToPrice(new BigDecimal(55))
                    .setTypeCode(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .build();
            podSubscription.subscriptionPlanList(subscriptionPlanListVo, new OnGetResponseListener<List<SubscriptionPlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionPlanSrv>> result) {
                    System.out.println(result.getResult().size());
                    new Thread(() -> {
                        try {
                            assertEquals(0, result.getResult().size());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @Order(1)
//    @DisplayName("")
    public void subscriptionPlanList_SomeRequiredParameters_Offset() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        List<Long> permittedBussinessId = new ArrayList<>();
        permittedBussinessId.add(4131L);

        List<Long> permittedProductId = new ArrayList<>();
        permittedProductId.add(16263L);

        try {
            SubscriptionPlanListVo subscriptionPlanListVo = new SubscriptionPlanListVo.Builder(baseInfoVo)
                    .setBaseInfoVo(baseInfoVo)
                    .setSize(10L)
                    .setCurrencyCode("1000")
                    .setEnable(true)
                    .setFromPrice(new BigDecimal(5))
                    .setId(5488L)
                    .setPeriodTypeCode("fd")
                    .setPeriodTypeCountFrom(8522L)
                    .setPeriodTypeCountTo(852L)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedProductId(permittedProductId)
                    .setToPrice(new BigDecimal(55))
                    .setTypeCode("bj")
                    .build();
            podSubscription.subscriptionPlanList(subscriptionPlanListVo, new OnGetResponseListener<List<SubscriptionPlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionPlanSrv>> result) {
                    System.out.println(result.getResult().size());
                    new Thread(() -> {
                        try {
                            fail();
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @Order(1)
//    @DisplayName("")
    public void subscriptionPlanList_SomeRequiredParameters_Size() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        List<Long> permittedBussinessId = new ArrayList<>();
        permittedBussinessId.add(4131L);

        List<Long> permittedProductId = new ArrayList<>();
        permittedProductId.add(16263L);

        try {
            SubscriptionPlanListVo subscriptionPlanListVo = new SubscriptionPlanListVo.Builder(baseInfoVo)
                    .setBaseInfoVo(baseInfoVo)
                    .setOffset(0L)
                    .setCurrencyCode("1000")
                    .setEnable(true)
                    .setFromPrice(new BigDecimal(5))
                    .setId(5488L)
                    .setPeriodTypeCode("fd")
                    .setPeriodTypeCountFrom(8522L)
                    .setPeriodTypeCountTo(852L)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedProductId(permittedProductId)
                    .setToPrice(new BigDecimal(55))
                    .setTypeCode("bj")
                    .build();
            podSubscription.subscriptionPlanList(subscriptionPlanListVo, new OnGetResponseListener<List<SubscriptionPlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionPlanSrv>> result) {
                    System.out.println(result.getResult().size());
                    new Thread(() -> {
                        try {
                            fail();
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @Order(1)
//    @DisplayName("")
    public void subscriptionPlanList_NoParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodSubscription podSubscription = new PodSubscription();

        try {
            SubscriptionPlanListVo subscriptionPlanListVo = new SubscriptionPlanListVo.Builder(baseInfoVo)
                    .build();
            podSubscription.subscriptionPlanList(subscriptionPlanListVo, new OnGetResponseListener<List<SubscriptionPlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionPlanSrv>> result) {
                    System.out.println(result.getResult().size());
                    new Thread(() -> {
                        try {
                            fail();
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
