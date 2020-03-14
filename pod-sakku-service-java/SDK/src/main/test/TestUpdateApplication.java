import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.UpdateConfSrv;
import com.fanap.podSakku.data.modelVo.*;
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

public class TestUpdateApplication {
    private static String TOKEN = "";

    @Test
    public void updateApplication_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        ApplicationGitVo applicationGitVo = new ApplicationGitVo();
        applicationGitVo.setUrl("https://gitlab.com/negarnegma/testbuildmaz.git");
        applicationGitVo.setDockerFile("Dockerfile");
        applicationGitVo.setUsername("negarnegma");
        applicationGitVo.setAccessToken("rJC7f9uz-2gvQbSxeuRu");
        UpdateConfigVo updateConfigVo = new UpdateConfigVo();
        updateConfigVo.setCpu(2);
        updateConfigVo.setScalingMode("OFF");
        updateConfigVo.setGit(applicationGitVo);
        updateConfigVo.setDisk(2);
        try {
            UpdateApplicationVo updateApplicationVo = new UpdateApplicationVo.Builder(baseInfoVo)
                    .setAppId(2306L)
                    .setBody(updateConfigVo)
                    .build();            podSakku.updateApplication(updateApplicationVo, new OnGetResponseListener<UpdateConfSrv>() {
                @Override
                public void onResponse(ResultVo<UpdateConfSrv> result) {
                    System.out.println(result.getResult().getDisk());
                    try {
                        assertEquals(2.0, result.getResult().getDisk());
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
    public void updateApplication_RequiredParameters_Body() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            UpdateApplicationVo updateApplicationVo = new UpdateApplicationVo.Builder(baseInfoVo)
                    .setAppId(2306L)
                    .build();
            podSakku.updateApplication(updateApplicationVo, new OnGetResponseListener<UpdateConfSrv>() {
                @Override
                public void onResponse(ResultVo<UpdateConfSrv> result) {
                    System.out.println(result.getResult().getDisk());
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
    public void updateApplication_RequiredParameters_AppId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        ApplicationGitVo applicationGitVo = new ApplicationGitVo();
        applicationGitVo.setUrl("https://gitlab.com/negarnegma/testbuildmaz.git");
        applicationGitVo.setDockerFile("Dockerfile");
        applicationGitVo.setUsername("negarnegma");
        applicationGitVo.setAccessToken("rJC7f9uz-2gvQbSxeuRu");
        UpdateConfigVo updateConfigVo = new UpdateConfigVo();
        updateConfigVo.setCpu(2);
        updateConfigVo.setScalingMode("OFF");
        updateConfigVo.setGit(applicationGitVo);
        updateConfigVo.setDisk(2);
        try {
            UpdateApplicationVo updateApplicationVo = new UpdateApplicationVo.Builder(baseInfoVo)
                    .setBody(updateConfigVo)
                    .build();
            podSakku.updateApplication(updateApplicationVo, new OnGetResponseListener<UpdateConfSrv>() {
                @Override
                public void onResponse(ResultVo<UpdateConfSrv> result) {
                    System.out.println(result.getResult().getDisk());
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
    public void updateApplication_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            UpdateApplicationVo updateApplicationVo = new UpdateApplicationVo.Builder(baseInfoVo)
                    .build();
            podSakku.updateApplication(updateApplicationVo, new OnGetResponseListener<UpdateConfSrv>() {
                @Override
                public void onResponse(ResultVo<UpdateConfSrv> result) {
                    System.out.println(result.getResult().getDisk());
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
