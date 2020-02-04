import com.fanap.AvandService.controller.AvandService;
import com.fanap.AvandService.data.modelSrv.IssueInvoiceSrv;
import com.fanap.AvandService.data.modelVo.BaseInfoVo;
import com.fanap.AvandService.data.modelVo.IssueInvoiceVo;
import com.fanap.AvandService.data.modelVo.ResultVo;
import com.fanap.AvandService.util.OnGetResponseListener;
import com.fanap.podBaseService.exception.PodException;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestIssueInvoice {
    private static final String TOKEN = "";
    @Test
    public void issueInvoice_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setBusinessId(4826L)
                    .setPrice(1.0)
                    .setRedirectUri("https://www.google.com/")
                    .setUserId(2127611L)
                    .build();
            avandService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<IssueInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<IssueInvoiceSrv> result) {
                    try {
                            try {
                                assertEquals(0, result.getResult().getResult().getErrorCode());
                            } catch (AssertionFailedError el) {
                                optionalThrowable[0] = Optional.of(el);
                            }
                            cdl.countDown();

                    } catch (com.fanap.podBaseService.exception.PodException e) {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
                }

                @Override
                public void onFailed(PodException e) {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    @Test
    public void issueInvoice_RequiredParameters_BusinessId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setPrice(1.0)
                    .setRedirectUri("https://www.google.com/")
                    .setUserId(2127611L)
                    .build();
            avandService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<IssueInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<IssueInvoiceSrv> result) {
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    @Test
    public void issueInvoice_RequiredParameters_Price() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setBusinessId(12L)
                    .setRedirectUri("https://www.google.com/")
                    .setUserId(2127611L)
                    .build();
            avandService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<IssueInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<IssueInvoiceSrv> result) {
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    @Test
    public void issueInvoice_RequiredParameters_RedirectUri() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setBusinessId(12L)
                    .setPrice(1.0)
                    .setUserId(2127611L)
                    .build();
            avandService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<IssueInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<IssueInvoiceSrv> result) {
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    @Test
    public void issueInvoice_RequiredParameters_UserId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setBusinessId(12L)
                    .setPrice(1.0)
                    .setRedirectUri("https://www.google.com/")
                    .build();
            avandService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<IssueInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<IssueInvoiceSrv> result) {
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void issueInvoice_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        AvandService avandService = new AvandService();
        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .build();
            avandService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<IssueInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<IssueInvoiceSrv> result) {
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
