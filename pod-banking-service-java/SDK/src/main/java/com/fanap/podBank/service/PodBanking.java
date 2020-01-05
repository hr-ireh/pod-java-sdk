package com.fanap.podBank.service;

import com.fanap.podBank.data.modelSrv.*;
import com.fanap.podBank.data.modelVo.BatchPayaItemInfoContents;
import retrofit2.Call;
import retrofit2.http.*;
import retrofit2.http.Header;

import java.util.List;

/**
 * Created by Z.gholinia on 11/9/2019.
 */
public interface PodBanking {


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<ShebaInfoSrv>> getShebaInfo(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("sheba") String sheba);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<ShebaInfoSrv>> getDebitCardInfo(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("cardNumber") String cardNumber);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<GetDepositNumberByCardNumberSrv>> getDepositNumberByCardNumber(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("CardNumber") String CardNumber,
            @Field("Timestamp") String Timestamp,
            @Field("signature") String SignatureInfo);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<GetShebaByCardNumberSrv>> getShebaByCardNumber(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("CardNumber") String CardNumber,
            @Field("Timestamp") String Timestamp,
            @Field("signature") String Signature);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<GetCardInformationSrv>> getCardInformation(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String username,
            @Field("SrcCardNumber") String SrcCardNumber,
            @Field("DestCardNumber") String DestCardNumber,
            @Field("Email") String Email,
            @Field("Timestamp") String Timestamp,
            @Field("signature") String Signature);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<cardToCardSrv>> cardToCard(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("SrcCardNumber") String SrcCardNumber,
            @Field("DestCardNumber") String DestCardNumber,
            @Field("Password") String Password,
            @Field("Cvv2") String Cvv2,
            @Field("ExpireMonth") String ExpireMonth,
            @Field("ExpireYear") String ExpireYear,
            @Field("Amount") String Amount,
            @Field("Email") String Email,
            @Field("AuthorizationCode") String AuthorizationCode,
            @Field("WithReferenceNumber") String WithReferenceNumber,
            @Field("CardName") String CardName,
            @Field("SrcComment") String SrcComment,
            @Field("DestComment") String DestComment,
            @Field("OriginalAddress") String OriginalAddress,
            @Field("JsonData") String JsonData,
            @Field("Timestamp") String Timestamp,
            @Field("signature") String Signature
           );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<CardToCardListSrv>> cardToCardList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("SourceCardNumber") String SourceCardNumber,
            @Field("SourceDepositNumber") String SourceDepositNumber,
            @Field("DestinationCardNumber") String DestinationCardNumber,
            @Field("MinAmount") String MinAmount,
            @Field("MaxAmount") String MaxAmount,
            @Field("StartDate") String StartDate,
            @Field("EndDate") String EndDate,
            @Field("RefrenceNumber") String RefrenceNumber,
            @Field("SequenceNumber") String SequenceNumber,
            @Field("SourceNote") String SourceNote,
            @Field("DestinationNote") String DestinationNote,
            @Field("Timestamp") String Timestamp,
            @Field("signature") String Signature);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<GetSubmissionChqueSrv>> getSubmissionChque(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("Timestamp") String Timestamp,
            @Field("Deposit") String Deposit,
            @Field("ChequeNumber") String ChequeNumber,
            @Field("MinAmount") String MinAmount,
            @Field("MaxAmount") String MaxAmount,
            @Field("StartDate") String StartDate,
            @Field("EndDate") String EndDate,
            @Field("BankCode") String BankCode,
            @Field("ChequeStatus") String ChequeStatus,
            @Field("StartSubmisionDate") String StartSubmisionDate,
            @Field("EndSubmissionDate") String EndSubmitionDate,
            @Field("RowCount") String RowCount,
            @Field("signature") String Signature);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<ConvertDepositNumberToShebaSrv>> convertDepositNumberToSheba(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("DepositNumber") String DepositNumber,
            @Field("Timestamp") String Timestamp,
            @Field("signature") String Signature);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<ConvertShebaToDepositSrv>> convertShebaToDeposit(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("Sheba") String Sheba,
            @Field("Timestamp") String Timestamp,
            @Field("signature") String Signature);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<PayaSeriviceSrv>> payaService(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("Timestamp") String Timestamp,
            @Field("SourceDepositNumber") String SourceDepositNumber,
            @Field("TransferMoneyBillNumber") String TransferMoneyBillNumber,
            @Field("FileUniqueIdentifier") String FileUniqueIdentifier,
            @Field("BatchPayaItemInfos") String BatchPayaItemInfos,
            @Field("signature") String Signature);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<GetDepositInvoiceSrv>> getDepositInvoice(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("Timestamp") String Timestamp,
            @Field("DepositNumber") String DepositNumber,
            @Field("Sheba") String Sheba,
            @Field("StartDate") String StartDate,
            @Field("EndDate") String EndDate,
            @Field("FirstIndex") String FirstIndex,
            @Field("Count") String Count,
            @Field("signature") String Signature);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<GetDepositBalanceSrv>> getDepositBalance(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("DepositNumber") String DepositNumber,
            @Field("Timestamp") String Timestamp,
            @Field("Sheba") String Sheba,
            @Field("signature") String Signature);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<TransferMoneySrv>> transferMoney(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("SourceDepositNumber") String SourceDepositNumber,
            @Field("SourceSheba") String SourceSheba,
            @Field("DestDepositNumber") String DestDepositNumber,
            @Field("DestSheba") String DestSheba,
            @Field("DestFirstName") String DestFirstName,
            @Field("DestLastName") String DestLastName,
            @Field("Amount") String Amount,
            @Field("SourceComment") String SourceComment,
            @Field("DestComment") String DestComment,
            @Field("PaymentId") String PaymentId,
            @Field("Timestamp") String Timestamp,
            @Field("signature") String signature);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<GetTranfserStateSrv>> getTransferMoneyState(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("Date") String Date,
            @Field("Timestamp") String Timestamp,
            @Field("PaymentId") String PaymentId,
            @Field("signature") String Signature);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<BillPaymentByDepositSrv>> billPaymentByDeposit(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("Timestamp") String Timestamp,
            @Field("DepositNumber") String DepositNumber,
            @Field("BillNumber") String BillNumber,
            @Field("PaymentId") String PaymentId,
            @Field("signature") String Signature);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<GetShebaAndStatusSrv>> getShebaAndStatus(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("UserName") String UserName,
            @Field("Sheba") String Sheba,
            @Field("ShenaseVariz") String ShenaseVariz,
            @Field("Timestamp") String Timestamp,
            @Field("signature") String Signature);


}
