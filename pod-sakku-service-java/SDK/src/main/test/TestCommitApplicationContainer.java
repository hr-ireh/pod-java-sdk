import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.CommitApplicationContainerVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class TestCommitApplicationContainer {
    private static String TOKEN = "";

    @Test
    public void commitApplicationContainer_requiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CommitApplicationContainerVo commitApplicationContainerVo = new CommitApplicationContainerVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.commitApplicationContainer(commitApplicationContainerVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals("از کانتینر با شناسه dc324 برای برنامه 2338 به زودی نسخه پشتیبان تهیه خواهد شد!", result.getResult());
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
    public void commitApplicationContainer_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CommitApplicationContainerVo commitApplicationContainerVo = new CommitApplicationContainerVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .setContainerId("dc32411c097b0f89a4d246adc5abd128f8b8a03cc79cde1877d45f5ac9422101")
                    .setTag("1.2.3")
                    .build();
            podSakku.commitApplicationContainer(commitApplicationContainerVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals("از کانتینر با شناسه dc324 برای برنامه 2338 به زودی نسخه پشتیبان تهیه خواهد شد!", result.getResult());
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
    public void commitApplicationContainer_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CommitApplicationContainerVo commitApplicationContainerVo = new CommitApplicationContainerVo.Builder(baseInfoVo)
                    .build();
            podSakku.commitApplicationContainer(commitApplicationContainerVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
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
