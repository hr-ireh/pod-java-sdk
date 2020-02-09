import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.AccountBillItemSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.GetWalletAccountBillVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestGetWalletAccountBill {
    private static String TOKEN = "";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    @Test
    public void getWalletAccountBill_RequiredParameters() {
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
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetWalletAccountBillVo GetWalletAccountBillVo = new GetWalletAccountBillVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(55)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.getWalletAccountBill(GetWalletAccountBillVo, new OnGetResponseListener<List<AccountBillItemSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AccountBillItemSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void getWalletAccountBill_AllParameters() {
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
            GetWalletAccountBillVo GetWalletAccountBillVo = new GetWalletAccountBillVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(55)
                    .setWallet("PODLAND_WALLET")
                    .setAmountFrom(1L)
                    .setAmountTo(1L)
                    .setBlock(false)
                    .setCurrencyCode("IRR")
                    .setDateFrom("")
                    .setDateTo("")
                    .setDebtor(false)
                    .setDescription("dfd")
                    .setGuildCode("")
                    .build();
            podVirtualAccount.getWalletAccountBill(GetWalletAccountBillVo, new OnGetResponseListener<List<AccountBillItemSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AccountBillItemSrv>> result) {
                    System.out.println(result.getResult().size());
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
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void getWalletAccountBill_RequiredParameters_Offset() {
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
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetWalletAccountBillVo GetWalletAccountBillVo = new GetWalletAccountBillVo.Builder(baseInfoVo)
                    .setSize(55)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.getWalletAccountBill(GetWalletAccountBillVo, new OnGetResponseListener<List<AccountBillItemSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AccountBillItemSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void getWalletAccountBill_RequiredParameters_Size() {
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
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetWalletAccountBillVo GetWalletAccountBillVo = new GetWalletAccountBillVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.getWalletAccountBill(GetWalletAccountBillVo, new OnGetResponseListener<List<AccountBillItemSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AccountBillItemSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void getWalletAccountBill_RequiredParameters_Wallet() {
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
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetWalletAccountBillVo GetWalletAccountBillVo = new GetWalletAccountBillVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(55)
                    .build();
            podVirtualAccount.getWalletAccountBill(GetWalletAccountBillVo, new OnGetResponseListener<List<AccountBillItemSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AccountBillItemSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void getWalletAccountBill_NoParameters() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();

        try {
            GetWalletAccountBillVo GetWalletAccountBillVo = new GetWalletAccountBillVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.getWalletAccountBill(GetWalletAccountBillVo, new OnGetResponseListener<List<AccountBillItemSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AccountBillItemSrv>> result) {
                    System.out.println(result.getResult().size());
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
