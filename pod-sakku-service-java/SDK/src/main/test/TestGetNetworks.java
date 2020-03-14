import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.AppNetworkSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetNetworksVo;
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

public class TestGetNetworks {
    private static String TOKEN = "";

@Test
    public void getNetworks() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetNetworksVo getNetworksVo = new GetNetworksVo.Builder(baseInfoVo)
                    .build();
            podSakku.getNetworks(getNetworksVo, new OnGetResponseListener<List<AppNetworkSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AppNetworkSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    try {
                        assertEquals("default_user_network_197", result.getResult().get(0).getName());
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
