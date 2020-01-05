import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.DealerProductPermissionSrv;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.DealingProductPermissionListVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
import com.fanap.podDealing.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 11/13/2019.
 */

public class TestDealingProductPermissionList {
    @Test
//    @Order(1)
//    @DisplayName("")
    public void dealingProductPermissionList_RequiredParameters1() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            DealingProductPermissionListVo dealingProductPermissionListVo = new DealingProductPermissionListVo.Builder(baseInfoVo)
                    .build();
            podDealing.dealingProductPermissionList(dealingProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
                @Override
                public void onResponse(ResultVo<List<DealerProductPermissionSrv>> result) {
                    System.out.println(result.getResult());
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
    public void dealingProductPermissionList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            DealingProductPermissionListVo dealingProductPermissionListVo = new DealingProductPermissionListVo.Builder(baseInfoVo)
                    .setSize(50)
                    .setDealingBusinessId(9373L)
                    .setEnable(false)
                    .setEntityId(19482L)
                    .setOffset(0)
                    .build();
            podDealing.dealingProductPermissionList(dealingProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
                @Override
                public void onResponse(ResultVo<List<DealerProductPermissionSrv>> result) {
                    System.out.println(result.getResult());
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
    public void dealingProductPermissionList_NoParameters1() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            DealingProductPermissionListVo dealingProductPermissionListVo = new DealingProductPermissionListVo.Builder(baseInfoVo)
                    .build();
            podDealing.dealingProductPermissionList(dealingProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
                @Override
                public void onResponse(ResultVo<List<DealerProductPermissionSrv>> result) {
                    System.out.println(result.getResult());
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
