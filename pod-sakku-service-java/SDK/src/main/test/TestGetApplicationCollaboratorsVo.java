import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.ApplicationAccessSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetApplicationCollaboratorsVo;
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

public class TestGetApplicationCollaboratorsVo {
    private static String TOKEN = "";

    @Test
    public void getApplicationCollaborators_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationCollaboratorsVo getApplicationCollaboratorsVo = new GetApplicationCollaboratorsVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.getApplicationCollaborators(getApplicationCollaboratorsVo, new OnGetResponseListener<List<ApplicationAccessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ApplicationAccessSrv>> result) {
                    try {
                        assertEquals(135, result.getResult().get(0).getId());
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
    public void getApplicationCollaborators_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationCollaboratorsVo getApplicationCollaboratorsVo = new GetApplicationCollaboratorsVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setAll(false)
                    .setPage(1)
                    .setSize(10)
                    .build();
            podSakku.getApplicationCollaborators(getApplicationCollaboratorsVo, new OnGetResponseListener<List<ApplicationAccessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ApplicationAccessSrv>> result) {
                    try {
                        assertEquals(135, result.getResult().get(0).getId());
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
    public void getApplicationCollaborators_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationCollaboratorsVo getApplicationCollaboratorsVo = new GetApplicationCollaboratorsVo.Builder(baseInfoVo)
                    .build();
            podSakku.getApplicationCollaborators(getApplicationCollaboratorsVo, new OnGetResponseListener<List<ApplicationAccessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ApplicationAccessSrv>> result) {
                    try {
                        assertEquals("", result.getResult());
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
