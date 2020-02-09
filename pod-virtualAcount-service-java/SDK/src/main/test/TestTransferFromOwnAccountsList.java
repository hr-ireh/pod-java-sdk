import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.TransferCreditSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.data.modelVo.TransferFromOwnAccountsListVo;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestTransferFromOwnAccountsList {
    private static String TOKEN = "";

    @Test
    public void transferFromOwnAccountsList_AllParameters() {

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
            TransferFromOwnAccountsListVo transferFromOwnAccountsListVo = new TransferFromOwnAccountsListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .setFromDate("1398/05/09")
                    .setToDate("1399/05/09")
                    .setUniqueId("dgdsfv")
                    .build();
            podVirtualAccount.transferFromOwnAccountsList(transferFromOwnAccountsListVo, new OnGetResponseListener<List<TransferCreditSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferCreditSrv>> result) {
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
    public void transferFromOwnAccountsList_RequiredParameters() {

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
            TransferFromOwnAccountsListVo transferFromOwnAccountsListVo = new TransferFromOwnAccountsListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podVirtualAccount.transferFromOwnAccountsList(transferFromOwnAccountsListVo, new OnGetResponseListener<List<TransferCreditSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferCreditSrv>> result) {
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
    public void transferFromOwnAccountsList_RequiredParameters_Size() {

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
            TransferFromOwnAccountsListVo transferFromOwnAccountsListVo = new TransferFromOwnAccountsListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setFromDate("1376/05/09")
                    .setToDate("1376/05/09")
                    .setUniqueId("789")
                    .build();
            podVirtualAccount.transferFromOwnAccountsList(transferFromOwnAccountsListVo, new OnGetResponseListener<List<TransferCreditSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferCreditSrv>> result) {
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
    public void transferFromOwnAccountsList_RequiredParameters_Offset() {

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
            TransferFromOwnAccountsListVo transferFromOwnAccountsListVo = new TransferFromOwnAccountsListVo.Builder(baseInfoVo)
                    .setSize(50)
                    .setFromDate("1376/05/09")
                    .setToDate("1376/05/09")
                    .setUniqueId("789")
                    .build();
            podVirtualAccount.transferFromOwnAccountsList(transferFromOwnAccountsListVo, new OnGetResponseListener<List<TransferCreditSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferCreditSrv>> result) {
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
    public void transferFromOwnAccountsList_NoParameters() {

//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            TransferFromOwnAccountsListVo transferFromOwnAccountsListVo = new TransferFromOwnAccountsListVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.transferFromOwnAccountsList(transferFromOwnAccountsListVo, new OnGetResponseListener<List<TransferCreditSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferCreditSrv>> result) {
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
