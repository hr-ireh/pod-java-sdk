import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.controller.PodSubscription;
import com.fanap.podSubscription.data.modelSrv.SubscriptionSrv;
import com.fanap.podSubscription.data.modelVo.BaseInfoVo;
import com.fanap.podSubscription.data.modelVo.ConfirmSubscriptionVo;
import com.fanap.podSubscription.data.modelVo.ResultVo;
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

public class TestConfirmSubscription {
    private static String TOKEN = "004ad4f37900410f9f15caae9a62a87b";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void confirmSubscription_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();
        try {
            ConfirmSubscriptionVo confirmSubscriptionVo = new ConfirmSubscriptionVo.Builder(baseInfoVo)
                    .setSubscriptionId(1574L)
                    .setCode(2000729L)
                    .build();
            podSubscription.confirmSubscription(confirmSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(1574, result.getResult().getId());
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
    public void confirmSubscription_SomeRequiredParameters_SubscriptionId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();
        try {
            ConfirmSubscriptionVo confirmSubscriptionVo = new ConfirmSubscriptionVo.Builder(baseInfoVo)
                    .setCode(2000968L)
                    .build();
            podSubscription.confirmSubscription(confirmSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
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
    public void confirmSubscription_SomeRequiredParameters_Code() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription podSubscription = new PodSubscription();
        try {
            ConfirmSubscriptionVo confirmSubscriptionVo = new ConfirmSubscriptionVo.Builder(baseInfoVo)
                    .setSubscriptionId(444L)
                    .build();
            podSubscription.confirmSubscription(confirmSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
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
    public void confirmSubscription_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodSubscription podSubscription = new PodSubscription();
        try {
            ConfirmSubscriptionVo confirmSubscriptionVo = new ConfirmSubscriptionVo.Builder(baseInfoVo)
                    .build();
            podSubscription.confirmSubscription(confirmSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
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
