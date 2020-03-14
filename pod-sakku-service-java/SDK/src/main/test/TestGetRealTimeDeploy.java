import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.DeployStateSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetRealTimeDeployVo;
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

public class TestGetRealTimeDeploy {
    private static String TOKEN = "";

    @Test
    public void getRealTimeDeploy_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetRealTimeDeployVo getRealTimeDeployVo = new GetRealTimeDeployVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.getRealTimeDeploy(getRealTimeDeployVo, new OnGetResponseListener<DeployStateSrv>() {
                @Override
                public void onResponse(ResultVo<DeployStateSrv> result) {
                    System.out.println(result.getResult().getSteps().get(0).getTitle());
                    try {
                        assertEquals("بارگذاری هنوز آغاز نشده است!", result.getResult().getSteps().get(0).getTitle());
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
    public void getRealTimeDeploy_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetRealTimeDeployVo getRealTimeDeployVo = new GetRealTimeDeployVo.Builder(baseInfoVo)
                    .build();
            podSakku.getRealTimeDeploy(getRealTimeDeployVo, new OnGetResponseListener<DeployStateSrv>() {
                @Override
                public void onResponse(ResultVo<DeployStateSrv> result) {
                    System.out.println(result.getResult().getSteps().get(0).getTitle());
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
