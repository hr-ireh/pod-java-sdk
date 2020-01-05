import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.DealerProductPermissionSrv;
import com.fanap.podDealing.data.modelVo.AddDealerProductPermissionVo;
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

public class TestAddDealerProductPermission {
    public final String TOKEN = "1c0898d03cef4c0a80741653aaa1b8ad";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void addDealerProductPermission_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            AddDealerProductPermissionVo addDealerProductPermissionVo = new AddDealerProductPermissionVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .setEntityId(30343L)
                    .build();
            podDealing.addDealerProductPermission(addDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
                    new Thread(() -> {
                        try {
                            assertEquals(30343, result.getResult().getProduct().getEntityId());
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
    public void addDealerProductPermission_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            AddDealerProductPermissionVo addDealerProductPermissionVo = new AddDealerProductPermissionVo.Builder(baseInfoVo)
                    .build();
            podDealing.addDealerProductPermission(addDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
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
    public void addDealerProductPermission_SomeRequiredParameters_DealerBizId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            AddDealerProductPermissionVo addDealerProductPermissionVo = new AddDealerProductPermissionVo.Builder(baseInfoVo)
                    .setEntityId(30343L)
                    .build();
            podDealing.addDealerProductPermission(addDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
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
    public void addDealerProductPermission_SomeRequiredParameters_EntityId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            AddDealerProductPermissionVo addDealerProductPermissionVo = new AddDealerProductPermissionVo.Builder(baseInfoVo)
                   .setDealerBizId(98547L)
                    .build();
            podDealing.addDealerProductPermission(addDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
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
