package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.VoucherSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.DefineDiscountPercentageVoucherVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.enums.Enum_Server_type_Percent;
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

public class TestDefineDiscountPercentageVoucher {
    private final String TOKEN = "";
    @Test
    public void defineDiscountPercentageVoucher_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<Long> entityIds = new ArrayList<>();
        entityIds.add(29990L);
        entityIds.add(29989L);
        List<Integer> discountPercentages = new ArrayList<>();
        discountPercentages.add(35);
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        Enum_Server_type_Percent typePercent = Enum_Server_type_Percent.eight;

        try {
            DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo = new DefineDiscountPercentageVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("GAME_OWNER_GUILD")
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
                    .setType(typePercent)
                    .setDiscountPercentage(discountPercentages)
                    .build();
            billingService.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getHash());
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
    public void defineDiscountPercentageVoucher_AllParameters() {
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
        List<Long> entityIds = new ArrayList<>();
        entityIds.add(29990L);
        entityIds.add(29989L);
        List<Integer> discountPercentages = new ArrayList<>();
        discountPercentages.add(35);
        Voucher[] vouchers = {new Voucher(1, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        Enum_Server_type_Percent typePercent = Enum_Server_type_Percent.eight;
        List<String> hashs = new ArrayList<>();
        hashs.add(generatedString);


        try {
            DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo = new DefineDiscountPercentageVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("GAME_OWNER_GUILD")
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
                    .setType(typePercent)
                    .setDiscountPercentage(discountPercentages)
                    .setEntityId(entityIds)
                    .setLimitedConsumerId(16849L)
                    .setCurrencyCode("IIR")
                    .setHashCode(hashs)
                    .build();
            billingService.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getHash());
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
    public void defineDiscountPercentageVoucher_RequiredParameters_GuildCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<Long> entityIds = new ArrayList<>();
        entityIds.add(29990L);
        entityIds.add(29989L);
        List<Integer> discountPercentages = new ArrayList<>();
        discountPercentages.add(35);
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        Enum_Server_type_Percent typePercent = Enum_Server_type_Percent.eight;
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");


        try {
            DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo = new DefineDiscountPercentageVoucherVo.Builder(baseInfoVo)
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
                    .setType(typePercent)
                    .setDiscountPercentage(discountPercentages)
//                    .setEntityId(entityIds)
//                    .setLimitedConsumerId(16849L)
//                    .setCurrencyCode("IIR")
//                    .setHashCode(hashs)
//                   .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getHash());
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
    public void defineDiscountPercentageVoucher_RequiredParameters_ExpireDate() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<Long> entityIds = new ArrayList<>();
        entityIds.add(29990L);
        entityIds.add(29989L);
        List<Integer> discountPercentages = new ArrayList<>();
        discountPercentages.add(35);
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        Enum_Server_type_Percent typePercent = Enum_Server_type_Percent.eight;
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");


        try {
            DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo = new DefineDiscountPercentageVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("GAME_OWNER_GUILD")
                    .setVouchers(vouchers)
                    .setType(typePercent)
                    .setDiscountPercentage(discountPercentages)
//                    .setEntityId(entityIds)
//                    .setLimitedConsumerId(16849L)
//                    .setCurrencyCode("IIR")
//                    .setHashCode(hashs)
//                   .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getHash());
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
    public void defineDiscountPercentageVoucher_RequiredParameters_Voucher() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<Long> entityIds = new ArrayList<>();
        entityIds.add(29990L);
        entityIds.add(29989L);
        List<Integer> discountPercentages = new ArrayList<>();
        discountPercentages.add(35);
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        Enum_Server_type_Percent typePercent = Enum_Server_type_Percent.eight;
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");


        try {
            DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo = new DefineDiscountPercentageVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("GAME_OWNER_GUILD")
                    .setExpireDate("1400/12/01")
                    .setType(typePercent)
                    .setDiscountPercentage(discountPercentages)
//                    .setEntityId(entityIds)
//                    .setLimitedConsumerId(16849L)
//                    .setCurrencyCode("IIR")
//                    .setHashCode(hashs)
//                   .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getHash());
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
    public void defineDiscountPercentageVoucher_RequiredParameters_Type() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<Long> entityIds = new ArrayList<>();
        entityIds.add(29990L);
        entityIds.add(29989L);
        List<Integer> discountPercentages = new ArrayList<>();
        discountPercentages.add(35);
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        Enum_Server_type_Percent typePercent = Enum_Server_type_Percent.eight;
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");


        try {
            DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo = new DefineDiscountPercentageVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("GAME_OWNER_GUILD")
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
                    .setDiscountPercentage(discountPercentages)
//                    .setEntityId(entityIds)
//                    .setLimitedConsumerId(16849L)
//                    .setCurrencyCode("IIR")
//                    .setHashCode(hashs)
//                   .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getHash());
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
    public void defineDiscountPercentageVoucher_RequiredParameters_DiscountPercentage() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<Long> entityIds = new ArrayList<>();
        entityIds.add(29990L);
        entityIds.add(29989L);
        List<Integer> discountPercentages = new ArrayList<>();
        discountPercentages.add(35);
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        Enum_Server_type_Percent typePercent = Enum_Server_type_Percent.eight;
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");


        try {
            DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo = new DefineDiscountPercentageVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("GAME_OWNER_GUILD")
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
                    .setType(typePercent)
//                    .setEntityId(entityIds)
//                    .setLimitedConsumerId(16849L)
//                    .setCurrencyCode("IIR")
//                    .setHashCode(hashs)
//                   .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getHash());
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
    public void defineDiscountPercentageVoucher_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();

        try {
            DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo = new DefineDiscountPercentageVoucherVo.Builder(baseInfoVo)
                    .build();
            billingService.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getHash());
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
