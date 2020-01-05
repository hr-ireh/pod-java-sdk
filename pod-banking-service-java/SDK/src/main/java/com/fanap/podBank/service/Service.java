package com.fanap.podBank.service;

import com.fanap.podBank.data.modelSrv.*;
import com.fanap.podBank.data.modelVo.*;
import com.fanap.podBank.util.GetResult;
import com.fanap.podBank.util.OnGetResponseListener;
import com.fanap.podBaseService.util.RetrofitUtil;
import com.fanap.podBaseService.util.ServerTypeSelectionUtil;

/**
 * Created by Z.gholinia on 11/9/2019.
 */
public class Service {


    public void getShebaInfo(GetShebaInfoVo getShebaInfoVo,
                             OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getShebaInfoVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<ShebaInfoSrv>(service.getShebaInfo(
                getShebaInfoVo.getBaseInfoVo().getToken(),
                getShebaInfoVo.getBaseInfoVo().getToken_issuer(),
                getShebaInfoVo.getScProductId(),
                getShebaInfoVo.getBaseInfoVo().getScVoucherHash(),
                getShebaInfoVo.getBaseInfoVo().getScApiKey(),
                getShebaInfoVo.getSheba()

        ), onGetResponseListener).get();
    }


    public void getDebitCardInfo(GetDebitCardInfoVo getDebitCardInfoVo,
                                 OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getDebitCardInfoVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<ShebaInfoSrv>(service.getDebitCardInfo(
                getDebitCardInfoVo.getBaseInfoVo().getToken(),
                getDebitCardInfoVo.getBaseInfoVo().getToken_issuer(),
                getDebitCardInfoVo.getScProductId(),
                getDebitCardInfoVo.getBaseInfoVo().getScVoucherHash(),
                getDebitCardInfoVo.getBaseInfoVo().getScApiKey(),
                getDebitCardInfoVo.getCardNumber()

        ), onGetResponseListener).get();
    }


    public void getDepositNumberByCardNumber(GetDepositNumberByCardNumberVo getDepositNumberByCardNumberVo,
                                             OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getDepositNumberByCardNumberVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<GetDepositNumberByCardNumberSrv>(service.getDepositNumberByCardNumber(
                getDepositNumberByCardNumberVo.getBaseInfoVo().getToken(),
                getDepositNumberByCardNumberVo.getBaseInfoVo().getToken_issuer(),
                getDepositNumberByCardNumberVo.getScProductId(),
                getDepositNumberByCardNumberVo.getBaseInfoVo().getScVoucherHash(),
                getDepositNumberByCardNumberVo.getBaseInfoVo().getScApiKey(),
                getDepositNumberByCardNumberVo.getUserName(),
                getDepositNumberByCardNumberVo.getCardNumber(),
                getDepositNumberByCardNumberVo.getTimestamp(),
                getDepositNumberByCardNumberVo.getSignatureInfo()
        ), onGetResponseListener).get();
    }

    public void getShebaByCardNumber(GetShebaByCardNumberVo getShebaByCardNumberVo,
                                       OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getShebaByCardNumberVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<GetShebaByCardNumberSrv>(service.getShebaByCardNumber(
                getShebaByCardNumberVo.getBaseInfoVo().getToken(),
                getShebaByCardNumberVo.getBaseInfoVo().getToken_issuer(),
                getShebaByCardNumberVo.getScProductId(),
                getShebaByCardNumberVo.getBaseInfoVo().getScVoucherHash(),
                getShebaByCardNumberVo.getBaseInfoVo().getScApiKey(),
                getShebaByCardNumberVo.getUserName(),
                getShebaByCardNumberVo.getCardNumber(),
                getShebaByCardNumberVo.getTimestamp(),
                getShebaByCardNumberVo.getSignature()
        ), onGetResponseListener).get();
    }

    public void getCardInformation(GetCardInformationVo getCardInformationVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getCardInformationVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<GetCardInformationSrv>(service.getCardInformation(
                getCardInformationVo.getBaseInfoVo().getToken(),
                getCardInformationVo.getBaseInfoVo().getToken_issuer(),
                getCardInformationVo.getScProductId(),
                getCardInformationVo.getBaseInfoVo().getScVoucherHash(),
                getCardInformationVo.getBaseInfoVo().getScApiKey(),
                getCardInformationVo.getUserName(),
                getCardInformationVo.getSrcCardNumber(),
                getCardInformationVo.getDestCardNumber(),
                getCardInformationVo.getEmail(),
                getCardInformationVo.getTimestamp(),
                getCardInformationVo.getSignature()
        ), onGetResponseListener).get();
    }


    public void cardToCard(CardToCardVo cardToCardVo,
                           OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(cardToCardVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<cardToCardSrv>(service.cardToCard(
                cardToCardVo.getBaseInfoVo().getToken(),
                cardToCardVo.getBaseInfoVo().getToken_issuer(),
                cardToCardVo.getScProductId(),
                cardToCardVo.getBaseInfoVo().getScVoucherHash(),
                cardToCardVo.getBaseInfoVo().getScApiKey(),
                cardToCardVo.getUserName(),
                cardToCardVo.getSrcCardNumber(),
                cardToCardVo.getDestCardNumber(),
                cardToCardVo.getPassword(),
                cardToCardVo.getCvv2(),
                cardToCardVo.getExpireMonth(),
                cardToCardVo.getExpireYear(),
                cardToCardVo.getAmount(),
                cardToCardVo.getEmail(),
                cardToCardVo.getAuthorizationCode(),
                cardToCardVo.getWithReferenceNumber(),
                cardToCardVo.getCardName(),
                cardToCardVo.getSrcComment(),
                cardToCardVo.getDestComment(),
                cardToCardVo.getOriginalAddress(),
                cardToCardVo.getJsonData(),
                cardToCardVo.getTimestamp(),
                cardToCardVo.getSignature()
        ), onGetResponseListener).get();
    }


    public void cardToCardList(CardToCardListVo cardToCardListVo,
                               OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(cardToCardListVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<CardToCardListSrv>(service.cardToCardList(
                cardToCardListVo.getBaseInfoVo().getToken(),
                cardToCardListVo.getBaseInfoVo().getToken_issuer(),
                cardToCardListVo.getScProductId(),
                cardToCardListVo.getBaseInfoVo().getScVoucherHash(),
                cardToCardListVo.getBaseInfoVo().getScApiKey(),
                cardToCardListVo.getUserName(),
                cardToCardListVo.getSourceCardNumber(),
                cardToCardListVo.getSourceDepositNumber(),
                cardToCardListVo.getDestinationCardNumber(),
                cardToCardListVo.getMinAmount(),
                cardToCardListVo.getMaxAmount(),
                cardToCardListVo.getStartDate(),
                cardToCardListVo.getEndDate(),
                cardToCardListVo.getRefrenceNumber(),
                cardToCardListVo.getSequenceNumber(),
                cardToCardListVo.getSourceNote(),
                cardToCardListVo.getDestinationNote(),
                cardToCardListVo.getTimestamp(),
                cardToCardListVo.getSignature()

        ), onGetResponseListener).get();
    }


    public void getSubmissionChque(GetSubmissionChqueVo getSubmissionChqueVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getSubmissionChqueVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<GetSubmissionChqueSrv>(service.getSubmissionChque(
                getSubmissionChqueVo.getBaseInfoVo().getToken(),
                getSubmissionChqueVo.getBaseInfoVo().getToken_issuer(),
                getSubmissionChqueVo.getScProductId(),
                getSubmissionChqueVo.getBaseInfoVo().getScVoucherHash(),
                getSubmissionChqueVo.getBaseInfoVo().getScApiKey(),
                getSubmissionChqueVo.getUserName(),
                getSubmissionChqueVo.getTimestamp(),
                getSubmissionChqueVo.getDeposit(),
                getSubmissionChqueVo.getChequeNumber(),
                getSubmissionChqueVo.getMinAmount(),
                getSubmissionChqueVo.getMaxAmount(),
                getSubmissionChqueVo.getStartDate(),
                getSubmissionChqueVo.getEndDate(),
                getSubmissionChqueVo.getBankCode(),
                getSubmissionChqueVo.getChequeStatus(),
                getSubmissionChqueVo.getStartSubmisionDate(),
                getSubmissionChqueVo.getEndSubmitionDate(),
                getSubmissionChqueVo.getRowCount(),
                getSubmissionChqueVo.getSignature()

        ), onGetResponseListener).get();
    }

    public void convertDepositNumberToSheba(ConvertDepositNumberToShebaVo convertDepositNumberToShebaVo,
                                            OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(convertDepositNumberToShebaVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<ConvertDepositNumberToShebaSrv>(service.convertDepositNumberToSheba(
                convertDepositNumberToShebaVo.getBaseInfoVo().getToken(),
                convertDepositNumberToShebaVo.getBaseInfoVo().getToken_issuer(),
                convertDepositNumberToShebaVo.getScProductId(),
                convertDepositNumberToShebaVo.getBaseInfoVo().getScVoucherHash(),
                convertDepositNumberToShebaVo.getBaseInfoVo().getScApiKey(),
                convertDepositNumberToShebaVo.getUserName(),
                convertDepositNumberToShebaVo.getDepositNumber(),
                convertDepositNumberToShebaVo.getTimestamp(),
                convertDepositNumberToShebaVo.getSignature()
        ), onGetResponseListener).get();
    }


    public void convertShebaToDeposit(ConvertShebaToDepositVo convertShebaToDepositVo,
                                      OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(convertShebaToDepositVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<ConvertShebaToDepositSrv>(service.convertShebaToDeposit(
                convertShebaToDepositVo.getBaseInfoVo().getToken(),
                convertShebaToDepositVo.getBaseInfoVo().getToken_issuer(),
                convertShebaToDepositVo.getScProductId(),
                convertShebaToDepositVo.getBaseInfoVo().getScVoucherHash(),
                convertShebaToDepositVo.getBaseInfoVo().getScApiKey(),
                convertShebaToDepositVo.getUserName(),
                convertShebaToDepositVo.getSheba(),
                convertShebaToDepositVo.getTimestamp(),
                convertShebaToDepositVo.getSignature()
        ), onGetResponseListener).get();
    }

    public void payaService(PayaSeriviceVo payaSeriviceVo,
                            OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(payaSeriviceVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<PayaSeriviceSrv>(service.payaService(
                payaSeriviceVo.getBaseInfoVo().getToken(),
                payaSeriviceVo.getBaseInfoVo().getToken_issuer(),
                payaSeriviceVo.getScProductId(),
                payaSeriviceVo.getBaseInfoVo().getScVoucherHash(),
                payaSeriviceVo.getBaseInfoVo().getScApiKey(),
                payaSeriviceVo.getUserName(),
                payaSeriviceVo.getTimestamp(),
                payaSeriviceVo.getSourceDepositNumber(),
                payaSeriviceVo.getTransferMoneyBillNumber(),
                payaSeriviceVo.getFileUniqueIdentifier(),
                payaSeriviceVo.getBatchPayaItemInfos(),
                payaSeriviceVo.getSignature()

        ), onGetResponseListener).get();
    }


    public void getDepositInvoice(GetDepositInvoiceVo getDepositInvoiceVo,
                                  OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getDepositInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<GetDepositInvoiceSrv>(service.getDepositInvoice(
                getDepositInvoiceVo.getBaseInfoVo().getToken(),
                getDepositInvoiceVo.getBaseInfoVo().getToken_issuer(),
                getDepositInvoiceVo.getScProductId(),
                getDepositInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                getDepositInvoiceVo.getBaseInfoVo().getScApiKey(),
                getDepositInvoiceVo.getUserName(),
                getDepositInvoiceVo.getTimestamp(),
                getDepositInvoiceVo.getDepositNumber(),
                getDepositInvoiceVo.getSheba(),
                getDepositInvoiceVo.getStartDate(),
                getDepositInvoiceVo.getEndDate(),
                getDepositInvoiceVo.getFirstIndex(),
                getDepositInvoiceVo.getCount(),
                getDepositInvoiceVo.getSignatureInfo()

        ), onGetResponseListener).get();
    }

    public void getDepositBalance(GetDepositBalanceVo getDepositBalanceVo,
                                  OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getDepositBalanceVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<GetDepositBalanceSrv>(service.getDepositBalance(
                getDepositBalanceVo.getBaseInfoVo().getToken(),
                getDepositBalanceVo.getBaseInfoVo().getToken_issuer(),
                getDepositBalanceVo.getScProductId(),
                getDepositBalanceVo.getBaseInfoVo().getScVoucherHash(),
                getDepositBalanceVo.getBaseInfoVo().getScApiKey(),
                getDepositBalanceVo.getUserName(),
                getDepositBalanceVo.getDepositNumber(),
                getDepositBalanceVo.getTimestamp(),
                getDepositBalanceVo.getSheba(),
                getDepositBalanceVo.getSignatureInfo()

        ), onGetResponseListener).get();
    }

    public void transferMoney(TransferMoneyVo transferMoneyVo,
                              OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferMoneyVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<TransferMoneySrv>(service.transferMoney(
                transferMoneyVo.getBaseInfoVo().getToken(),
                transferMoneyVo.getBaseInfoVo().getToken_issuer(),
                transferMoneyVo.getScProductId(),
                transferMoneyVo.getBaseInfoVo().getScVoucherHash(),
                transferMoneyVo.getBaseInfoVo().getScApiKey(),
                transferMoneyVo.getUserName(),
                transferMoneyVo.getSourceDepositNumber(),
                transferMoneyVo.getSourceSheba(),
                transferMoneyVo.getDestDepositNumber(),
                transferMoneyVo.getDestSheba(),
                transferMoneyVo.getDestFirstName(),
                transferMoneyVo.getDestLastName(),
                transferMoneyVo.getAmount(),
                transferMoneyVo.getSourceComment(),
                transferMoneyVo.getDestComment(),
                transferMoneyVo.getPaymentId(),
                transferMoneyVo.getTimestamp(),
                transferMoneyVo.getSignature()

        ), onGetResponseListener).get();
    }


    public void getTransferMoneyState(GetTranfserStateVo getTranfserStateVo,
                                 OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getTranfserStateVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<GetTranfserStateSrv>(service.getTransferMoneyState(
                getTranfserStateVo.getBaseInfoVo().getToken(),
                getTranfserStateVo.getBaseInfoVo().getToken_issuer(),
                getTranfserStateVo.getScProductId(),
                getTranfserStateVo.getBaseInfoVo().getScVoucherHash(),
                getTranfserStateVo.getBaseInfoVo().getScApiKey(),
                getTranfserStateVo.getUserName(),
                getTranfserStateVo.getDate(),
                getTranfserStateVo.getTimestamp(),
                getTranfserStateVo.getPaymentId(),
                getTranfserStateVo.getSignature()

        ), onGetResponseListener).get();
    }


    public void billPaymentByDeposit(BillPaymentByDepositVo billPaymentByDepositVo,
                                     OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(billPaymentByDepositVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<BillPaymentByDepositSrv>(service.billPaymentByDeposit(
                billPaymentByDepositVo.getBaseInfoVo().getToken(),
                billPaymentByDepositVo.getBaseInfoVo().getToken_issuer(),
                billPaymentByDepositVo.getScProductId(),
                billPaymentByDepositVo.getBaseInfoVo().getScVoucherHash(),
                billPaymentByDepositVo.getBaseInfoVo().getScApiKey(),
                billPaymentByDepositVo.getUserName(),
                billPaymentByDepositVo.getTimestamp(),
                billPaymentByDepositVo.getDepositNumber(),
                billPaymentByDepositVo.getBillNumber(),
                billPaymentByDepositVo.getPaymentId(),
                billPaymentByDepositVo.getSignature()

        ), onGetResponseListener).get();
    }
    public void getShebaAndStatus(GetShebaAndStatusVo getShebaAndStatusVo,
                                  OnGetResponseListener onGetResponseListener) {

        PodBanking service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getShebaAndStatusVo.getBaseInfoVo().getServerType()))
                .create(PodBanking.class);

        new GetResult<GetShebaAndStatusSrv>(service.getShebaAndStatus(
                getShebaAndStatusVo.getBaseInfoVo().getToken(),
                getShebaAndStatusVo.getBaseInfoVo().getToken_issuer(),
                getShebaAndStatusVo.getScProductId(),
                getShebaAndStatusVo.getBaseInfoVo().getScVoucherHash(),
                getShebaAndStatusVo.getBaseInfoVo().getScApiKey(),
                getShebaAndStatusVo.getUserName(),
                getShebaAndStatusVo.getSheba(),
                getShebaAndStatusVo.getShenaseVariz(),
                getShebaAndStatusVo.getTimestamp(),
                getShebaAndStatusVo.getSignatureInfo()

        ), onGetResponseListener).get();
    }


}
