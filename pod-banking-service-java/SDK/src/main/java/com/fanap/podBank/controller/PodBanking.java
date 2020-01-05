package com.fanap.podBank.controller;

import com.fanap.podBank.data.modelVo.*;
import com.fanap.podBank.service.Service;
import com.fanap.podBank.util.OnGetResponseListener;
import com.fanap.podBaseService.exception.PodException;

/**
 * Created by Z.gholinia on 11/9/2019.
 */
public class PodBanking {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();


    /**
     * get Sheba Info.
     *
     * @param getShebaInfoVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getShebaInfo(GetShebaInfoVo getShebaInfoVo,
                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getShebaInfo(getShebaInfoVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Debit Card Info.
     *
     * @param getDebitCardInfoVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getDebitCardInfo(GetDebitCardInfoVo getDebitCardInfoVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getDebitCardInfo(getDebitCardInfoVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Deposit Number By Card Number.
     *
     * @param getDepositNumberByCardNumberVo
     * @param onGetResponseListener          A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getDepositNumberByCardNumber(GetDepositNumberByCardNumberVo getDepositNumberByCardNumberVo,
                                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getDepositNumberByCardNumber(getDepositNumberByCardNumberVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Sheba By Card Number.
     *
     * @param getShebaByCardNumberVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getShebaByCardNumber(GetShebaByCardNumberVo getShebaByCardNumberVo,
                                             OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getShebaByCardNumber(getShebaByCardNumberVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Card Information.
     *
     * @param getCardInformationVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getCardInformation(GetCardInformationVo getCardInformationVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getCardInformation(getCardInformationVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * card to Card.
     *
     * @param cardToCardVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking cardToCard(CardToCardVo cardToCardVo,
                                 OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.cardToCard(cardToCardVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * crad To Card List.
     *
     * @param cardToCardListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking cardToCardList(CardToCardListVo cardToCardListVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.cardToCardList(cardToCardListVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Submission Chque.
     *
     * @param getSubmissionChqueVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getSubmissionChque(GetSubmissionChqueVo getSubmissionChqueVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getSubmissionChque(getSubmissionChqueVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Convert Deposit Number To Sheba.
     *
     * @param convertDepositNumberToShebaVo
     * @param onGetResponseListener         A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                      InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking convertDepositNumberToSheba(ConvertDepositNumberToShebaVo convertDepositNumberToShebaVo,
                                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.convertDepositNumberToSheba(convertDepositNumberToShebaVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * convert Sheba To Deposit.
     *
     * @param convertShebaToDepositVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking convertShebaToDeposit(ConvertShebaToDepositVo convertShebaToDepositVo,
                                            OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.convertShebaToDeposit(convertShebaToDepositVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * paya Service.
     *
     * @param payaSeriviceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking payaService(PayaSeriviceVo payaSeriviceVo,
                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.payaService(payaSeriviceVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Deposit Invoice.
     *
     * @param getDepositInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getDepositInvoice(GetDepositInvoiceVo getDepositInvoiceVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getDepositInvoice(getDepositInvoiceVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Deposit Invoice.
     *
     * @param getDepositBalanceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getDepositBalance(GetDepositBalanceVo getDepositBalanceVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getDepositBalance(getDepositBalanceVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * transfer Money.
     *
     * @param transferMoneyVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking transferMoney(TransferMoneyVo transferMoneyVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.transferMoney(transferMoneyVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }



    /**
     *get Transfer State.
     *
     * @param getTranfserStateVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getTransferMoneyState(GetTranfserStateVo getTranfserStateVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getTransferMoneyState(getTranfserStateVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     *Bill Payment By Deposit.
     *
     * @param billPaymentByDepositVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking billPaymentByDeposit(BillPaymentByDepositVo billPaymentByDepositVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.billPaymentByDeposit(billPaymentByDepositVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     *Bill Payment By Deposit.
     *
     * @param getShebaAndStatusVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBanking getShebaAndStatus(GetShebaAndStatusVo getShebaAndStatusVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.getShebaAndStatus(getShebaAndStatusVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


}

