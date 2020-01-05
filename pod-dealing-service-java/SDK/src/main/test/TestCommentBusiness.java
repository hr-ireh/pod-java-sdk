import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelVo.BaseInfoVo;
import com.fanap.podDealing.data.modelVo.CommentBusinessVo;
import com.fanap.podDealing.data.modelVo.ResultVo;
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

public class TestCommentBusiness {
    public final String TOKEN = "9dfc30b213f74c82b2e03053c338d58e";

    @Test
//    @Order(1)
//    @DisplayName("")
    public void commentBusiness_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessVo commentBusinessVo = new CommentBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setText("khooooob")
                    .build();
            podDealing.commentBusiness(commentBusinessVo, new OnGetResponseListener<Long>() {
                @Override
                public void onResponse(ResultVo<Long> result) {
                    System.out.println(result.getMessageId());
                    new Thread(() -> {
                        try {
                            assertEquals(0, result.getMessageId());
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
    public void commentBusiness_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessVo commentBusinessVo = new CommentBusinessVo.Builder(baseInfoVo)
                    .build();
            podDealing.commentBusiness(commentBusinessVo, new OnGetResponseListener<Long>() {
                @Override
                public void onResponse(ResultVo<Long> result) {
                    System.out.println(result.getMessageId());
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
    public void commentBusiness_SomeRequiredParameters_BusinessId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessVo commentBusinessVo = new CommentBusinessVo.Builder(baseInfoVo)
                    .setText("hiiii")
                    .build();
            podDealing.commentBusiness(commentBusinessVo, new OnGetResponseListener<Long>() {
                @Override
                public void onResponse(ResultVo<Long> result) {
                    System.out.println(result.getMessageId());
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
    public void commentBusiness_SomeRequiredParameters_Text() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessVo commentBusinessVo = new CommentBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(54564L)
                    .build();
            podDealing.commentBusiness(commentBusinessVo, new OnGetResponseListener<Long>() {
                @Override
                public void onResponse(ResultVo<Long> result) {
                    System.out.println(result.getMessageId());
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
