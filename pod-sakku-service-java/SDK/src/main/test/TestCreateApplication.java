import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.CreateApplicationSrv;
import com.fanap.podSakku.data.modelVo.*;
import com.fanap.podSakku.enums.EnumDeployType;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCreateApplication {
    private static String TOKEN = "";

    @Test
    public void createApplication_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        ApplicationGitVo applicationGitVo = new ApplicationGitVo();
        ApplicationImageVo image = new ApplicationImageVo();
        image.setRegistry("nginx");
        image.setName("Docker Hub");
        applicationGitVo.setImageName("nginx");
//        applicationGitVo.setDockerFile("Dockerfile");
//        applicationGitVo.setUsername("negarnegma");
//        applicationGitVo.setAccessToken("rJC7f9uz-2gvQbSxeuRu");
        ConfigContentVo configContentVo = null;
        ConfigContentVo configContentVo1 = null;
        PortVo portVo = new PortVo();
        portVo.setPort(80);
        List<PortVo> portVos = new ArrayList<>();
        portVos.add(portVo);
        try {
            configContentVo = new ConfigContentVo.Builder()
                    .setName("zahra10000")
                    .setMem(1)
                    .setCpu(1)
                    .setDeployType(EnumDeployType.DOCKER_IMAGE)
                    .setGit(applicationGitVo)
                    .setDisk(1)
                    .setPortVos(portVos)
                    .setImage(image)
                    .build();
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        try {
            CreateApplicationVo createApplicationVo = new CreateApplicationVo.Builder(baseInfoVo)
                    .setConfig(configContentVo)
                    .build();
            podSakku.createApplication(createApplicationVo, new OnGetResponseListener<CreateApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<CreateApplicationSrv> result) {
                    System.out.println(result.getResult().getId());
                    try {
                        assertEquals("zahra10000", result.getResult().getName());
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
    public void createApplication_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CreateApplicationVo createApplicationVo = new CreateApplicationVo.Builder(baseInfoVo)
                    .build();
            podSakku.createApplication(createApplicationVo, new OnGetResponseListener<CreateApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<CreateApplicationSrv> result) {
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
