package com.fanap.AvandService.service;

import com.fanap.AvandService.data.modelSrv.InvoiceSrv;
import com.fanap.AvandService.data.modelSrv.IssueInvoiceSrv;
import com.fanap.AvandService.data.modelSrv.ResultSrv;
import com.fanap.AvandService.data.modelSrv.VerifyAndCancelInvoiceSrv;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by  Z.Gholinia on 9/30/2019.
 */
public interface AvandService {

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<IssueInvoiceSrv>> issueInvoice(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Header("_ott_") String ott,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("redirectUri") String redirectUri,
            @Field("userId") String userId,
            @Field("businessId") String businessId,
            @Field("price") String price);

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
    Call<ResultSrv<VerifyAndCancelInvoiceSrv>> cancelInvoice(
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
    Call<ResultSrv<VerifyAndCancelInvoiceSrv>> verifyInvoice(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("invoiceId") String invoiceId
    );
}
