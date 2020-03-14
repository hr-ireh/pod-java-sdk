import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.ApplicationSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetUserApplicationsListVo;
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
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class TestGetUserApplicationsList {
    private static String TOKEN = "";

    @Test
    public void getUserApplicationsList_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetUserApplicationsListVo getUserApplicationsListVo = new GetUserApplicationsListVo.Builder(baseInfoVo)
                    .setPage(1)
                    .build();
            podSakku.getUserApplicationsList(getUserApplicationsListVo, new OnGetResponseListener<List<ApplicationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ApplicationSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        assertEquals("2442", result.getResult().get(0).getId());
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
    public void getUserApplicationsList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetUserApplicationsListVo getUserApplicationsListVo = new GetUserApplicationsListVo.Builder(baseInfoVo)
                    .setPage(1)
                    .setSize(10)
                    .build();
            podSakku.getUserApplicationsList(getUserApplicationsListVo, new OnGetResponseListener<List<ApplicationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ApplicationSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        assertEquals("2442", result.getResult().get(0).getId());
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
    public void getUserApplicationsList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetUserApplicationsListVo getUserApplicationsListVo = new GetUserApplicationsListVo.Builder(baseInfoVo)
                    .build();
            podSakku.getUserApplicationsList(getUserApplicationsListVo, new OnGetResponseListener<List<ApplicationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ApplicationSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
