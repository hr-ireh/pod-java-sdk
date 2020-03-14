import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.ApplicationBaseConfig;
import com.fanap.podSakku.data.modelSrv.ApplicationSrv;
import com.fanap.podSakku.data.modelSrv.PortMapping;
import com.fanap.podSakku.data.modelVo.ApplicationImageVo;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.CreateAppByMachineMechanismVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
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

public class TestCreateAppByMachineMechanism {
    private static String TOKEN = "";

    @Test
    public void createAppByMachineMechanism_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        ApplicationBaseConfig applicationBaseConfig =new ApplicationBaseConfig();
        applicationBaseConfig.setDeployType(EnumDeployType.DOCKER_IMAGE);
        ApplicationImageVo image=new ApplicationImageVo();
        image.setRegistry("nginx");
        image.setName("Docker Hub");
        applicationBaseConfig.setImage(image);
        applicationBaseConfig.setName("zra12");
        List<PortMapping> ports=new ArrayList<>();
        PortMapping portMapping=new PortMapping();
        portMapping.setPort(80);
        ports.add(portMapping);
        applicationBaseConfig.setPorts(ports);
        applicationBaseConfig.setDisk(1);
        applicationBaseConfig.setCpu(1);
        applicationBaseConfig.setMem(1);
        try {
            CreateAppByMachineMechanismVo createAppByMachineMechanismVo = new CreateAppByMachineMechanismVo.Builder(baseInfoVo)
                    .setConfig(applicationBaseConfig)
                    .build();
            podSakku.createAppByMachineMechanism(createAppByMachineMechanismVo, new OnGetResponseListener<ApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationSrv> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals("zra12", result.getResult().getName());
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
    public void createAppByMachineMechanism_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CreateAppByMachineMechanismVo createAppByMachineMechanismVo = new CreateAppByMachineMechanismVo.Builder(baseInfoVo)
                    .build();
            podSakku.createAppByMachineMechanism(createAppByMachineMechanismVo, new OnGetResponseListener<ApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationSrv> result) {
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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
