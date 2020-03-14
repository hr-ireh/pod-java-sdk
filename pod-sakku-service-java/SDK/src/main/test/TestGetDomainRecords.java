import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.DomainRRSet;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetDomainRecordsVo;
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

public class TestGetDomainRecords {
    private static String TOKEN = "";

    @Test
    public void getDomainRecords_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetDomainRecordsVo getDomainRecordsVo = new GetDomainRecordsVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .build();
            podSakku.getDomainRecords(getDomainRecordsVo, new OnGetResponseListener<List<DomainRRSet>>() {
                @Override
                public void onResponse(ResultVo<List<DomainRRSet>> result) {
                    System.out.println(result.getResult().size());
                    try {
                        assertEquals("@", result.getResult().get(0).getName());
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
    public void getDomainRecords_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetDomainRecordsVo getDomainRecordsVo = new GetDomainRecordsVo.Builder(baseInfoVo)
                    .build();
            podSakku.getDomainRecords(getDomainRecordsVo, new OnGetResponseListener<List<DomainRRSet>>() {
                @Override
                public void onResponse(ResultVo<List<DomainRRSet>> result) {
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
