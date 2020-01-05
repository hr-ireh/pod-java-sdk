import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.controller.PodSubscription;
import com.fanap.podSubscription.data.modelSrv.SubscriptionSrv;
import com.fanap.podSubscription.data.modelVo.BaseInfoVo;
import com.fanap.podSubscription.data.modelVo.ConsumeSubscriptionVo;
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

public class TestConsumeSubscription {
    private static String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void consumeSubscription_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription billingService = new PodSubscription();

        try {
            ConsumeSubscriptionVo ConsumeSubscriptionVo = new ConsumeSubscriptionVo.Builder(baseInfoVo)
                    .setId(1574L)
                    .build();
            billingService.consumeSubscription(ConsumeSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals("نام پلن", result.getResult().getPlan().getName());
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
    public void consumeSubscription_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription billingService = new PodSubscription();

        try {
            ConsumeSubscriptionVo ConsumeSubscriptionVo = new ConsumeSubscriptionVo.Builder(baseInfoVo)
                    .setId(1574L)
                    .setUsedAmount(100L)
                    .build();
            billingService.consumeSubscription(ConsumeSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals("نام پلن", result.getResult().getPlan().getName());
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
    public void consumeSubscription_SomeRequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription billingService = new PodSubscription();

        try {
            ConsumeSubscriptionVo ConsumeSubscriptionVo = new ConsumeSubscriptionVo.Builder(baseInfoVo)
                    .setUsedAmount(100L)
                    .build();
            billingService.consumeSubscription(ConsumeSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
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
    public void consumeSubscription_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodSubscription billingService = new PodSubscription();

        try {
            ConsumeSubscriptionVo ConsumeSubscriptionVo = new ConsumeSubscriptionVo.Builder(baseInfoVo)
                    .setUsedAmount(100L)
                    .build();
            billingService.consumeSubscription(ConsumeSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
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
