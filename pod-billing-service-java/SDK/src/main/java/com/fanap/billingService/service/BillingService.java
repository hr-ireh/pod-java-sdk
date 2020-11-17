package com.fanap.billingService.service;

import com.fanap.billingService.data.modelSrv.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by  Z.Gholinia on 9/30/2019.
 */
public interface BillingService {


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<String>> ott(
            @Field("_token_") String token,
            @Field("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<InvoiceSrv>> issueInvoice(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Header("_ott_") String ott,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("redirectURL") String redirectURL,
            @Field("userId") String userId,
            @Field("billNumber") String billNumber,
            @Field("description") String description,
            @Field("deadline") String deadline,
            @Field("productId[]") List<String> productId,
            @Field("price[]") List<String> price,
            @Field("quantity[]") List<String> quantity,
            @Field("productDescription[]") List<String> productDescription,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("addressId") String addressId,
            @Field("voucherHash[]") List<String> voucherHash,
            @Field("preferredTaxRate") String preferredTaxRate,
            @Field("verificationNeeded") String verificationNeeded,
            @Field("verifyAfterTimeout") String verifyAfterTimeout,
            @Field("preview") String preview,
            @Field("metadata") String metadata,
            @Field("safe") String safe,
            @Field("postVoucherEnabled") String postVoucherEnabled,
            @Field("hasEvent") String hasEvent,
            @Field("eventTitle") String eventTitle,
            @Field("eventTimeZone") String eventTimeZone,
            @Field("eventReminders[]") List<String> eventReminders,
            @Field("eventDescription") String eventDescription,
            @Field("eventMetadata") String eventMetadata,
            @Field("cellphoneNumber") String cellphoneNumber
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrvCreatePreInvoice<String>> createPreInvoice(
            @Header("_token_") String _token_,
            @Header("_token_issuer_") String tokenIssuer,
            @Header("scProductId") String scProductId,
            @Header("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("token") String token,
            @Field("ott") String ott,
            @Field("redirectUri") String redirectUri,
            @Field("userId") String userId,
            @Field("productId[]") List<String> productId,
            @Field("price[]") List<String> price,
            @Field("quantity[]") List<String> quantity,
            @Field("productDescription[]") List<String> productDescription,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("billNumber") String billNumber,
            @Field("description") String description,
            @Field("deadline") String deadline,
            @Field("preferredTaxRate") String preferredTaxRate,
            @Field("verificationNeeded") String verificationNeeded,
            @Field("callUrl") String callUrl
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<InvoiceSrv>>> getInvoiceList(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("billNumber") String billNumber,
            @Field("uniqueNumber") String uniqueNumber,
            @Field("trackerId") String trackerId,
            @Field("fromDate") String fromDate,
            @Field("toDate") String toDate,
            @Field("isCanceled") String isCanceled,
            @Field("isPayed") String isPayed,
            @Field("isClosed") String isClosed,
            @Field("isWaiting") String isWaiting,
            @Field("guildCode") String guildCode,
            @Field("referenceNumber") String referenceNumber,
            @Field("userId") String userId,
            @Field("issuerId") String issuerId,
            @Field("Field") String Field,
            @Field("firstId") String firstId,
            @Field("lastId") String lastId,
            @Field("offset") String offset,
            @Field("productIdList[]") List<String> productIdList,
            @Field("size") String size);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<InvoiceSrv>>> getInvoiceListByMetadata(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("metaQuery") String metaQuery,
            @Field("isCanceled") String isCanceled,
            @Field("isPayed") String isPayed,
            @Field("offset") String offset,
            @Field("size") String size);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<ExportServiceSrv>> getInvoiceListAsFile(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("billNumber") String billNumber,
            @Field("uniqueNumber") String uniqueNumber,
            @Field("trackerId") String trackerId,
            @Field("fromDate") String fromDate,
            @Field("toDate") String toDate,
            @Field("isCanceled") String isCanceled,
            @Field("isPayed") String isPayed,
            @Field("isClosed") String isClosed,
            @Field("isWaiting") String isWaiting,
            @Field("guildCode") String guildCode,
            @Field("referenceNumber") String referenceNumber,
            @Field("userId") String userId,
            @Field("Field") String Field,
            @Field("productIdList[]") List<String> productIdList,
            @Field("lastNRows") String lastNRows,
            @Field("callbackUrl") String callbackUrl
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> cancelInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<InvoiceSrv>> verifyAndCloseInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> closeInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<String>> getInvoicePaymentLink(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("invoiceId") String invoiceId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> payInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("invoiceId") String invoiceId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> payInvoiceByCredit(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("_ott_") String ott,
            @Field("invoiceId") String invoiceId,
            @Field("delegationHash") List<String> delegationHash,
            @Field("delegatorId") List<String> delegatorId,
            @Field("wallet") String wallet,
            @Field("forceDelegation") String forceDelegation
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> payAnyInvoiceByCredit(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("_ott_") String ott,
            @Field("invoiceId") String invoiceId,
            @Field("delegationHash") List<String> delegationHash,
            @Field("delegatorId") List<String> delegatorId,
            @Field("wallet") String wallet,
            @Field("forceDelegation") String forceDelegation
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> sendInvoicePaymentSMS(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("invoiceId") String invoiceId,
            @Field("delegationId") String delegationId,
            @Field("wallet") String wallet,
            @Field("forceDelegation") String forceDelegation,
            @Field("callbackUri") String callbackUri,
            @Field("redirectUri") String redirectUri
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> payInvoiceInFuture(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("invoiceId") String invoiceId,
            @Field("date") String date,
            @Field("wallet") String wallet,
            @Field("guildCode") String guildCode

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> payInvoiceByInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("creditorInvoiceId") String creditorInvoiceId,
            @Field("debtorInvoiceId") String debtorInvoiceId

    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<InvoiceSrv>> issueMultiInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("data") String data,
            @Field("delegationHash") List<String> delegationHash,
            @Field("delegatorId") List<String> delegatorId,
            @Field("forceDelegation") String forceDelegation


    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<InvoiceSrv>> reduceMultiInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("data") String data


    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<InvoiceSrv>> reduceMultiInvoiceAndCashout(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("data") String data,
            @Field("toolCode") String toolCode


    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<VoucherSrv>>> defineCreditVoucher(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("guildCode") String guildCode,
            @Field("expireDate") String expireDate,
            @Field("count[]") List<String> count,
            @Field("amount[]") List<String> amount,
            @Field("name[]") List<String> name,
            @Field("description[]") List<String> description,
            @Field("limitedConsumerId") String limitedConsumerId,
            @Field("currencyCode") String currencyCode,
            @Field("hash[]") List<String> hash

    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<VoucherSrv>>> defineDiscountAmountVoucher(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("guildCode") String guildCode,
            @Field("expireDate") String expireDate,
            @Field("count[]") List<String> count,
            @Field("amount[]") List<String> amount,
            @Field("productId[]") List<String> productId,
            @Field("dealerBusinessId[]") List<String> dealerBusinessId,
            @Field("name[]") List<String> name,
            @Field("description[]") List<String> description,
            @Field("limitedConsumerId") String limitedConsumerId,
            @Field("currencyCode") String currencyCode,
            @Field("hash[]") List<String> hash

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<VoucherSrv>>> defineDiscountPercentageVoucher(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("guildCode") String guildCode,
            @Field("expireDate") String expireDate,
            @Field("count[]") List<String> count,
            @Field("amount[]") List<String> amount,
            @Field("discountPercentage[]") List<String> discountPercentage,
            @Field("productId[]") List<String> entityId,
            @Field("dealerBusinessId[]") List<String> dealerBusinessId,
            @Field("name[]") List<String> name,
            @Field("description[]") List<String> description,
            @Field("limitedConsumerId") String limitedConsumerId,
            @Field("type") String type,
            @Field("currencyCode") String currencyCode,
            @Field("hash[]") List<String> hash

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<InvoiceSrv>> applyVoucher(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("ott") String ott,
            @Field("invoiceId") String invoiceId,
            @Field("voucherHash") List<String> voucherHash,
            @Field("preview") String preview

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<VoucherSrv>> deactivateVoucher(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<VoucherSrv>> activateVoucher(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<VoucherSrv>>> getVoucherList(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("consumerId") String consumerId,
            @Field("hash") String hash,
            @Field("name") String name,
            @Field("type") String type,
            @Field("guildCode[]") List<String> guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("amountFrom") String amountFrom,
            @Field("amountTo") String amountTo,
            @Field("discountPercentageFrom") String discountPercentageFrom,
            @Field("discountPercentageTo") String discountPercentageTo,
            @Field("expireDateFrom") String expireDateFrom,
            @Field("expireDateTo") String expireDateTo,
            @Field("productId[]") List<String> entityId,
            @Field("consumDateFrom") String consumDateFrom,
            @Field("consumDateTo") String consumDateTo,
            @Field("usedAmountFrom") String usedAmountFrom,
            @Field("usedAmountTo") String usedAmountTo,
            @Field("active") String active,
            @Field("used") String used,
            @Field("offset") String offset,
            @Field("size") String size


    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<DirectWithdrawSrv>> defineDirectWithdraw(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("username") String username,
            @Field("privateKey") String privateKey,
            @Field("depositNumber") String depositNumber,
            @Field("onDemand") String onDemand,
            @Field("minAmount") String minAmount,
            @Field("maxAmount") String maxAmount,
            @Field("wallet") String wallet
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<DirectWithdrawSrv>>> directWithdrawList(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("wallet") String wallet,
            @Field("offset") String offset,
            @Field("size") String size
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<DirectWithdrawSrv>> updateDirectWithdraw(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("username") String username,
            @Field("privateKey") String privateKey,
            @Field("depositNumber ") String depositNumber,
            @Field("onDemand") String onDemand,
            @Field("minAmount") String minAmount,
            @Field("maxAmount") String maxAmount,
            @Field("wallet") String wallet
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> revokeDirectWithdraw(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<ExportServiceSrv>>> getExportList(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("id") String id,
            @Field("statusCode") String statusCode,
            @Field("serviceUrl") String serviceUrl
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SettlementRequestSrv>> requestGuildSettlement(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("ott") String ott,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("firstName") String firstName,
            @Field("lastName") String lastName,
            @Field("sheba") String sheba,
            @Field("amount") String amount,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("uniqueId") String uniqueId,
            @Field("description") String description
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SettlementRequestSrv>> requestWalletSettlement(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("ott") String ott,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("wallet") String wallet,
            @Field("firstName") String firstName,
            @Field("lastName") String lastName,
            @Field("sheba") String sheba,
            @Field("amount") String amount,
            @Field("currencyCode") String currencyCode,
            @Field("uniqueId") String uniqueId,
            @Field("description") String description
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SettlementRequestSrv>> requestSettlementByTool(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("ott") String ott,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("firstName") String firstName,
            @Field("lastName") String lastName,
            @Field("toolCode") String toolCode,
            @Field("toolId") String toolId,
            @Field("amount") String amount,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("uniqueId") String uniqueId,
            @Field("description") String description
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<SettlementRequestSrv>>> listSettlements(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("statusCode") String statusCode,
            @Field("currencyCode") String currencyCode,
            @Field("fromAmount") String fromAmount,
            @Field("toAmount") String toAmount,
            @Field("fromDate") String FromDate,
            @Field("toDate") String toDate,
            @Field("offset") String offset,
            @Field("uniqueId") String uniqueId,
            @Field("size") String size,
            @Field("id") String id,
            @Field("firstName") String firstName,
            @Field("lastName") String lastName,
            @Field("toolCode") String toolCode,
            @Field("toolId") String toolId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> addAutoSettlement(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("firstName") String firstName,
            @Field("lastName") String lastName,
            @Field("sheba") String sheba,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("instant") String instant
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> removeAutoSettlement(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<InvoiceSrv>> verifyInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("billNumber") String billNumber
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<InvoiceSrv>> reduceInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("invoiceItemId[]") List<String> invoiceItemId,
            @Field("price[]") List<String> price,
            @Field("itemDescription[]") List<String> itemDescription,
            @Field("quantity[]") List<String> quantity,
            @Field("preferredTaxRate") String preferredTaxRate
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<InvoiceWithBillNumberSrv>> invoiceWithBillNumber(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("billNumber") String billNumber,
            @Field("productId[]") List<String> productId,
            @Field("price[]") List<String> price,
            @Field("quantity[]") List<String> quantity,
            @Field("productDescription[]") List<String> productDescription,
            @Field("guildCode") String guildCode,
            @Field("redirectURL") String redirectURL,
            @Field("userId") String userId,
            @Field("description") String description,
            @Field("deadline") String deadline,
            @Field("currencyCode") String currencyCode,
            @Field("addressId") String addressId,
            @Field("verificationNeeded") String verificationNeeded
    );
}
