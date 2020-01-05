package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.data.modelVo.VerifyInvoiceVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestVerifyInvoice {
    private static final String TOKEN = "";


    @Test
//    @DisplayName("")
    public void verifyInvoice_RequiredParameters_id() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScVoucherHash("")
//                .setScApiKey("")
                .build();
        BillingService billingService = new BillingService();
        try {
            VerifyInvoiceVo verifyInvoiceVo = new VerifyInvoiceVo.Builder(baseInfoVo)
                    .setId(38255L)
                    .build();
            billingService.verifyInvoice(verifyInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
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
                            assertEquals(59, e.getCode());
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (
                PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
//    @DisplayName("")
    public void verifyInvoice_RequiredParameters_billNumber() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScVoucherHash("")
//                .setScApiKey("")
                .build();
        BillingService billingService = new BillingService();
        try {
            VerifyInvoiceVo verifyInvoiceVo = new VerifyInvoiceVo.Builder(baseInfoVo)
                    .setBillNumber("12")
                    .build();
            billingService.verifyInvoice(verifyInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
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
                            assertEquals(59, e.getCode());
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (
                PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @DisplayName("")
    public void verifyInvoice_AllParameters() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScVoucherHash("")
//                .setScApiKey("")
                .build();
        BillingService billingService = new BillingService();
        try {
            VerifyInvoiceVo verifyInvoiceVo = new VerifyInvoiceVo.Builder(baseInfoVo)
                    .setId(38255L)
                    .setBillNumber("hjgfj")
                    .build();
            billingService.verifyInvoice(verifyInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
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
        } catch (
                PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @DisplayName("")
    public void verifyInvoice_NoParameters() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();
        try {
            VerifyInvoiceVo verifyInvoiceVo = new VerifyInvoiceVo.Builder(baseInfoVo)
                    .build();
            billingService.verifyInvoice(verifyInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
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
        } catch (
                PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
