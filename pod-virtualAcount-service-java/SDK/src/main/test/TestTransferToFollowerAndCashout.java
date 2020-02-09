import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.UserAmountSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.data.modelVo.TransferToFollowerAndCashoutVo;
import com.fanap.podVirtualAccount.enums.Enum_Tool_Code;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestTransferToFollowerAndCashout {

    private static String TOKEN = "";
    @Test
    public void transferToFollowerAndCashout_RequiredParameters() {
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
            TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo = new TransferToFollowerAndCashoutVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("آفرین که تو تست قبل زود بهم پول دادی")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getActive());
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
    public void transferToFollowerAndCashout_AllParameters() {
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
            TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo = new TransferToFollowerAndCashoutVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("آفرین که تو تست قبل زود بهم پول دادی")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .setToolCode(Enum_Tool_Code.SETTLEMENT_TOOL_CARD.getToolCode())
                    .setCurrencyCode("IRR")
                    .setUniqueId("sfs")
                    .build();
            podVirtualAccount.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getActive());
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
    public void transferToFollowerAndCashout_RequiredParameters_GuildCode() {
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
            TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo = new TransferToFollowerAndCashoutVo.Builder(baseInfoVo)
                    .setAmount(1L)
                    .setDescription("آفرین که تو تست قبل زود بهم پول دادی")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .setToolCode(Enum_Tool_Code.SETTLEMENT_TOOL_CARD.getToolCode())
                    .build();
            podVirtualAccount.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getActive());
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
    public void transferToFollowerAndCashout_RequiredParameters_Amount() {
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
            TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo = new TransferToFollowerAndCashoutVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setDescription("آفرین که تو تست قبل زود بهم پول دادی")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .setToolCode(Enum_Tool_Code.SETTLEMENT_TOOL_CARD.getToolCode())
                    .build();
            podVirtualAccount.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getActive());
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
    public void transferToFollowerAndCashout_RequiredParameters_Description() {
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
            TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo = new TransferToFollowerAndCashoutVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .setToolCode(Enum_Tool_Code.SETTLEMENT_TOOL_CARD.getToolCode())
                    .build();
            podVirtualAccount.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getActive());
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
    public void transferToFollowerAndCashout_RequiredParameters_UserId() {
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
            TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo = new TransferToFollowerAndCashoutVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("آفرین که تو تست قبل زود بهم پول دادی")
                    .setWallet("PODLAND_WALLET")
                    .setToolCode(Enum_Tool_Code.SETTLEMENT_TOOL_CARD.getToolCode())
                    .build();
            podVirtualAccount.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getActive());
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
    public void transferToFollowerAndCashout_RequiredParameters_Wallet() {
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
            TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo = new TransferToFollowerAndCashoutVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("آفرین که تو تست قبل زود بهم پول دادی")
                    .setUserId(7001L)
                    .setToolCode(Enum_Tool_Code.SETTLEMENT_TOOL_CARD.getToolCode())
                    .build();
            podVirtualAccount.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getActive());
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
    public void transferToFollowerAndCashout_NoParameters() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();

        try {
            TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo = new TransferToFollowerAndCashoutVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getActive());
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
