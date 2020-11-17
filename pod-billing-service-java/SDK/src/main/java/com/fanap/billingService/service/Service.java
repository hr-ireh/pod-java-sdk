package com.fanap.billingService.service;

import com.fanap.billingService.data.modelSrv.*;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.*;

import java.util.List;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */
public class Service {

    public void ott(OttVo ottVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        ottVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<String>(service.ott(
                ottVo.getBaseInfoVo().getToken(),
                ottVo.getBaseInfoVo().getToken_issuer(),
                ottVo.getScProductId(),
                ottVo.getBaseInfoVo().getScVoucherHash(),
                ottVo.getBaseInfoVo().getScApiKey()
        ), onGetResponseListener).get();
    }

    public ResultVo<String> ott(OttVo ottVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        ottVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.ott(
                ottVo.getBaseInfoVo().getToken(),
                ottVo.getBaseInfoVo().getToken_issuer(),
                ottVo.getScProductId(),
                ottVo.getBaseInfoVo().getScVoucherHash(),
                ottVo.getBaseInfoVo().getScApiKey()
        )).getResponse();
    }

    public void issueInvoice(IssueInvoiceVo issueInvoiceVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        issueInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.issueInvoice(
                issueInvoiceVo.getBaseInfoVo().getToken(),
                issueInvoiceVo.getBaseInfoVo().getToken_issuer(),
                issueInvoiceVo.getBaseInfoVo().getOtt(),
                issueInvoiceVo.getScProductId(),
                issueInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                issueInvoiceVo.getBaseInfoVo().getScApiKey(),
                issueInvoiceVo.getRedirectURL(),
                issueInvoiceVo.getUserId(),
                issueInvoiceVo.getBillNumber(),
                issueInvoiceVo.getDescription(),
                issueInvoiceVo.getDeadline(),
                issueInvoiceVo.getEntityId(),
                issueInvoiceVo.getPrice(),
                issueInvoiceVo.getQuantity(),
                issueInvoiceVo.getProductDescription(),
                issueInvoiceVo.getGuildCode(),
                issueInvoiceVo.getCurrencyCode(),
                issueInvoiceVo.getAddressId(),
                issueInvoiceVo.getVoucherHash(),
                issueInvoiceVo.getPreferredTaxRate(),
                issueInvoiceVo.getVerificationNeeded(),
                issueInvoiceVo.getVerifyAfterTimeout(),
                issueInvoiceVo.getPreview(),
                issueInvoiceVo.getMetadata(),
                issueInvoiceVo.getSafe(),
                issueInvoiceVo.getPostVoucherEnabled(),
                issueInvoiceVo.getHasEvent(),
                issueInvoiceVo.getEventTitle(),
                issueInvoiceVo.getEventTimeZone(),
                issueInvoiceVo.getEventReminders(),
                issueInvoiceVo.getEventDescription(),
                issueInvoiceVo.getEventMetadata(),
                issueInvoiceVo.getCellphoneNumber()
        ), onGetResponseListener).get();
    }

    public ResultVo<InvoiceSrv> issueInvoice(IssueInvoiceVo issueInvoiceVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        issueInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.issueInvoice(
                issueInvoiceVo.getBaseInfoVo().getToken(),
                issueInvoiceVo.getBaseInfoVo().getToken_issuer(),
                issueInvoiceVo.getBaseInfoVo().getOtt(),
                issueInvoiceVo.getScProductId(),
                issueInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                issueInvoiceVo.getBaseInfoVo().getScApiKey(),
                issueInvoiceVo.getRedirectURL(),
                issueInvoiceVo.getUserId(),
                issueInvoiceVo.getBillNumber(),
                issueInvoiceVo.getDescription(),
                issueInvoiceVo.getDeadline(),
                issueInvoiceVo.getEntityId(),
                issueInvoiceVo.getPrice(),
                issueInvoiceVo.getQuantity(),
                issueInvoiceVo.getProductDescription(),
                issueInvoiceVo.getGuildCode(),
                issueInvoiceVo.getCurrencyCode(),
                issueInvoiceVo.getAddressId(),
                issueInvoiceVo.getVoucherHash(),
                issueInvoiceVo.getPreferredTaxRate(),
                issueInvoiceVo.getVerificationNeeded(),
                issueInvoiceVo.getVerifyAfterTimeout(),
                issueInvoiceVo.getPreview(),
                issueInvoiceVo.getMetadata(),
                issueInvoiceVo.getSafe(),
                issueInvoiceVo.getPostVoucherEnabled(),
                issueInvoiceVo.getHasEvent(),
                issueInvoiceVo.getEventTitle(),
                issueInvoiceVo.getEventTimeZone(),
                issueInvoiceVo.getEventReminders(),
                issueInvoiceVo.getEventDescription(),
                issueInvoiceVo.getEventMetadata(),
                issueInvoiceVo.getCellphoneNumber()
        )).getResponse();
    }

    public void createPreInvoice(CreatePreInvoiceVo createPreInvoiceVo, OnGetResponseListener onGetResponseListener) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        createPreInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResultCreatePreInvoice<String>(service.createPreInvoice(
                createPreInvoiceVo.getBaseInfoVo().getToken(),
                createPreInvoiceVo.getBaseInfoVo().getToken_issuer(),
                createPreInvoiceVo.getScProductId(),
                createPreInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                createPreInvoiceVo.getBaseInfoVo().getScApiKey(),
                createPreInvoiceVo.getToken(),
                createPreInvoiceVo.getBaseInfoVo().getOtt(),
                createPreInvoiceVo.getRedirectURL(),
                createPreInvoiceVo.getUserId(),
                createPreInvoiceVo.getEntityId(),
                createPreInvoiceVo.getPrice(),
                createPreInvoiceVo.getQuantity(),
                createPreInvoiceVo.getProductDescription(),
                createPreInvoiceVo.getGuildCode(),
                createPreInvoiceVo.getCurrencyCode(),
                createPreInvoiceVo.getBillNumber(),
                createPreInvoiceVo.getDescription(),
                createPreInvoiceVo.getDeadline(),
                createPreInvoiceVo.getPreferredTaxRate(),
                createPreInvoiceVo.getVerificationNeeded(),
                createPreInvoiceVo.getCallUrl()
        ), onGetResponseListener).get();
    }

    public ResultVo<String> createPreInvoice(CreatePreInvoiceVo createPreInvoiceVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        createPreInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResultCreatePreInvoice<>(service.createPreInvoice(
                createPreInvoiceVo.getBaseInfoVo().getToken(),
                createPreInvoiceVo.getBaseInfoVo().getToken_issuer(),
                createPreInvoiceVo.getScProductId(),
                createPreInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                createPreInvoiceVo.getBaseInfoVo().getScApiKey(),
                createPreInvoiceVo.getToken(),
                createPreInvoiceVo.getBaseInfoVo().getOtt(),
                createPreInvoiceVo.getRedirectURL(),
                createPreInvoiceVo.getUserId(),
                createPreInvoiceVo.getEntityId(),
                createPreInvoiceVo.getPrice(),
                createPreInvoiceVo.getQuantity(),
                createPreInvoiceVo.getProductDescription(),
                createPreInvoiceVo.getGuildCode(),
                createPreInvoiceVo.getCurrencyCode(),
                createPreInvoiceVo.getBillNumber(),
                createPreInvoiceVo.getDescription(),
                createPreInvoiceVo.getDeadline(),
                createPreInvoiceVo.getPreferredTaxRate(),
                createPreInvoiceVo.getVerificationNeeded(),
                createPreInvoiceVo.getCallUrl()
        )).getResponse();
    }

    public void getInvoiceList(GetInvoiceListVo getInvoiceListVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoiceListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

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

    public ResultVo<List<InvoiceSrv>> getInvoiceList(GetInvoiceListVo getInvoiceListVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoiceListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.getInvoiceList(
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
        )).getResponse();
    }

    public void getInvoiceListByMetadata(GetInvoiceListByMetadataVo getInvoiceListByMetadataVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoiceListByMetadataVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<InvoiceSrv>>(service.getInvoiceListByMetadata(
                getInvoiceListByMetadataVo.getBaseInfoVo().getToken(),
                getInvoiceListByMetadataVo.getBaseInfoVo().getToken_issuer(),
                getInvoiceListByMetadataVo.getScProductId(),
                getInvoiceListByMetadataVo.getBaseInfoVo().getScVoucherHash(),
                getInvoiceListByMetadataVo.getBaseInfoVo().getScApiKey(),
                getInvoiceListByMetadataVo.getMetaQuery(),
                getInvoiceListByMetadataVo.getIsCanceled(),
                getInvoiceListByMetadataVo.getIsPayed(),
                getInvoiceListByMetadataVo.getOffset(),
                getInvoiceListByMetadataVo.getSize()
        ),
                onGetResponseListener).get();
    }

    public ResultVo<List<InvoiceSrv>> getInvoiceListByMetadata(GetInvoiceListByMetadataVo getInvoiceListByMetadataVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoiceListByMetadataVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.getInvoiceListByMetadata(
                getInvoiceListByMetadataVo.getBaseInfoVo().getToken(),
                getInvoiceListByMetadataVo.getBaseInfoVo().getToken_issuer(),
                getInvoiceListByMetadataVo.getScProductId(),
                getInvoiceListByMetadataVo.getBaseInfoVo().getScVoucherHash(),
                getInvoiceListByMetadataVo.getBaseInfoVo().getScApiKey(),
                getInvoiceListByMetadataVo.getMetaQuery(),
                getInvoiceListByMetadataVo.getIsCanceled(),
                getInvoiceListByMetadataVo.getIsPayed(),
                getInvoiceListByMetadataVo.getOffset(),
                getInvoiceListByMetadataVo.getSize()
        )).getResponse();
    }

    public void getInvoiceListAsFile(GetInvoiceListAsFileVo getInvoiceListAsFileVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoiceListAsFileVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<ExportServiceSrv>(service.getInvoiceListAsFile(
                getInvoiceListAsFileVo.getBaseInfoVo().getToken(),
                getInvoiceListAsFileVo.getBaseInfoVo().getToken_issuer(),
                getInvoiceListAsFileVo.getScProductId(),
                getInvoiceListAsFileVo.getBaseInfoVo().getScVoucherHash(),
                getInvoiceListAsFileVo.getBaseInfoVo().getScApiKey(),
                getInvoiceListAsFileVo.getId(),
                getInvoiceListAsFileVo.getBillNumber(),
                getInvoiceListAsFileVo.getUniqueNumber(),
                getInvoiceListAsFileVo.getTrackerId(),
                getInvoiceListAsFileVo.getFromDate(),
                getInvoiceListAsFileVo.getToDate(),
                getInvoiceListAsFileVo.getIsCanceled(),
                getInvoiceListAsFileVo.getIsPayed(),
                getInvoiceListAsFileVo.getIsClosed(),
                getInvoiceListAsFileVo.getIsWaiting(),
                getInvoiceListAsFileVo.getGuildCode(),
                getInvoiceListAsFileVo.getReferenceNumber(),
                getInvoiceListAsFileVo.getUserId(),
                getInvoiceListAsFileVo.getQuery(),
                getInvoiceListAsFileVo.getEntityIdList(),
                getInvoiceListAsFileVo.getLastNRows(),
                getInvoiceListAsFileVo.getCallbackUrl()
        ),
                onGetResponseListener).get();
    }

    public ResultVo<ExportServiceSrv> getInvoiceListAsFile(GetInvoiceListAsFileVo getInvoiceListAsFileVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoiceListAsFileVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.getInvoiceListAsFile(
                getInvoiceListAsFileVo.getBaseInfoVo().getToken(),
                getInvoiceListAsFileVo.getBaseInfoVo().getToken_issuer(),
                getInvoiceListAsFileVo.getScProductId(),
                getInvoiceListAsFileVo.getBaseInfoVo().getScVoucherHash(),
                getInvoiceListAsFileVo.getBaseInfoVo().getScApiKey(),
                getInvoiceListAsFileVo.getId(),
                getInvoiceListAsFileVo.getBillNumber(),
                getInvoiceListAsFileVo.getUniqueNumber(),
                getInvoiceListAsFileVo.getTrackerId(),
                getInvoiceListAsFileVo.getFromDate(),
                getInvoiceListAsFileVo.getToDate(),
                getInvoiceListAsFileVo.getIsCanceled(),
                getInvoiceListAsFileVo.getIsPayed(),
                getInvoiceListAsFileVo.getIsClosed(),
                getInvoiceListAsFileVo.getIsWaiting(),
                getInvoiceListAsFileVo.getGuildCode(),
                getInvoiceListAsFileVo.getReferenceNumber(),
                getInvoiceListAsFileVo.getUserId(),
                getInvoiceListAsFileVo.getQuery(),
                getInvoiceListAsFileVo.getEntityIdList(),
                getInvoiceListAsFileVo.getLastNRows(),
                getInvoiceListAsFileVo.getCallbackUrl()
        )).getResponse();
    }

    public void cancelInvoice(CancelInvoiceVo cancelInvoiceVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        cancelInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.cancelInvoice(
                cancelInvoiceVo.getBaseInfoVo().getToken(),
                cancelInvoiceVo.getBaseInfoVo().getToken_issuer(),
                cancelInvoiceVo.getScProductId(),
                cancelInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                cancelInvoiceVo.getBaseInfoVo().getScApiKey(),
                cancelInvoiceVo.getId()
        ),
                onGetResponseListener).get();
    }

    public ResultVo<Boolean> cancelInvoice(CancelInvoiceVo cancelInvoiceVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        cancelInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.cancelInvoice(
                cancelInvoiceVo.getBaseInfoVo().getToken(),
                cancelInvoiceVo.getBaseInfoVo().getToken_issuer(),
                cancelInvoiceVo.getScProductId(),
                cancelInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                cancelInvoiceVo.getBaseInfoVo().getScApiKey(),
                cancelInvoiceVo.getId()
        )).getResponse();
    }

    public void verifyAndCloseInvoice(VerifyAndCloseInvoiceVo verifyAndCloseInvoiceVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        verifyAndCloseInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.verifyAndCloseInvoice(
                verifyAndCloseInvoiceVo.getBaseInfoVo().getToken(),
                verifyAndCloseInvoiceVo.getBaseInfoVo().getToken_issuer(),
                verifyAndCloseInvoiceVo.getScProductId(),
                verifyAndCloseInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                verifyAndCloseInvoiceVo.getBaseInfoVo().getScApiKey(),
                verifyAndCloseInvoiceVo.getId()
        ),
                onGetResponseListener).get();
    }

    public ResultVo<InvoiceSrv> verifyAndCloseInvoice(VerifyAndCloseInvoiceVo verifyAndCloseInvoiceVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        verifyAndCloseInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.verifyAndCloseInvoice(
                verifyAndCloseInvoiceVo.getBaseInfoVo().getToken(),
                verifyAndCloseInvoiceVo.getBaseInfoVo().getToken_issuer(),
                verifyAndCloseInvoiceVo.getScProductId(),
                verifyAndCloseInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                verifyAndCloseInvoiceVo.getBaseInfoVo().getScApiKey(),
                verifyAndCloseInvoiceVo.getId()
        )).getResponse();
    }

    public void closeInvoice(CloseInvoiceVo closeInvoiceVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        closeInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.closeInvoice(
                closeInvoiceVo.getBaseInfoVo().getToken(),
                closeInvoiceVo.getBaseInfoVo().getToken_issuer(),
                closeInvoiceVo.getScProductId(),
                closeInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                closeInvoiceVo.getBaseInfoVo().getScApiKey(),
                closeInvoiceVo.getId()
        ),
                onGetResponseListener).get();
    }

    public ResultVo<Boolean> closeInvoice(CloseInvoiceVo closeInvoiceVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        closeInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.closeInvoice(
                closeInvoiceVo.getBaseInfoVo().getToken(),
                closeInvoiceVo.getBaseInfoVo().getToken_issuer(),
                closeInvoiceVo.getScProductId(),
                closeInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                closeInvoiceVo.getBaseInfoVo().getScApiKey(),
                closeInvoiceVo.getId()
        )).getResponse();
    }

    public void getInvoicePaymentLink(GetInvoicePaymentLinkVo getInvoicePaymentLinkVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoicePaymentLinkVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<String>(service.getInvoicePaymentLink(
                getInvoicePaymentLinkVo.getBaseInfoVo().getToken(),
                getInvoicePaymentLinkVo.getBaseInfoVo().getToken_issuer(),
                getInvoicePaymentLinkVo.getScProductId(),
                getInvoicePaymentLinkVo.getBaseInfoVo().getScVoucherHash(),
                getInvoicePaymentLinkVo.getBaseInfoVo().getScApiKey(),
                getInvoicePaymentLinkVo.getInvoiceId()
        ),
                onGetResponseListener).get();
    }

    public ResultVo<String> getInvoicePaymentLink(GetInvoicePaymentLinkVo getInvoicePaymentLinkVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoicePaymentLinkVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.getInvoicePaymentLink(
                getInvoicePaymentLinkVo.getBaseInfoVo().getToken(),
                getInvoicePaymentLinkVo.getBaseInfoVo().getToken_issuer(),
                getInvoicePaymentLinkVo.getScProductId(),
                getInvoicePaymentLinkVo.getBaseInfoVo().getScVoucherHash(),
                getInvoicePaymentLinkVo.getBaseInfoVo().getScApiKey(),
                getInvoicePaymentLinkVo.getInvoiceId()
        )).getResponse();
    }

    public void payInvoice(PayInvoiceVo payInvoiceVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payInvoice(
                payInvoiceVo.getBaseInfoVo().getToken(),
                payInvoiceVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceVo.getScProductId(),
                payInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                payInvoiceVo.getBaseInfoVo().getScApiKey(),
                payInvoiceVo.getInvoiceId()
        ), onGetResponseListener).get();
    }

    public ResultVo<Boolean> payInvoice(PayInvoiceVo payInvoiceVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.payInvoice(
                payInvoiceVo.getBaseInfoVo().getToken(),
                payInvoiceVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceVo.getScProductId(),
                payInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                payInvoiceVo.getBaseInfoVo().getScApiKey(),
                payInvoiceVo.getInvoiceId()
        )).getResponse();
    }

    public void payInvoiceByCredit(PayInvoiceByCreditVo payInvoiceByCreditVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceByCreditVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payInvoiceByCredit(
                payInvoiceByCreditVo.getBaseInfoVo().getToken(),
                payInvoiceByCreditVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceByCreditVo.getScProductId(),
                payInvoiceByCreditVo.getBaseInfoVo().getScVoucherHash(),
                payInvoiceByCreditVo.getBaseInfoVo().getScApiKey(),
                payInvoiceByCreditVo.getBaseInfoVo().getOtt(),
                payInvoiceByCreditVo.getInvoiceId(),
                payInvoiceByCreditVo.getDelegationHash(),
                payInvoiceByCreditVo.getDelegatorId(),
                payInvoiceByCreditVo.getWallet(),
                payInvoiceByCreditVo.getForceDelegation()
        ), onGetResponseListener).get();
    }

    public ResultVo<Boolean> payInvoiceByCredit(PayInvoiceByCreditVo payInvoiceByCreditVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceByCreditVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.payInvoiceByCredit(
                payInvoiceByCreditVo.getBaseInfoVo().getToken(),
                payInvoiceByCreditVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceByCreditVo.getScProductId(),
                payInvoiceByCreditVo.getBaseInfoVo().getScVoucherHash(),
                payInvoiceByCreditVo.getBaseInfoVo().getScApiKey(),
                payInvoiceByCreditVo.getBaseInfoVo().getOtt(),
                payInvoiceByCreditVo.getInvoiceId(),
                payInvoiceByCreditVo.getDelegationHash(),
                payInvoiceByCreditVo.getDelegatorId(),
                payInvoiceByCreditVo.getWallet(),
                payInvoiceByCreditVo.getForceDelegation()
        )).getResponse();
    }

    public void payAnyInvoiceByCredit(PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payAnyInvoiceByCreditVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payAnyInvoiceByCredit(
                payAnyInvoiceByCreditVo.getBaseInfoVo().getToken(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getToken_issuer(),
                payAnyInvoiceByCreditVo.getScProductId(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getScVoucherHash(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getScApiKey(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getOtt(),
                payAnyInvoiceByCreditVo.getInvoiceId(),
                payAnyInvoiceByCreditVo.getDelegationHash(),
                payAnyInvoiceByCreditVo.getDelegatorId(),
                payAnyInvoiceByCreditVo.getWallet(),
                payAnyInvoiceByCreditVo.getForceDelegation()
        ), onGetResponseListener).get();
    }

    public ResultVo<Boolean> payAnyInvoiceByCredit(PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payAnyInvoiceByCreditVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.payAnyInvoiceByCredit(
                payAnyInvoiceByCreditVo.getBaseInfoVo().getToken(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getToken_issuer(),
                payAnyInvoiceByCreditVo.getScProductId(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getScVoucherHash(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getScApiKey(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getOtt(),
                payAnyInvoiceByCreditVo.getInvoiceId(),
                payAnyInvoiceByCreditVo.getDelegationHash(),
                payAnyInvoiceByCreditVo.getDelegatorId(),
                payAnyInvoiceByCreditVo.getWallet(),
                payAnyInvoiceByCreditVo.getForceDelegation()
        )).getResponse();
    }

    public void sendInvoicePaymentSMS(SendInvoicePaymentSmsVo sendInvoicePaymentSMSVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        sendInvoicePaymentSMSVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.sendInvoicePaymentSMS(
                sendInvoicePaymentSMSVo.getBaseInfoVo().getToken(),
                sendInvoicePaymentSMSVo.getBaseInfoVo().getToken_issuer(),
                sendInvoicePaymentSMSVo.getScProductId(),
                sendInvoicePaymentSMSVo.getBaseInfoVo().getScVoucherHash(),
                sendInvoicePaymentSMSVo.getBaseInfoVo().getScApiKey(),
                sendInvoicePaymentSMSVo.getInvoiceId(),
                sendInvoicePaymentSMSVo.getDelegationId(),
                sendInvoicePaymentSMSVo.getWallet(),
                sendInvoicePaymentSMSVo.getForceDelegation(),
                sendInvoicePaymentSMSVo.getCallbackUri(),
                sendInvoicePaymentSMSVo.getRedirectUri()
        ), onGetResponseListener).get();
    }

    public ResultVo<Boolean> sendInvoicePaymentSMS(SendInvoicePaymentSmsVo sendInvoicePaymentSMSVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        sendInvoicePaymentSMSVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.sendInvoicePaymentSMS(
                sendInvoicePaymentSMSVo.getBaseInfoVo().getToken(),
                sendInvoicePaymentSMSVo.getBaseInfoVo().getToken_issuer(),
                sendInvoicePaymentSMSVo.getScProductId(),
                sendInvoicePaymentSMSVo.getBaseInfoVo().getScVoucherHash(),
                sendInvoicePaymentSMSVo.getBaseInfoVo().getScApiKey(),
                sendInvoicePaymentSMSVo.getInvoiceId(),
                sendInvoicePaymentSMSVo.getDelegationId(),
                sendInvoicePaymentSMSVo.getWallet(),
                sendInvoicePaymentSMSVo.getForceDelegation(),
                sendInvoicePaymentSMSVo.getCallbackUri(),
                sendInvoicePaymentSMSVo.getRedirectUri()
        )).getResponse();
    }

    public void payInvoiceInFuture(PayInvoiceInFutureVo payInvoiceInFutureVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceInFutureVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payInvoiceInFuture(
                payInvoiceInFutureVo.getBaseInfoVo().getToken(),
                payInvoiceInFutureVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceInFutureVo.getScProductId(),
                payInvoiceInFutureVo.getBaseInfoVo().getScVoucherHash(),
                payInvoiceInFutureVo.getBaseInfoVo().getScApiKey(),
                payInvoiceInFutureVo.getInvoiceId(),
                payInvoiceInFutureVo.getDate(),
                payInvoiceInFutureVo.getWallet(),
                payInvoiceInFutureVo.getGuildCode()
        ), onGetResponseListener).get();
    }

    public ResultVo<Boolean> payInvoiceInFuture(PayInvoiceInFutureVo payInvoiceInFutureVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceInFutureVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.payInvoiceInFuture(
                payInvoiceInFutureVo.getBaseInfoVo().getToken(),
                payInvoiceInFutureVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceInFutureVo.getScProductId(),
                payInvoiceInFutureVo.getBaseInfoVo().getScVoucherHash(),
                payInvoiceInFutureVo.getBaseInfoVo().getScApiKey(),
                payInvoiceInFutureVo.getInvoiceId(),
                payInvoiceInFutureVo.getDate(),
                payInvoiceInFutureVo.getWallet(),
                payInvoiceInFutureVo.getGuildCode()
        )).getResponse();
    }

    public void payInvoiceByInvoice(PayInvoiceByInvoiceVo payInvoiceByInvoiceVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceByInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payInvoiceByInvoice(
                payInvoiceByInvoiceVo.getBaseInfoVo().getToken(),
                payInvoiceByInvoiceVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceByInvoiceVo.getScProductId(),
                payInvoiceByInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                payInvoiceByInvoiceVo.getBaseInfoVo().getScApiKey(),
                payInvoiceByInvoiceVo.getCreditorInvoiceId(),
                payInvoiceByInvoiceVo.getDebtorInvoiceId()
        ), onGetResponseListener).get();
    }

    public ResultVo<Boolean> payInvoiceByInvoice(PayInvoiceByInvoiceVo payInvoiceByInvoiceVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceByInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.payInvoiceByInvoice(
                payInvoiceByInvoiceVo.getBaseInfoVo().getToken(),
                payInvoiceByInvoiceVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceByInvoiceVo.getScProductId(),
                payInvoiceByInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                payInvoiceByInvoiceVo.getBaseInfoVo().getScApiKey(),
                payInvoiceByInvoiceVo.getCreditorInvoiceId(),
                payInvoiceByInvoiceVo.getDebtorInvoiceId()
        )).getResponse();
    }

    public void issueMultiInvoice(IssueMultiInvoiceVo issueMultiInvoiceVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        issueMultiInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.issueMultiInvoice(
                issueMultiInvoiceVo.getBaseInfoVo().getToken(),
                issueMultiInvoiceVo.getBaseInfoVo().getToken_issuer(),
                issueMultiInvoiceVo.getScProductId(),
                issueMultiInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                issueMultiInvoiceVo.getBaseInfoVo().getScApiKey(),
                issueMultiInvoiceVo.getData(),
                issueMultiInvoiceVo.getDelegationHash(),
                issueMultiInvoiceVo.getDelegatorId(),
                issueMultiInvoiceVo.getForceDelegation()
        ), onGetResponseListener).get();
    }

    public ResultVo<InvoiceSrv> issueMultiInvoice(IssueMultiInvoiceVo issueMultiInvoiceVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        issueMultiInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.issueMultiInvoice(
                issueMultiInvoiceVo.getBaseInfoVo().getToken(),
                issueMultiInvoiceVo.getBaseInfoVo().getToken_issuer(),
                issueMultiInvoiceVo.getScProductId(),
                issueMultiInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                issueMultiInvoiceVo.getBaseInfoVo().getScApiKey(),
                issueMultiInvoiceVo.getData(),
                issueMultiInvoiceVo.getDelegationHash(),
                issueMultiInvoiceVo.getDelegatorId(),
                issueMultiInvoiceVo.getForceDelegation()
        )).getResponse();
    }

    public void reduceMultiInvoice(ReduceMultiInvoiceVo reduceMultiInvoiceVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        reduceMultiInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.reduceMultiInvoice(
                reduceMultiInvoiceVo.getBaseInfoVo().getToken(),
                reduceMultiInvoiceVo.getBaseInfoVo().getToken_issuer(),
                reduceMultiInvoiceVo.getScProductId(),
                reduceMultiInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                reduceMultiInvoiceVo.getBaseInfoVo().getScApiKey(),
                reduceMultiInvoiceVo.getData()


        ), onGetResponseListener).get();
    }

    public ResultVo<InvoiceSrv> reduceMultiInvoice(ReduceMultiInvoiceVo reduceMultiInvoiceVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        reduceMultiInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.reduceMultiInvoice(
                reduceMultiInvoiceVo.getBaseInfoVo().getToken(),
                reduceMultiInvoiceVo.getBaseInfoVo().getToken_issuer(),
                reduceMultiInvoiceVo.getScProductId(),
                reduceMultiInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                reduceMultiInvoiceVo.getBaseInfoVo().getScApiKey(),
                reduceMultiInvoiceVo.getData()
        )).getResponse();
    }

    public void reduceMultiInvoiceAndCashout(ReduceMultiInvoiceAndCashoutVo reduceMultiInvoiceAndCashoutVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.reduceMultiInvoiceAndCashout(
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getToken(),
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getToken_issuer(),
                reduceMultiInvoiceAndCashoutVo.getScProductId(),
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getScVoucherHash(),
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getScApiKey(),
                reduceMultiInvoiceAndCashoutVo.getData(),
                reduceMultiInvoiceAndCashoutVo.getToolCode()

        ), onGetResponseListener).get();
    }

    public ResultVo<InvoiceSrv> reduceMultiInvoiceAndCashout(ReduceMultiInvoiceAndCashoutVo reduceMultiInvoiceAndCashoutVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.reduceMultiInvoiceAndCashout(
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getToken(),
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getToken_issuer(),
                reduceMultiInvoiceAndCashoutVo.getScProductId(),
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getScVoucherHash(),
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getScApiKey(),
                reduceMultiInvoiceAndCashoutVo.getData(),
                reduceMultiInvoiceAndCashoutVo.getToolCode()

        )).getResponse();
    }

    public void defineCreditVoucher(DefineCreditVoucherVo defineCreditVoucherVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        defineCreditVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<VoucherSrv>>(service.defineCreditVoucher(
                defineCreditVoucherVo.getBaseInfoVo().getToken(),
                defineCreditVoucherVo.getBaseInfoVo().getToken_issuer(),
                defineCreditVoucherVo.getScProductId(),
                defineCreditVoucherVo.getBaseInfoVo().getScVoucherHash(),
                defineCreditVoucherVo.getBaseInfoVo().getScApiKey(),
                defineCreditVoucherVo.getGuildCode(),
                defineCreditVoucherVo.getExpireDate(),
                defineCreditVoucherVo.getCount(),
                defineCreditVoucherVo.getAmount(),
                defineCreditVoucherVo.getName(),
                defineCreditVoucherVo.getDescription(),
                defineCreditVoucherVo.getLimitedConsumerId(),
                defineCreditVoucherVo.getCurrencyCode(),
                defineCreditVoucherVo.getHashCode()

        ), onGetResponseListener).get();
    }

    public ResultVo<List<VoucherSrv>> defineCreditVoucher(DefineCreditVoucherVo defineCreditVoucherVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        defineCreditVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.defineCreditVoucher(
                defineCreditVoucherVo.getBaseInfoVo().getToken(),
                defineCreditVoucherVo.getBaseInfoVo().getToken_issuer(),
                defineCreditVoucherVo.getScProductId(),
                defineCreditVoucherVo.getBaseInfoVo().getScVoucherHash(),
                defineCreditVoucherVo.getBaseInfoVo().getScApiKey(),
                defineCreditVoucherVo.getGuildCode(),
                defineCreditVoucherVo.getExpireDate(),
                defineCreditVoucherVo.getCount(),
                defineCreditVoucherVo.getAmount(),
                defineCreditVoucherVo.getName(),
                defineCreditVoucherVo.getDescription(),
                defineCreditVoucherVo.getLimitedConsumerId(),
                defineCreditVoucherVo.getCurrencyCode(),
                defineCreditVoucherVo.getHashCode()
        )).getResponse();
    }

    public void defineDiscountAmountVoucher(DefineDiscountAmountVoucherVo defineDiscountAmountVoucherVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        defineDiscountAmountVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<VoucherSrv>>(service.defineDiscountAmountVoucher(
                defineDiscountAmountVoucherVo.getBaseInfoVo().getToken(),
                defineDiscountAmountVoucherVo.getBaseInfoVo().getToken_issuer(),
                defineDiscountAmountVoucherVo.getScProductId(),
                defineDiscountAmountVoucherVo.getBaseInfoVo().getScVoucherHash(),
                defineDiscountAmountVoucherVo.getBaseInfoVo().getScApiKey(),
                defineDiscountAmountVoucherVo.getGuildCode(),
                defineDiscountAmountVoucherVo.getExpireDate(),
                defineDiscountAmountVoucherVo.getCount(),
                defineDiscountAmountVoucherVo.getAmount(),
                defineDiscountAmountVoucherVo.getEntityId(),
                defineDiscountAmountVoucherVo.getDealerBusinessId(),
                defineDiscountAmountVoucherVo.getName(),
                defineDiscountAmountVoucherVo.getDescription(),
                defineDiscountAmountVoucherVo.getLimitedConsumerId(),
                defineDiscountAmountVoucherVo.getCurrencyCode(),
                defineDiscountAmountVoucherVo.getHashCode()

        ), onGetResponseListener).get();
    }

    public ResultVo<List<VoucherSrv>> defineDiscountAmountVoucher(DefineDiscountAmountVoucherVo defineDiscountAmountVoucherVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        defineDiscountAmountVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.defineDiscountAmountVoucher(
                defineDiscountAmountVoucherVo.getBaseInfoVo().getToken(),
                defineDiscountAmountVoucherVo.getBaseInfoVo().getToken_issuer(),
                defineDiscountAmountVoucherVo.getScProductId(),
                defineDiscountAmountVoucherVo.getBaseInfoVo().getScVoucherHash(),
                defineDiscountAmountVoucherVo.getBaseInfoVo().getScApiKey(),
                defineDiscountAmountVoucherVo.getGuildCode(),
                defineDiscountAmountVoucherVo.getExpireDate(),
                defineDiscountAmountVoucherVo.getCount(),
                defineDiscountAmountVoucherVo.getAmount(),
                defineDiscountAmountVoucherVo.getEntityId(),
                defineDiscountAmountVoucherVo.getDealerBusinessId(),
                defineDiscountAmountVoucherVo.getName(),
                defineDiscountAmountVoucherVo.getDescription(),
                defineDiscountAmountVoucherVo.getLimitedConsumerId(),
                defineDiscountAmountVoucherVo.getCurrencyCode(),
                defineDiscountAmountVoucherVo.getHashCode()

        )).getResponse();
    }

    public void defineDiscountPercentageVoucher(DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        defineDiscountPercentageVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<VoucherSrv>>(service.defineDiscountPercentageVoucher(
                defineDiscountPercentageVoucherVo.getBaseInfoVo().getToken(),
                defineDiscountPercentageVoucherVo.getBaseInfoVo().getToken_issuer(),
                defineDiscountPercentageVoucherVo.getScProductId(),
                defineDiscountPercentageVoucherVo.getBaseInfoVo().getScVoucherHash(),
                defineDiscountPercentageVoucherVo.getBaseInfoVo().getScApiKey(),
                defineDiscountPercentageVoucherVo.getGuildCode(),
                defineDiscountPercentageVoucherVo.getExpireDate(),
                defineDiscountPercentageVoucherVo.getCount(),
                defineDiscountPercentageVoucherVo.getAmount(),
                defineDiscountPercentageVoucherVo.getDiscountPercentage(),
                defineDiscountPercentageVoucherVo.getEntityId(),
                defineDiscountPercentageVoucherVo.getDealerBusinessId(),
                defineDiscountPercentageVoucherVo.getName(),
                defineDiscountPercentageVoucherVo.getDescription(),
                defineDiscountPercentageVoucherVo.getLimitedConsumerId(),
                defineDiscountPercentageVoucherVo.getType(),
                defineDiscountPercentageVoucherVo.getCurrencyCode(),
                defineDiscountPercentageVoucherVo.getHashCode()

        ), onGetResponseListener).get();
    }

    public ResultVo<List<VoucherSrv>> defineDiscountPercentageVoucher(DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        defineDiscountPercentageVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.defineDiscountPercentageVoucher(
                defineDiscountPercentageVoucherVo.getBaseInfoVo().getToken(),
                defineDiscountPercentageVoucherVo.getBaseInfoVo().getToken_issuer(),
                defineDiscountPercentageVoucherVo.getScProductId(),
                defineDiscountPercentageVoucherVo.getBaseInfoVo().getScVoucherHash(),
                defineDiscountPercentageVoucherVo.getBaseInfoVo().getScApiKey(),
                defineDiscountPercentageVoucherVo.getGuildCode(),
                defineDiscountPercentageVoucherVo.getExpireDate(),
                defineDiscountPercentageVoucherVo.getCount(),
                defineDiscountPercentageVoucherVo.getAmount(),
                defineDiscountPercentageVoucherVo.getDiscountPercentage(),
                defineDiscountPercentageVoucherVo.getEntityId(),
                defineDiscountPercentageVoucherVo.getDealerBusinessId(),
                defineDiscountPercentageVoucherVo.getName(),
                defineDiscountPercentageVoucherVo.getDescription(),
                defineDiscountPercentageVoucherVo.getLimitedConsumerId(),
                defineDiscountPercentageVoucherVo.getType(),
                defineDiscountPercentageVoucherVo.getCurrencyCode(),
                defineDiscountPercentageVoucherVo.getHashCode()

        )).getResponse();
    }

    public void applyVoucher(ApplyVoucherVo applyVoucherVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        applyVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.applyVoucher(
                applyVoucherVo.getBaseInfoVo().getToken(),
                applyVoucherVo.getBaseInfoVo().getToken_issuer(),
                applyVoucherVo.getScProductId(),
                applyVoucherVo.getBaseInfoVo().getScVoucherHash(),
                applyVoucherVo.getBaseInfoVo().getScApiKey(),
                applyVoucherVo.getBaseInfoVo().getOtt(),
                applyVoucherVo.getInvoiceId(),
                applyVoucherVo.getVoucherHash(),
                applyVoucherVo.getPreview()


        ), onGetResponseListener).get();
    }

    public ResultVo<InvoiceSrv> applyVoucher(ApplyVoucherVo applyVoucherVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        applyVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.applyVoucher(
                applyVoucherVo.getBaseInfoVo().getToken(),
                applyVoucherVo.getBaseInfoVo().getToken_issuer(),
                applyVoucherVo.getScProductId(),
                applyVoucherVo.getBaseInfoVo().getScVoucherHash(),
                applyVoucherVo.getBaseInfoVo().getScApiKey(),
                applyVoucherVo.getBaseInfoVo().getOtt(),
                applyVoucherVo.getInvoiceId(),
                applyVoucherVo.getVoucherHash(),
                applyVoucherVo.getPreview()


        )).getResponse();
    }

    public void deactivateVoucher(DeactivateVoucherVo deactivateVoucherVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        deactivateVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<VoucherSrv>(service.deactivateVoucher(
                deactivateVoucherVo.getBaseInfoVo().getToken(),
                deactivateVoucherVo.getBaseInfoVo().getToken_issuer(),
                deactivateVoucherVo.getScProductId(),
                deactivateVoucherVo.getBaseInfoVo().getScVoucherHash(),
                deactivateVoucherVo.getBaseInfoVo().getScApiKey(),
                deactivateVoucherVo.getVoucherId()

        ), onGetResponseListener).get();
    }

    public ResultVo<VoucherSrv> deactivateVoucher(DeactivateVoucherVo deactivateVoucherVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        deactivateVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.deactivateVoucher(
                deactivateVoucherVo.getBaseInfoVo().getToken(),
                deactivateVoucherVo.getBaseInfoVo().getToken_issuer(),
                deactivateVoucherVo.getScProductId(),
                deactivateVoucherVo.getBaseInfoVo().getScVoucherHash(),
                deactivateVoucherVo.getBaseInfoVo().getScApiKey(),
                deactivateVoucherVo.getVoucherId()

        )).getResponse();
    }

    public void activateVoucher(ActivateVoucherVo activateVoucherVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        activateVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<VoucherSrv>(service.activateVoucher(
                activateVoucherVo.getBaseInfoVo().getToken(),
                activateVoucherVo.getBaseInfoVo().getToken_issuer(),
                activateVoucherVo.getScProductId(),
                activateVoucherVo.getBaseInfoVo().getScVoucherHash(),
                activateVoucherVo.getBaseInfoVo().getScApiKey(),
                activateVoucherVo.getVoucherId()


        ), onGetResponseListener).get();
    }

    public ResultVo<VoucherSrv> activateVoucher(ActivateVoucherVo activateVoucherVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        activateVoucherVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.activateVoucher(
                activateVoucherVo.getBaseInfoVo().getToken(),
                activateVoucherVo.getBaseInfoVo().getToken_issuer(),
                activateVoucherVo.getScProductId(),
                activateVoucherVo.getBaseInfoVo().getScVoucherHash(),
                activateVoucherVo.getBaseInfoVo().getScApiKey(),
                activateVoucherVo.getVoucherId()


        )).getResponse();
    }

    public void getVoucherList(GetVoucherListVo getVoucherListVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getVoucherListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<VoucherSrv>>(service.getVoucherList(
                getVoucherListVo.getBaseInfoVo().getToken(),
                getVoucherListVo.getBaseInfoVo().getToken_issuer(),
                getVoucherListVo.getScProductId(),
                getVoucherListVo.getBaseInfoVo().getScVoucherHash(),
                getVoucherListVo.getBaseInfoVo().getScApiKey(),
                getVoucherListVo.getConsumerId(),
                getVoucherListVo.getHashCode(),
                getVoucherListVo.getName(),
                getVoucherListVo.getType(),
                getVoucherListVo.getGuildCode(),
                getVoucherListVo.getCurrencyCode(),
                getVoucherListVo.getAmountFrom(),
                getVoucherListVo.getAmountTo(),
                getVoucherListVo.getDiscountPercentageFrom(),
                getVoucherListVo.getDiscountPercentageTo(),
                getVoucherListVo.getExpireDateFrom(),
                getVoucherListVo.getExpireDateTo(),
                getVoucherListVo.getEntityId(),
                getVoucherListVo.getConsumDateFrom(),
                getVoucherListVo.getConsumDateTo(),
                getVoucherListVo.getUsedAmountFrom(),
                getVoucherListVo.getUsedAmountTo(),
                getVoucherListVo.getActive(),
                getVoucherListVo.getUsed(),
                getVoucherListVo.getOffset(),
                getVoucherListVo.getSize()


        ), onGetResponseListener).get();
    }

    public ResultVo<List<VoucherSrv>> getVoucherList(GetVoucherListVo getVoucherListVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getVoucherListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.getVoucherList(
                getVoucherListVo.getBaseInfoVo().getToken(),
                getVoucherListVo.getBaseInfoVo().getToken_issuer(),
                getVoucherListVo.getScProductId(),
                getVoucherListVo.getBaseInfoVo().getScVoucherHash(),
                getVoucherListVo.getBaseInfoVo().getScApiKey(),
                getVoucherListVo.getConsumerId(),
                getVoucherListVo.getHashCode(),
                getVoucherListVo.getName(),
                getVoucherListVo.getType(),
                getVoucherListVo.getGuildCode(),
                getVoucherListVo.getCurrencyCode(),
                getVoucherListVo.getAmountFrom(),
                getVoucherListVo.getAmountTo(),
                getVoucherListVo.getDiscountPercentageFrom(),
                getVoucherListVo.getDiscountPercentageTo(),
                getVoucherListVo.getExpireDateFrom(),
                getVoucherListVo.getExpireDateTo(),
                getVoucherListVo.getEntityId(),
                getVoucherListVo.getConsumDateFrom(),
                getVoucherListVo.getConsumDateTo(),
                getVoucherListVo.getUsedAmountFrom(),
                getVoucherListVo.getUsedAmountTo(),
                getVoucherListVo.getActive(),
                getVoucherListVo.getUsed(),
                getVoucherListVo.getOffset(),
                getVoucherListVo.getSize()


        )).getResponse();
    }

    public void defineDirectWithdraw(DefineDirectWithdrawVo defineDirectWithdrawVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        defineDirectWithdrawVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<DirectWithdrawSrv>(service.defineDirectWithdraw(
                defineDirectWithdrawVo.getBaseInfoVo().getToken(),
                defineDirectWithdrawVo.getBaseInfoVo().getToken_issuer(),
                defineDirectWithdrawVo.getScProductId(),
                defineDirectWithdrawVo.getBaseInfoVo().getScVoucherHash(),
                defineDirectWithdrawVo.getBaseInfoVo().getScApiKey(),
                defineDirectWithdrawVo.getUsername(),
                defineDirectWithdrawVo.getPrivateKey(),
                defineDirectWithdrawVo.getDepositNumber(),
                defineDirectWithdrawVo.getOnDemand(),
                defineDirectWithdrawVo.getMinAmount(),
                defineDirectWithdrawVo.getMaxAmount(),
                defineDirectWithdrawVo.getWallet()


        ), onGetResponseListener).get();
    }

    public ResultVo<DirectWithdrawSrv> defineDirectWithdraw(DefineDirectWithdrawVo defineDirectWithdrawVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        defineDirectWithdrawVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.defineDirectWithdraw(
                defineDirectWithdrawVo.getBaseInfoVo().getToken(),
                defineDirectWithdrawVo.getBaseInfoVo().getToken_issuer(),
                defineDirectWithdrawVo.getScProductId(),
                defineDirectWithdrawVo.getBaseInfoVo().getScVoucherHash(),
                defineDirectWithdrawVo.getBaseInfoVo().getScApiKey(),
                defineDirectWithdrawVo.getUsername(),
                defineDirectWithdrawVo.getPrivateKey(),
                defineDirectWithdrawVo.getDepositNumber(),
                defineDirectWithdrawVo.getOnDemand(),
                defineDirectWithdrawVo.getMinAmount(),
                defineDirectWithdrawVo.getMaxAmount(),
                defineDirectWithdrawVo.getWallet()


        )).getResponse();
    }

    public void directWithdrawList(DirectWithdrawListVo directWithdrawListVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        directWithdrawListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<DirectWithdrawSrv>>(service.directWithdrawList(
                directWithdrawListVo.getBaseInfoVo().getToken(),
                directWithdrawListVo.getBaseInfoVo().getToken_issuer(),
                directWithdrawListVo.getScProductId(),
                directWithdrawListVo.getBaseInfoVo().getScVoucherHash(),
                directWithdrawListVo.getBaseInfoVo().getScApiKey(),
                directWithdrawListVo.getWallet(),
                directWithdrawListVo.getOffset(),
                directWithdrawListVo.getSize()


        ), onGetResponseListener).get();
    }

    public ResultVo<List<DirectWithdrawSrv>> directWithdrawList(DirectWithdrawListVo directWithdrawListVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        directWithdrawListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.directWithdrawList(
                directWithdrawListVo.getBaseInfoVo().getToken(),
                directWithdrawListVo.getBaseInfoVo().getToken_issuer(),
                directWithdrawListVo.getScProductId(),
                directWithdrawListVo.getBaseInfoVo().getScVoucherHash(),
                directWithdrawListVo.getBaseInfoVo().getScApiKey(),
                directWithdrawListVo.getWallet(),
                directWithdrawListVo.getOffset(),
                directWithdrawListVo.getSize()


        )).getResponse();
    }

    public void updateDirectWithdraw(UpdateDirectWithdrawVo updateDirectWithdrawVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        updateDirectWithdrawVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<DirectWithdrawSrv>(service.updateDirectWithdraw(
                updateDirectWithdrawVo.getBaseInfoVo().getToken(),
                updateDirectWithdrawVo.getBaseInfoVo().getToken_issuer(),
                updateDirectWithdrawVo.getScProductId(),
                updateDirectWithdrawVo.getBaseInfoVo().getScVoucherHash(),
                updateDirectWithdrawVo.getBaseInfoVo().getScApiKey(),
                updateDirectWithdrawVo.getId(),
                updateDirectWithdrawVo.getUsername(),
                updateDirectWithdrawVo.getPrivateKey(),
                updateDirectWithdrawVo.getDepositNumber(),
                updateDirectWithdrawVo.getOnDemand(),
                updateDirectWithdrawVo.getMinAmount(),
                updateDirectWithdrawVo.getMaxAmount(),
                updateDirectWithdrawVo.getWallet()


        ), onGetResponseListener).get();
    }

    public ResultVo<DirectWithdrawSrv> updateDirectWithdraw(UpdateDirectWithdrawVo updateDirectWithdrawVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        updateDirectWithdrawVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.updateDirectWithdraw(
                updateDirectWithdrawVo.getBaseInfoVo().getToken(),
                updateDirectWithdrawVo.getBaseInfoVo().getToken_issuer(),
                updateDirectWithdrawVo.getScProductId(),
                updateDirectWithdrawVo.getBaseInfoVo().getScVoucherHash(),
                updateDirectWithdrawVo.getBaseInfoVo().getScApiKey(),
                updateDirectWithdrawVo.getId(),
                updateDirectWithdrawVo.getUsername(),
                updateDirectWithdrawVo.getPrivateKey(),
                updateDirectWithdrawVo.getDepositNumber(),
                updateDirectWithdrawVo.getOnDemand(),
                updateDirectWithdrawVo.getMinAmount(),
                updateDirectWithdrawVo.getMaxAmount(),
                updateDirectWithdrawVo.getWallet()

        )).getResponse();
    }

    public void revokeDirectWithdraw(RevokeDirectWithdrawVo revokeDirectWithdrawVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        revokeDirectWithdrawVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.revokeDirectWithdraw(
                revokeDirectWithdrawVo.getBaseInfoVo().getToken(),
                revokeDirectWithdrawVo.getBaseInfoVo().getToken_issuer(),
                revokeDirectWithdrawVo.getScProductId(),
                revokeDirectWithdrawVo.getBaseInfoVo().getScVoucherHash(),
                revokeDirectWithdrawVo.getBaseInfoVo().getScApiKey(),
                revokeDirectWithdrawVo.getId()

        ), onGetResponseListener).get();
    }

    public ResultVo<Boolean> revokeDirectWithdraw(RevokeDirectWithdrawVo revokeDirectWithdrawVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        revokeDirectWithdrawVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.revokeDirectWithdraw(
                revokeDirectWithdrawVo.getBaseInfoVo().getToken(),
                revokeDirectWithdrawVo.getBaseInfoVo().getToken_issuer(),
                revokeDirectWithdrawVo.getScProductId(),
                revokeDirectWithdrawVo.getBaseInfoVo().getScVoucherHash(),
                revokeDirectWithdrawVo.getBaseInfoVo().getScApiKey(),
                revokeDirectWithdrawVo.getId()

        )).getResponse();
    }

    public void getExportList(GetExportListVo getExportListVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getExportListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<ExportServiceSrv>>(service.getExportList(
                getExportListVo.getBaseInfoVo().getToken(),
                getExportListVo.getBaseInfoVo().getToken_issuer(),
                getExportListVo.getScProductId(),
                getExportListVo.getBaseInfoVo().getScVoucherHash(),
                getExportListVo.getBaseInfoVo().getScApiKey(),
                getExportListVo.getOffset(),
                getExportListVo.getSize(),
                getExportListVo.getId(),
                getExportListVo.getStatusCode(),
                getExportListVo.getServiceUrl()


        ), onGetResponseListener).get();
    }

    public ResultVo<List<ExportServiceSrv>> getExportList(GetExportListVo getExportListVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getExportListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.getExportList(
                getExportListVo.getBaseInfoVo().getToken(),
                getExportListVo.getBaseInfoVo().getToken_issuer(),
                getExportListVo.getScProductId(),
                getExportListVo.getBaseInfoVo().getScVoucherHash(),
                getExportListVo.getBaseInfoVo().getScApiKey(),
                getExportListVo.getOffset(),
                getExportListVo.getSize(),
                getExportListVo.getId(),
                getExportListVo.getStatusCode(),
                getExportListVo.getServiceUrl()


        )).getResponse();
    }

    public void requestGuildSettlement(RequestGuildSettlementVo requestGuildSettlementVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        requestGuildSettlementVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<SettlementRequestSrv>(service.requestGuildSettlement(
                requestGuildSettlementVo.getBaseInfoVo().getToken(),
                requestGuildSettlementVo.getBaseInfoVo().getToken_issuer(),
                requestGuildSettlementVo.getBaseInfoVo().getOtt(),
                requestGuildSettlementVo.getScProductId(),
                requestGuildSettlementVo.getBaseInfoVo().getScVoucherHash(),
                requestGuildSettlementVo.getBaseInfoVo().getScApiKey(),
                requestGuildSettlementVo.getFirstName(),
                requestGuildSettlementVo.getLastName(),
                requestGuildSettlementVo.getSheba(),
                requestGuildSettlementVo.getAmount(),
                requestGuildSettlementVo.getGuildCode(),
                requestGuildSettlementVo.getCurrencyCode(),
                requestGuildSettlementVo.getUniqueId(),
                requestGuildSettlementVo.getDescription()


        ), onGetResponseListener).get();
    }

    public ResultVo<SettlementRequestSrv> requestGuildSettlement(RequestGuildSettlementVo requestGuildSettlementVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        requestGuildSettlementVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.requestGuildSettlement(
                requestGuildSettlementVo.getBaseInfoVo().getToken(),
                requestGuildSettlementVo.getBaseInfoVo().getToken_issuer(),
                requestGuildSettlementVo.getBaseInfoVo().getOtt(),
                requestGuildSettlementVo.getScProductId(),
                requestGuildSettlementVo.getBaseInfoVo().getScVoucherHash(),
                requestGuildSettlementVo.getBaseInfoVo().getScApiKey(),
                requestGuildSettlementVo.getFirstName(),
                requestGuildSettlementVo.getLastName(),
                requestGuildSettlementVo.getSheba(),
                requestGuildSettlementVo.getAmount(),
                requestGuildSettlementVo.getGuildCode(),
                requestGuildSettlementVo.getCurrencyCode(),
                requestGuildSettlementVo.getUniqueId(),
                requestGuildSettlementVo.getDescription()


        )).getResponse();
    }

    public void requestWalletSettlement(RequestWalletSettlementVo requestWalletSettlementVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        requestWalletSettlementVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<SettlementRequestSrv>(service.requestWalletSettlement(
                requestWalletSettlementVo.getBaseInfoVo().getToken(),
                requestWalletSettlementVo.getBaseInfoVo().getToken_issuer(),
                requestWalletSettlementVo.getBaseInfoVo().getOtt(),
                requestWalletSettlementVo.getScProductId(),
                requestWalletSettlementVo.getBaseInfoVo().getScVoucherHash(),
                requestWalletSettlementVo.getBaseInfoVo().getScApiKey(),
                requestWalletSettlementVo.getWallet(),
                requestWalletSettlementVo.getFirstName(),
                requestWalletSettlementVo.getLastName(),
                requestWalletSettlementVo.getSheba(),
                requestWalletSettlementVo.getAmount(),
                requestWalletSettlementVo.getCurrenncyCode(),
                requestWalletSettlementVo.getUniqueId(),
                requestWalletSettlementVo.getDescription()


        ), onGetResponseListener).get();
    }

    public ResultVo<SettlementRequestSrv> requestWalletSettlement(RequestWalletSettlementVo requestWalletSettlementVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        requestWalletSettlementVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.requestWalletSettlement(
                requestWalletSettlementVo.getBaseInfoVo().getToken(),
                requestWalletSettlementVo.getBaseInfoVo().getToken_issuer(),
                requestWalletSettlementVo.getBaseInfoVo().getOtt(),
                requestWalletSettlementVo.getScProductId(),
                requestWalletSettlementVo.getBaseInfoVo().getScVoucherHash(),
                requestWalletSettlementVo.getBaseInfoVo().getScApiKey(),
                requestWalletSettlementVo.getWallet(),
                requestWalletSettlementVo.getFirstName(),
                requestWalletSettlementVo.getLastName(),
                requestWalletSettlementVo.getSheba(),
                requestWalletSettlementVo.getAmount(),
                requestWalletSettlementVo.getCurrenncyCode(),
                requestWalletSettlementVo.getUniqueId(),
                requestWalletSettlementVo.getDescription()


        )).getResponse();
    }

    public void requestSettlementByTool(RequestSettlementByToolVo requestSettlementByToolVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        requestSettlementByToolVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<SettlementRequestSrv>(service.requestSettlementByTool(
                requestSettlementByToolVo.getBaseInfoVo().getToken(),
                requestSettlementByToolVo.getBaseInfoVo().getToken_issuer(),
                requestSettlementByToolVo.getBaseInfoVo().getOtt(),
                requestSettlementByToolVo.getScProductId(),
                requestSettlementByToolVo.getBaseInfoVo().getScVoucherHash(),
                requestSettlementByToolVo.getBaseInfoVo().getScApiKey(),
                requestSettlementByToolVo.getFirstName(),
                requestSettlementByToolVo.getLastName(),
                requestSettlementByToolVo.getToolCode(),
                requestSettlementByToolVo.getToolId(),
                requestSettlementByToolVo.getAmount(),
                requestSettlementByToolVo.getGuildCode(),
                requestSettlementByToolVo.getCurrenncyCode(),
                requestSettlementByToolVo.getUniqueId(),
                requestSettlementByToolVo.getDescription()


        ), onGetResponseListener).get();
    }

    public ResultVo<SettlementRequestSrv> requestSettlementByTool(RequestSettlementByToolVo requestSettlementByToolVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        requestSettlementByToolVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.requestSettlementByTool(
                requestSettlementByToolVo.getBaseInfoVo().getToken(),
                requestSettlementByToolVo.getBaseInfoVo().getToken_issuer(),
                requestSettlementByToolVo.getBaseInfoVo().getOtt(),
                requestSettlementByToolVo.getScProductId(),
                requestSettlementByToolVo.getBaseInfoVo().getScVoucherHash(),
                requestSettlementByToolVo.getBaseInfoVo().getScApiKey(),
                requestSettlementByToolVo.getFirstName(),
                requestSettlementByToolVo.getLastName(),
                requestSettlementByToolVo.getToolCode(),
                requestSettlementByToolVo.getToolId(),
                requestSettlementByToolVo.getAmount(),
                requestSettlementByToolVo.getGuildCode(),
                requestSettlementByToolVo.getCurrenncyCode(),
                requestSettlementByToolVo.getUniqueId(),
                requestSettlementByToolVo.getDescription()


        )).getResponse();
    }

    public void listSettlements(ListSettlementsVo listSettlementsVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        listSettlementsVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<SettlementRequestSrv>>(service.listSettlements(
                listSettlementsVo.getBaseInfoVo().getToken(),
                listSettlementsVo.getBaseInfoVo().getToken_issuer(),
                listSettlementsVo.getScProductId(),
                listSettlementsVo.getBaseInfoVo().getScVoucherHash(),
                listSettlementsVo.getBaseInfoVo().getScApiKey(),
                listSettlementsVo.getStatusCode(),
                listSettlementsVo.getCurrencyCode(),
                listSettlementsVo.getFromAmount(),
                listSettlementsVo.getToAmount(),
                listSettlementsVo.getFromDate(),
                listSettlementsVo.getToDate(),
                listSettlementsVo.getOffset(),
                listSettlementsVo.getUniqueId(),
                listSettlementsVo.getSize(),
                listSettlementsVo.getId(),
                listSettlementsVo.getFirstName(),
                listSettlementsVo.getLastName(),
                listSettlementsVo.getToolCode(),
                listSettlementsVo.getToolId()


        ), onGetResponseListener).get();
    }

    public ResultVo<List<SettlementRequestSrv>> listSettlements(ListSettlementsVo listSettlementsVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        listSettlementsVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.listSettlements(
                listSettlementsVo.getBaseInfoVo().getToken(),
                listSettlementsVo.getBaseInfoVo().getToken_issuer(),
                listSettlementsVo.getScProductId(),
                listSettlementsVo.getBaseInfoVo().getScVoucherHash(),
                listSettlementsVo.getBaseInfoVo().getScApiKey(),
                listSettlementsVo.getStatusCode(),
                listSettlementsVo.getCurrencyCode(),
                listSettlementsVo.getFromAmount(),
                listSettlementsVo.getToAmount(),
                listSettlementsVo.getFromDate(),
                listSettlementsVo.getToDate(),
                listSettlementsVo.getOffset(),
                listSettlementsVo.getUniqueId(),
                listSettlementsVo.getSize(),
                listSettlementsVo.getId(),
                listSettlementsVo.getFirstName(),
                listSettlementsVo.getLastName(),
                listSettlementsVo.getToolCode(),
                listSettlementsVo.getToolId()


        )).getResponse();
    }

    public void addAutoSettlement(AddAutoSettlementVo addAutoSettlementVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        addAutoSettlementVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.addAutoSettlement(
                addAutoSettlementVo.getBaseInfoVo().getToken(),
                addAutoSettlementVo.getBaseInfoVo().getToken_issuer(),
                addAutoSettlementVo.getScProductId(),
                addAutoSettlementVo.getBaseInfoVo().getScVoucherHash(),
                addAutoSettlementVo.getBaseInfoVo().getScApiKey(),
                addAutoSettlementVo.getFirstName(),
                addAutoSettlementVo.getLastName(),
                addAutoSettlementVo.getSheba(),
                addAutoSettlementVo.getGuildCode(),
                addAutoSettlementVo.getCurrencyCode(),
                addAutoSettlementVo.getInstant()


        ), onGetResponseListener).get();
    }

    public ResultVo<Boolean> addAutoSettlement(AddAutoSettlementVo addAutoSettlementVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        addAutoSettlementVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.addAutoSettlement(
                addAutoSettlementVo.getBaseInfoVo().getToken(),
                addAutoSettlementVo.getBaseInfoVo().getToken_issuer(),
                addAutoSettlementVo.getScProductId(),
                addAutoSettlementVo.getBaseInfoVo().getScVoucherHash(),
                addAutoSettlementVo.getBaseInfoVo().getScApiKey(),
                addAutoSettlementVo.getFirstName(),
                addAutoSettlementVo.getLastName(),
                addAutoSettlementVo.getSheba(),
                addAutoSettlementVo.getGuildCode(),
                addAutoSettlementVo.getCurrencyCode(),
                addAutoSettlementVo.getInstant()
        )).getResponse();
    }

    public void removeAutoSettlement(RemoveAutoSettlementVo removeAutoSettlementVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        removeAutoSettlementVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.removeAutoSettlement(
                removeAutoSettlementVo.getBaseInfoVo().getToken(),
                removeAutoSettlementVo.getBaseInfoVo().getToken_issuer(),
                removeAutoSettlementVo.getScProductId(),
                removeAutoSettlementVo.getBaseInfoVo().getScVoucherHash(),
                removeAutoSettlementVo.getBaseInfoVo().getScApiKey(),
                removeAutoSettlementVo.getGuildCode(),
                removeAutoSettlementVo.getCurrencyCode()


        ), onGetResponseListener).get();
    }

    public ResultVo<Boolean> removeAutoSettlement(RemoveAutoSettlementVo removeAutoSettlementVo) throws PodException {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        removeAutoSettlementVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.removeAutoSettlement(
                removeAutoSettlementVo.getBaseInfoVo().getToken(),
                removeAutoSettlementVo.getBaseInfoVo().getToken_issuer(),
                removeAutoSettlementVo.getScProductId(),
                removeAutoSettlementVo.getBaseInfoVo().getScVoucherHash(),
                removeAutoSettlementVo.getBaseInfoVo().getScApiKey(),
                removeAutoSettlementVo.getGuildCode(),
                removeAutoSettlementVo.getCurrencyCode()
        )).getResponse();
    }

    public void verifyInvoice(VerifyInvoiceVo verifyInvoiceVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        verifyInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.verifyInvoice(
                verifyInvoiceVo.getBaseInfoVo().getToken(),
                verifyInvoiceVo.getBaseInfoVo().getToken_issuer(),
                verifyInvoiceVo.getScProductId(),
                verifyInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                verifyInvoiceVo.getBaseInfoVo().getScApiKey(),
                verifyInvoiceVo.getId(),
                verifyInvoiceVo.getBillNumber()
        ),
                onGetResponseListener).get();
    }

    public ResultVo<InvoiceSrv> verifyInvoice(VerifyInvoiceVo verifyInvoiceVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        verifyInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.verifyInvoice(
                verifyInvoiceVo.getBaseInfoVo().getToken(),
                verifyInvoiceVo.getBaseInfoVo().getToken_issuer(),
                verifyInvoiceVo.getScProductId(),
                verifyInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                verifyInvoiceVo.getBaseInfoVo().getScApiKey(),
                verifyInvoiceVo.getId(),
                verifyInvoiceVo.getBillNumber()
        )).getResponse();
    }

    public void reduceInvoice(ReduceInvoiceVo reduceInvoiceVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        reduceInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.reduceInvoice(
                reduceInvoiceVo.getBaseInfoVo().getToken(),
                reduceInvoiceVo.getBaseInfoVo().getToken_issuer(),
                reduceInvoiceVo.getScProductId(),
                reduceInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                reduceInvoiceVo.getBaseInfoVo().getScApiKey(),
                reduceInvoiceVo.getId(),
                reduceInvoiceVo.getInvoiceItemId(),
                reduceInvoiceVo.getPrice(),
                reduceInvoiceVo.getItemDescription(),
                reduceInvoiceVo.getQuantity(),
                reduceInvoiceVo.getPreferredTaxRate()
        ), onGetResponseListener).get();
    }

    public ResultVo<InvoiceSrv> reduceInvoice(ReduceInvoiceVo reduceInvoiceVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        reduceInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.reduceInvoice(
                reduceInvoiceVo.getBaseInfoVo().getToken(),
                reduceInvoiceVo.getBaseInfoVo().getToken_issuer(),
                reduceInvoiceVo.getScProductId(),
                reduceInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                reduceInvoiceVo.getBaseInfoVo().getScApiKey(),
                reduceInvoiceVo.getId(),
                reduceInvoiceVo.getInvoiceItemId(),
                reduceInvoiceVo.getPrice(),
                reduceInvoiceVo.getItemDescription(),
                reduceInvoiceVo.getQuantity(),
                reduceInvoiceVo.getPreferredTaxRate()
        )).getResponse();
    }

    public void invoiceWithBillNumber(InvoiceWithBillNumberVo invoiceWithBillNumberVo, OnGetResponseListener onGetResponseListener) {


        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        invoiceWithBillNumberVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceWithBillNumberSrv>(service.invoiceWithBillNumber(
                invoiceWithBillNumberVo.getBaseInfoVo().getToken(),
                invoiceWithBillNumberVo.getBaseInfoVo().getToken_issuer(),
                invoiceWithBillNumberVo.getScProductId(),
                invoiceWithBillNumberVo.getBaseInfoVo().getScVoucherHash(),
                invoiceWithBillNumberVo.getBaseInfoVo().getScApiKey(),
                invoiceWithBillNumberVo.getBillNumber(),
                invoiceWithBillNumberVo.getProductId(),
                invoiceWithBillNumberVo.getPrice(),
                invoiceWithBillNumberVo.getQuantity(),
                invoiceWithBillNumberVo.getProductDescription(),
                invoiceWithBillNumberVo.getGuildCode(),
                invoiceWithBillNumberVo.getRedirectURL(),
                invoiceWithBillNumberVo.getUserId(),
                invoiceWithBillNumberVo.getDescription(),
                invoiceWithBillNumberVo.getDeadline(),
                invoiceWithBillNumberVo.getCurrencyCode(),
                invoiceWithBillNumberVo.getAddressId(),
                invoiceWithBillNumberVo.getVerificationNeeded()
        ), onGetResponseListener).get();
    }

    public ResultVo<InvoiceWithBillNumberSrv> invoiceWithBillNumber(InvoiceWithBillNumberVo invoiceWithBillNumberVo) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        invoiceWithBillNumberVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        return new GetResult<>(service.invoiceWithBillNumber(
                invoiceWithBillNumberVo.getBaseInfoVo().getToken(),
                invoiceWithBillNumberVo.getBaseInfoVo().getToken_issuer(),
                invoiceWithBillNumberVo.getScProductId(),
                invoiceWithBillNumberVo.getBaseInfoVo().getScVoucherHash(),
                invoiceWithBillNumberVo.getBaseInfoVo().getScApiKey(),
                invoiceWithBillNumberVo.getBillNumber(),
                invoiceWithBillNumberVo.getProductId(),
                invoiceWithBillNumberVo.getPrice(),
                invoiceWithBillNumberVo.getQuantity(),
                invoiceWithBillNumberVo.getProductDescription(),
                invoiceWithBillNumberVo.getGuildCode(),
                invoiceWithBillNumberVo.getRedirectURL(),
                invoiceWithBillNumberVo.getUserId(),
                invoiceWithBillNumberVo.getDescription(),
                invoiceWithBillNumberVo.getDeadline(),
                invoiceWithBillNumberVo.getCurrencyCode(),
                invoiceWithBillNumberVo.getAddressId(),
                invoiceWithBillNumberVo.getVerificationNeeded()
        )).getResponse();
    }
}
