import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.AppNetworkSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.CreateNetworkVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCreateNetwork {

    private static String TOKEN = "";

    @Test
    public void createNetwork_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CreateNetworkVo createNetworkVo = new CreateNetworkVo.Builder(baseInfoVo)
                    .setName("testCreateNetwork1")
                    .build();
            podSakku.createNetwork(createNetworkVo, new OnGetResponseListener<AppNetworkSrv>() {
                @Override
                public void onResponse(ResultVo<AppNetworkSrv> result) {
                    System.out.println(result.getResult().getName());
                    try {
                        assertEquals("testCreateNetwork1", result.getResult().getName());
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
    public void createNetwork_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CreateNetworkVo createNetworkVo = new CreateNetworkVo.Builder(baseInfoVo)
                    .build();
            podSakku.createNetwork(createNetworkVo, new OnGetResponseListener<AppNetworkSrv>() {
                @Override
                public void onResponse(ResultVo<AppNetworkSrv> result) {
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

}
