package com.fanap.AvandService.service;

import com.fanap.AvandService.data.modelSrv.InvoiceSrv;
import com.fanap.AvandService.data.modelSrv.IssueInvoiceSrv;
import com.fanap.AvandService.data.modelSrv.VerifyAndCancelInvoiceSrv;
import com.fanap.AvandService.data.modelVo.CancelInvoiceVo;
import com.fanap.AvandService.data.modelVo.GetInvoiceListVo;
import com.fanap.AvandService.data.modelVo.IssueInvoiceVo;
import com.fanap.AvandService.data.modelVo.VerifyInvoiceVo;
import com.fanap.AvandService.util.GetResult;
import com.fanap.AvandService.util.OnGetResponseListener;
import com.fanap.AvandService.util.RetrofitUtil;

import java.util.List;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */
public class Service {

    public void issueInvoice(IssueInvoiceVo issueInvoiceVo, OnGetResponseListener onGetResponseListener) {

        AvandService service = RetrofitUtil
                .getInstance()
                .create(AvandService.class);

        new GetResult<IssueInvoiceSrv>(service.issueInvoice(
                issueInvoiceVo.getBaseInfoVo().getToken(),
                issueInvoiceVo.getBaseInfoVo().getToken_issuer(),
                issueInvoiceVo.getBaseInfoVo().getOtt(),
                issueInvoiceVo.getScProductId(),
                issueInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                issueInvoiceVo.getBaseInfoVo().getScApiKey(),
                issueInvoiceVo.getRedirectUri(),
                issueInvoiceVo.getUserId(),
                issueInvoiceVo.getBusinessId(),
                issueInvoiceVo.getPrice()
        ), onGetResponseListener).get();
    }

    public void cancelInvoice(CancelInvoiceVo cancelInvoiceVo,
                              OnGetResponseListener onGetResponseListener) {

        AvandService service = RetrofitUtil
                .getInstance()
                .create(AvandService.class);

        new GetResult<VerifyAndCancelInvoiceSrv>(service.cancelInvoice(
                cancelInvoiceVo.getBaseInfoVo().getToken(),
                cancelInvoiceVo.getBaseInfoVo().getToken_issuer(),
                cancelInvoiceVo.getScProductId(),
                cancelInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                cancelInvoiceVo.getBaseInfoVo().getScApiKey(),
                cancelInvoiceVo.getInvoiceId()
        ),
                onGetResponseListener).get();
    }

    public void verifyInvoice(VerifyInvoiceVo verifyInvoiceVo,
                              OnGetResponseListener onGetResponseListener) {

        AvandService service = RetrofitUtil
                .getInstance()
                .create(AvandService.class);

        new GetResult<VerifyAndCancelInvoiceSrv>(service.verifyInvoice(
                verifyInvoiceVo.getBaseInfoVo().getToken(),
                verifyInvoiceVo.getBaseInfoVo().getToken_issuer(),
                verifyInvoiceVo.getScProductId(),
                verifyInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                verifyInvoiceVo.getBaseInfoVo().getScApiKey(),
                verifyInvoiceVo.getInvoiceId()
        ),
                onGetResponseListener).get();
    }

    public void getInvoiceList(GetInvoiceListVo getInvoiceListVo,
                               OnGetResponseListener onGetResponseListener) {

        AvandService service = RetrofitUtil
                .getInstance()
                .create(AvandService.class);

        new GetResult<List<InvoiceSrv>>(service.getInvoiceList(
                getInvoiceListVo.getBaseInfoVo().getToken(),
                getInvoiceListVo.getBaseInfoVo().getToken_issuer(),
                getInvoiceListVo.getScProductId(),
                getInvoiceListVo.getBaseInfoVo().getScVoucherHash(),
                getInvoiceListVo.getBaseInfoVo().getScApiKey(),
                getInvoiceListVo.getId(),
                getInvoiceListVo.getBillNumber(),
                getInvoiceListVo.getUniqueNumber(),
                getInvoiceListVo.getTrackerId(),
                getInvoiceListVo.getFromDate(),
                getInvoiceListVo.getToDate(),
                getInvoiceListVo.getIsCanceled(),
                getInvoiceListVo.getIsPayed(),
                getInvoiceListVo.getIsClosed(),
                getInvoiceListVo.getIsWaiting(),
                getInvoiceListVo.getGuildCode(),
                getInvoiceListVo.getReferenceNumber(),
                getInvoiceListVo.getUserId(),
                getInvoiceListVo.getId(),
                getInvoiceListVo.getQuery(),
                getInvoiceListVo.getFirstId(),
                getInvoiceListVo.getLastId(),
                getInvoiceListVo.getOffset(),
                getInvoiceListVo.getEntityIdList(),
                getInvoiceListVo.getSize()
        ),
                onGetResponseListener).get();
    }
}
