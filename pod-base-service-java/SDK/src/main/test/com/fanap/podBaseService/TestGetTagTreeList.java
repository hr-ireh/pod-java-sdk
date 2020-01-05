package com.fanap.podBaseService;

import com.fanap.podBaseService.controller.PodBaseService;
import com.fanap.podBaseService.data.modelSrv.TagTreeSrv;
import com.fanap.podBaseService.data.modelVo.BaseInfoVo;
import com.fanap.podBaseService.data.modelVo.GetTagTreeListVo;
import com.fanap.podBaseService.data.modelVo.ResultVo;
import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.OnGetResponseListener;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestGetTagTreeList {
    private final String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";
    @Rule
    public final TestRule globalTimeout = Timeout.millis(20000);

    @Test
    @Order(1)
//    @DisplayName("")
    public void getTagTreeList_RequiredParameters1() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
                    .setCategoryId(1267L)
                    .setLevelCount(1)
                    .setLevel(0)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        assertEquals(2261, result.getResult().get(0).getId());
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
    @Order(2)
//    @DisplayName("")
    public void getTagTreeList_RequiredParameters2() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
                    .setCategoryId(1267L)
                    .setLevelCount(1)
                    .setParentId(2261L)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        assertEquals(2262, result.getResult().get(0).getId());
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
    @Order(3)
//    @DisplayName("")
    public void getTagTreeList_RequiredParameters3() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
                    .setId(2262L)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        assertEquals(2262, result.getResult().get(0).getId());
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
    @Order(4)
//    @DisplayName("")
    public void getTagTreeList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
                    .setCategoryId(705L)
                    .setLevelCount(1)
                    .setId(823L)
                    .setParentId(820L)
                    .setLevel(1)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        assertEquals(823, result.getResult().get(0).getId());
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
    @Order(5)
//    @DisplayName("")
    public void getTagTreeList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        fail();
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    @Order(6)
//    @DisplayName("")
    public void getTagTreeList_SomeRequiredParameters_LevelCount() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
                    .setCategoryId(361L)
                    .setLevel(0)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        fail();
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    @Order(7)
//    @DisplayName("")
    public void getTagTreeList_SomeRequiredParameters_CategoryId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
                    .setLevelCount(1)
                    .setLevel(0)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        fail();
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    @Order(8)
//    @DisplayName("")
    public void getTagTreeList_SomeRequiredParameters_Level() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
                    .setLevelCount(1)
                    .setCategoryId(361L)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        fail();
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
