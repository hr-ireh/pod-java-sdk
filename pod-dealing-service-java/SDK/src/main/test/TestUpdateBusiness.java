import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.BusinessSrv;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
import com.fanap.podDealing.data.modelVo.UpdateBusinessVo;
import com.fanap.podDealing.util.OnGetResponseListener;
import com.mifmif.common.regex.Generex;
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

public class TestUpdateBusiness {
    public final String TOKEN = "9dfc30b213f74c82b2e03053c338d58e";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void updateBusiness_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(12773L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
//                    .setScVoucherHash(scVoucherHashs)
//                    .setTags(tags)
//                    .setTagTrees(tagTrees)
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(randomStr, result.getResult().getName());
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
    public void updateBusiness_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();

        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(12773L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentCellphoneNumber("09154961631")
                    .setAgentFirstName("استارت آپ")
                    .setAgentLastName("رضا")
                    .setAgentNationalCode("0850255258")
                    .setCellphone("09157894565")
                    .setChangeAgent(true)
                    .setChangeCover(true)
                    .setChangeLogo(false)
                    .setCompanyName("استور رضا")
                    .setCoverImage("https://images.unsplash.com/photo-1470549638415-0a0755be0619?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80")
                    .setDateEstablishing("1376/06/24")
                    .setEconomicCode("TestListUserCreatedBusiness")
                    .setEmail("biiz.biz@gmail.com")
                    .setFax("89770000")
                    .setFirstName("زهرا")
                    .setLastName("شکاری")
                    .setLat("36.299666")
                    .setLng("59.54698")
                    .setLink("https://www.freelogoservices.com")
                    .setLogoImage("https://www.freelogoservices.com/api/main/images/1j+ojVVCOMkX9Wyrexe4hGfa37SW8BVCjkKUgzNtaTFN...Q9ukCA7w6wytLhuJxwF51cIixEJc8Er2XokD8lI018m8j4=")
                    .setNationalCode("0850459587")
                    .setPhone("66258396")
                    .setPostalCode("9771964733")
                    .setRegistrationNumber("jfgjg")
                    .setSheba("510570100180013692932101")
                    .setShopName("مغازه رضا خان")
                    .setShopNameEn(" jgfj")
                    .setWebsite("https://www.freelogoservices.com")
//                    .setTagTrees(tagTrees)
//                    .setTags(tags)
//                    .setTagTreeCategoryName("محصولات دیجیتال")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(randomStr, result.getResult().getName());
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
    public void updateBusiness_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodDealing podDealing = new PodDealing();
        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_Sheba() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setSheba("852")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_NationalCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_Cellphone() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setCellphone("9154965")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_Phone() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setPhone("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_Fax() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setFax("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_PostalCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setPostalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_AgentCellphoneNumber() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentCellphoneNumber("91586254")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_AgentNationalCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_BizId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_BusinessName() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_GuildCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_Country() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_State() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_City() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_Address() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setDescription("it")
                    .setAgentNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateBusiness_SomeRequiredParameters_Description() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName(randomStr)
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setAgentNationalCode("985")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
