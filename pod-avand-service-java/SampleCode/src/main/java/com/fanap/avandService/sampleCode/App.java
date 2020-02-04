package com.fanap.avandService.sampleCode;

import com.fanap.AvandService.controller.AvandService;
import com.fanap.AvandService.data.modelSrv.InvoiceSrv;
import com.fanap.AvandService.data.modelSrv.IssueInvoiceSrv;
import com.fanap.AvandService.data.modelSrv.VerifyAndCancelInvoiceSrv;
import com.fanap.AvandService.data.modelVo.*;
import com.fanap.AvandService.util.OnGetResponseListener;
import com.fanap.podBaseService.exception.PodException;

import java.util.List;

/**
 * Created by Zahra Gholinia on 10/9/2019.
 */

public class
App {

    private static final String TOKEN = "";

    public static void main(String[] args) {
            issueInvoice();
//            cancelInvoice();
//            verifyInvoice();
//            getInvoiceList();

    }

    private static void verifyInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        try {
            VerifyInvoiceVo verifyInvoiceVo = new VerifyInvoiceVo.Builder(baseInfoVo)
                    .setInvoiceId(9120623L)
                    .build();
            avandService.verifyInvoice(verifyInvoiceVo, new OnGetResponseListener<VerifyAndCancelInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<VerifyAndCancelInvoiceSrv> result) {
                    try {
                        System.out.println(result.getResult().getResult().getReferenceId());
                    } catch (com.fanap.podBaseService.exception.PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (
                PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void cancelInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        try {
            CancelInvoiceVo cancelInvoiceVo = new CancelInvoiceVo.Builder(baseInfoVo)
                    .setInvoiceId(9120734L)
                    .build();
            avandService.cancelInvoice(cancelInvoiceVo, new OnGetResponseListener<VerifyAndCancelInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<VerifyAndCancelInvoiceSrv> result) {
                    try {
                        System.out.println(result.getResult().getResult().getReferenceId());
                    } catch (com.fanap.podBaseService.exception.PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void issueInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("65d6fad92ffa49b4b3d09a1db39193f3")
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
                        System.out.println(result.getResult().getResult().getResult().getPaymentUrl());
                    } catch (com.fanap.podBaseService.exception.PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getInvoiceList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .build();

        AvandService avandService = new AvandService();
        try {
            GetInvoiceListVo getInvoiceListVo = null;
            try {
                getInvoiceListVo = new GetInvoiceListVo.Builder(baseInfoVo)
                        .setOffset(0)
                        .setSize(10)
                        //                    .setScVoucherHash(voucherHashs)
                        .build();
            } catch (com.fanap.podBaseService.exception.PodException e) {
                e.printStackTrace();
            }
            avandService.getInvoiceList(getInvoiceListVo, new OnGetResponseListener<List<InvoiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<InvoiceSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

}



