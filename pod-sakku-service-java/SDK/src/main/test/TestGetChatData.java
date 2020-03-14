import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.ChatCredentialSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetChatDataVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestGetChatData {
    private static String TOKEN = "";

    @Test
    public void getChatData_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxOTciLCJyb2xlIjpbIlJPTEVfVVNFUiJdLCJpc3MiOiJTQUtLVS1JU1MiLCJwb2Rzc29fdG9rZW4iOiJmYTdlM2EyZDg2Njk0YWUyOTBkN2FkNTdjNzdiMDgyMCIsImV4cCI6MTU4NTIwMzI4MX0.y2TZjmr7sY99uK6NZDT5KiCSQB9TuKMobzwGtciOd7wHPihFSToGjdP9zuZZS05eighfUoY_3DM2IAQrDAZ7mg")
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetChatDataVo getChatDataVo = new GetChatDataVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.getChatData(getChatDataVo, new OnGetResponseListener<ChatCredentialSrv>() {
                @Override
                public void onResponse(ResultVo<ChatCredentialSrv> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals(23609, result.getResult().getThreadId());
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
    public void getChatData_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetChatDataVo getChatDataVo = new GetChatDataVo.Builder(baseInfoVo)
                    .build();
            podSakku.getChatData(getChatDataVo, new OnGetResponseListener<ChatCredentialSrv>() {
                @Override
                public void onResponse(ResultVo<ChatCredentialSrv> result) {
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
