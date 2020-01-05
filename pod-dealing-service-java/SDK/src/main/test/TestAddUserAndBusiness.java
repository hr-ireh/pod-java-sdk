import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.BusinessSrv;
import com.fanap.podDealing.data.modelVo.AddUserAndBusinessVo;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
import com.fanap.podDealing.util.OnGetResponseListener;
import com.mifmif.common.regex.Generex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 11/9/2019.
 */

public class TestAddUserAndBusiness {
    public final String TOKEN = "9dfc30b213f74c82b2e03053c338d58e";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void addUserAndBusiness_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername(randomStr)
                    .setBusinessName(randomStr)
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            Assertions.assertEquals(randomStr, result.getResult().getName());
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
    public void addUserAndBusiness_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        String[] tags = {"tags1", "tags2"};
        permittedGuildCodeList.add(GUILD_CODE);
        Generex generex = new Generex("[0-4]([a-c][e-g]{3,10})");
        String randomStr = generex.random();

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername(randomStr)
                    .setBusinessName(randomStr)
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setAgentNationalCode("0860103722")
                    .setCellphone("09158102505")
                    .setCoverImage("https://images.unsplash.com/photo-1531675973208-3e54d1732662?ixlib=rb-1.2.1%26ixid=eyJhcHBfaWQiOjEyMDd9%26auto=format%26fit=crop%26w=634%26q=80")
                    .setEconomicCode("1234123132")
                    .setFax("89770000")
                    .setFirstName("استارت آپ")
                    .setLastName("رضا خان")
                    .setLat("36.299666")
                    .setLng("59.54698")
                    .setLink("https://www.freelogoservices.com")
                    .setLogoImage("https://www.freelogoservices.com/api/main/images/1j+ojVVCOMkX9Wyrexe4hGfa37SW8BVCjkKUgzNtaTFN...Q9ukCA7w6wytLhuJxwF51cIixEJc8Er2XokD8lI018m8j4=")
                    .setNationalCode("0850178114")
                    .setNewsReader(false)
                    .setPhone("66258396")
                    .setPostalCode("9771964733")
                    .setRegistrationNumber("4545")
                    .setSheba("510570100180013692932101")
//                    .setTags(tags)
//                    .setTagTreeCategoryName("")
//                    .setTagTrees("")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getName());
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
    public void addUserAndBusiness_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodDealing podDealing = new PodDealing();

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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


    @Test
//    @Order(1)
//    @DisplayName("")
    public void addUserAndBusiness_SomeRequiredParameters_AgentCellphoneNumber() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername(generatedString)
                    .setBusinessName(generatedString)
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154931")
                    .setGuildCode(permittedGuildCodeList)
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_Phone() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername(generatedString)
                    .setBusinessName(generatedString)
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_PostalCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername(generatedString)
                    .setBusinessName(generatedString)
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPostalCode("55")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_NationalCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername(generatedString)
                    .setBusinessName(generatedString)
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setNationalCode("985")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_Cellphone() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername(generatedString)
                    .setBusinessName(generatedString)
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setCellphone("915485")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_Fax() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername(generatedString)
                    .setBusinessName(generatedString)
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setFax("985")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_AgentNationalCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername(generatedString)
                    .setBusinessName(generatedString)
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setAgentNationalCode("985")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_Username() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setBusinessName("generatedString")
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_BusinessName() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_Email() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_GuildCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setPhone("985")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_Country() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setEmail("biiz.biz@gmail.com")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_State() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setEmail("biiz.biz@gmail.com")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .setCountry("iran")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_City() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setEmail("biiz.biz@gmail.com")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .setCountry("iran")
                    .setState("khorasan")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_Address() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setEmail("biiz.biz@gmail.com")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_Description() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setEmail("biiz.biz@gmail.com")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_AgentFirstName() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setEmail("biiz.biz@gmail.com")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("hiiii")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_SomeRequiredParameters_AgentLastName() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setEmail("biiz.biz@gmail.com")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("hiiii")
                    .setAgentFirstName("bizzzz")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void addUserAndBusiness_RequiredParameters_AgentCellphoneNumber() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("fgfg")
                    .setBusinessName("gdf")
                    .setEmail("biiz.biz@gmail.com")
                    .setGuildCode(permittedGuildCodeList)
                    .setPhone("985")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("hiiii")
                    .setAgentFirstName("bizzzz")
                    .setAgentLastName("ziiiib")
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
