import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.CreditInvoiceSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.data.modelVo.VerifyCreditInvoiceVo;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestVerifyCreditInvoice {
    private static String TOKEN = "";

    @Test
    public void verifyCreditInvoice_AllParameters() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            VerifyCreditInvoiceVo verifyCreditInvoiceVo = new VerifyCreditInvoiceVo.Builder(baseInfoVo)
                    .setBillNumber("123")
                    .setId(82L)
                    .build();
            podVirtualAccount.verifyCreditInvoice(verifyCreditInvoiceVo, new OnGetResponseListener<CreditInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<CreditInvoiceSrv> result) {
                    System.out.println(result.getResult());
                    new Thread(() -> {
                        try {
                            assertEquals(false, result.isHasError());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void verifyCreditInvoice_NoParameters() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            VerifyCreditInvoiceVo verifyCreditInvoiceVo = new VerifyCreditInvoiceVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.verifyCreditInvoice(verifyCreditInvoiceVo, new OnGetResponseListener<CreditInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<CreditInvoiceSrv> result) {
                    System.out.println(result.getResult());
                    new Thread(() -> {
                        try {
                            fail();
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
