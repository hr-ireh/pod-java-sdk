package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.PayAnyInvoiceByCreditVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.DelegationInfo;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestPayAnyInvoiceByCredit {
    private static final String TOKEN = "";
    @Test
    public void payAnyInvoiceByCredit_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("b7ada5e256d1b9d7")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();

        try {
            PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo = new PayAnyInvoiceByCreditVo.Builder(baseInfoVo)
                    .setInvoiceId(31580L)
                    .setWallet("PODLAND_WALLET")
                    .build();
            billingService.payAnyInvoiceByCredit(payAnyInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
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
                            assertEquals(24, e.getCode());
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
    public void payAnyInvoiceByCredit_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("b7ada5e256d1b9d7")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        DelegationInfo[] delegationInfo ={new DelegationInfo(1234L,"bb")};
        List<String> scVoucherHashs = new ArrayList<>();
        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo = new PayAnyInvoiceByCreditVo.Builder(baseInfoVo)
                    .setInvoiceId(31580L)
                    .setWallet("PODLAND_WALLET")
                    .setDelegationInfos(delegationInfo)
                    .build();
            billingService.payAnyInvoiceByCredit(payAnyInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
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
                            assertEquals(24, e.getCode());
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
    public void payAnyInvoiceByCredit_RequiredParameters_InvoiceId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("b7ada5e256d1b9d7")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();

        try {
            PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo = new PayAnyInvoiceByCreditVo.Builder(baseInfoVo)
                    .setWallet("PODLAND_WALLET")
                    .build();
            billingService.payAnyInvoiceByCredit(payAnyInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
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
    public void payAnyInvoiceByCredit_RequiredParameters_Wallet() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("b7ada5e256d1b9d7")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();

        try {
            PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo = new PayAnyInvoiceByCreditVo.Builder(baseInfoVo)
                    .setInvoiceId(31580L)
                    .build();
            billingService.payAnyInvoiceByCredit(payAnyInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
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
    public void payAnyInvoiceByCredit_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();

        try {
            PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo = new PayAnyInvoiceByCreditVo.Builder(baseInfoVo)
                    .build();
            billingService.payAnyInvoiceByCredit(payAnyInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
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
