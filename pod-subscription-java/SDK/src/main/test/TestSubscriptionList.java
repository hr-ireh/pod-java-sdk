import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.controller.PodSubscription;
import com.fanap.podSubscription.data.modelSrv.SubscriptionFullSrv;
import com.fanap.podSubscription.data.modelVo.BaseInfoVo;
import com.fanap.podSubscription.data.modelVo.ResultVo;
import com.fanap.podSubscription.data.modelVo.SubscriptionListVo;
import com.fanap.podSubscription.util.OnGetResponseListener;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by zahra.Gholinia on 11/16/2019.
 */

public class TestSubscriptionList {
    private static String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void subscriptionList_AllParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();


        try {
            SubscriptionListVo subscriptionListVo = new SubscriptionListVo.Builder(baseInfoVo)
                    .setOffset(0L)
                    .setSize(100L)
                    .setSubscriptionPlanId(626L)
                    .build();
            podSubscription.subscriptionList(subscriptionListVo, new OnGetResponseListener<List<SubscriptionFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    new Thread(() -> {
                        try {
                            assertEquals(626, result.getResult().get(0).getPlan().getId());
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
    public void subscriptionList_SomeRequiredParameters_Offset() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();


        try {
            SubscriptionListVo subscriptionListVo = new SubscriptionListVo.Builder(baseInfoVo)
                    .setSize(100L)
                    .setSubscriptionPlanId(41L)
                    .build();
            podSubscription.subscriptionList(subscriptionListVo, new OnGetResponseListener<List<SubscriptionFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
    public void subscriptionList_SomeRequiredParameters_Size() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();


        try {
            SubscriptionListVo subscriptionListVo = new SubscriptionListVo.Builder(baseInfoVo)
                    .setOffset(0L)
                    .setSubscriptionPlanId(41L)
                    .build();
            podSubscription.subscriptionList(subscriptionListVo, new OnGetResponseListener<List<SubscriptionFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
    public void subscriptionList_SomeRequiredParameters_SubscriptionPlanId() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();


        try {
            SubscriptionListVo subscriptionListVo = new SubscriptionListVo.Builder(baseInfoVo)
                    .setOffset(0L)
                    .setSize(100L)
                    .build();
            podSubscription.subscriptionList(subscriptionListVo, new OnGetResponseListener<List<SubscriptionFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
    public void subscriptionList_NoParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodSubscription podSubscription = new PodSubscription();


        try {
            SubscriptionListVo subscriptionListVo = new SubscriptionListVo.Builder(baseInfoVo)
                    .build();
            podSubscription.subscriptionList(subscriptionListVo, new OnGetResponseListener<List<SubscriptionFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
