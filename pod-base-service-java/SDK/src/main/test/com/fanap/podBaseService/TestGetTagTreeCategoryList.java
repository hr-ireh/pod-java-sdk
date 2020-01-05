package com.fanap.podBaseService;

import com.fanap.podBaseService.controller.PodBaseService;
import com.fanap.podBaseService.data.modelSrv.TagTreeCategorySrv;
import com.fanap.podBaseService.data.modelVo.BaseInfoVo;
import com.fanap.podBaseService.data.modelVo.GetTagTreeCategoryListVo;
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
public class TestGetTagTreeCategoryList {
    private final String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";

    @Rule
    public final TestRule globalTimeout = Timeout.millis(20000);



    @Test
    @Order(1)
//    @DisplayName("")
    public void getTagTreeCategoryList_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeCategoryListVo getTagTreeCategoryListVo = new GetTagTreeCategoryListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
                    .build();
            podBaseService.getTagTreeCategoryList(getTagTreeCategoryListVo, new OnGetResponseListener<List<TagTreeCategorySrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeCategorySrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        assertEquals(704, result.getResult().get(0).getId());
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
    public void getTagTreeCategoryList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeCategoryListVo getTagTreeCategoryListVo = new GetTagTreeCategoryListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
                    .setQuery("tag")
                    .setId(704L)
                    .setName("tag2")
                    .build();
            podBaseService.getTagTreeCategoryList(getTagTreeCategoryListVo, new OnGetResponseListener<List<TagTreeCategorySrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeCategorySrv>> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals(704, result.getResult().get(0).getId());

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
    public void getTagCategoryList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeCategoryListVo getTagTreeCategoryListVo = new GetTagTreeCategoryListVo.Builder(baseInfoVo)
                    .build();
            podBaseService.getTagTreeCategoryList(getTagTreeCategoryListVo, new OnGetResponseListener<List<TagTreeCategorySrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeCategorySrv>> result) {
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
    @Order(4)
//    @DisplayName("")
    public void getTagCategoryList_SomeRequiredParameters_Offset() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeCategoryListVo getTagTreeCategoryListVo = new GetTagTreeCategoryListVo.Builder(baseInfoVo)
                    .setSize(10)
                    .build();
            podBaseService.getTagTreeCategoryList(getTagTreeCategoryListVo, new OnGetResponseListener<List<TagTreeCategorySrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeCategorySrv>> result) {
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
    @Order(3)
//    @DisplayName("")
    public void getTagCategoryList_SomeRequiredParameters_Size() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeCategoryListVo getTagTreeCategoryListVo = new GetTagTreeCategoryListVo.Builder(baseInfoVo)
                    .setSize(10)
                    .build();
            podBaseService.getTagTreeCategoryList(getTagTreeCategoryListVo, new OnGetResponseListener<List<TagTreeCategorySrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeCategorySrv>> result) {
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
