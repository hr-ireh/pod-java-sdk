import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.HealthCheckSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.HealthCheckVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.data.modelVo.UpdateHealthCheckByIdVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestUpdateHealthCheckVoSrvById {
    private static String TOKEN = "";

    @Test
    public void updateHealthCheckById_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        HealthCheckVo healthCheckVo = new HealthCheckVo();
        healthCheckVo.setScheme("http");
        healthCheckVo.setEndpoint("/ping");
        healthCheckVo.setResponseString("pong");
        try {
            UpdateHealthCheckByIdVo updateHealthCheckByIdVo = new UpdateHealthCheckByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setHid(45L)
                    .setUpdateRequest(healthCheckVo)
                    .build();
            podSakku.updateHealthCheckById(updateHealthCheckByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getId());
                    try {
                        assertEquals(45, result.getResult().getId());
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
    public void updateHealthCheckById_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        HealthCheckVo healthCheckVo = new HealthCheckVo();
        healthCheckVo.setScheme("http");
        healthCheckVo.setEndpoint("/ping");
        healthCheckVo.setResponseString("pong");
        try {
            UpdateHealthCheckByIdVo updateHealthCheckByIdVo = new UpdateHealthCheckByIdVo.Builder(baseInfoVo)
                    .setHid(41L)
                    .setUpdateRequest(healthCheckVo)
                    .build();
            podSakku.updateHealthCheckById(updateHealthCheckByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateHealthCheckById_RequiredParameters_Hid() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        HealthCheckVo healthCheckVo = new HealthCheckVo();
        healthCheckVo.setScheme("http");
        healthCheckVo.setEndpoint("/ping");
        healthCheckVo.setResponseString("pong");
        try {
            UpdateHealthCheckByIdVo updateHealthCheckByIdVo = new UpdateHealthCheckByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setUpdateRequest(healthCheckVo)
                    .build();
            podSakku.updateHealthCheckById(updateHealthCheckByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateHealthCheckById_RequiredParameters_UpdateRequest() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        HealthCheckVo healthCheckVo = new HealthCheckVo();
        healthCheckVo.setScheme("http");
        healthCheckVo.setEndpoint("/ping");
        healthCheckVo.setResponseString("pong");
        try {
            UpdateHealthCheckByIdVo updateHealthCheckByIdVo = new UpdateHealthCheckByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setHid(41L)
                    .build();
            podSakku.updateHealthCheckById(updateHealthCheckByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateHealthCheckById_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            UpdateHealthCheckByIdVo updateHealthCheckByIdVo = new UpdateHealthCheckByIdVo.Builder(baseInfoVo)
                    .build();
            podSakku.updateHealthCheckById(updateHealthCheckByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getId());
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
