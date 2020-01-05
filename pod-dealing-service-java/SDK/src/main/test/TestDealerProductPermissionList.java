import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.DealerProductPermissionSrv;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.DealerProductPermissionListVo;
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

public class TestDealerProductPermissionList {

    @Test
//    @Order(1)
//    @DisplayName("")
    public void dealerProductPermissionList_RequiredParameters1() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("99cb42376f6d4ec8ba6bbab265c79ff1")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            DealerProductPermissionListVo dealerProductPermissionListVo = new DealerProductPermissionListVo.Builder(baseInfoVo)
                    .build();
            podDealing.dealerProductPermissionList(dealerProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    public void dealerProductPermissionList_AllParameters1() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("99cb42376f6d4ec8ba6bbab265c79ff1")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            DealerProductPermissionListVo dealerProductPermissionListVo = new DealerProductPermissionListVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .setEnable(false)
                    .setEntityId(19482L)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podDealing.dealerProductPermissionList(dealerProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    public void dealerProductPermissionList_NoParameters1() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            DealerProductPermissionListVo dealerProductPermissionListVo = new DealerProductPermissionListVo.Builder(baseInfoVo)
                    .build();
            podDealing.dealerProductPermissionList(dealerProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
