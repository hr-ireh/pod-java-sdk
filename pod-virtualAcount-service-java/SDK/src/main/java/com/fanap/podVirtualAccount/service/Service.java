package com.fanap.podVirtualAccount.service;

import com.fanap.podBaseService.util.RetrofitUtil;
import com.fanap.podBaseService.util.ServerTypeSelectionUtil;
import com.fanap.podVirtualAccount.data.modelSrv.*;
import com.fanap.podVirtualAccount.data.modelVo.*;
import com.fanap.podVirtualAccount.util.GetResult;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;

import java.util.List;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class Service {

    public void issueCreditInvoiceAndGetHash(IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo,
                                             OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(issueCreditInvoiceAndGetHashVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<String>(service.issueCreditInvoiceAndGetHash(
                issueCreditInvoiceAndGetHashVo.getBaseInfoVo().getToken(),
                issueCreditInvoiceAndGetHashVo.getBaseInfoVo().getToken_issuer(),
                issueCreditInvoiceAndGetHashVo.getScProductId(),
                issueCreditInvoiceAndGetHashVo.getBaseInfoVo().getScVoucherHash(),
                issueCreditInvoiceAndGetHashVo.getBaseInfoVo().getScApiKey(),
                issueCreditInvoiceAndGetHashVo.getAmount(),
                issueCreditInvoiceAndGetHashVo.getUserId(),
                issueCreditInvoiceAndGetHashVo.getBillNumber(),
                issueCreditInvoiceAndGetHashVo.getWallet(),
                issueCreditInvoiceAndGetHashVo.getRedirectUrl()
        ), onGetResponseListener).get();
    }

    public void verifyCreditInvoice(VerifyCreditInvoiceVo verifyCreditInvoiceVo,
                                    OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(verifyCreditInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<CreditInvoiceSrv>(service.verifyCreditInvoice(
                verifyCreditInvoiceVo.getBaseInfoVo().getToken(),
                verifyCreditInvoiceVo.getBaseInfoVo().getToken_issuer(),
                verifyCreditInvoiceVo.getScProductId(),
                verifyCreditInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                verifyCreditInvoiceVo.getBaseInfoVo().getScApiKey(),
                verifyCreditInvoiceVo.getBillNumber(),
                verifyCreditInvoiceVo.getId()
        ), onGetResponseListener).get();
    }

    public void transferFromOwnAccounts(TransferFromOwnAccountsVo transferFromOwnAccountsVo,
                                        OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferFromOwnAccountsVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<UserAmountSrv>(service.transferFromOwnAccounts(
                transferFromOwnAccountsVo.getBaseInfoVo().getToken(),
                transferFromOwnAccountsVo.getBaseInfoVo().getToken_issuer(),
                transferFromOwnAccountsVo.getScProductId(),
                transferFromOwnAccountsVo.getBaseInfoVo().getScVoucherHash(),
                transferFromOwnAccountsVo.getBaseInfoVo().getScApiKey(),
                transferFromOwnAccountsVo.getGuildCode(),
                transferFromOwnAccountsVo.getAmount(),
                transferFromOwnAccountsVo.getCustomerAmount(),
                transferFromOwnAccountsVo.getCurrencyCode(),
                transferFromOwnAccountsVo.getDescription(),
                transferFromOwnAccountsVo.getWallet(),
                transferFromOwnAccountsVo.getUniqueId()
        ), onGetResponseListener).get();
    }


    public void transferFromOwnAccountsList(TransferFromOwnAccountsListVo transferFromOwnAccountsListVo,
                                            OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferFromOwnAccountsListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<TransferCreditSrv>>(service.transferFromOwnAccountsList(
                transferFromOwnAccountsListVo.getBaseInfoVo().getToken(),
                transferFromOwnAccountsListVo.getBaseInfoVo().getToken_issuer(),
                transferFromOwnAccountsListVo.getScProductId(),
                transferFromOwnAccountsListVo.getBaseInfoVo().getScVoucherHash(),
                transferFromOwnAccountsListVo.getBaseInfoVo().getScApiKey(),
                transferFromOwnAccountsListVo.getUniqueId(),
                transferFromOwnAccountsListVo.getOffset(),
                transferFromOwnAccountsListVo.getSize(),
                transferFromOwnAccountsListVo.getFromDate(),
                transferFromOwnAccountsListVo.getToDate()
        ), onGetResponseListener).get();
    }


    public void transferToContact(TransferToContactVo transferToContactVo,
                                  OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToContactVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<TransferToContactSrv>(service.transferToContact(
                transferToContactVo.getBaseInfoVo().getToken(),
                transferToContactVo.getBaseInfoVo().getToken_issuer(),
                transferToContactVo.getScProductId(),
                transferToContactVo.getBaseInfoVo().getScVoucherHash(),
                transferToContactVo.getBaseInfoVo().getScApiKey(),
                transferToContactVo.getContactId(),
                transferToContactVo.getAmount(),
                transferToContactVo.getWallet(),
                transferToContactVo.getCurrencyCode(),
                transferToContactVo.getDescription(),
                transferToContactVo.getUniqueId()
        ), onGetResponseListener).get();
    }

    public void transferToContactList(TransferToContactListVo transferToContactListVo,
                                      OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToContactListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<TransferToContactSrv>>(service.transferToContactList(
                transferToContactListVo.getBaseInfoVo().getToken(),
                transferToContactListVo.getBaseInfoVo().getToken_issuer(),
                transferToContactListVo.getScProductId(),
                transferToContactListVo.getBaseInfoVo().getScVoucherHash(),
                transferToContactListVo.getBaseInfoVo().getScApiKey(),
                transferToContactListVo.getOffset(),
                transferToContactListVo.getSize(),
                transferToContactListVo.getContactId(),
                transferToContactListVo.getFromAmount(),
                transferToContactListVo.getToAmount(),
                transferToContactListVo.getCurrencyCode(),
                transferToContactListVo.getUniqueId(),
                transferToContactListVo.getFromDate(),
                transferToContactListVo.getToDate()
        ), onGetResponseListener).get();
    }


    public void follow(FollowVo followVo,
                       OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(followVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<Boolean>(service.follow(
                followVo.getBaseInfoVo().getToken(),
                followVo.getBaseInfoVo().getToken_issuer(),
                followVo.getScProductId(),
                followVo.getBaseInfoVo().getScVoucherHash(),
                followVo.getBaseInfoVo().getScApiKey(),
                followVo.getBusinessId(),
                followVo.getFollow()
        ), onGetResponseListener).get();
    }

    public void getBusiness(GetBusinessVo getBusinessVo,
                            OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getBusinessVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<BusinessSrv>(service.getBusiness(
                getBusinessVo.getBaseInfoVo().getToken(),
                getBusinessVo.getBaseInfoVo().getToken_issuer(),
                getBusinessVo.getScProductId(),
                getBusinessVo.getBaseInfoVo().getScVoucherHash(),
                getBusinessVo.getBaseInfoVo().getScApiKey()
        ), onGetResponseListener).get();
    }


    public void getFollowers(GetFollowersVo getFollowersVo,
                             OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getFollowersVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<UserSrv>>(service.getFollowers(
                getFollowersVo.getBaseInfoVo().getToken(),
                getFollowersVo.getBaseInfoVo().getToken_issuer(),
                getFollowersVo.getScProductId(),
                getFollowersVo.getBaseInfoVo().getScVoucherHash(),
                getFollowersVo.getBaseInfoVo().getScApiKey(),
                getFollowersVo.getOffset(),
                getFollowersVo.getSize()
        ), onGetResponseListener).get();
    }

    public void transferToFollower(TransferToFollowerVo transferToFollowerVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToFollowerVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<UserAmountSrv>(service.transferToFollower(
                transferToFollowerVo.getBaseInfoVo().getToken(),
                transferToFollowerVo.getBaseInfoVo().getToken_issuer(),
                transferToFollowerVo.getScProductId(),
                transferToFollowerVo.getBaseInfoVo().getScVoucherHash(),
                transferToFollowerVo.getBaseInfoVo().getScApiKey(),
                transferToFollowerVo.getGuildCode(),
                transferToFollowerVo.getAmount(),
                transferToFollowerVo.getUserId(),
                transferToFollowerVo.getDescription(),
                transferToFollowerVo.getCurrencyCode(),
                transferToFollowerVo.getWallet(),
                transferToFollowerVo.getUniqueId()
        ), onGetResponseListener).get();
    }

    public void transferToFollowerList(TransferToFollowerListVo transferToFollowerListVo,
                                       OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToFollowerListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<TransferToFollowerSrv>>(service.transferToFollowerList(
                transferToFollowerListVo.getBaseInfoVo().getToken(),
                transferToFollowerListVo.getBaseInfoVo().getToken_issuer(),
                transferToFollowerListVo.getScProductId(),
                transferToFollowerListVo.getBaseInfoVo().getScVoucherHash(),
                transferToFollowerListVo.getBaseInfoVo().getScApiKey(),
                transferToFollowerListVo.getUserId(),
                transferToFollowerListVo.getGuildCode(),
                transferToFollowerListVo.getWallet(),
                transferToFollowerListVo.getCurrencyCode(),
                transferToFollowerListVo.getFromAmount(),
                transferToFollowerListVo.getToAmount(),
                transferToFollowerListVo.getUniqueId(),
                transferToFollowerListVo.getOffset(),
                transferToFollowerListVo.getSize(),
                transferToFollowerListVo.getFromDate(),
                transferToFollowerListVo.getToDate()

        ), onGetResponseListener).get();
    }

    public void transferToFollowerAndCashout(TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo,
                                             OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToFollowerAndCashoutVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<UserAmountSrv>(service.transferToFollowerAndCashout(
                transferToFollowerAndCashoutVo.getBaseInfoVo().getToken(),
                transferToFollowerAndCashoutVo.getBaseInfoVo().getToken_issuer(),
                transferToFollowerAndCashoutVo.getScProductId(),
                transferToFollowerAndCashoutVo.getBaseInfoVo().getScVoucherHash(),
                transferToFollowerAndCashoutVo.getBaseInfoVo().getScApiKey(),
                transferToFollowerAndCashoutVo.getGuildCode(),
                transferToFollowerAndCashoutVo.getAmount(),
                transferToFollowerAndCashoutVo.getUserId(),
                transferToFollowerAndCashoutVo.getDescription(),
                transferToFollowerAndCashoutVo.getCurrencyCode(),
                transferToFollowerAndCashoutVo.getWallet(),
                transferToFollowerAndCashoutVo.getToolCode(),
                transferToFollowerAndCashoutVo.getUniqueId()
        ), onGetResponseListener).get();
    }

    public void transferByInvoice(TransferByInvoiceVo transferByInvoiceVo,
                                  OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferByInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<UserAmountSrv>(service.transferByInvoice(
                transferByInvoiceVo.getBaseInfoVo().getToken(),
                transferByInvoiceVo.getBaseInfoVo().getToken_issuer(),
                transferByInvoiceVo.getScProductId(),
                transferByInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                transferByInvoiceVo.getBaseInfoVo().getScApiKey(),
                transferByInvoiceVo.getGuildCode(),
                transferByInvoiceVo.getAmount(),
                transferByInvoiceVo.getInvoiceId(),
                transferByInvoiceVo.getDescription(),
                transferByInvoiceVo.getCurrencyCode(),
                transferByInvoiceVo.getUniqueId(),
                transferByInvoiceVo.getWallet()
        ), onGetResponseListener).get();
    }

    public void listTransferByInvoice(ListTransferByInvoiceVo listTransferByInvoiceVo,
                                      OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(listTransferByInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<TransferToFollowerSrv>>(service.listTransferByInvoice(
                listTransferByInvoiceVo.getBaseInfoVo().getToken(),
                listTransferByInvoiceVo.getBaseInfoVo().getToken_issuer(),
                listTransferByInvoiceVo.getScProductId(),
                listTransferByInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                listTransferByInvoiceVo.getBaseInfoVo().getScApiKey(),
                listTransferByInvoiceVo.getInvoiceId(),
                listTransferByInvoiceVo.getGuildCode(),
                listTransferByInvoiceVo.getWallet(),
                listTransferByInvoiceVo.getFromAmount(),
                listTransferByInvoiceVo.getToAmount(),
                listTransferByInvoiceVo.getCurrencyCode(),
                listTransferByInvoiceVo.getUniqueId(),
                listTransferByInvoiceVo.getOffset(),
                listTransferByInvoiceVo.getSize(),
                listTransferByInvoiceVo.getFromDate(),
                listTransferByInvoiceVo.getToDate()
        ), onGetResponseListener).get();
    }

    public void getGuildAccountBill(GetGuildAccountBillVo getGuildAccountBillVo,
                                    OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getGuildAccountBillVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<AccountBillItemSrv>>(service.getGuildAccountBill(
                getGuildAccountBillVo.getBaseInfoVo().getToken(),
                getGuildAccountBillVo.getBaseInfoVo().getToken_issuer(),
                getGuildAccountBillVo.getScProductId(),
                getGuildAccountBillVo.getBaseInfoVo().getScVoucherHash(),
                getGuildAccountBillVo.getBaseInfoVo().getScApiKey(),
                getGuildAccountBillVo.getDateFrom(),
                getGuildAccountBillVo.getDateTo(),
                getGuildAccountBillVo.getDescription(),
                getGuildAccountBillVo.getAmountFrom(),
                getGuildAccountBillVo.getAmountTo(),
                getGuildAccountBillVo.getBlock(),
                getGuildAccountBillVo.getGuildCode(),
                getGuildAccountBillVo.getCurrencyCode(),
                getGuildAccountBillVo.getDebtor(),
                getGuildAccountBillVo.getOffset(),
                getGuildAccountBillVo.getSize()
        ), onGetResponseListener).get();
    }

    public void getWalletAccountBill(GetWalletAccountBillVo getWalletAccountBillVo,
                                     OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getWalletAccountBillVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<AccountBillItemSrv>>(service.getWalletAccountBill(
                getWalletAccountBillVo.getBaseInfoVo().getToken(),
                getWalletAccountBillVo.getBaseInfoVo().getToken_issuer(),
                getWalletAccountBillVo.getScProductId(),
                getWalletAccountBillVo.getBaseInfoVo().getScVoucherHash(),
                getWalletAccountBillVo.getBaseInfoVo().getScApiKey(),
                getWalletAccountBillVo.getDateFrom(),
                getWalletAccountBillVo.getDateTo(),
                getWalletAccountBillVo.getDescription(),
                getWalletAccountBillVo.getAmountFrom(),
                getWalletAccountBillVo.getAmountTo(),
                getWalletAccountBillVo.getBlock(),
                getWalletAccountBillVo.getGuildCode(),
                getWalletAccountBillVo.getCurrencyCode(),
                getWalletAccountBillVo.getDebtor(),
                getWalletAccountBillVo.getWallet(),
                getWalletAccountBillVo.getOffset(),
                getWalletAccountBillVo.getSize()
        ), onGetResponseListener).get();
    }


    public void getAccountBillAsFile(GetAccountBillAsFileVo getAccountBillAsFileVo,
                                     OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getAccountBillAsFileVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<ExportServiceSrv>(service.getAccountBillAsFile(
                getAccountBillAsFileVo.getBaseInfoVo().getToken(),
                getAccountBillAsFileVo.getBaseInfoVo().getToken_issuer(),
                getAccountBillAsFileVo.getScProductId(),
                getAccountBillAsFileVo.getBaseInfoVo().getScVoucherHash(),
                getAccountBillAsFileVo.getBaseInfoVo().getScApiKey(),
                getAccountBillAsFileVo.getDateFrom(),
                getAccountBillAsFileVo.getDateTo(),
                getAccountBillAsFileVo.getDescription(),
                getAccountBillAsFileVo.getAmountFrom(),
                getAccountBillAsFileVo.getAmountTo(),
                getAccountBillAsFileVo.getBlock(),
                getAccountBillAsFileVo.getGuildCode(),
                getAccountBillAsFileVo.getCurrencyCode(),
                getAccountBillAsFileVo.getDebtor(),
                getAccountBillAsFileVo.getLastNRows(),
                getAccountBillAsFileVo.getCallbackUrl()
        ), onGetResponseListener).get();
    }


    public void cardToCardList(CardToCardListVo cardToCardListVo,
                               OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(cardToCardListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<CardToCardPoolSrv>>(service.cardToCardList(
                cardToCardListVo.getBaseInfoVo().getToken(),
                cardToCardListVo.getBaseInfoVo().getToken_issuer(),
                cardToCardListVo.getScProductId(),
                cardToCardListVo.getBaseInfoVo().getScVoucherHash(),
                cardToCardListVo.getBaseInfoVo().getScApiKey(),
                cardToCardListVo.getOffset(),
                cardToCardListVo.getSize(),
                cardToCardListVo.getCanEdit(),
                cardToCardListVo.getCanceled(),
                cardToCardListVo.getStatusCode(),
                cardToCardListVo.getCauseCode(),
                cardToCardListVo.getCauseId(),
                cardToCardListVo.getFromDate(),
                cardToCardListVo.getToDate(),
                cardToCardListVo.getFromAmount(),
                cardToCardListVo.getToAmount(),
                cardToCardListVo.getUniqueId(),
                cardToCardListVo.getReferenceNumber()
        ), onGetResponseListener).get();
    }


    public void updateCardToCard(UpdateCardToCardVo updateCardToCardVo,
                                 OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(updateCardToCardVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<CardToCardPoolSrv>>(service.updateCardToCard(
                updateCardToCardVo.getBaseInfoVo().getToken(),
                updateCardToCardVo.getBaseInfoVo().getToken_issuer(),
                updateCardToCardVo.getScProductId(),
                updateCardToCardVo.getBaseInfoVo().getScVoucherHash(),
                updateCardToCardVo.getBaseInfoVo().getScApiKey(),
                updateCardToCardVo.getId(),
                updateCardToCardVo.getCardNumber()
        ), onGetResponseListener).get();
    }

    public void addWithdrawRulePlan(AddWithdrawRulePlanVo addWithdrawRulePlanVo,
                                    OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addWithdrawRulePlanVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<WithdrawRuleSrv>(service.addWithdrawRulePlan(
                addWithdrawRulePlanVo.getBaseInfoVo().getToken(),
                addWithdrawRulePlanVo.getBaseInfoVo().getToken_issuer(),
                addWithdrawRulePlanVo.getScProductId(),
                addWithdrawRulePlanVo.getBaseInfoVo().getScVoucherHash(),
                addWithdrawRulePlanVo.getBaseInfoVo().getScApiKey(),
                addWithdrawRulePlanVo.getSubscriptionDays(),
                addWithdrawRulePlanVo.getMaxAmount(),
                addWithdrawRulePlanVo.getMaxCount(),
                addWithdrawRulePlanVo.getTypeCode()
        ), onGetResponseListener).get();
    }

    public void withdrawRulePlanList(WithdrawRulePlanListVo withdrawRulePlanListVo,
                                     OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(withdrawRulePlanListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<WithdrawRulePlanSrv>>(service.withdrawRulePlanList(
                withdrawRulePlanListVo.getBaseInfoVo().getToken(),
                withdrawRulePlanListVo.getBaseInfoVo().getToken_issuer(),
                withdrawRulePlanListVo.getScProductId(),
                withdrawRulePlanListVo.getBaseInfoVo().getScVoucherHash(),
                withdrawRulePlanListVo.getBaseInfoVo().getScApiKey(),
                withdrawRulePlanListVo.getOffset(),
                withdrawRulePlanListVo.getSize(),
                withdrawRulePlanListVo.getBusinessId(),
                withdrawRulePlanListVo.getId()
        ), onGetResponseListener).get();
    }

    public void withdrawRuleList(WithdrawRuleListVo withdrawRuleListVo,
                                 OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(withdrawRuleListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<List<WithdrawRuleForBizSrv>>(service.withdrawRuleList(
                withdrawRuleListVo.getBaseInfoVo().getToken(),
                withdrawRuleListVo.getBaseInfoVo().getToken_issuer(),
                withdrawRuleListVo.getScProductId(),
                withdrawRuleListVo.getBaseInfoVo().getScVoucherHash(),
                withdrawRuleListVo.getBaseInfoVo().getScApiKey(),
                withdrawRuleListVo.getOffset(),
                withdrawRuleListVo.getSize(),
                withdrawRuleListVo.getTypeCode(),
                withdrawRuleListVo.getUserId()
        ), onGetResponseListener).get();
    }

    public void revokeWithdrawRule(RevokeWithdrawRuleVo revokeWithdrawRuleVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(revokeWithdrawRuleVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<Boolean>(service.revokeWithdrawRule(
                revokeWithdrawRuleVo.getBaseInfoVo().getToken(),
                revokeWithdrawRuleVo.getBaseInfoVo().getToken_issuer(),
                revokeWithdrawRuleVo.getScProductId(),
                revokeWithdrawRuleVo.getBaseInfoVo().getScVoucherHash(),
                revokeWithdrawRuleVo.getBaseInfoVo().getScApiKey(),
                revokeWithdrawRuleVo.getRuleId()
        ), onGetResponseListener).get();
    }


    public void payInvoiceByCredit(PayInvoiceByCreditVo payInvoiceByCreditVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(payInvoiceByCreditVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<Boolean>(service.payInvoiceByCredit(
                payInvoiceByCreditVo.getBaseInfoVo().getToken(),
                payInvoiceByCreditVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceByCreditVo.getScProductId(),
                payInvoiceByCreditVo.getBaseInfoVo().getScVoucherHash(),
                payInvoiceByCreditVo.getBaseInfoVo().getScApiKey(),
                payInvoiceByCreditVo.getBaseInfoVo().getOtt(),
                payInvoiceByCreditVo.getInvoiceId(),
                payInvoiceByCreditVo.getWallet()
        ), onGetResponseListener).get();
    }


    public void withdrawRuleUsageReport(WithdrawRuleUsageReportVo withdrawRuleUsageReportVo,
                                        OnGetResponseListener onGetResponseListener) {

        PodVirtualAccount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(withdrawRuleUsageReportVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAccount.class);

        new GetResult<WithdrawRuleUsageReportSrv>(service.withdrawRuleUsageReport(
                withdrawRuleUsageReportVo.getBaseInfoVo().getToken(),
                withdrawRuleUsageReportVo.getBaseInfoVo().getToken_issuer(),
                withdrawRuleUsageReportVo.getScProductId(),
                withdrawRuleUsageReportVo.getBaseInfoVo().getScVoucherHash(),
                withdrawRuleUsageReportVo.getBaseInfoVo().getScApiKey(),
                withdrawRuleUsageReportVo.getRuleId()
        ), onGetResponseListener).get();
    }

}
