import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.DeployStateSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetFakeApplicationStateVo;
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

public class TestGetFakeApplicationStateVo {
    private static String TOKEN = "";

    @Test
    public void getFakeApplicationState_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetFakeApplicationStateVo getFakeApplicationStateVo = new GetFakeApplicationStateVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.getFakeApplicationState(getFakeApplicationStateVo, new OnGetResponseListener<DeployStateSrv>() {
                @Override
                public void onResponse(ResultVo<DeployStateSrv> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals(30.0, result.getResult().getPercent());
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
    public void getFakeApplicationState_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetFakeApplicationStateVo getFakeApplicationStateVo = new GetFakeApplicationStateVo.Builder(baseInfoVo)
                    .build();
            podSakku.getFakeApplicationState(getFakeApplicationStateVo, new OnGetResponseListener<DeployStateSrv>() {
                @Override
                public void onResponse(ResultVo<DeployStateSrv> result) {
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
