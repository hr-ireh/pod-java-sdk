package com.fanap.podTools.service;

import com.fanap.podTools.data.modelSrv.ResultSrv;
import com.fanap.podTools.data.modelSrv.ServiceBillSrv;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public interface PodTools {


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<ServiceBillSrv>> payBill(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("billId") String billId,
            @Field("paymentId") String paymentId);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<List<ServiceBillSrv>>> payedBillList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("referenceNumber") String referenceNumber,
            @Field("fromDate") String fromDate,
            @Field("toDate") String toDate,
            @Field("billId") String billId,
            @Field("paymentId") String paymentId,
            @Field("offset") String offset,
            @Field("size") String size

    );


}
