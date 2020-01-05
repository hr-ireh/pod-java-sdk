import com.fanap.podBank.controller.PodBanking;
import com.fanap.podBank.data.modelSrv.ShebaInfoSrv;
import com.fanap.podBank.data.modelVo.BaseInfoVo;
import com.fanap.podBank.data.modelVo.GetShebaInfoVo;
import com.fanap.podBank.data.modelVo.ResultVo;
import com.fanap.podBank.util.OnGetResponseListener;
import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static com.fanap.podBaseService.util.MyOptional.countDownLatch;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 11/9/2019.
 */

public class TestGetShebaInfo {

    private static String TOKEN = "";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void getShebaInfo_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBanking podBanking = new PodBanking();
        try {
            GetShebaInfoVo getShebaInfoVo = new GetShebaInfoVo.Builder(baseInfoVo)
                    .setSheba("")
                    .build();
            podBanking.getShebaInfo(getShebaInfoVo, new OnGetResponseListener<ShebaInfoSrv>() {
                @Override
                public void onResponse(ResultVo<ShebaInfoSrv> result) {
                    System.out.println(result.getResult().getOwners().get(0).getLastName());
                    new Thread(() -> {
                        try {
                            assertEquals("510570100180013692932101", result.getResult().getSheba());
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
    public void getShebaInfo_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodBanking podBanking = new PodBanking();
        try {
            GetShebaInfoVo getShebaInfoVo = new GetShebaInfoVo.Builder(baseInfoVo)
                    .build();
            podBanking.getShebaInfo(getShebaInfoVo, new OnGetResponseListener<ShebaInfoSrv>() {
                @Override
                public void onResponse(ResultVo<ShebaInfoSrv> result) {
                    System.out.println(result.getResult().getOwners().get(0).getLastName());
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
    public void getShebaInfo_SomeRequiredParameters_Sheba() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBanking podBanking = new PodBanking();
        try {
            GetShebaInfoVo getShebaInfoVo = new GetShebaInfoVo.Builder(baseInfoVo)
                    .build();
            podBanking.getShebaInfo(getShebaInfoVo, new OnGetResponseListener<ShebaInfoSrv>() {
                @Override
                public void onResponse(ResultVo<ShebaInfoSrv> result) {
                    System.out.println(result.getResult().getOwners().get(0).getLastName());
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
