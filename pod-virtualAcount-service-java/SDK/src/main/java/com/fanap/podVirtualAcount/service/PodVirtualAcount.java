package com.fanap.podVirtualAcount.service;

import com.fanap.podVirtualAcount.data.modelSrv.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created By Askarian on 5/28/2019
 */
public interface PodVirtualAcount {

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<String>> issueCreditInvoiceAndGetHash(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("amount") String amount,
            @Field("userId") String userId,
            @Field("billNumber") String billNumber,
            @Field("wallet") String wallet,
            @Field("redirectUrl") String redirectUrl);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<CreditInvoiceSrv>> verifyCreditInvoice(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("billNumber") String billNumber,
            @Field("id") String id);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<UserAmountSrv>> transferFromOwnAccounts(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("guildCode") List<String> guildCode,
            @Field("amount") List<String> amount,
            @Field("customerAmount") String customerAmount,
            @Field("currencyCode") String currencyCode,
            @Field("description") String description,
            @Field("wallet") String wallet,
            @Field("uniqueId") String uniqueId);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<TransferCreditSrv>>> transferFromOwnAccountsList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("uniqueId") String uniqueId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("fromDate") String fromDate,
            @Field("toDate") String toDate);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<TransferToContactSrv>> transferToContact(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("contactId") String contactId,
            @Field("amount") String amount,
            @Field("wallet") String wallet,
            @Field("currencyCode") String currencyCode,
            @Field("description") String description,
            @Field("uniqueId") String uniqueId);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<TransferToContactSrv>>> transferToContactList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("contactId") String contactId,
            @Field("fromAmount") String fromAmount,
            @Field("toAmount") String toAmount,
            @Field("currencyCode") String currencyCode,
            @Field("uniqueId") String uniqueId,
            @Field("fromDate") String fromDate,
            @Field("toDate") String toDate);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> follow(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("businessId") String businessId,
            @Field("follow") String follow);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<BusinessSrv>> getBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<UserSrv>>> getFollowers(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("offset") String offset,
            @Field("size") String size);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<UserAmountSrv>> transferToFollower(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("guildCode") String guildCode,
            @Field("amount") String amount,
            @Field("userId") String userId,
            @Field("description") String description,
            @Field("currencyCode") String currencyCode,
            @Field("wallet") String wallet,
            @Field("uniqueId") String uniqueId);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<TransferToFollowerSrv>>> transferToFollowerList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("userId") String userId,
            @Field("guildCode") String guildCode,
            @Field("wallet") String wallet,
            @Field("currencyCode") String currencyCode,
            @Field("fromAmount") String fromAmount,
            @Field("toAmount") String toAmount,
            @Field("uniqueId") String uniqueId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("fromDate") String fromDate,
            @Field("toDate") String toDate);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<UserAmountSrv>> transferToFollowerAndCashout(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("guildCode") String guildCode,
            @Field("amount") String amount,
            @Field("userId") String userId,
            @Field("description") String description,
            @Field("currencyCode") String currencyCode,
            @Field("wallet") String wallet,
            @Field("toolCode") String toolCode,
            @Field("uniqueId") String uniqueId);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<UserAmountSrv>> transferByInvoice(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("guildCode") String guildCode,
            @Field("amount") String amount,
            @Field("invoiceId") String invoiceId,
            @Field("description") String description,
            @Field("currencyCode") String currencyCode,
            @Field("uniqueId") String uniqueId,
            @Field("wallet") String wallet);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<TransferToFollowerSrv>>> listTransferByInvoice(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("invoiceId") String invoiceId,
            @Field("guildCode") String guildCode,
            @Field("wallet") String wallet,
            @Field("fromAmount") String fromAmount,
            @Field("toAmount") String toAmount,
            @Field("currencyCode") String currencyCode,
            @Field("uniqueId") String uniqueId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("fromDate") String fromDate,
            @Field("toDate") String toDate);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<AccountBillItemSrv>>> getGuildAccountBill(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("dateFrom") String dateFrom,
            @Field("dateTo") String dateTo,
            @Field("description") String description,
            @Field("amountFrom") String amountFrom,
            @Field("amountTo") String amountTo,
            @Field("block") String block,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("debtor") String debtor,
            @Field("offset") String offset,
            @Field("size") String size);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<AccountBillItemSrv>>> getWalletAccountBill(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("dateFrom") String dateFrom,
            @Field("dateTo") String dateTo,
            @Field("description") String description,
            @Field("amountFrom") String amountFrom,
            @Field("amountTo") String amountTo,
            @Field("block") String block,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("debtor") String debtor,
            @Field("wallet") String wallet,
            @Field("offset") String offset,
            @Field("size") String size);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<ExportServiceSrv>> getAccountBillAsFile(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("dateFrom") String dateFrom,
            @Field("dateTo") String dateTo,
            @Field("description") String description,
            @Field("amountFrom") String amountFrom,
            @Field("amountTo") String amountTo,
            @Field("block") String block,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("debtor") String debtor,
            @Field("lastNRows") String lastNRows,
            @Field("callbackUrl") String callbackUrl);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<CardToCardPoolSrv>>> cardToCardList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("canEdit") String canEdit,
            @Field("canceled") String canceled,
            @Field("statusCode") String statusCode,
            @Field("causeCode") String causeCode,
            @Field("causeId") String causeId,
            @Field("fromDate") String fromDate,
            @Field("toDate") String toDate,
            @Field("fromAmount") String fromAmount,
            @Field("toAmount") String toAmount,
            @Field("uniqueId") String uniqueId,
            @Field("referenceNumber") String referenceNumber);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<CardToCardPoolSrv>>> updateCardToCard(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("cardNumber") String cardNumber);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Void>> addCard(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("cardNumber") String cardNumber,
            @Field("name") String name,
            @Field("tag") String tag,
            @Field("cvv2") String cvv2,
            @Field("expiryMonth") String expiryMonth,
            @Field("order") String order);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Void>> addSheba(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("sheba") String sheba,
            @Field("name") String name);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<CardListSrv>>> cardList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("cardNumber") String cardNumber,
            @Field("id") String id,
            @Field("name") String name,
            @Field("tag") String tag);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<ShebaListSrv>>> shebaList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("id") String id,
            @Field("sheba") String sheba,
            @Field("name") String name);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<UserAmountSrv>> businessBalance(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("guildCode") String guildCode);
}