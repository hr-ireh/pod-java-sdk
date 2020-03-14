import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.CatalogAppFullSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetAllCatalogAppByIdVo;
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

public class TestGetAllCatalogAppById {
    private static String TOKEN = "";

    @Test
    public void getAllCatalogAppById_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllCatalogAppByIdVo getAllCatalogAppByIdVo = new GetAllCatalogAppByIdVo.Builder(baseInfoVo)
                    .setId(4L)
                    .build();
            podSakku.getAllCatalogAppById(getAllCatalogAppByIdVo, new OnGetResponseListener<List<CatalogAppFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogAppFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    try {
                        assertEquals("MongoDB", result.getResult().get(0).getName());
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
    public void getAllCatalogAppById_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllCatalogAppByIdVo getAllCatalogAppByIdVo = new GetAllCatalogAppByIdVo.Builder(baseInfoVo)
                    .build();
            podSakku.getAllCatalogAppById(getAllCatalogAppByIdVo, new OnGetResponseListener<List<CatalogAppFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogAppFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
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
