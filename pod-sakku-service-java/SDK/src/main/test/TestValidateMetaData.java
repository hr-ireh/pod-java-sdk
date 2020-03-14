import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.CatalogMetadata;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.data.modelVo.ValidateMetadataVo;
import com.fanap.podSakku.enums.CatalogMetadataScope;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestValidateMetaData {
    private static String TOKEN = "";

    @Test
    public void validateMetaData_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogMetadata catalogMetadata = new CatalogMetadata();
        catalogMetadata.setDescription("test sdk");
        catalogMetadata.setName("version");
        catalogMetadata.setScope(CatalogMetadataScope.CONFIG);
        try {
            ValidateMetadataVo validateMetadataVo = new ValidateMetadataVo.Builder(baseInfoVo)
                    .setMetadataVO(catalogMetadata)
                    .build();
            podSakku.validateMetaData(validateMetadataVo, new OnGetResponseListener<CatalogMetadata>() {
                @Override
                public void onResponse(ResultVo<CatalogMetadata> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals("version", result.getResult().getName());
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
    public void validateMetaData_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            ValidateMetadataVo validateMetadataVo = new ValidateMetadataVo.Builder(baseInfoVo)
                    .build();
            podSakku.validateMetaData(validateMetadataVo, new OnGetResponseListener<CatalogMetadata>() {
                @Override
                public void onResponse(ResultVo<CatalogMetadata> result) {
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

}
