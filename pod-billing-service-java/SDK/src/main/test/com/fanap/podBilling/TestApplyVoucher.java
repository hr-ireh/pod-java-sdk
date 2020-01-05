package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.ApplyVoucherVo;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestApplyVoucher {
    private final String TOKEN = "";
    @Test
    public void applyVoucher_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("745ca2da8203263b")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        List<String> voucherHashs = new ArrayList<>();
        voucherHashs.add("YELZF7WUHRLD");


        try {
            ApplyVoucherVo applyVoucherVo = new ApplyVoucherVo.Builder(baseInfoVo)
                    .setInvoiceId(37445L)
                    .setVoucherHash(voucherHashs)
                    .build();
            billingService.applyVoucher(applyVoucherVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getDescription());
                    new Thread(() -> {
                        try {
                            assertEquals(37445, result.getResult().getId());
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
    public void applyVoucher_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("745ca2da8203263b")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        List<String> voucherHashs = new ArrayList<>();
        voucherHashs.add("YELZF7WUHRLD");


        try {
            ApplyVoucherVo applyVoucherVo = new ApplyVoucherVo.Builder(baseInfoVo)
                    .setInvoiceId(37445L)
                    .setVoucherHash(voucherHashs)
                    .setPreview(false)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.applyVoucher(applyVoucherVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getDescription());
                    new Thread(() -> {
                        try {
                            assertEquals(37445, result.getResult().getId());
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
    public void applyVoucher_RequiredParameters_VoucherHashs() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("745ca2da8203263b")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        List<String> voucherHashs = new ArrayList<>();
        voucherHashs.add("YELZF7WUHRLD");
        try {
            ApplyVoucherVo applyVoucherVo = new ApplyVoucherVo.Builder(baseInfoVo)
                    .setInvoiceId(37445L)
                    .build();
            billingService.applyVoucher(applyVoucherVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getDescription());
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
    @Test
    public void applyVoucher_RequiredParameters_InvoiceId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("745ca2da8203263b")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        List<String> voucherHashs = new ArrayList<>();
        voucherHashs.add("YELZF7WUHRLD");
        try {
            ApplyVoucherVo applyVoucherVo = new ApplyVoucherVo.Builder(baseInfoVo)
                  .setVoucherHash(voucherHashs)
                    .build();
            billingService.applyVoucher(applyVoucherVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getDescription());
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
    @Test
    public void applyVoucher_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        List<String> voucherHashs = new ArrayList<>();
        voucherHashs.add("YELZF7WUHRLD");


        try {
            ApplyVoucherVo applyVoucherVo = new ApplyVoucherVo.Builder(baseInfoVo)
                    .build();
            billingService.applyVoucher(applyVoucherVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getDescription());
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
