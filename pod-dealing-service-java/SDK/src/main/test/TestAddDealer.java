import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.BusinessDealerSrv;
import com.fanap.podDealing.data.modelVo.AddDealerVo;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
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

public class TestAddDealer {

    public final String TOKEN = "2bf53fedbd8a4e07ba73fe21e4e70cda";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void addDealer_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            AddDealerVo addDealerVo = new AddDealerVo.Builder(baseInfoVo)
                    .setDealerBizId(9364L)
                    .build();
            podDealing.addDealer(addDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(11564, result.getResult().getBusiness().getId());
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
    public void addDealer_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            AddDealerVo addDealerVo = new AddDealerVo.Builder(baseInfoVo)
                    .setDealerBizId(9364L)
                    .setAllProductAllow(true)
                    .build();
            podDealing.addDealer(addDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(11564, result.getResult().getBusiness().getId());
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
    public void addDealer_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            AddDealerVo addDealerVo = new AddDealerVo.Builder(baseInfoVo)
                    .build();
            podDealing.addDealer(addDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
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
    public void addDealer_SomeRequiredParameters_DealerBizId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            AddDealerVo addDealerVo = new AddDealerVo.Builder(baseInfoVo)
                    .build();
            podDealing.addDealer(addDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
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
