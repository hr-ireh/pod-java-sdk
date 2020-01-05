package com.fanap.billingService.controller;

import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.service.Service;
import com.fanap.billingService.util.OnGetResponseListener;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class BillingService {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();

    /**
     * Get ott.
     *
     * @param ottVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService ott(OttVo ottVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.ott(ottVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Issue invoice.
     *
     * @param issueInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService issueInvoice(IssueInvoiceVo issueInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.issueInvoice(issueInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Create preinvoice.
     *
     * @param createPreInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService createPreInvoice(CreatePreInvoiceVo createPreInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.createPreInvoice(createPreInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list.
     *
     * @param getInvoiceListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService getInvoiceList(GetInvoiceListVo getInvoiceListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getInvoiceList(getInvoiceListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list by metadata.
     *
     * @param getInvoiceListByMetadataVo
     * @param onGetResponseListener      A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                   InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService getInvoiceListByMetadata(GetInvoiceListByMetadataVo getInvoiceListByMetadataVo,
                                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getInvoiceListByMetadata(getInvoiceListByMetadataVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param getInvoiceListAsFileVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService getInvoiceListAsFile(GetInvoiceListAsFileVo getInvoiceListAsFileVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getInvoiceListAsFile(getInvoiceListAsFileVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param cancelInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService cancelInvoice(CancelInvoiceVo cancelInvoiceVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.cancelInvoice(cancelInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param verifyAndCloseInvoiceVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService verifyAndCloseInvoice(VerifyAndCloseInvoiceVo verifyAndCloseInvoiceVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.verifyAndCloseInvoice(verifyAndCloseInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param closeInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService closeInvoice(CloseInvoiceVo closeInvoiceVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.closeInvoice(closeInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param getInvoicePaymentLinkVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService getInvoicePaymentLink(GetInvoicePaymentLinkVo getInvoicePaymentLinkVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getInvoicePaymentLink(getInvoicePaymentLinkVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * pay Invoice.
     *
     * @param payInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService payInvoice(PayInvoiceVo payInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.payInvoice(payInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * pay Invoice By Credit.
     *
     * @param payInvoiceByCreditVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService payInvoiceByCredit(PayInvoiceByCreditVo payInvoiceByCreditVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.payInvoiceByCredit(payInvoiceByCreditVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * pay Any Invoice By Credit.
     *
     * @param payAnyInvoiceByCreditVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService payAnyInvoiceByCredit(PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.payAnyInvoiceByCredit(payAnyInvoiceByCreditVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * sendInvoicePaymentSMS.
     *
     * @param sendInvoicePaymentSMSVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService sendInvoicePaymentSMS(SendInvoicePaymentSmsVo sendInvoicePaymentSMSVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.sendInvoicePaymentSMS(sendInvoicePaymentSMSVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * pay Invoice In Future.
     *
     * @param payInvoiceInFutureVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService payInvoiceInFuture(PayInvoiceInFutureVo payInvoiceInFutureVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.payInvoiceInFuture(payInvoiceInFutureVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * pay Invoice By Invoice.
     *
     * @param payInvoiceByInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService payInvoiceByInvoice(PayInvoiceByInvoiceVo payInvoiceByInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.payInvoiceByInvoice(payInvoiceByInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * issue Multi Invoice .
     *
     * @param issueMultiInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService issueMultiInvoice(IssueMultiInvoiceVo issueMultiInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.issueMultiInvoice(issueMultiInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * reduce Multi Invoice .
     *
     * @param reduceMultiInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService reduceMultiInvoice(ReduceMultiInvoiceVo  reduceMultiInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.reduceMultiInvoice(reduceMultiInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }




    /**
     * reduce Multi Invoice And Cashout .
     *
     * @param reduceMultiInvoiceAndCashoutVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService reduceMultiInvoiceAndCashout(ReduceMultiInvoiceAndCashoutVo  reduceMultiInvoiceAndCashoutVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.reduceMultiInvoiceAndCashout(reduceMultiInvoiceAndCashoutVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }



    /**
     * define Credit Voucher .
     *
     * @param defineCreditVoucherVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService defineCreditVoucher(DefineCreditVoucherVo  defineCreditVoucherVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.defineCreditVoucher(defineCreditVoucherVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * define Discount Amount Voucher.
     *
     * @param defineDiscountAmountVoucherVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService defineDiscountAmountVoucher(DefineDiscountAmountVoucherVo  defineDiscountAmountVoucherVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.defineDiscountAmountVoucher(defineDiscountAmountVoucherVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * define Discount Percentage Voucher.
     *
     * @param defineDiscountPercentageVoucherVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService defineDiscountPercentageVoucher(DefineDiscountPercentageVoucherVo  defineDiscountPercentageVoucherVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * apply Voucher.
     *
     * @param applyVoucherVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService applyVoucher(ApplyVoucherVo  applyVoucherVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.applyVoucher(applyVoucherVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * deactivate Voucher.
     *
     * @param deactivateVoucherVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService deactivateVoucher(DeactivateVoucherVo  deactivateVoucherVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deactivateVoucher(deactivateVoucherVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }



    /**
     * activate Voucher.
     *
     * @param activateVoucherVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService activateVoucher(ActivateVoucherVo  activateVoucherVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.activateVoucher(activateVoucherVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Voucher List.
     *
     * @param getVoucherListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService getVoucherList(GetVoucherListVo  getVoucherListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getVoucherList(getVoucherListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * define Direct With draw.
     *
     * @param defineDirectWithdrawVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService defineDirectWithdraw(DefineDirectWithdrawVo  defineDirectWithdrawVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.defineDirectWithdraw(defineDirectWithdrawVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * direct With draw List.
     *
     * @param directWithdrawListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService directWithdrawList(DirectWithdrawListVo  directWithdrawListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.directWithdrawList(directWithdrawListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * update Direct With draw.
     *
     * @param updateDirectWithdrawVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService updateDirectWithdraw(UpdateDirectWithdrawVo  updateDirectWithdrawVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateDirectWithdraw(updateDirectWithdrawVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * revoke Direct With draw.
     *
     * @param revokeDirectWithdrawVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService revokeDirectWithdraw(RevokeDirectWithdrawVo  revokeDirectWithdrawVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.revokeDirectWithdraw(revokeDirectWithdrawVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     *get Export List.
     *
     * @param getExportListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService getExportList(GetExportListVo  getExportListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getExportList(getExportListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     *request Guild Settlement.
     *
     * @param requestGuildSettlementVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService requestGuildSettlement(RequestGuildSettlementVo requestGuildSettlementVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.requestGuildSettlement(requestGuildSettlementVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }




    /**
     *request Settlement.
     *
     * @param requestWalletSettlementVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService requestWalletSettlement(RequestWalletSettlementVo requestWalletSettlementVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.requestWalletSettlement(requestWalletSettlementVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }



    /**
     *requestS ettlement By Tool.
     *
     * @param requestSettlementByToolVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService requestSettlementByTool(RequestSettlementByToolVo requestSettlementByToolVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.requestSettlementByTool(requestSettlementByToolVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }



    /**
     *list Settlements.
     *
     * @param listSettlementsVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService listSettlements(ListSettlementsVo listSettlementsVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.listSettlements(listSettlementsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     *add Auto Settlement.
     *
     * @param addAutoSettlementVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService addAutoSettlement(AddAutoSettlementVo addAutoSettlementVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addAutoSettlement(addAutoSettlementVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     *remove Auto Settlement.
     *
     * @param removeAutoSettlementVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService removeAutoSettlement(RemoveAutoSettlementVo removeAutoSettlementVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.removeAutoSettlement(removeAutoSettlementVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     *verify Invoice.
     *
     * @param verifyInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService verifyInvoice(VerifyInvoiceVo verifyInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.verifyInvoice(verifyInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     *reduce Invoice.
     *
     * @param reduceInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public BillingService reduceInvoice(ReduceInvoiceVo reduceInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.reduceInvoice(reduceInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

}
