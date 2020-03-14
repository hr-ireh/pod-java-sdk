import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.HealthCheckSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.DeleteAllAppHealthChecksVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestDeleteAllAppHealthChecksSrvVo {

    private static String TOKEN = "";

    @Test
    public void deleteAllAppHealthChecks_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteAllAppHealthChecksVo deleteAllAppHealthChecksVo = new DeleteAllAppHealthChecksVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setPath("")
                    .build();
            podSakku.deleteAllAppHealthChecks(deleteAllAppHealthChecksVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals(0, result.getResult().size());
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
    public void deleteAllAppHealthChecks_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteAllAppHealthChecksVo deleteAllAppHealthChecksVo = new DeleteAllAppHealthChecksVo.Builder(baseInfoVo)
                    .setPath("")
                    .build();
            podSakku.deleteAllAppHealthChecks(deleteAllAppHealthChecksVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
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

    @Test
    public void deleteAllAppHealthChecks_RequiredParameters_Path() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteAllAppHealthChecksVo deleteAllAppHealthChecksVo = new DeleteAllAppHealthChecksVo.Builder(baseInfoVo)
                    .setId(41L)
                    .build();
            podSakku.deleteAllAppHealthChecks(deleteAllAppHealthChecksVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
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

    @Test
    public void deleteAllAppHealthChecks_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteAllAppHealthChecksVo deleteAllAppHealthChecksVo = new DeleteAllAppHealthChecksVo.Builder(baseInfoVo)
                    .build();
            podSakku.deleteAllAppHealthChecks(deleteAllAppHealthChecksVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
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
