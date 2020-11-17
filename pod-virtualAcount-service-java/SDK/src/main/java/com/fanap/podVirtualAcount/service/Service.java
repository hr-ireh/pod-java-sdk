package com.fanap.podVirtualAcount.service;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.RetrofitUtil;
import com.fanap.podBaseService.util.ServerTypeSelectionUtil;
import com.fanap.podVirtualAcount.data.modelSrv.*;
import com.fanap.podVirtualAcount.data.modelVo.*;
import com.fanap.podVirtualAcount.util.GetResult;
import com.fanap.podVirtualAcount.util.OnGetResponseListener;

import java.util.List;

/**
 * Created By Askarian on 5/28/2019
 */
public class Service {

    public void issueCreditInvoiceAndGetHash(IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(issueCreditInvoiceAndGetHashVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<String> issueCreditInvoiceAndGetHash(IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(issueCreditInvoiceAndGetHashVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.issueCreditInvoiceAndGetHash(
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
        )).getResponse();
    }

    public void verifyCreditInvoice(VerifyCreditInvoiceVo verifyCreditInvoiceVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(verifyCreditInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<CreditInvoiceSrv> verifyCreditInvoice(VerifyCreditInvoiceVo verifyCreditInvoiceVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(verifyCreditInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.verifyCreditInvoice(
                verifyCreditInvoiceVo.getBaseInfoVo().getToken(),
                verifyCreditInvoiceVo.getBaseInfoVo().getToken_issuer(),
                verifyCreditInvoiceVo.getScProductId(),
                verifyCreditInvoiceVo.getBaseInfoVo().getScVoucherHash(),
                verifyCreditInvoiceVo.getBaseInfoVo().getScApiKey(),
                verifyCreditInvoiceVo.getBillNumber(),
                verifyCreditInvoiceVo.getId()
        )).getResponse();
    }

    public void transferFromOwnAccounts(TransferFromOwnAccountsVo transferFromOwnAccountsVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferFromOwnAccountsVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<UserAmountSrv> transferFromOwnAccounts(TransferFromOwnAccountsVo transferFromOwnAccountsVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferFromOwnAccountsVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.transferFromOwnAccounts(
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
        )).getResponse();
    }

    public void transferFromOwnAccountsList(TransferFromOwnAccountsListVo transferFromOwnAccountsListVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferFromOwnAccountsListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<List<TransferCreditSrv>> transferFromOwnAccountsList(TransferFromOwnAccountsListVo transferFromOwnAccountsListVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferFromOwnAccountsListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.transferFromOwnAccountsList(
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
        )).getResponse();
    }

    public void transferToContact(TransferToContactVo transferToContactVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToContactVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<TransferToContactSrv> transferToContact(TransferToContactVo transferToContactVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToContactVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.transferToContact(
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
        )).getResponse();
    }

    public void transferToContactList(TransferToContactListVo transferToContactListVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToContactListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<List<TransferToContactSrv>> transferToContactList(TransferToContactListVo transferToContactListVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToContactListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.transferToContactList(
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
        )).getResponse();
    }

    public void follow(FollowVo followVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(followVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<Boolean> follow(FollowVo followVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(followVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.follow(
                followVo.getBaseInfoVo().getToken(),
                followVo.getBaseInfoVo().getToken_issuer(),
                followVo.getScProductId(),
                followVo.getBaseInfoVo().getScVoucherHash(),
                followVo.getBaseInfoVo().getScApiKey(),
                followVo.getBusinessId(),
                followVo.getFollow()
        )).getResponse();
    }

    public void getBusiness(GetBusinessVo getBusinessVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getBusinessVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        new GetResult<BusinessSrv>(service.getBusiness(
                getBusinessVo.getBaseInfoVo().getToken(),
                getBusinessVo.getBaseInfoVo().getToken_issuer(),
                getBusinessVo.getScProductId(),
                getBusinessVo.getBaseInfoVo().getScVoucherHash(),
                getBusinessVo.getBaseInfoVo().getScApiKey()
        ), onGetResponseListener).get();
    }

    public ResultVo<BusinessSrv> getBusiness(GetBusinessVo getBusinessVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getBusinessVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.getBusiness(
                getBusinessVo.getBaseInfoVo().getToken(),
                getBusinessVo.getBaseInfoVo().getToken_issuer(),
                getBusinessVo.getScProductId(),
                getBusinessVo.getBaseInfoVo().getScVoucherHash(),
                getBusinessVo.getBaseInfoVo().getScApiKey()
        )).getResponse();
    }

    public void getFollowers(GetFollowersVo getFollowersVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getFollowersVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<List<UserSrv>> getFollowers(GetFollowersVo getFollowersVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getFollowersVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.getFollowers(
                getFollowersVo.getBaseInfoVo().getToken(),
                getFollowersVo.getBaseInfoVo().getToken_issuer(),
                getFollowersVo.getScProductId(),
                getFollowersVo.getBaseInfoVo().getScVoucherHash(),
                getFollowersVo.getBaseInfoVo().getScApiKey(),
                getFollowersVo.getOffset(),
                getFollowersVo.getSize()
        )).getResponse();
    }

    public void transferToFollower(TransferToFollowerVo transferToFollowerVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToFollowerVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<UserAmountSrv> transferToFollower(TransferToFollowerVo transferToFollowerVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToFollowerVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.transferToFollower(
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
        )).getResponse();
    }

    public void transferToFollowerList(TransferToFollowerListVo transferToFollowerListVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToFollowerListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<List<TransferToFollowerSrv>> transferToFollowerList(TransferToFollowerListVo transferToFollowerListVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToFollowerListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.transferToFollowerList(
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

        )).getResponse();
    }

    public void transferToFollowerAndCashout(TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToFollowerAndCashoutVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<UserAmountSrv> transferToFollowerAndCashout(TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferToFollowerAndCashoutVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.transferToFollowerAndCashout(
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
        )).getResponse();
    }

    public void transferByInvoice(TransferByInvoiceVo transferByInvoiceVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferByInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<UserAmountSrv> transferByInvoice(TransferByInvoiceVo transferByInvoiceVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(transferByInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.transferByInvoice(
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
        )).getResponse();
    }

    public void listTransferByInvoice(ListTransferByInvoiceVo listTransferByInvoiceVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(listTransferByInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<List<TransferToFollowerSrv>> listTransferByInvoice(ListTransferByInvoiceVo listTransferByInvoiceVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(listTransferByInvoiceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.listTransferByInvoice(
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
        )).getResponse();
    }

    public void getGuildAccountBill(GetGuildAccountBillVo getGuildAccountBillVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getGuildAccountBillVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<List<AccountBillItemSrv>> getGuildAccountBill(GetGuildAccountBillVo getGuildAccountBillVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getGuildAccountBillVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.getGuildAccountBill(
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
        )).getResponse();
    }

    public void getWalletAccountBill(GetWalletAccountBillVo getWalletAccountBillVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getWalletAccountBillVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<List<AccountBillItemSrv>> getWalletAccountBill(GetWalletAccountBillVo getWalletAccountBillVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getWalletAccountBillVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.getWalletAccountBill(
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
        )).getResponse();
    }

    public void getAccountBillAsFile(GetAccountBillAsFileVo getAccountBillAsFileVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getAccountBillAsFileVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<ExportServiceSrv> getAccountBillAsFile(GetAccountBillAsFileVo getAccountBillAsFileVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getAccountBillAsFileVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.getAccountBillAsFile(
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
        )).getResponse();
    }

    public void cardToCardList(CardToCardListVo cardToCardListVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(cardToCardListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<List<CardToCardPoolSrv>> cardToCardList(CardToCardListVo cardToCardListVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(cardToCardListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.cardToCardList(
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
        )).getResponse();
    }

    public void updateCardToCard(UpdateCardToCardVo updateCardToCardVo, OnGetResponseListener onGetResponseListener) {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(updateCardToCardVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

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

    public ResultVo<List<CardToCardPoolSrv>> updateCardToCard(UpdateCardToCardVo updateCardToCardVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(updateCardToCardVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.updateCardToCard(
                updateCardToCardVo.getBaseInfoVo().getToken(),
                updateCardToCardVo.getBaseInfoVo().getToken_issuer(),
                updateCardToCardVo.getScProductId(),
                updateCardToCardVo.getBaseInfoVo().getScVoucherHash(),
                updateCardToCardVo.getBaseInfoVo().getScApiKey(),
                updateCardToCardVo.getId(),
                updateCardToCardVo.getCardNumber()
        )).getResponse();
    }

    public ResultVo<Void> addCard(AddCardVo addCardVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addCardVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.addCard(
                addCardVo.getBaseInfoVo().getToken(),
                addCardVo.getBaseInfoVo().getToken_issuer(),
                addCardVo.getScProductId(),
                addCardVo.getCardNumber(),
                addCardVo.getName(),
                addCardVo.getTag(),
                addCardVo.getCvv2(),
                addCardVo.getExpiryMonth(),
                addCardVo.getOrder()
        )).getResponse();
    }

    public ResultVo<Void> addSheba(AddShebaVo shebaVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(shebaVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.addSheba(
                shebaVo.getBaseInfoVo().getToken(),
                shebaVo.getBaseInfoVo().getToken_issuer(),
                shebaVo.getScProductId(),
                shebaVo.getSheba(),
                shebaVo.getName()
        )).getResponse();
    }

    public ResultVo<List<CardListSrv>> cardList(CardListVo cardListVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(cardListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.cardList(
                cardListVo.getBaseInfoVo().getToken(),
                cardListVo.getBaseInfoVo().getToken_issuer(),
                cardListVo.getScProductId(),
                cardListVo.getOffset(),
                cardListVo.getSize(),
                cardListVo.getCardNumber(),
                cardListVo.getId(),
                cardListVo.getName(),
                cardListVo.getTag()
        )).getResponse();
    }

    public ResultVo<List<ShebaListSrv>> shebaList(ShebaListVo shebaListVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(shebaListVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.shebaList(
                shebaListVo.getBaseInfoVo().getToken(),
                shebaListVo.getBaseInfoVo().getToken_issuer(),
                shebaListVo.getScProductId(),
                shebaListVo.getOffset(),
                shebaListVo.getSize(),
                shebaListVo.getId(),
                shebaListVo.getSheba(),
                shebaListVo.getName()
        )).getResponse();
    }

    public ResultVo<UserAmountSrv> businessBalance(BusinessBalanceVo businessBalanceVo) throws PodException {

        PodVirtualAcount service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(businessBalanceVo.getBaseInfoVo().getServerType()))
                .create(PodVirtualAcount.class);

        return new GetResult<>(service.businessBalance(
                businessBalanceVo.getBaseInfoVo().getToken(),
                businessBalanceVo.getBaseInfoVo().getToken_issuer(),
                businessBalanceVo.getScProductId(),
                businessBalanceVo.getGuildCode()
        )).getResponse();
    }
}