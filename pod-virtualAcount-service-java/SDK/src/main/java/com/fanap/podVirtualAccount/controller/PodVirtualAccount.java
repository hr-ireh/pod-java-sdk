package com.fanap.podVirtualAccount.controller;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.data.modelVo.*;
import com.fanap.podVirtualAccount.service.Service;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class PodVirtualAccount {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();


    /**
     * issue Credit Invoice And Get Hash.
     *
     * @param issueCreditInvoiceAndGetHashVo
     * @param onGetResponseListener          A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount issueCreditInvoiceAndGetHash(IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo,
                                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * verify Credit Invoice.
     *
     * @param verifyCreditInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount verifyCreditInvoice(VerifyCreditInvoiceVo verifyCreditInvoiceVo,
                                                 OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.verifyCreditInvoice(verifyCreditInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * transfer From Own Accounts.
     *
     * @param transferFromOwnAccountsVo
     * @param onGetResponseListener     A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                  InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount transferFromOwnAccounts(TransferFromOwnAccountsVo transferFromOwnAccountsVo,
                                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.transferFromOwnAccounts(transferFromOwnAccountsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * transfer From Own Accounts List.
     *
     * @param transferFromOwnAccountsListVo
     * @param onGetResponseListener         A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                      InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount transferFromOwnAccountsList(TransferFromOwnAccountsListVo transferFromOwnAccountsListVo,
                                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.transferFromOwnAccountsList(transferFromOwnAccountsListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * transfer To Contact.
     *
     * @param transferToContactVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount transferToContact(TransferToContactVo transferToContactVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.transferToContact(transferToContactVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * transfer To Contact List.
     *
     * @param transferToContactListVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount transferToContactList(TransferToContactListVo transferToContactListVo,
                                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.transferToContactList(transferToContactListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * follow.
     *
     * @param followVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount follow(FollowVo followVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.follow(followVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * follow.
     *
     * @param getBusinessVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount getBusiness(GetBusinessVo getBusinessVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getBusiness(getBusinessVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Followers.
     *
     * @param getFollowersVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount getFollowers(GetFollowersVo getFollowersVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getFollowers(getFollowersVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * transfer To Follower.
     *
     * @param transferToFollowerVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount transferToFollower(TransferToFollowerVo transferToFollowerVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.transferToFollower(transferToFollowerVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * transfer To Follower List.
     *
     * @param transferToFollowerListVo
     * @param onGetResponseListener    A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                 InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount transferToFollowerList(TransferToFollowerListVo transferToFollowerListVo,
                                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.transferToFollowerList(transferToFollowerListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * transfer To Follower And Cashout.
     *
     * @param transferToFollowerAndCashoutVo
     * @param onGetResponseListener          A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount transferToFollowerAndCashout(TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo,
                                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * transfer By Invoice.
     *
     * @param transferByInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount transferByInvoice(TransferByInvoiceVo transferByInvoiceVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.transferByInvoice(transferByInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * list Transfer By Invoice.
     *
     * @param listTransferByInvoiceVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount listTransferByInvoice(ListTransferByInvoiceVo listTransferByInvoiceVo,
                                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.listTransferByInvoice(listTransferByInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Account Bill Biz.
     *
     * @param getGuildAccountBillVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount getGuildAccountBill(GetGuildAccountBillVo getGuildAccountBillVo,
                                                 OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getGuildAccountBill(getGuildAccountBillVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Account Bill.
     *
     * @param getWalletAccountBillVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount getWalletAccountBill(GetWalletAccountBillVo getWalletAccountBillVo,
                                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getWalletAccountBill(getWalletAccountBillVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Account Bill As File.
     *
     * @param getAccountBillAsFileVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount getAccountBillAsFile(GetAccountBillAsFileVo getAccountBillAsFileVo,
                                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAccountBillAsFile(getAccountBillAsFileVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * card To Card List.
     *
     * @param cardToCardListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount cardToCardList(CardToCardListVo cardToCardListVo,
                                            OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.cardToCardList(cardToCardListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update Card To Card.
     *
     * @param updateCardToCardVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount updateCardToCard(UpdateCardToCardVo updateCardToCardVo,
                                              OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateCardToCard(updateCardToCardVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * add With draw Rule Plan.
     *
     * @param addWithdrawRulePlanVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount addWithdrawRulePlan(AddWithdrawRulePlanVo addWithdrawRulePlanVo,
                                                 OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addWithdrawRulePlan(addWithdrawRulePlanVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * with draw Rule Plan List.
     *
     * @param withdrawRulePlanListVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount withdrawRulePlanList(WithdrawRulePlanListVo withdrawRulePlanListVo,
                                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.withdrawRulePlanList(withdrawRulePlanListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * with draw Rule List.
     *
     * @param withdrawRulePlanListVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount withdrawRuleList(WithdrawRuleListVo withdrawRulePlanListVo,
                                              OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.withdrawRuleList(withdrawRulePlanListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * with draw Rule List.
     *
     * @param revokeWithdrawRuleVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount revokeWithdrawRule(RevokeWithdrawRuleVo revokeWithdrawRuleVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.revokeWithdrawRule(revokeWithdrawRuleVo, onGetResponseListener);
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
    public PodVirtualAccount payInvoiceByCredit(PayInvoiceByCreditVo payInvoiceByCreditVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.payInvoiceByCredit(payInvoiceByCreditVo, onGetResponseListener);
        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * with draw Rule Usage Report.
     *
     * @param withdrawRuleUsageReportVo
     * @param onGetResponseListener     A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                  InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodVirtualAccount withdrawRuleUsageReport(WithdrawRuleUsageReportVo withdrawRuleUsageReportVo,
                                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.withdrawRuleUsageReport(withdrawRuleUsageReportVo, onGetResponseListener);
        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

}
