import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.BusinessDealerSrv;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.EnableDealerVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
import com.fanap.podDealing.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 11/13/2019.
 */

public class TestEnableDealer {


    @Test
//    @Order(1)
//    @DisplayName("")
    public void enableDealer_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            EnableDealerVo enableDealerVo = new EnableDealerVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .build();
            podDealing.enableDealer(enableDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(9373, result.getResult().getDealer().getId());
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
    public void enableDealer_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            EnableDealerVo enableDealerVo = new EnableDealerVo.Builder(baseInfoVo)
                    .build();
            podDealing.enableDealer(enableDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
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
    public void enableDealer_SomeRequiredParameters_DealerBizId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            EnableDealerVo enableDealerVo = new EnableDealerVo.Builder(baseInfoVo)
                    .build();
            podDealing.enableDealer(enableDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
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
