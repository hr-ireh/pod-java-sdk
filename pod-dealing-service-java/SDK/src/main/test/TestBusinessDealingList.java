import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.BusinessDealerSrv;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.BusinessDealingListVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
import com.fanap.podDealing.util.OnGetResponseListener;
import org.junit.jupiter.api.Assertions;
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

public class TestBusinessDealingList {

    public final String TOKEN = "9a36df05377e45fb943d22543996498c";


    @Test
//    @Order(1)
//    @DisplayName("")
    public void businessDealingList_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            BusinessDealingListVo businessDealingListVo = new BusinessDealingListVo.Builder(baseInfoVo)
                    .build();
            podDealing.businessDealingList(businessDealingListVo, new OnGetResponseListener<List<BusinessDealerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessDealerSrv>> result) {
                    System.out.println(result.getResult().size());
                    new Thread(() -> {
                        try {
                            Assertions.assertEquals("رضا استور شماره 7", result.getResult().get(0).getBusiness().getName());
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
    public void businessDealingList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            BusinessDealingListVo businessDealingListVo = new BusinessDealingListVo.Builder(baseInfoVo)
                    .setDealingBusinessId(9373L)
                    .setEnable(false)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podDealing.businessDealingList(businessDealingListVo, new OnGetResponseListener<List<BusinessDealerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessDealerSrv>> result) {
                    System.out.println(result.getResult().size());

                    try {
                        Assertions.assertEquals(0, result.getResult().size());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();

                }

                @Override
                public void onFailed(PodException e) {

                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();


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
    public void businessDealingList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            BusinessDealingListVo businessDealingListVo = new BusinessDealingListVo.Builder(baseInfoVo)
                    .build();
            podDealing.businessDealingList(businessDealingListVo, new OnGetResponseListener<List<BusinessDealerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessDealerSrv>> result) {
                    System.out.println(result.getResult().size());
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
