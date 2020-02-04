import com.fanap.AvandService.controller.AvandService;
import com.fanap.AvandService.data.modelSrv.VerifyAndCancelInvoiceSrv;
import com.fanap.AvandService.data.modelVo.BaseInfoVo;
import com.fanap.AvandService.data.modelVo.ResultVo;
import com.fanap.AvandService.data.modelVo.VerifyInvoiceVo;
import com.fanap.AvandService.util.OnGetResponseListener;
import com.fanap.podBaseService.exception.PodException;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestVerifyInvoice {
    private static final String TOKEN = "";

    @Test
    public void verifyInvoice_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        try {
            VerifyInvoiceVo verifyInvoiceVo = new VerifyInvoiceVo.Builder(baseInfoVo)
                    .setInvoiceId(9134972L)
                    .build();
            avandService.verifyInvoice(verifyInvoiceVo, new OnGetResponseListener<VerifyAndCancelInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<VerifyAndCancelInvoiceSrv> result) {
                    try {
                        try {
                            assertEquals(0, result.getResult().getResult().getErrorCode());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();

//                        System.out.println(result.getResult().getResult().getResult().getPaymentUrl());
                    } catch (com.fanap.podBaseService.exception.PodException e) {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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
        } catch (
                PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    @Test
    public void verifyInvoice_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        AvandService avandService = new AvandService();
        try {
            VerifyInvoiceVo verifyInvoiceVo = new VerifyInvoiceVo.Builder(baseInfoVo)
                    .build();
            avandService.verifyInvoice(verifyInvoiceVo, new OnGetResponseListener<VerifyAndCancelInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<VerifyAndCancelInvoiceSrv> result) {
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
        } catch (
                PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
