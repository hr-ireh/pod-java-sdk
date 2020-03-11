import com.fanap.podAIPlatform.controller.PodAIPlatform;
import com.fanap.podAIPlatform.data.modelSrv.ImageProcessingAuthenticationSrv;
import com.fanap.podAIPlatform.data.modelVo.BaseInfoVo;
import com.fanap.podAIPlatform.data.modelVo.ImageProcessingAuthenticationVo;
import com.fanap.podAIPlatform.data.modelVo.ResultVo;
import com.fanap.podAIPlatform.enums.EnumMode;
import com.fanap.podAIPlatform.util.OnGetResponseListener;
import com.fanap.podBaseService.exception.PodException;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podAIPlatform.util.Keys.SC_API_KEY_IMAGE_PROCESSING;
import static com.fanap.podAIPlatform.util.Keys.TOKEN;
import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestImageProcessingAuthentication {

    @Test
    public void imageProcessingAuthentication_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_IMAGE_PROCESSING)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            ImageProcessingAuthenticationVo imageProcessingAuthenticationVo = new ImageProcessingAuthenticationVo.Builder(baseInfoVo)
                    .setImage1("https://core.pod.ir:443/nzh/image/?imageId=110531&width=909&height=909&hashCode=16b11e5cf3c-0.42178732891944504")
                    .setImage2("https://core.pod.ir:443/nzh/image/?imageId=104132&width=409&height=409&hashCode=16afd4e69b5-0.30817062367834125")
                    .setMode(EnumMode.EASY)
                    .build();
            podAIPlatform.imageProcessingAuthentication(imageProcessingAuthenticationVo, new OnGetResponseListener<ImageProcessingAuthenticationSrv>() {
                @Override
                public void onResponse(ResultVo<ImageProcessingAuthenticationSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getStatusMessage());
                    } catch (PodException e) {
                      fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

                    new Thread(() -> {
                        try {
                            assertEquals(false, result.isHasError());
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
    public void imageProcessingAuthentication_RequiredParameters_Image1() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_IMAGE_PROCESSING)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            ImageProcessingAuthenticationVo imageProcessingAuthenticationVo = new ImageProcessingAuthenticationVo.Builder(baseInfoVo)
                    .setImage2("https://core.pod.ir:443/nzh/image/?imageId=104132&width=409&height=409&hashCode=16afd4e69b5-0.30817062367834125")
                    .setMode(EnumMode.EASY)
                    .build();
            podAIPlatform.imageProcessingAuthentication(imageProcessingAuthenticationVo, new OnGetResponseListener<ImageProcessingAuthenticationSrv>() {
                @Override
                public void onResponse(ResultVo<ImageProcessingAuthenticationSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getStatusMessage());
                    } catch (PodException e) {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void imageProcessingAuthentication_RequiredParameters_Image2() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_IMAGE_PROCESSING)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            ImageProcessingAuthenticationVo imageProcessingAuthenticationVo = new ImageProcessingAuthenticationVo.Builder(baseInfoVo)
                    .setImage1("https://core.pod.ir:443/nzh/image/?imageId=110531&width=909&height=909&hashCode=16b11e5cf3c-0.42178732891944504")
                    .setMode(EnumMode.EASY)
                    .build();
            podAIPlatform.imageProcessingAuthentication(imageProcessingAuthenticationVo, new OnGetResponseListener<ImageProcessingAuthenticationSrv>() {
                @Override
                public void onResponse(ResultVo<ImageProcessingAuthenticationSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getStatusMessage());
                    } catch (PodException e) {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void imageProcessingAuthentication_RequiredParameters_Mode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_IMAGE_PROCESSING)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            ImageProcessingAuthenticationVo imageProcessingAuthenticationVo = new ImageProcessingAuthenticationVo.Builder(baseInfoVo)
                    .setImage1("https://core.pod.ir:443/nzh/image/?imageId=110531&width=909&height=909&hashCode=16b11e5cf3c-0.42178732891944504")
                    .setImage2("https://core.pod.ir:443/nzh/image/?imageId=104132&width=409&height=409&hashCode=16afd4e69b5-0.30817062367834125")
                    .build();
            podAIPlatform.imageProcessingAuthentication(imageProcessingAuthenticationVo, new OnGetResponseListener<ImageProcessingAuthenticationSrv>() {
                @Override
                public void onResponse(ResultVo<ImageProcessingAuthenticationSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getStatusMessage());
                    } catch (PodException e) {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void imageProcessingAuthentication_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            ImageProcessingAuthenticationVo imageProcessingAuthenticationVo = new ImageProcessingAuthenticationVo.Builder(baseInfoVo)
                    .build();
            podAIPlatform.imageProcessingAuthentication(imageProcessingAuthenticationVo, new OnGetResponseListener<ImageProcessingAuthenticationSrv>() {
                @Override
                public void onResponse(ResultVo<ImageProcessingAuthenticationSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getStatusMessage());
                    } catch (PodException e) {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }



}
