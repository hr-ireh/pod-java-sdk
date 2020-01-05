import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.BusinessSrv;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.ListUserCreatedBusinessVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
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

public class TestListUserCreatedBusiness {
    public final String TOKEN = "9dfc30b213f74c82b2e03053c338d58e";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void listUserCreatedBusiness_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<Long> permittedBizIdList = new ArrayList<>();
        permittedBizIdList.add(5204L);
        PodDealing podDealing = new PodDealing();

        try {
            ListUserCreatedBusinessVo listUserCreatedBusinessVo = new ListUserCreatedBusinessVo.Builder(baseInfoVo)
                    .build();
            podDealing.listUserCreatedBusiness(listUserCreatedBusinessVo, new OnGetResponseListener<List<BusinessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    new Thread(() -> {
                        try {
                            assertEquals(12773, result.getResult().get(0).getId());
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
    public void listUserCreatedBusiness_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<Long> permittedBizIdList = new ArrayList<>();
        permittedBizIdList.add(5204L);
        List<String> permittedGuildCode = new ArrayList<>();
        permittedGuildCode.add("FOOD_GUILD");
        PodDealing podDealing = new PodDealing();

        try {
            ListUserCreatedBusinessVo listUserCreatedBusinessVo = new ListUserCreatedBusinessVo.Builder(baseInfoVo)
//                    .setActive(false)
                    .setBizId(permittedBizIdList)
                    .setBusinessName("رضا استور")
                    .setCellphone("09375334941")
//                    .setCity("مشهد")
//                    .setCountry("ایران")
                    .setEconomicCode("1234123132")
                    .setEmail("rzzar.e@gmail.com")
                    .setGuildCode(permittedGuildCode)
                    .setNationalCode("0850177227")
                    .setOffset(0)
                    .setQuery("رضا")
                    .setSheba("510570100180013692932101")
                    .setSize(100)
                    .setSsoId("12857483")
//                    .setState("خراسان رضوی")
//                    .setTags()
//                    .setTagTrees()
                    .setUsername("re.zare.b")
                    .build();
            podDealing.listUserCreatedBusiness(listUserCreatedBusinessVo, new OnGetResponseListener<List<BusinessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessSrv>> result) {
                    System.out.println(result.getMessageId());
                    new Thread(() -> {
                        try {
                            assertEquals(0, result.getMessageId());
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
    public void listUserCreatedBusiness_SomeRequiredParameters_NationalCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<Long> permittedBizIdList = new ArrayList<>();
        permittedBizIdList.add(5204L);
        PodDealing podDealing = new PodDealing();

        try {
            ListUserCreatedBusinessVo listUserCreatedBusinessVo = new ListUserCreatedBusinessVo.Builder(baseInfoVo)
                    .setNationalCode("9875")
                    .build();
            podDealing.listUserCreatedBusiness(listUserCreatedBusinessVo, new OnGetResponseListener<List<BusinessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
    public void listUserCreatedBusiness_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodDealing podDealing = new PodDealing();

        try {
            ListUserCreatedBusinessVo listUserCreatedBusinessVo = new ListUserCreatedBusinessVo.Builder(baseInfoVo)
                    .build();
            podDealing.listUserCreatedBusiness(listUserCreatedBusinessVo, new OnGetResponseListener<List<BusinessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
