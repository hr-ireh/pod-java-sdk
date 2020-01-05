package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.GetInvoiceListByMetadataVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestGetInvoiceListByMetadata {
    private static final String TOKEN = "";

    @Test
//    @DisplayName("")
    public void getInvoiceListByMetadata_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListByMetadataVo getInvoiceListByMetadataVo = new GetInvoiceListByMetadataVo.Builder(baseInfoVo)
                    .setMetaQuery("{\n" +
                            "  \"field\":\"name\",\n" +
                            "  \"is\":\"ali\"}")
                    .build();
            billingService.getInvoiceListByMetadata(getInvoiceListByMetadataVo,
                    new OnGetResponseListener<List<InvoiceSrv>>() {
                        @Override
                        public void onResponse(ResultVo<List<InvoiceSrv>> result) {
                            new Thread(() -> {
                                try {
                                    assertEquals(0, result.getResult().size());
                                    System.out.println(result.getResult());
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
//    @DisplayName("")
    public void getInvoiceListByMetadata_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListByMetadataVo getInvoiceListByMetadataVo = new GetInvoiceListByMetadataVo.Builder(baseInfoVo)
                    .setMetaQuery("{\n" +
                            "  \"field\":\"name\",\n" +
                            "  \"is\":\"ali\"}")
                    .setIsCanceled(false)
                    .setIsPayed(false)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            billingService.getInvoiceListByMetadata(getInvoiceListByMetadataVo,
                    new OnGetResponseListener<List<InvoiceSrv>>() {
                        @Override
                        public void onResponse(ResultVo<List<InvoiceSrv>> result) {
                            new Thread(() -> {
                                try {
                                    assertEquals(0, result.getResult().size());
                                    System.out.println(result.getResult());
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
//    @DisplayName("")
    public void getInvoiceListByMetadata_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListByMetadataVo getInvoiceListByMetadataVo = new GetInvoiceListByMetadataVo.Builder(baseInfoVo)
                    .build();
            billingService.getInvoiceListByMetadata(getInvoiceListByMetadataVo,
                    new OnGetResponseListener<List<InvoiceSrv>>() {
                        @Override
                        public void onResponse(ResultVo<List<InvoiceSrv>> result) {
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
//    @DisplayName("")
    public void getInvoiceListByMetadata_RequiredParameters_metaQuery() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListByMetadataVo getInvoiceListByMetadataVo = new GetInvoiceListByMetadataVo.Builder(baseInfoVo)
                    .setIsPayed(false)
                    .setIsCanceled(false)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            billingService.getInvoiceListByMetadata(getInvoiceListByMetadataVo,
                    new OnGetResponseListener<List<InvoiceSrv>>() {
                        @Override
                        public void onResponse(ResultVo<List<InvoiceSrv>> result) {
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
