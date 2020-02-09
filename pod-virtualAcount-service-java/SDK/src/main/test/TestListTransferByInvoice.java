import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.TransferToFollowerSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ListTransferByInvoiceVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestListTransferByInvoice {

    private static String TOKEN = "";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    @Test
    public void listTransferByInvoice_RequiredParameters() {
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
            ListTransferByInvoiceVo listTransferByInvoiceVo = new ListTransferByInvoiceVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podVirtualAccount.listTransferByInvoice(listTransferByInvoiceVo, new OnGetResponseListener<List<TransferToFollowerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferToFollowerSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
    public void listTransferByInvoice_AllParameters() {
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
            ListTransferByInvoiceVo listTransferByInvoiceVo = new ListTransferByInvoiceVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .setCurrencyCode("IRR")
                    .setFromAmount(1L)
                    .setFromDate("1398/02/02")
                    .setGuildCode("ENGINEERING_GUILD")
                    .setInvoiceId(1L)
                    .setToAmount(10000L)
                    .setToDate("1399/02/02")
                    .setUniqueId("dfer")
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.listTransferByInvoice(listTransferByInvoiceVo, new OnGetResponseListener<List<TransferToFollowerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferToFollowerSrv>> result) {
//                    System.out.println(result.getResult().get(0).getId());
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
    public void listTransferByInvoice_RequiredParameters_Offset() {
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
            ListTransferByInvoiceVo listTransferByInvoiceVo = new ListTransferByInvoiceVo.Builder(baseInfoVo)
                    .setSize(50)
                    .build();
            podVirtualAccount.listTransferByInvoice(listTransferByInvoiceVo, new OnGetResponseListener<List<TransferToFollowerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferToFollowerSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
    public void listTransferByInvoice_RequiredParameters_Size() {
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
            ListTransferByInvoiceVo listTransferByInvoiceVo = new ListTransferByInvoiceVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .build();
            podVirtualAccount.listTransferByInvoice(listTransferByInvoiceVo, new OnGetResponseListener<List<TransferToFollowerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferToFollowerSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
    public void listTransferByInvoice_NoParameters() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();

        try {
            ListTransferByInvoiceVo listTransferByInvoiceVo = new ListTransferByInvoiceVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.listTransferByInvoice(listTransferByInvoiceVo, new OnGetResponseListener<List<TransferToFollowerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferToFollowerSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
