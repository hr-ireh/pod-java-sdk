import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.CommentSrv;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.CommentBusinessListVo;
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
 * Created by Z.gholinia on 11/9/2019.
 */

public class TestCommentBusinessList {
    public final String TOKEN = "c43049a626e5462ab85c0a8e4028e9fe";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void commentBusinessList_RequiredParameters1() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setOffset(0)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
                    new Thread(() -> {
                        try {
                            assertEquals("khooooob", result.getResult().get(0).getText());
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
    public void commentBusinessList_RequiredParameters2() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setLastId(7777L)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
                    new Thread(() -> {
                        try {
                            assertEquals("khooooob", result.getResult().get(0).getText());
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
    public void commentBusinessList_RequiredParameters3() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setFirstId(1300L)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
                    new Thread(() -> {
                        try {
                            assertEquals("khooooob", result.getResult().get(0).getText());
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
    public void commentBusinessList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
                    new Thread(() -> {
                        try {
                            assertEquals("khooooob", result.getResult().get(0).getText());
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
    //@Order(1)
//    @DisplayName("")
    public void commentBusinessList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
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
    //@Order(1)
//    @DisplayName("")
    public void commentBusinessList_SomeRequiredParameters_offset_lastId_firstId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setOffset(1)
                    .setLastId(7777L)
                    .setFirstId(1300L)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
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
    public void commentBusinessList_SomeRequiredParameters_offset_lastId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setOffset(1)
                    .setLastId(7777L)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
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
    //@Order(1)
//    @DisplayName("")
    public void commentBusinessList_SomeRequiredParameters_offset_firstId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setOffset(1)
                    .setFirstId(7777L)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
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
    //@Order(1)
//    @DisplayName("")
    public void commentBusinessList_SomeRequiredParameters_lastId_firstId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setLastId(1300L)
                    .setFirstId(7777L)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
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
    //@Order(1)
//    @DisplayName("")
    public void commentBusinessList_SomeRequiredParameters_BusinessId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
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
