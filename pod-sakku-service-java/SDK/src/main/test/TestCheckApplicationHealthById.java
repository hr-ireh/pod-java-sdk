import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.HealthCheckSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.CheckApplicationHealthByIdVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCheckApplicationHealthById {
    private static String TOKEN = "";
   @Test
    public  void checkApplicationHealthById_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CheckApplicationHealthByIdVo checkApplicationHealthByIdVo = new CheckApplicationHealthByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setHid(44L)
                    .build();
            podSakku.checkApplicationHealthById(checkApplicationHealthByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getLastStatus());
                    try {
                        assertEquals(HealthCheckSrv.Status.FAILED, result.getResult().getLastStatus());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();

                }
                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    public  void checkApplicationHealthById_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CheckApplicationHealthByIdVo checkApplicationHealthByIdVo = new CheckApplicationHealthByIdVo.Builder(baseInfoVo)
                    .setHid(44L)
                    .build();
            podSakku.checkApplicationHealthById(checkApplicationHealthByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getLastStatus());
                    try {
                       fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();

                }
                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public  void checkApplicationHealthById_RequiredParameters_Hid() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CheckApplicationHealthByIdVo checkApplicationHealthByIdVo = new CheckApplicationHealthByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.checkApplicationHealthById(checkApplicationHealthByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getLastStatus());
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();

                }
                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public  void checkApplicationHealthById_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CheckApplicationHealthByIdVo checkApplicationHealthByIdVo = new CheckApplicationHealthByIdVo.Builder(baseInfoVo)
                    .build();
            podSakku.checkApplicationHealthById(checkApplicationHealthByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getLastStatus());
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();

                }
                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
