import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.ApplicationBaseConfig;
import com.fanap.podSakku.data.modelSrv.CatalogAppFullSrv;
import com.fanap.podSakku.data.modelSrv.CatalogAppMetadata;
import com.fanap.podSakku.data.modelSrv.PortMapping;
import com.fanap.podSakku.data.modelVo.AddCatalogAppVo;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.CreateCatalogAppVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.enums.EnumProtocol;
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

public class TestCreateCatalogApp {

    private static String TOKEN = "";

    @Test
    public void createCatalogApp_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AddCatalogAppVo addCatalogAppVo = new AddCatalogAppVo();
        addCatalogAppVo.setName("testZahra");
        addCatalogAppVo.setDescription("test zahra");
        addCatalogAppVo.setPrice(0);
        addCatalogAppVo.setDeployLimitCount(1000);
        ApplicationBaseConfig config = new ApplicationBaseConfig();
        config.setCpu(1);
        config.setDisk(1);
        config.setMem(1);
        config.setName("testzahra21");
        PortMapping port = new PortMapping();
        port.setPort(80);
        port.setProtocol(EnumProtocol.HTTP);
        port.setSsl(false);
        port.setBasicAuthentication(false);
        port.setBasicAuthentication(false);
        List<PortMapping> ports = new ArrayList<>();
        ports.add(port);
        config.setPorts(ports);
        addCatalogAppVo.setConfig(config);
        addCatalogAppVo.setMetadata(new ArrayList<CatalogAppMetadata>());
        try {
            CreateCatalogAppVo createCatalogAppVo = new CreateCatalogAppVo.Builder(baseInfoVo)
                    .setCatalogId(4L)
                    .setAddCatalogAppVo(addCatalogAppVo)
                    .build();
            podSakku.createCatalogApp(createCatalogAppVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
                    System.out.println(result.getResult().getId());
                    try {
                        assertEquals("DELETE", result.getResult().getId());
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
                    cdl.countDown();  }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void createCatalogApp_RequiredParameters_CatalogId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AddCatalogAppVo addCatalogAppVo = new AddCatalogAppVo();
        addCatalogAppVo.setName("testZahra");
        addCatalogAppVo.setDescription("test zahra");
        addCatalogAppVo.setPrice(0);
        addCatalogAppVo.setDeployLimitCount(1000);
        ApplicationBaseConfig config = new ApplicationBaseConfig();
        config.setCpu(1);
        config.setDisk(1);
        config.setMem(1);
        config.setName("testzahra21");
        PortMapping port = new PortMapping();
        port.setPort(80);
        port.setProtocol(EnumProtocol.HTTP);
        port.setSsl(false);
        port.setBasicAuthentication(false);
        port.setBasicAuthentication(false);
        List<PortMapping> ports = new ArrayList<>();
        ports.add(port);
        config.setPorts(ports);
        addCatalogAppVo.setConfig(config);
        addCatalogAppVo.setMetadata(new ArrayList<CatalogAppMetadata>());
        try {
            CreateCatalogAppVo createCatalogAppVo = new CreateCatalogAppVo.Builder(baseInfoVo)
                    .setAddCatalogAppVo(addCatalogAppVo)
                    .build();
            podSakku.createCatalogApp(createCatalogAppVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
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
                    cdl.countDown();  }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void createCatalogApp_RequiredParameters_AddCatalogAppVO() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CreateCatalogAppVo createCatalogAppVo = new CreateCatalogAppVo.Builder(baseInfoVo)
                    .setCatalogId(4L)
                    .build();
            podSakku.createCatalogApp(createCatalogAppVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
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
                    cdl.countDown();  }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    @Test
    public void createCatalogApp_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CreateCatalogAppVo createCatalogAppVo = new CreateCatalogAppVo.Builder(baseInfoVo)
                    .build();
            podSakku.createCatalogApp(createCatalogAppVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
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
                    cdl.countDown();  }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
}
