package com.fanap.podBaseService;

import com.fanap.podBaseService.controller.PodBaseService;
import com.fanap.podBaseService.data.modelSrv.TagTreeSrv;
import com.fanap.podBaseService.data.modelVo.AddTagTreeVo;
import com.fanap.podBaseService.data.modelVo.BaseInfoVo;
import com.fanap.podBaseService.data.modelVo.ResultVo;
import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.OnGetResponseListener;
import org.junit.Rule;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
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
public class TestAddTagTree {
    public final String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";
    @Rule
    public final TestRule globalTimeout = Timeout.millis(20000);


    @Test
        @Order(1)
//        @DisplayName("")
    public void addTagTree_RequiredParameters() {
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
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .setName(generatedString)
                    .setCategoryId(1387L)
                    .build();

            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
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
//        @DisplayName("")
    public void addTagTree_AllParameters() {
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
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .setName(generatedString)
                    .setCategoryId(1267L)
                    .setParentId(2261L)
                    .build();
            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
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

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    new Thread(() -> {
                        try {
                            fail();
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
//        @DisplayName("")
    public void addTagTree_NoParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .build();


            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
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
        @Order(4)
//        @DisplayName("")
    public void addTagTree_SomeRequiredParameters_Name() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();


        try {
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .setCategoryId(1267L)
                    .build();


            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
                    new Thread(() -> {
                        try {
                            fail();
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                    ;
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
//        @DisplayName("")
    public void addTagTree_SomeRequiredParameters_CategoryId() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .setName("fghfgh")
                    .build();


            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
                    new Thread(() -> {
                        try {
                            fail();
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                    ;
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
//        @DisplayName("")
    public void addTagTree_InvalidParameters_CategoryId() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .setName("fghfgh")
                    .setCategoryId(0L)
                    .build();


            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
                    new Thread(() -> {
                        try {
                            fail();
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                    ;
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    new Thread(() -> {
                        try {
                            assertEquals(78, e.getCode());
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
        @Order(7)
//        @DisplayName("")
    public void addTagTree_RepetitiousName() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .setName("نامبرچسب5")
                    .setCategoryId(1267L)
                    .build();
            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
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
                            assertEquals(222, e.getCode());
                        } catch (AssertionFailedError e1) {
                            optionalThrowable[0] = Optional.of(e1);
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
        @Order(8)
//        @DisplayName("")
    public void addTagTree_InvalidParameters_Token() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("TOKEN")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();
        try {
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .setName("نام برچسب5")
                    .setCategoryId(1267L)
                    .build();
            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
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
                            assertEquals(21, e.getCode());
                        } catch (AssertionFailedError e1) {
                            optionalThrowable[0] = Optional.of(e1);
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
}



