package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.PayInvoiceByInvoiceVo;
import com.fanap.billingService.data.modelVo.ResultVo;
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
public class TestPayInvoiceByInvoice {


    private static final String TOKEN = "";

    @Test
//    @DisplayName("")
    public void payInvoiceByInvoice_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("004ad4f37900410f9f15caae9a62a87b")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            PayInvoiceByInvoiceVo payInvoiceByInvoiceVo = new PayInvoiceByInvoiceVo.Builder(baseInfoVo)
                    .setCreditorInvoiceId(32476L)
                    .setDebtorInvoiceId(32479L)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.payInvoiceByInvoice(payInvoiceByInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
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
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    @Test
//    @DisplayName("")
    public void payInvoiceByInvoice_SomeRequiredParameters_CreditorInvoiceId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("004ad4f37900410f9f15caae9a62a87b")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            PayInvoiceByInvoiceVo payInvoiceByInvoiceVo = new PayInvoiceByInvoiceVo.Builder(baseInfoVo)
                    .setDebtorInvoiceId(32479L)
                    .build();
            billingService.payInvoiceByInvoice(payInvoiceByInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
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

    @Test
//    @DisplayName("")
    public void payInvoiceByInvoice_SomeRequiredParameters_DebtorInvoiceId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("004ad4f37900410f9f15caae9a62a87b")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            PayInvoiceByInvoiceVo payInvoiceByInvoiceVo = new PayInvoiceByInvoiceVo.Builder(baseInfoVo)
                    .setDebtorInvoiceId(32479L)
                    .build();
            billingService.payInvoiceByInvoice(payInvoiceByInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
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

    @Test
//    @DisplayName("")
    public void payInvoiceByInvoice_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            PayInvoiceByInvoiceVo payInvoiceByInvoiceVo = new PayInvoiceByInvoiceVo.Builder(baseInfoVo)
                    .build();
            billingService.payInvoiceByInvoice(payInvoiceByInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
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
