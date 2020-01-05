import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.controller.PodSubscription;
import com.fanap.podSubscription.data.modelSrv.SubscriptionPlanSrv;
import com.fanap.podSubscription.data.modelVo.AddSubscriptionPlanVo;
import com.fanap.podSubscription.data.modelVo.BaseInfoVo;
import com.fanap.podSubscription.data.modelVo.ResultVo;
import com.fanap.podSubscription.enums.Enum_Period_Type_Code;
import com.fanap.podSubscription.enums.Enum_Type;
import com.fanap.podSubscription.util.OnGetResponseListener;
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

public class TestAddSubscriptionPlan {
    private static String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";
    private static String GUILD_CODE = "ENGINEERING_GUILD";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void addSubscriptionPlan_RequiredParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();

        List<Long> permittedBussinessId = new ArrayList<>();
        permittedBussinessId.add(9343L);


        try {
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(3L)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setEntityId(29808L)
                    .setName("نام پلن")
                    .setPrice(new BigDecimal(1))
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_DAILY.getPeriodTypeCode())
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setGuildCode(GUILD_CODE)
                    .setCurrencyCode("IRR")
                    .build();
            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals("نام پلن", result.getResult().getName());
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
    public void addSubscriptionPlan_AllParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add("FOOD_GUILD");

        List<Long> permittedBussinessId = new ArrayList<>();
        permittedBussinessId.add(9343L);

        List<Long> permittedProductId = new ArrayList<>();
        permittedProductId.add(22138L);

        try {
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedProductId(permittedProductId)
                    .setEntityId(29808L)
                    .setName("نام پلن")
                    .setPrice(new BigDecimal(1))
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setGuildCode(GUILD_CODE)
                    .setCurrencyCode("IRR")
                    .setUsageAmountLimit(1000000L)
                    .setUsageCountLimit(100L)
                    .build();
            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals("نام پلن", result.getResult().getName());
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
    public void addSubscriptionPlan_NoParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodSubscription podSubscription = new PodSubscription();
        try {
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .build();
            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void addSubscriptionPlan_SomeRequiredParameters_PeriodTypeCode() {

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
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedProductId(permittedProductId)
                    .setEntityId(16263L)
                    .setName("نام پلن")
                    .setPrice(new BigDecimal(1))
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setGuildCode(GUILD_CODE)
                    .setCurrencyCode("IRR")
                    .setUsageAmountLimit(1000000L)
                    .setUsageCountLimit(100L)
                    .build();
            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void addSubscriptionPlan__SomeRequiredParameters_PermittedBusinessId() {

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
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedProductId(permittedProductId)
                    .setEntityId(16263L)
                    .setName("نام پلن")
                    .setPrice(new BigDecimal(1))
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setGuildCode(GUILD_CODE)
                    .setCurrencyCode("IRR")
                    .setUsageAmountLimit(1000000L)
                    .setUsageCountLimit(100L)
                    .build();

            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void addSubscriptionPlan__SomeRequiredParameters_EntityId() {

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
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedProductId(permittedProductId)
                    .setName("نام پلن")
                    .setPrice(new BigDecimal(1))
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setGuildCode(GUILD_CODE)
                    .setCurrencyCode("IRR")
                    .setUsageAmountLimit(1000000L)
                    .setUsageCountLimit(100L)
                    .build();


            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void addSubscriptionPlan__SomeRequiredParameters_Name() {

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
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedProductId(permittedProductId)
                    .setEntityId(16263L)
                    .setPrice(new BigDecimal(1))
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setGuildCode(GUILD_CODE)
                    .setCurrencyCode("IRR")
                    .setUsageAmountLimit(1000000L)
                    .setUsageCountLimit(100L)
                    .build();


            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void addSubscriptionPlan_SomeRequiredParameters_Price() {

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
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedProductId(permittedProductId)
                    .setEntityId(16263L)
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setGuildCode(GUILD_CODE)
                    .setCurrencyCode("IRR")
                    .setUsageAmountLimit(1000000L)
                    .setUsageCountLimit(100L)
                    .build();


            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void addSubscriptionPlan__SomeRequiredParameters_Type() {

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
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedProductId(permittedProductId)
                    .setEntityId(16263L)
                    .setName("نام پلن")
                    .setPrice(new BigDecimal(1))
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setGuildCode(GUILD_CODE)
                    .setCurrencyCode("IRR")
                    .setUsageAmountLimit(1000000L)
                    .setUsageCountLimit(100L)
                    .build();

            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void addSubscriptionPlan__SomeRequiredParameters_GuildCode() {

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
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedProductId(permittedProductId)
                    .setEntityId(16263L)
                    .setName("نام پلن")
                    .setPrice(new BigDecimal(1))
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setCurrencyCode("IRR")
                    .setUsageAmountLimit(1000000L)
                    .setUsageCountLimit(100L)
                    .build();


            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void addSubscriptionPlan__SomeRequiredParameters_CurrencyCode() {

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
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedProductId(permittedProductId)
                    .setEntityId(16263L)
                    .setName("نام پلن")
                    .setPrice(new BigDecimal(1))
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setGuildCode(GUILD_CODE)
                    .setUsageAmountLimit(1000000L)
                    .setUsageCountLimit(100L)
                    .build();

            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
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
