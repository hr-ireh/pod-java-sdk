package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.PayInvoiceInFutureVo;
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
public class TestPayInvoiceInFuture {
    private static final String TOKEN = "";


    @Test
//    @DisplayName("")
    public void payInvoiceInFuture_RequiredParameters_wallet() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setOtt("")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        try {
            PayInvoiceInFutureVo payInvoiceInFutureVo = new PayInvoiceInFutureVo.Builder(baseInfoVo)
                    .setDate("1399/07/05")
                    .setInvoiceId(31607L)
                    .setWallet("PODLAND_WALLET")
                    .build();
            billingService.payInvoiceInFuture(payInvoiceInFutureVo, new OnGetResponseListener<Boolean>() {
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
                            assertEquals(999, e.getCode());
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
    public void payInvoiceInFuture_RequiredParameters_GuildCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setOtt("")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        try {
            PayInvoiceInFutureVo payInvoiceInFutureVo = new PayInvoiceInFutureVo.Builder(baseInfoVo)
                    .setDate("1399/07/05")
                    .setInvoiceId(31607L)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .build();
            billingService.payInvoiceInFuture(payInvoiceInFutureVo, new OnGetResponseListener<Boolean>() {
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
                            assertEquals(999, e.getCode());
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
    public void payInvoiceInFuture_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setOtt("")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        try {
            PayInvoiceInFutureVo payInvoiceInFutureVo = new PayInvoiceInFutureVo.Builder(baseInfoVo)
                    .setDate("1398/07/05")
                    .setInvoiceId(31607L)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setWallet("PODLAND_WALLET")
                    .build();
            billingService.payInvoiceInFuture(payInvoiceInFutureVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
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
    public void payInvoiceInFuture_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        try {
            PayInvoiceInFutureVo payInvoiceInFutureVo = new PayInvoiceInFutureVo.Builder(baseInfoVo)
                    .build();
            billingService.payInvoiceInFuture(payInvoiceInFutureVo, new OnGetResponseListener<Boolean>() {
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
//    @DisplayName("")c
    public void payInvoiceInFuture_SomeRequiredParameters_Date() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setOtt("")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        try {
            PayInvoiceInFutureVo payInvoiceInFutureVo = new PayInvoiceInFutureVo.Builder(baseInfoVo)
                    .setInvoiceId(31607L)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setWallet("PODLAND_WALLET")
                    .build();
            billingService.payInvoiceInFuture(payInvoiceInFutureVo, new OnGetResponseListener<Boolean>() {
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
    public void payInvoiceInFuture_SomeRequiredParameters_InvoiceId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setOtt("")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        try {
            PayInvoiceInFutureVo payInvoiceInFutureVo = new PayInvoiceInFutureVo.Builder(baseInfoVo)
                    .setDate("1398/07/05")
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setWallet("PODLAND_WALLET")
                    .build();
            billingService.payInvoiceInFuture(payInvoiceInFutureVo, new OnGetResponseListener<Boolean>() {
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
