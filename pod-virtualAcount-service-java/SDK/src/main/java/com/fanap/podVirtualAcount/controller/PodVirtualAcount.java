package com.fanap.podVirtualAcount.controller;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAcount.data.modelSrv.*;
import com.fanap.podVirtualAcount.data.modelVo.*;
import com.fanap.podVirtualAcount.service.Service;
import com.fanap.podVirtualAcount.util.OnGetResponseListener;

import java.util.List;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class PodVirtualAcount {

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
    public PodVirtualAcount issueCreditInvoiceAndGetHash(IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<String> issueCreditInvoiceAndGetHash(IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo) throws PodException {
        return service.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo);
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
    public PodVirtualAcount verifyCreditInvoice(VerifyCreditInvoiceVo verifyCreditInvoiceVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.verifyCreditInvoice(verifyCreditInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<CreditInvoiceSrv> verifyCreditInvoice(VerifyCreditInvoiceVo verifyCreditInvoiceVo) throws PodException {
        return service.verifyCreditInvoice(verifyCreditInvoiceVo);
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
    public PodVirtualAcount transferFromOwnAccounts(TransferFromOwnAccountsVo transferFromOwnAccountsVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.transferFromOwnAccounts(transferFromOwnAccountsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<UserAmountSrv> transferFromOwnAccounts(TransferFromOwnAccountsVo transferFromOwnAccountsVo) throws PodException {
        return service.transferFromOwnAccounts(transferFromOwnAccountsVo);
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
    public PodVirtualAcount transferFromOwnAccountsList(TransferFromOwnAccountsListVo transferFromOwnAccountsListVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.transferFromOwnAccountsList(transferFromOwnAccountsListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<List<TransferCreditSrv>> transferFromOwnAccountsList(TransferFromOwnAccountsListVo transferFromOwnAccountsListVo) throws PodException {
        return service.transferFromOwnAccountsList(transferFromOwnAccountsListVo);
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
    public PodVirtualAcount transferToContact(TransferToContactVo transferToContactVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.transferToContact(transferToContactVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<TransferToContactSrv> transferToContact(TransferToContactVo transferToContactVo) throws PodException {
        return service.transferToContact(transferToContactVo);
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
    public PodVirtualAcount transferToContactList(TransferToContactListVo transferToContactListVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.transferToContactList(transferToContactListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<List<TransferToContactSrv>> transferToContactList(TransferToContactListVo transferToContactListVo) throws PodException {
        return service.transferToContactList(transferToContactListVo);
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
    public PodVirtualAcount follow(FollowVo followVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.follow(followVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<Boolean> follow(FollowVo followVo) throws PodException {
        return service.follow(followVo);
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
    public PodVirtualAcount getBusiness(GetBusinessVo getBusinessVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.getBusiness(getBusinessVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<BusinessSrv> getBusiness(GetBusinessVo getBusinessVo) throws PodException {
        return service.getBusiness(getBusinessVo);
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
    public PodVirtualAcount getFollowers(GetFollowersVo getFollowersVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.getFollowers(getFollowersVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<List<UserSrv>> getFollowers(GetFollowersVo getFollowersVo) throws PodException {
        return service.getFollowers(getFollowersVo);
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
    public PodVirtualAcount transferToFollower(TransferToFollowerVo transferToFollowerVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.transferToFollower(transferToFollowerVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<UserAmountSrv> transferToFollower(TransferToFollowerVo transferToFollowerVo) throws PodException {
        return service.transferToFollower(transferToFollowerVo);
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
    public PodVirtualAcount transferToFollowerList(TransferToFollowerListVo transferToFollowerListVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.transferToFollowerList(transferToFollowerListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<List<TransferToFollowerSrv>> transferToFollowerList(TransferToFollowerListVo transferToFollowerListVo) throws PodException {
        return service.transferToFollowerList(transferToFollowerListVo);
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
    public PodVirtualAcount transferToFollowerAndCashout(TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<UserAmountSrv> transferToFollowerAndCashout(TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo) throws PodException {
        return service.transferToFollowerAndCashout(transferToFollowerAndCashoutVo);
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
    public PodVirtualAcount transferByInvoice(TransferByInvoiceVo transferByInvoiceVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.transferByInvoice(transferByInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<UserAmountSrv> transferByInvoice(TransferByInvoiceVo transferByInvoiceVo) throws PodException {
        return service.transferByInvoice(transferByInvoiceVo);
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
    public PodVirtualAcount listTransferByInvoice(ListTransferByInvoiceVo listTransferByInvoiceVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.listTransferByInvoice(listTransferByInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<List<TransferToFollowerSrv>> listTransferByInvoice(ListTransferByInvoiceVo listTransferByInvoiceVo) throws PodException {
        return service.listTransferByInvoice(listTransferByInvoiceVo);
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
    public PodVirtualAcount getGuildAccountBill(GetGuildAccountBillVo getGuildAccountBillVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.getGuildAccountBill(getGuildAccountBillVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<List<AccountBillItemSrv>> getGuildAccountBill(GetGuildAccountBillVo getGuildAccountBillVo) throws PodException {
        return service.getGuildAccountBill(getGuildAccountBillVo);
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
    public PodVirtualAcount getWalletAccountBill(GetWalletAccountBillVo getWalletAccountBillVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.getWalletAccountBill(getWalletAccountBillVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<List<AccountBillItemSrv>> getWalletAccountBill(GetWalletAccountBillVo getWalletAccountBillVo) throws PodException {
        return service.getWalletAccountBill(getWalletAccountBillVo);
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
    public PodVirtualAcount getAccountBillAsFile(GetAccountBillAsFileVo getAccountBillAsFileVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.getAccountBillAsFile(getAccountBillAsFileVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<ExportServiceSrv> getAccountBillAsFile(GetAccountBillAsFileVo getAccountBillAsFileVo) throws PodException {
        return service.getAccountBillAsFile(getAccountBillAsFileVo);
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
    public PodVirtualAcount cardToCardList(CardToCardListVo cardToCardListVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.cardToCardList(cardToCardListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<List<CardToCardPoolSrv>> cardToCardList(CardToCardListVo cardToCardListVo) throws PodException {
        return service.cardToCardList(cardToCardListVo);
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
    public PodVirtualAcount updateCardToCard(UpdateCardToCardVo updateCardToCardVo, OnGetResponseListener onGetResponseListener) throws PodException {

        if (onGetResponseListener != null)
            service.updateCardToCard(updateCardToCardVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    public ResultVo<List<CardToCardPoolSrv>> updateCardToCard(UpdateCardToCardVo updateCardToCardVo) throws PodException {
        return service.updateCardToCard(updateCardToCardVo);
    }


    public ResultVo<Void> addCard(AddCardVo addCardVo) throws PodException {
        return service.addCard(addCardVo);
    }

    public ResultVo<Void> addSheba(AddShebaVo addShebaVo) throws PodException {
        return service.addSheba(addShebaVo);
    }

    public ResultVo<List<CardListSrv>> cardList(CardListVo cardListVo) throws PodException {
        return service.cardList(cardListVo);
    }

    public ResultVo<List<ShebaListSrv>> shebaList(ShebaListVo shebaListVo) throws PodException {
        return service.shebaList(shebaListVo);
    }

    public ResultVo<UserAmountSrv> businessBalance(BusinessBalanceVo businessBalanceVo) throws PodException {
        return service.businessBalance(businessBalanceVo);
    }
}