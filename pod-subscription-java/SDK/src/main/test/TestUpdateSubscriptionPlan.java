import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.controller.PodSubscription;
import com.fanap.podSubscription.data.modelSrv.SubscriptionPlanSrv;
import com.fanap.podSubscription.data.modelVo.BaseInfoVo;
import com.fanap.podSubscription.data.modelVo.ResultVo;
import com.fanap.podSubscription.data.modelVo.UpdateSubscriptionPlanVo;
import com.fanap.podSubscription.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Created by zahra.Gholinia on 11/16/2019.
 */

public class TestUpdateSubscriptionPlan {

    private static String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void updateSubscriptionPlan_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodSubscription podSubscription = new PodSubscription();

        try {
            UpdateSubscriptionPlanVo UpdateSubscriptionPlanVo = new UpdateSubscriptionPlanVo.Builder(baseInfoVo)
                    .setId(162L)
                    .setPeriodTypeCount(2L)
                    .setPeriodTypeCode("SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY")
                    .setEnable("true")
                    .setName("zahra")
                    .setPrice(10000L)
                    .setUsageCountLimit(3L)
                    .build();
            podSubscription.updateSubscriptionPlan(UpdateSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getPeriodTypeCode());
                    new Thread(() -> {
                        try {
                            assertEquals("zahra", result.getResult().getName());
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
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    @Test
//    @Order(1)
//    @DisplayName("")
    public void updateSubscriptionPlan_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodSubscription podSubscription = new PodSubscription();

        try {
            UpdateSubscriptionPlanVo UpdateSubscriptionPlanVo = new UpdateSubscriptionPlanVo.Builder(baseInfoVo)
                    .setId(162L)
                    .build();
            podSubscription.updateSubscriptionPlan(UpdateSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getPeriodTypeCode());
                    new Thread(() -> {
                        try {
                            assertEquals("zahra", result.getResult().getName());
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
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    @Test
//    @Order(1)
//    @DisplayName("")
    public void updateSubscriptionPlan_SomeRequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodSubscription podSubscription = new PodSubscription();

        try {
            UpdateSubscriptionPlanVo UpdateSubscriptionPlanVo = new UpdateSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(2L)
                    .setPeriodTypeCode("SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY")
                    .setEnable("true")
                    .setName("zahra")
                    .setPrice(10000L)
                    .setUsageCountLimit(3L)
                    .build();
            podSubscription.updateSubscriptionPlan(UpdateSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getPeriodTypeCode());
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
    public void updateSubscriptionPlan_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSubscription podSubscription = new PodSubscription();

        try {
            UpdateSubscriptionPlanVo UpdateSubscriptionPlanVo = new UpdateSubscriptionPlanVo.Builder(baseInfoVo)
                    .build();
            podSubscription.updateSubscriptionPlan(UpdateSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getPeriodTypeCode());
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
