package com.fanap.podBaseService;

import com.fanap.podBaseService.controller.PodBaseService;
import com.fanap.podBaseService.data.modelSrv.TagTreeCategorySrv;
import com.fanap.podBaseService.data.modelVo.AddTagTreeCategoryVo;
import com.fanap.podBaseService.data.modelVo.BaseInfoVo;
import com.fanap.podBaseService.data.modelVo.ResultVo;
import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.OnGetResponseListener;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.opentest4j.AssertionFailedError;

import java.nio.charset.Charset;
import java.util.Optional;
import java.util.Random;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestAddTagTreeCategory {
    private final String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";
    @Rule
    public final TestRule globalTimeout = Timeout.millis(20000);


    @Test
    @Order(1)
//    @DisplayName("")
    public void addTagTreeCategory_AllParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        try {
            AddTagTreeCategoryVo addTagTreeCategoryVo = new AddTagTreeCategoryVo.Builder(baseInfoVo)
                    .setName(generatedString)
                    .setDesc("توضیحاتدستهندی")
                    .build();
            podBaseService.addTagTreeCategory(addTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
                    new Thread(() -> {
                        try {
                            assertEquals(generatedString, result.getResult().getName());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }


                @Disabled
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
    @Order(2)
//    @DisplayName("")
    public void addTagTreeCategory_RequiredParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        try {
            AddTagTreeCategoryVo addTagTreeCategoryVo = new AddTagTreeCategoryVo.Builder(baseInfoVo)
                    .setName(generatedString)
                    .build();
            podBaseService.addTagTreeCategory(addTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(generatedString, result.getResult().getName());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }


                @Disabled
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
    @Order(3)
//    @DisplayName("")
    public void addTagTreeCategory_RepetitiousName() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();
        final int[] errorCode = new int[1];


        try {
            AddTagTreeCategoryVo addTagTreeCategoryVo = new AddTagTreeCategoryVo.Builder(baseInfoVo)
                    .setName("نامدستهبندی1")
                    .build();
            podBaseService.addTagTreeCategory(addTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
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
                    try {
                        assertEquals(193, e.getCode());
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
    @Order(4)
//    @DisplayName("")
    public void addTagTreeCategory_SomeRequiredParameters_Name() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();


        try {
            AddTagTreeCategoryVo addTagTreeCategoryVo = new AddTagTreeCategoryVo.Builder(baseInfoVo)
                    .build();
            podBaseService.addTagTreeCategory(addTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
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
    @Order(5)
//    @DisplayName("")
    public void addTagTreeCategory_NoParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodBaseService podBaseService = new PodBaseService();


        try {
            AddTagTreeCategoryVo addTagTreeCategoryVo = new AddTagTreeCategoryVo.Builder(baseInfoVo)
                    .build();
            podBaseService.addTagTreeCategory(addTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
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
    @Order(6)
//    @DisplayName("")
    public void addTagTreeCategory_InvalidParameters_Token() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("TOKEN")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            AddTagTreeCategoryVo addTagTreeCategoryVo = new AddTagTreeCategoryVo.Builder(baseInfoVo)
                    .setName("نامدستهبندی1")
                    .build();
            podBaseService.addTagTreeCategory(addTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
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
                    try {
                        assertEquals(21, e.getCode());
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
}
