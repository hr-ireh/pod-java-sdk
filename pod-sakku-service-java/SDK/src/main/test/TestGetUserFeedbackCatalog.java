import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.CatalogAppFullSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetUserFeedbackCatalogVo;
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

public class TestGetUserFeedbackCatalog {

    private static String TOKEN = "";

    @Test
    public void getUserFeedbackCatalog_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetUserFeedbackCatalogVo getUserFeedbackCatalogVo = new GetUserFeedbackCatalogVo.Builder(baseInfoVo)
                    .setStatus(false)
                    .build();
            podSakku.getUserFeedbackCatalog(getUserFeedbackCatalogVo, new OnGetResponseListener<List<CatalogAppFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogAppFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    try {
                        assertEquals(5, result.getResult().get(0).getId());
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
    public void getUserFeedbackCatalog_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetUserFeedbackCatalogVo getUserFeedbackCatalogVo = new GetUserFeedbackCatalogVo.Builder(baseInfoVo)
                    .build();
            podSakku.getUserFeedbackCatalog(getUserFeedbackCatalogVo, new OnGetResponseListener<List<CatalogAppFullSrv>>() {
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
