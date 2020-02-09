import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.UserAmountSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.data.modelVo.TransferByInvoiceVo;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestTransferByInvoice {
    private static String TOKEN = "";
    @Test
    public void transferByInvoice_RequiredParameters1() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            TransferByInvoiceVo transferByInvoiceVo = new TransferByInvoiceVo.Builder(baseInfoVo)
                    .setAmount(100L)
                    .setDescription("هی تو پووول بده")
                    .setInvoiceId(48332L)
                    .setGuildCode("CLOTHING_GUILD")
//                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferByInvoice(transferByInvoiceVo, new OnGetResponseListener<UserAmountSrv>() {
                @Override
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getAmount());
                    new Thread(() -> {
                        try {
                            assertEquals(false, result.isHasError());
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
    public void transferByInvoice_RequiredParameters2() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            TransferByInvoiceVo transferByInvoiceVo = new TransferByInvoiceVo.Builder(baseInfoVo)
                    .setAmount(1L)
                    .setDescription("هی تو پووول بده")
                    .setInvoiceId(48332L)
//                    .setGuildCode("ENGINEERING_GUILD")
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferByInvoice(transferByInvoiceVo, new OnGetResponseListener<UserAmountSrv>() {
                @Override
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getAmount());
                    new Thread(() -> {
                        try {
                            assertEquals(false, result.isHasError());
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
    public void transferByInvoice_AllParameters1() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            TransferByInvoiceVo transferByInvoiceVo = new TransferByInvoiceVo.Builder(baseInfoVo)
                    .setAmount(1L)
                    .setDescription("هی تو پووول بده")
                    .setInvoiceId(48332L)
                    .setGuildCode("CLOTHING_GUILD")
                    .setCurrencyCode("IRR")
                    .setCustomerAmount(1L)
                    .setUniqueId("cvsdv")
                    .build();
            podVirtualAccount.transferByInvoice(transferByInvoiceVo, new OnGetResponseListener<UserAmountSrv>() {
                @Override
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getAmount());
                    new Thread(() -> {
                        try {
                            assertEquals(false, result.isHasError());
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
    public void transferByInvoice_RequiredParameters_Amount() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            TransferByInvoiceVo transferByInvoiceVo = new TransferByInvoiceVo.Builder(baseInfoVo)
                    .setDescription("هی تو پووول بده")
                    .setInvoiceId(49873l)
                    .setGuildCode("ENGINEERING_GUILD")
//                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferByInvoice(transferByInvoiceVo, new OnGetResponseListener<UserAmountSrv>() {
                @Override
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getAmount());
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
    public void transferByInvoice_RequiredParameters_Description() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            TransferByInvoiceVo transferByInvoiceVo = new TransferByInvoiceVo.Builder(baseInfoVo)
                    .setAmount(1L)
                    .setInvoiceId(49873l)
                    .setGuildCode("ENGINEERING_GUILD")
//                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferByInvoice(transferByInvoiceVo, new OnGetResponseListener<UserAmountSrv>() {
                @Override
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getAmount());
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
    public void transferByInvoice_RequiredParameters_InvoiceId() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            TransferByInvoiceVo transferByInvoiceVo = new TransferByInvoiceVo.Builder(baseInfoVo)
                    .setAmount(1L)
                    .setDescription("هی تو پووول بده")
                    .setGuildCode("ENGINEERING_GUILD")
//                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferByInvoice(transferByInvoiceVo, new OnGetResponseListener<UserAmountSrv>() {
                @Override
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getAmount());
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
    public void transferByInvoice_NoParameters() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            TransferByInvoiceVo transferByInvoiceVo = new TransferByInvoiceVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.transferByInvoice(transferByInvoiceVo, new OnGetResponseListener<UserAmountSrv>() {
                @Override
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getAmount());
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
