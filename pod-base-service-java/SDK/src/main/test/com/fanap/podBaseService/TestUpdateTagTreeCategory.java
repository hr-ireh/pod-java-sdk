package com.fanap.podBaseService;

import com.fanap.podBaseService.controller.PodBaseService;
import com.fanap.podBaseService.data.modelSrv.TagTreeCategorySrv;
import com.fanap.podBaseService.data.modelVo.BaseInfoVo;
import com.fanap.podBaseService.data.modelVo.ResultVo;
import com.fanap.podBaseService.data.modelVo.UpdateTagTreeCategoryVo;
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
public class TestUpdateTagTreeCategory {

    private final String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";
    @Rule
    public final TestRule globalTimeout = Timeout.millis(20000);


    @Test
    @Order(1)
//    @DisplayName("")
    public void updateTagTreeCategory_RequiredParameters() {
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
            UpdateTagTreeCategoryVo updateTagTreeCategoryVo = new UpdateTagTreeCategoryVo.Builder(baseInfoVo)
                    .setId(1267L)
                    .setName(generatedString)
                    .build();
            podBaseService.updateTagTreeCategory(updateTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
                    System.out.println(result.getResult().getName());
                    try {
                        assertEquals(generatedString, result.getResult().getName());
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
    public void updateTagTreeCategory_AllParameters() {
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
            UpdateTagTreeCategoryVo updateTagTreeCategoryVo = new UpdateTagTreeCategoryVo.Builder(baseInfoVo)
                    .setId(1390L)
                    .setName(generatedString)
                    .setDesc("hi")
                    .setEnable(true)
                    .build();
            podBaseService.updateTagTreeCategory(updateTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
                    System.out.println(result.getResult().getName());
                    try {
                        assertEquals(generatedString, result.getResult().getName());
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
    public void updateTagTreeCategory_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();
        try {
            UpdateTagTreeCategoryVo updateTagTreeCategoryVo = new UpdateTagTreeCategoryVo.Builder(baseInfoVo)
                    .build();
            podBaseService.updateTagTreeCategory(updateTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
                    System.out.println(result.getResult().getName());
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
    public void updateTagTreeCategory_SomeRequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();
        try {
            UpdateTagTreeCategoryVo updateTagTreeCategoryVo = new UpdateTagTreeCategoryVo.Builder(baseInfoVo)
                    .setName("hi")
                    .build();
            podBaseService.updateTagTreeCategory(updateTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
                    System.out.println(result.getResult().getName());
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
