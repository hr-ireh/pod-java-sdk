import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.IssueCreditInvoiceAndGetHashVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestIssueCreditInvoiceAndGetHash {
    private static String TOKEN = "";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";


    @Test
    public void issueCreditInvoiceAndGetHash_AllParameters() {
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
            IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo = new IssueCreditInvoiceAndGetHashVo.Builder(baseInfoVo)
                    .setAmount(100L)
                    .setBillNumber("kobra11")
                    .setRedirectUrl("https://www.google.com/")
                    .setWallet("PODLAND_WALLET")
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                    System.out.println(issueCreditInvoiceAndGetHashVo.getLink(result.getResult()));
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
    public void issueCreditInvoiceAndGetHash_RequiredParameters_Amount() {
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
            IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo = new IssueCreditInvoiceAndGetHashVo.Builder(baseInfoVo)
                    .setBillNumber("987")
                    .setRedirectUrl("https://www.google.com/")
                    .setWallet("PODLAND_WALLET")
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
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
    public void issueCreditInvoiceAndGetHash_RequiredParameters_BillNumber() {
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
            IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo = new IssueCreditInvoiceAndGetHashVo.Builder(baseInfoVo)
                    .setAmount(0L)
                    .setRedirectUrl("https://www.google.com/")
                    .setWallet("PODLAND_WALLET")
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
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
    public void issueCreditInvoiceAndGetHash_RequiredParameters_RedirectUrl() {
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
            IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo = new IssueCreditInvoiceAndGetHashVo.Builder(baseInfoVo)
                    .setAmount(0L)
                    .setBillNumber("987")
                    .setWallet("PODLAND_WALLET")
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
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
    public void issueCreditInvoiceAndGetHash_RequiredParameters_wallet() {
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
            IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo = new IssueCreditInvoiceAndGetHashVo.Builder(baseInfoVo)
                    .setAmount(0L)
                    .setBillNumber("987")
                    .setRedirectUrl("https://www.google.com/")
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
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
    public void issueCreditInvoiceAndGetHash_RequiredParameters_UserId() {
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
            IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo = new IssueCreditInvoiceAndGetHashVo.Builder(baseInfoVo)
                    .setAmount(0L)
                    .setBillNumber("987")
                    .setRedirectUrl("https://www.google.com/")
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
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
    public void issueCreditInvoiceAndGetHash_NoParameters() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo = new IssueCreditInvoiceAndGetHashVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
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
