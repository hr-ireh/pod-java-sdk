import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
import com.fanap.podDealing.data.modelVo.UnconfirmCommentVo;
import com.fanap.podDealing.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 11/9/2019.
 */

public class TestUnconfirmComment {
    public final String TOKEN = "9dfc30b213f74c82b2e03053c338d58e";
    public static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";


    @Test
//    @Order(1)
//    @DisplayName("")
    public void unconfirmComment_AllParameters() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("475fd39223cd47289a8977d0f73f1bf7")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            UnconfirmCommentVo unconfirmCommentVo = new UnconfirmCommentVo.Builder(baseInfoVo)
                    .setCommentId(7224L)
                    .build();
            podDealing.unconfirmComment(unconfirmCommentVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                    new Thread(() -> {
                        try {
                            assertEquals(true, result.getResult());
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
    public void unconfirmComment_NoParameters() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("475fd39223cd47289a8977d0f73f1bf7")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            UnconfirmCommentVo unconfirmCommentVo = new UnconfirmCommentVo.Builder(baseInfoVo)
                    .build();
            podDealing.unconfirmComment(unconfirmCommentVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
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
    public void unconfirmComment_SomeRequiredParameters_CommentId() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            UnconfirmCommentVo unconfirmCommentVo = new UnconfirmCommentVo.Builder(baseInfoVo)
                    .build();
            podDealing.unconfirmComment(unconfirmCommentVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
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
