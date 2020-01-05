package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestReduceMultiInvoice {
@Test
    public void reduceMultiInvoice_AllParameters()  {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        ReduceInvoiceSubItemVo mainReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(34881L)
                .setDescription("JJ")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> mainReduceInvoiceSubItemVos = new ArrayList<>();
        mainReduceInvoiceSubItemVos.add(mainReduceInvoiceSubItemVo);

    ReduceInvoiceItemVO mainInvoiceVos = null;
    try {
        mainInvoiceVos = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32514L)
                .setReduceInvoiceItemVOs(mainReduceInvoiceSubItemVos)
                .build();
    } catch (PodException e) {
        fail();
    }

    ReduceInvoiceSubItemVo subReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(32515L)
                .setDescription("jioj")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> subrReduceInvoiceSubItemVos = new ArrayList<>();
        subrReduceInvoiceSubItemVos.add(subReduceInvoiceSubItemVo);


    ReduceInvoiceItemVO subReduceInvoiceItemVo = null;
    try {
        subReduceInvoiceItemVo = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32515L)
                .setReduceInvoiceItemVOs(subrReduceInvoiceSubItemVos)
                .build();
    } catch (PodException e) {
        fail();
    }

    List<ReduceInvoiceItemVO> subReduceInvoiceItemVos = new ArrayList<>();
        subReduceInvoiceItemVos.add(subReduceInvoiceItemVo);

        ReduceInvoiceSubItemVo customerreduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(34879L)
                .setDescription("DFDF")
                .setPrice(100L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerreduceInvoiceSubItemVo);


        ReduceMultiInvoiceDataVo reduceMultiInvoiceDataVo = new ReduceMultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVos)
                .setSubInvoices(subReduceInvoiceItemVos)
                .setCustomerInvoiceItemVOs(customerInvoiceItems);
        try {
            ReduceMultiInvoiceVo reduceMultiInvoiceVo = new ReduceMultiInvoiceVo.Builder(baseInfoVo)
                    .setData(reduceMultiInvoiceDataVo)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.reduceMultiInvoice(reduceMultiInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult());
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
                            assertEquals(32, e.getCode());
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
        } catch (JsonProcessingException e) {
          fail();
        }

    }

    @Test
    public void reduceMultiInvoice_NoParameters()  {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        BillingService billingService = new BillingService();
        try {
            ReduceMultiInvoiceVo reduceMultiInvoiceVo = new ReduceMultiInvoiceVo.Builder(baseInfoVo)

                    .build();
            billingService.reduceMultiInvoice(reduceMultiInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult());
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
