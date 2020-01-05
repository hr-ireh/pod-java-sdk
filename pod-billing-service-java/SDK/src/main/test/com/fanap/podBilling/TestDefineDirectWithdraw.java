package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.DirectWithdrawSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.DefineDirectWithdrawVo;
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

public class TestDefineDirectWithdraw {
    private final String TOKEN = "";

    @Test
    public void defineDirectWithdraw_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .setUsername("zahra")
                    .setPrivateKey("")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
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
                            assertEquals(170, e.getCode());
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
    public void defineDirectWithdraw_RequiredParameters_UserName() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .setPrivateKey("")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
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
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    @Test
    public void defineDirectWithdraw_RequiredParameters_Wallet() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .setPrivateKey("")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setUsername("zah")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
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
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    @Test
    public void defineDirectWithdraw_RequiredParameters_PrivateKey() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .setUsername("hi")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
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
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    @Test
    public void defineDirectWithdraw_RequiredParameters_DepositNumber() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .setUsername("hi")
                    .setPrivateKey("")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
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
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    @Test
    public void defineDirectWithdraw_RequiredParameters_OnDemand() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .setUsername("hi")
                    .setPrivateKey("")
                    .setDepositNumber("13692932")
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
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
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    @Test
    public void defineDirectWithdraw_RequiredParameters_MinAmount() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .setUsername("hi")
                    .setPrivateKey("")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
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
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    @Test
    public void defineDirectWithdraw_RequiredParameters_MaxAmount() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .setUsername("hi")
                    .setPrivateKey("")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
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
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    @Test
    public void defineDirectWithdraw_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
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
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


}
