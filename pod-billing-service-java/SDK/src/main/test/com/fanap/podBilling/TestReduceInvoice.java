package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.InvoiceItemInfoVo;
import com.fanap.billingService.data.modelVo.ReduceInvoiceVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestReduceInvoice {
    private static final String TOKEN = "";

    @Test
//    @DisplayName("")
    public void reduceInvoice_RequiredParameters() {
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
        List<InvoiceItemInfoVo> invoiceItemInfoVos = new ArrayList<>();
        InvoiceItemInfoVo invoiceItemInfoVo = new InvoiceItemInfoVo();
        invoiceItemInfoVo.setInvoiceItemId(34625L)
                .setPrice(new BigDecimal(2))
                .setItemDescription("ete")
                .setQuantity(new BigDecimal(2));
        invoiceItemInfoVos.add(invoiceItemInfoVo);


        try {
            ReduceInvoiceVo reduceInvoiceVo = new ReduceInvoiceVo.Builder(baseInfoVo)
                    .setId(32276L)
                    .setInvoiceItemsInfo(invoiceItemInfoVos)
                    .build();
            billingService.reduceInvoice(reduceInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            fail();
                            System.out.println(result.getResult().getUserSrv().getId());
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
                            assertEquals(4, e.getCode());
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
    public void reduceInvoice_AllParameters() {
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
        List<InvoiceItemInfoVo> invoiceItemInfoVos = new ArrayList<>();
        InvoiceItemInfoVo invoiceItemInfoVo = new InvoiceItemInfoVo();
        invoiceItemInfoVo.setInvoiceItemId(60745L)
                .setPrice(new BigDecimal(1))
                .setItemDescription("test")
                .setQuantity(new BigDecimal(2));
        invoiceItemInfoVos.add(invoiceItemInfoVo);


        try {
            ReduceInvoiceVo reduceInvoiceVo = new ReduceInvoiceVo.Builder(baseInfoVo)
                    .setId(56197L)
                    .setInvoiceItemsInfo(invoiceItemInfoVos)
                    .setPreferredTaxRate(0.03D)
                    .build();
            billingService.reduceInvoice(reduceInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            fail();
                            System.out.println(result.getResult().getId());
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
                            assertEquals(32, e.getCode());
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
    public void reduceInvoice_NoParameters() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        BillingService billingService = new BillingService();
        try {
            ReduceInvoiceVo reduceInvoiceVo = new ReduceInvoiceVo.Builder(baseInfoVo)
                    .build();
            billingService.reduceInvoice(reduceInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            fail();
                            System.out.println(result.getResult().getUserSrv().getId());
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
        } catch (
                PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @DisplayName("")
    public void reduceInvoice_RequiredParameters_Id() {
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
        List<InvoiceItemInfoVo> invoiceItemInfoVos = new ArrayList<>();
        InvoiceItemInfoVo invoiceItemInfoVo = new InvoiceItemInfoVo();
        invoiceItemInfoVo.setInvoiceItemId(34625L)
                .setPrice(new BigDecimal(2))
                .setItemDescription("ete")
                .setQuantity(new BigDecimal(2));
        invoiceItemInfoVos.add(invoiceItemInfoVo);


        try {
            ReduceInvoiceVo reduceInvoiceVo = new ReduceInvoiceVo.Builder(baseInfoVo)
                    .setInvoiceItemsInfo(invoiceItemInfoVos)
                    .build();
            billingService.reduceInvoice(reduceInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            fail();
                            System.out.println(result.getResult().getUserSrv().getId());
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
    public void reduceInvoice_RequiredParameters_InvoiceItemsInfo() {
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
        List<InvoiceItemInfoVo> invoiceItemInfoVos = new ArrayList<>();
        InvoiceItemInfoVo invoiceItemInfoVo = new InvoiceItemInfoVo();
        invoiceItemInfoVo.setInvoiceItemId(34625L)
                .setPrice(new BigDecimal(2))
                .setItemDescription("ete")
                .setQuantity(new BigDecimal(2));
        invoiceItemInfoVos.add(invoiceItemInfoVo);


        try {
            ReduceInvoiceVo reduceInvoiceVo = new ReduceInvoiceVo.Builder(baseInfoVo)
                    .setId(123L)
                    .build();
            billingService.reduceInvoice(reduceInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            fail();
                            System.out.println(result.getResult().getUserSrv().getId());
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
