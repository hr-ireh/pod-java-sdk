import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.DockerLogsSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetRealTimeAppLogsByIdVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestGetRealTimeAppLogsSrvById {
    private static String TOKEN = "";

    @Test
    public void getRealTimeAppLogsById_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetRealTimeAppLogsByIdVo getRealTimeAppLogsByIdVo = new GetRealTimeAppLogsByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setTime(System.currentTimeMillis())
                    .build();
            podSakku.getRealTimeAppLogsById(getRealTimeAppLogsByIdVo, new OnGetResponseListener<DockerLogsSrv>() {
                @Override
                public void onResponse(ResultVo<DockerLogsSrv> result) {
                    System.out.println(result.getResult().getStart());
                    try {
                        assertEquals(null, result.getResult().getLogs());
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
    public void getRealTimeAppLogsById_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetRealTimeAppLogsByIdVo getRealTimeAppLogsByIdVo = new GetRealTimeAppLogsByIdVo.Builder(baseInfoVo)
                    .setTime(System.currentTimeMillis())
                    .build();
            podSakku.getRealTimeAppLogsById(getRealTimeAppLogsByIdVo, new OnGetResponseListener<DockerLogsSrv>() {
                @Override
                public void onResponse(ResultVo<DockerLogsSrv> result) {
                    System.out.println(result.getResult().getStart());
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
    public void getRealTimeAppLogsById_RequiredParameters_Time() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetRealTimeAppLogsByIdVo getRealTimeAppLogsByIdVo = new GetRealTimeAppLogsByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.getRealTimeAppLogsById(getRealTimeAppLogsByIdVo, new OnGetResponseListener<DockerLogsSrv>() {
                @Override
                public void onResponse(ResultVo<DockerLogsSrv> result) {
                    System.out.println(result.getResult().getStart());
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
    public void getRealTimeAppLogsById_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetRealTimeAppLogsByIdVo getRealTimeAppLogsByIdVo = new GetRealTimeAppLogsByIdVo.Builder(baseInfoVo)
                    .build();
            podSakku.getRealTimeAppLogsById(getRealTimeAppLogsByIdVo, new OnGetResponseListener<DockerLogsSrv>() {
                @Override
                public void onResponse(ResultVo<DockerLogsSrv> result) {
                    System.out.println(result.getResult().getStart());
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
