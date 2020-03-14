import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.CatalogAppFullSrv;
import com.fanap.podSakku.data.modelSrv.CatalogAppMetadata;
import com.fanap.podSakku.data.modelSrv.CatalogUpdate;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.data.modelVo.UpdateCatalogVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestUpdateCatalog {
    private static String TOKEN = "";

    @Test
    public void updateCatalog_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogUpdate catalogUpdate = new CatalogUpdate();
        catalogUpdate.setName("zahratest");
        catalogUpdate.setMetadata(new ArrayList<CatalogAppMetadata>() {
        });
        try {
            UpdateCatalogVo updateCatalogVo = new UpdateCatalogVo.Builder(baseInfoVo)
                    .setCatalogAppId(63L)
                    .setCatalogUpdate(catalogUpdate)
                    .build();
            podSakku.updateCatalog(updateCatalogVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
                    System.out.println(result.getResult().getName());
                    try {
                        assertEquals("zahratest", result.getResult().getName());
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
    public void updateCatalog_RequiredParameters_CatalogAppId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogUpdate catalogUpdate = new CatalogUpdate();
        catalogUpdate.setName("zahratest");
        catalogUpdate.setMetadata(new ArrayList<CatalogAppMetadata>() {
        });
        try {
            UpdateCatalogVo updateCatalogVo = new UpdateCatalogVo.Builder(baseInfoVo)
                    .setCatalogUpdate(catalogUpdate)
                    .build();
            podSakku.updateCatalog(updateCatalogVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
                    System.out.println(result.getResult().getName());
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
    public void updateCatalog_RequiredParameters_CatalogUpdateVO() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogUpdate catalogUpdate = new CatalogUpdate();
        catalogUpdate.setName("zahratest");
        catalogUpdate.setMetadata(new ArrayList<CatalogAppMetadata>() {
        });
        try {
            UpdateCatalogVo updateCatalogVo = new UpdateCatalogVo.Builder(baseInfoVo)
                    .setCatalogAppId(63L)
                    .build();
            podSakku.updateCatalog(updateCatalogVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
                    System.out.println(result.getResult().getName());
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

    @Test
    public void updateCatalog_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            UpdateCatalogVo updateCatalogVo = new UpdateCatalogVo.Builder(baseInfoVo)
                    .build();
            podSakku.updateCatalog(updateCatalogVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
                    System.out.println(result.getResult().getName());
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
