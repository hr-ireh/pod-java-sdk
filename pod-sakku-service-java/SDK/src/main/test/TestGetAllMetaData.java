import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.CatalogMetadata;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetAllMetadataVo;
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

public class TestGetAllMetaData {
    private static String TOKEN = "";

    @Test
    public void getAllMetaData_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllMetadataVo getAllMetadataVo = new GetAllMetadataVo.Builder(baseInfoVo)
                    .build();
            podSakku.getAllMetaData(getAllMetadataVo, new OnGetResponseListener<List<CatalogMetadata>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogMetadata>> result) {
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void getAllMetaData_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllMetadataVo getAllMetadataVo = new GetAllMetadataVo.Builder(baseInfoVo)
                    .setPage(1)
                    .setSize(10)
                    .build();
            podSakku.getAllMetaData(getAllMetadataVo, new OnGetResponseListener<List<CatalogMetadata>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogMetadata>> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals("version", result.getResult().get(0).getName());
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



