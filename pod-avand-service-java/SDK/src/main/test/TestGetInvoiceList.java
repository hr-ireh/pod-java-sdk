import com.fanap.AvandService.controller.AvandService;
import com.fanap.AvandService.data.modelSrv.InvoiceSrv;
import com.fanap.AvandService.data.modelVo.BaseInfoVo;
import com.fanap.AvandService.data.modelVo.GetInvoiceListVo;
import com.fanap.AvandService.data.modelVo.ResultVo;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.AvandService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestGetInvoiceList {
    private static final String TOKEN = "";


    @Test
//    @DisplayName("")
    public void getInvoiceList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        LocalDateTime fromDate = LocalDateTime.of(1398, 06, 01, 13, 0, 0);
        LocalDateTime toDate = LocalDateTime.of(1398, 10, 02, 13, 0, 0);
        List<Long> issuerId = new ArrayList<>();
        issuerId.add(16128L);
//        List<String> scVoucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        GetInvoiceListVo getInvoiceListVo = null;
        try {
            getInvoiceListVo = new GetInvoiceListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .setBillNumber("1")
//                    .setEntityIdList()
                    .setFirstId(0L)
                    .setFromDate(fromDate)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setId(32276L)
                    .setIsCanceled(false)
                    .setIsClosed(false)
                    .setIsPayed(false)
                    .setIssuerId(issuerId)
                    .setIsWaiting(true)
                    .setLastId(32189L)
//                    .setQuery("پرداخت")
                    .setReferenceNumber("53138324")
                    .setToDate(toDate)
//                    .setTrackerId()
                    .setUniqueNumber("9d117cee5a341961")
                    .setUserId(16849L)
                    .build();
            avandService.getInvoiceList(getInvoiceListVo, new OnGetResponseListener<List<InvoiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<InvoiceSrv>> result) {
                    System.out.println(result.getResult());
                        try {
                            assertEquals(0, result.getResult().size());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                }
                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @DisplayName("")
    public void getInvoiceList_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListVo getInvoiceListVo = new GetInvoiceListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            avandService.getInvoiceList(getInvoiceListVo, new OnGetResponseListener<List<InvoiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<InvoiceSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    new Thread(() -> {
                        try {
                            assertEquals(9134969, result.getResult().get(0).getId());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
        } catch (com.fanap.podBaseService.exception.PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    @Test
//    @DisplayName("")
    public void getInvoiceList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        AvandService avandService = new AvandService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListVo getInvoiceListVo = new GetInvoiceListVo.Builder(baseInfoVo)
                    .build();
            avandService.getInvoiceList(getInvoiceListVo, new OnGetResponseListener<List<InvoiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<InvoiceSrv>> result) {
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
        } catch (com.fanap.podBaseService.exception.PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    @Test
//    @DisplayName("")
    public void getInvoiceList_SomeRequiredParameters_offset() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListVo getInvoiceListVo = new GetInvoiceListVo.Builder(baseInfoVo)
                    .setSize(10)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            avandService.getInvoiceList(getInvoiceListVo, new OnGetResponseListener<List<InvoiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<InvoiceSrv>> result) {
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
        } catch (com.fanap.podBaseService.exception.PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    @Test
    //    @DisplayName("")
    public void getInvoiceList_SomeRequiredParameters_size() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListVo getInvoiceListVo = new GetInvoiceListVo.Builder(baseInfoVo)
                    .setOffset(0)
//                    .setLastId(77777L)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            avandService.getInvoiceList(getInvoiceListVo, new OnGetResponseListener<List<InvoiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<InvoiceSrv>> result) {
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
        } catch (com.fanap.podBaseService.exception.PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }
}
