import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.UserBusinessInfoSrv;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
import com.fanap.podDealing.data.modelVo.UserBusinessInfosVo;
import com.fanap.podDealing.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 11/9/2019.
 */

public class TestUserBusinessInfos {
    public final String TOKEN = "9dfc30b213f74c82b2e03053c338d58e";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void userBusinessInfos_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<Long> permittedIdList = new ArrayList<>();
        permittedIdList.add(5188L);
        PodDealing podDealing = new PodDealing();


        try {
            UserBusinessInfosVo userBusinessInfosVo = new UserBusinessInfosVo.Builder(baseInfoVo)
                    .setId(permittedIdList)
                    .build();
            podDealing.userBusinessInfos(userBusinessInfosVo, new OnGetResponseListener<List<UserBusinessInfoSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserBusinessInfoSrv>> result) {
                    System.out.println(result.getResult().get(0).getRate().getRate());
                    new Thread(() -> {
                        try {
                            assertEquals(0.0, result.getResult().get(0).getRate().getRate());
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
    public void userBusinessInfos_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodDealing podDealing = new PodDealing();


        try {
            UserBusinessInfosVo userBusinessInfosVo = new UserBusinessInfosVo.Builder(baseInfoVo)
                    .build();
            podDealing.userBusinessInfos(userBusinessInfosVo, new OnGetResponseListener<List<UserBusinessInfoSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserBusinessInfoSrv>> result) {
                    System.out.println(result.getResult().get(0).getRate().getRate());
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
    public void userBusinessInfos_SomeRequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodDealing podDealing = new PodDealing();


        try {
            UserBusinessInfosVo userBusinessInfosVo = new UserBusinessInfosVo.Builder(baseInfoVo)
                    .build();
            podDealing.userBusinessInfos(userBusinessInfosVo, new OnGetResponseListener<List<UserBusinessInfoSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserBusinessInfoSrv>> result) {
                    System.out.println(result.getResult().get(0).getRate().getRate());
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
