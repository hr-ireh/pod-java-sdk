import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.CatalogClassSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetAllCatalogsVo;
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

public class TestGetAllCatalogs {
    private static String TOKEN = "";

    @Test
    public void getAllCatalogs() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllCatalogsVo getAllCatalogsVo = new GetAllCatalogsVo.Builder(baseInfoVo)
                    .build();
            podSakku.getAllCatalogs(getAllCatalogsVo, new OnGetResponseListener<List<CatalogClassSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogClassSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    try {
                        assertEquals("(CMS) سیستم مدیریت محتوا", result.getResult().get(0).getName());
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
}
