package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.VoucherSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.DefineCreditVoucherVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import com.fanap.billingService.util.Voucher;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestDefineCreditVoucher {
    private final String TOKEN = "";

    @Test
    public void defineCreditVoucher_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");
        try {
            DefineCreditVoucherVo defineCreditVoucherVo = new DefineCreditVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
                    .build();
            billingService.defineCreditVoucher(defineCreditVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    new Thread(() -> {
                        try {
                            assertEquals("بن شارژ اعتبار - لیست محصولات", result.getResult().get(0).getName());
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
    public void defineCreditVoucher_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        Voucher[] vouchers = {new Voucher(1, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        List<String> hashs = new ArrayList<>();
        hashs.add(generatedString);
        try {
            DefineCreditVoucherVo defineCreditVoucherVo = new DefineCreditVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
                    .setLimitedConsumerId(16849L)
                    .setCurrencyCode("IIR")
                    .setHashCode(hashs)
                    .build();
            billingService.defineCreditVoucher(defineCreditVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    new Thread(() -> {
                        try {
                            assertEquals("بن شارژ اعتبار - لیست محصولات", result.getResult().get(0).getName());
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
    public void defineCreditVoucher_RequiredParameters_GuildCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");
        try {
            DefineCreditVoucherVo defineCreditVoucherVo = new DefineCreditVoucherVo.Builder(baseInfoVo)
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
                    .build();
            billingService.defineCreditVoucher(defineCreditVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0));
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
    public void defineCreditVoucher_RequiredParameters_ExpireDate() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");
        try {
            DefineCreditVoucherVo defineCreditVoucherVo = new DefineCreditVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setVouchers(vouchers)
                    .build();
            billingService.defineCreditVoucher(defineCreditVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0));
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
    public void defineCreditVoucher_RequiredParameters_Vouchers() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");
        try {
            DefineCreditVoucherVo defineCreditVoucherVo = new DefineCreditVoucherVo.Builder(baseInfoVo)
                    .setExpireDate("1400/12/01")
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .build();
            billingService.defineCreditVoucher(defineCreditVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0));
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
    public void defineCreditVoucher_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");
        try {
            DefineCreditVoucherVo defineCreditVoucherVo = new DefineCreditVoucherVo.Builder(baseInfoVo)
                    .build();
            billingService.defineCreditVoucher(defineCreditVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0));
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
