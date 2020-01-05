import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.BusinessApiTokenSrv;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.GetApiTokenForCreatedBusinessVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
import com.fanap.podDealing.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 11/9/2019.
 */

public class TestGetApiTokenForCreatedBusiness {
    public final String TOKEN = "c43049a626e5462ab85c0a8e4028e9fe";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void getApiTokenForCreatedBusiness_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            GetApiTokenForCreatedBusinessVo getApiTokenForCreatedBusinessVo = new GetApiTokenForCreatedBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(12564L)
                    .build();
            podDealing.getApiTokenForCreatedBusiness(getApiTokenForCreatedBusinessVo, new OnGetResponseListener<BusinessApiTokenSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessApiTokenSrv> result) {
                    System.out.println(result.getResult().getApiToken());
                    new Thread(() -> {
                        try {
                            assertEquals(12564, result.getResult().getBusiness().getId());
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
    public void getApiTokenForCreatedBusiness_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            GetApiTokenForCreatedBusinessVo getApiTokenForCreatedBusinessVo = new GetApiTokenForCreatedBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(12564L)
                    .build();
            podDealing.getApiTokenForCreatedBusiness(getApiTokenForCreatedBusinessVo, new OnGetResponseListener<BusinessApiTokenSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessApiTokenSrv> result) {
                    System.out.println(result.getResult().getApiToken());
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
    public void getApiTokenForCreatedBusiness_SomeRequiredParameters_BusinessId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            GetApiTokenForCreatedBusinessVo getApiTokenForCreatedBusinessVo = new GetApiTokenForCreatedBusinessVo.Builder(baseInfoVo)
                    .build();
            podDealing.getApiTokenForCreatedBusiness(getApiTokenForCreatedBusinessVo, new OnGetResponseListener<BusinessApiTokenSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessApiTokenSrv> result) {
                    System.out.println(result.getResult().getApiToken());
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
