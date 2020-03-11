import com.fanap.podAIPlatform.controller.PodAIPlatform;
import com.fanap.podAIPlatform.data.modelSrv.SpeechToTextSrv;
import com.fanap.podAIPlatform.data.modelVo.BaseInfoVo;
import com.fanap.podAIPlatform.data.modelVo.ResultVo;
import com.fanap.podAIPlatform.data.modelVo.SpeechToTextVo;
import com.fanap.podAIPlatform.util.OnGetResponseListener;
import com.fanap.podBaseService.exception.PodException;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podAIPlatform.util.Keys.SC_API_KEY_NLU_BANKING;
import static com.fanap.podAIPlatform.util.Keys.SC_API_KEY_SPEECH_TO_TEXT;
import static com.fanap.podAIPlatform.util.Keys.TOKEN;
import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestSpeechToText {
    @Test
    public void speechToText_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_SPEECH_TO_TEXT)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            SpeechToTextVo speechToTextVo = new SpeechToTextVo.Builder(baseInfoVo)
                    .setLinkFile("http://tilin.ir/kWwj26K")
                    .build();
            podAIPlatform.speechToText(speechToTextVo, new OnGetResponseListener<SpeechToTextSrv>() {
                @Override
                public void onResponse(ResultVo<SpeechToTextSrv> result) {
                    try {
                        System.out.println(result.getResult().getResult().getData().getText());
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
    public void speechToText_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            SpeechToTextVo speechToTextVo = new SpeechToTextVo.Builder(baseInfoVo)
                    .build();
            podAIPlatform.speechToText(speechToTextVo, new OnGetResponseListener<SpeechToTextSrv>() {
                @Override
                public void onResponse(ResultVo<SpeechToTextSrv> result) {
                    try {
                        System.out.println(result.getResult().getResult().getData().getText());
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
