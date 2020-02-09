import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.UserAmountSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.data.modelVo.TransferToFollowerVo;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestTransferToFollower {
    private static String TOKEN = "";

    @Test
    public void transferToFollower_RequiredParameters() {
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
            TransferToFollowerVo transferToFollowerVo = new TransferToFollowerVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("زود باش پول بده")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferToFollower(transferToFollowerVo, new OnGetResponseListener<UserAmountSrv>() {
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
    public void transferToFollower_AllParameters() {
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
            TransferToFollowerVo transferToFollowerVo = new TransferToFollowerVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("زود باش پول بده")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .setCurrencyCode("IRR")
                    .setUniqueId("147")
                    .build();
            podVirtualAccount.transferToFollower(transferToFollowerVo, new OnGetResponseListener<UserAmountSrv>() {
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
    public void transferToFollower_RequiredParameters_GuildCode() {
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
            TransferToFollowerVo transferToFollowerVo = new TransferToFollowerVo.Builder(baseInfoVo)
                    .setAmount(1L)
                    .setDescription("زود باش پول بده")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferToFollower(transferToFollowerVo, new OnGetResponseListener<UserAmountSrv>() {
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
    public void transferToFollower_RequiredParameters_Amount() {
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
            TransferToFollowerVo transferToFollowerVo = new TransferToFollowerVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setDescription("زود باش پول بده")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferToFollower(transferToFollowerVo, new OnGetResponseListener<UserAmountSrv>() {
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
    public void transferToFollower_RequiredParameters_Description() {
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
            TransferToFollowerVo transferToFollowerVo = new TransferToFollowerVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferToFollower(transferToFollowerVo, new OnGetResponseListener<UserAmountSrv>() {
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
    public void transferToFollower_RequiredParameters_UserId() {
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
            TransferToFollowerVo transferToFollowerVo = new TransferToFollowerVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("زود باش پول بده")
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferToFollower(transferToFollowerVo, new OnGetResponseListener<UserAmountSrv>() {
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
    public void transferToFollower_RequiredParameters_Wallet() {
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
            TransferToFollowerVo transferToFollowerVo = new TransferToFollowerVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("زود باش پول بده")
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.transferToFollower(transferToFollowerVo, new OnGetResponseListener<UserAmountSrv>() {
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
    public void transferToFollower_NoParameters() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();

        try {
            TransferToFollowerVo transferToFollowerVo = new TransferToFollowerVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.transferToFollower(transferToFollowerVo, new OnGetResponseListener<UserAmountSrv>() {
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
