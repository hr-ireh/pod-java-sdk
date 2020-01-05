package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.ExportServiceSrv;
import com.fanap.billingService.data.modelSrv.LinkSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.GetExportListVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.EnumFileStatusCode;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestGetExportList {
    private static final String TOKEN = "";

    @Test
//    @DisplayName("")
    public void getExportList_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9dfc30b213f74c82b2e03053c338d58e")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumFileStatusCode enumFileStatusCode = EnumFileStatusCode.EXPORT_SERVICE_STATUS_SUCCESSFUL;

//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            GetExportListVo getExportListVo = new GetExportListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            billingService.getExportList(getExportListVo, new OnGetResponseListener<List<ExportServiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ExportServiceSrv>> result) {
                    LinkSrv linkSrv = new LinkSrv();
                    linkSrv = getExportListVo.getLink(result.getResult().get(0).getResultFile().getId(), result.getResult().get(0).getResultFile().getHashCode());
                    System.out.println(linkSrv.getRedirectUrl());
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
//    @DisplayName("")
    public void getExportList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9dfc30b213f74c82b2e03053c338d58e")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumFileStatusCode enumFileStatusCode = EnumFileStatusCode.EXPORT_SERVICE_STATUS_SUCCESSFUL;

//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            GetExportListVo getExportListVo = new GetExportListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .setStatusCode(enumFileStatusCode.getValue())
                    .setId(51537L)
                    .setServiceUrl("asdfg")
                    .build();
            billingService.getExportList(getExportListVo, new OnGetResponseListener<List<ExportServiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ExportServiceSrv>> result) {
//                    LinkSrv linkSrv = new LinkSrv();
//                    linkSrv = getExportListVo.getLink(result.getResult().get(0).getResultFile().getId(), result.getResult().get(0).getResultFile().getHashCode());
//                    System.out.println(linkSrv.getRedirectUrl());
                    new Thread(() -> {
                        try {
                            assertEquals(0, result.getResult().size());
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
//    @DisplayName("")
    public void getExportList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();
        EnumFileStatusCode enumFileStatusCode = EnumFileStatusCode.EXPORT_SERVICE_STATUS_SUCCESSFUL;
        try {
            GetExportListVo getExportListVo = new GetExportListVo.Builder(baseInfoVo)
                    .build();
            billingService.getExportList(getExportListVo, new OnGetResponseListener<List<ExportServiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ExportServiceSrv>> result) {
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
//    @DisplayName("")
    public void getExportList_RequiredParameters_Offset() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9dfc30b213f74c82b2e03053c338d58e")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumFileStatusCode enumFileStatusCode = EnumFileStatusCode.EXPORT_SERVICE_STATUS_SUCCESSFUL;

//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            GetExportListVo getExportListVo = new GetExportListVo.Builder(baseInfoVo)
                    .setSize(50)
                    .build();
            billingService.getExportList(getExportListVo, new OnGetResponseListener<List<ExportServiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ExportServiceSrv>> result) {
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
//    @DisplayName("")
    public void getExportList_RequiredParameters_Size() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9dfc30b213f74c82b2e03053c338d58e")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumFileStatusCode enumFileStatusCode = EnumFileStatusCode.EXPORT_SERVICE_STATUS_SUCCESSFUL;

//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            GetExportListVo getExportListVo = new GetExportListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .build();
            billingService.getExportList(getExportListVo, new OnGetResponseListener<List<ExportServiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ExportServiceSrv>> result) {
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
