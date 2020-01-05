package com.fanap.podSubscription.service;

import com.fanap.podSubscription.data.modelSrv.ResultSrv;
import com.fanap.podSubscription.data.modelSrv.SubscriptionFullSrv;
import com.fanap.podSubscription.data.modelSrv.SubscriptionPlanSrv;
import com.fanap.podSubscription.data.modelSrv.SubscriptionSrv;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created By Askarian on 5/28/2019
 */
public interface PodSubscription {

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<SubscriptionFullSrv>>> subscriptionList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("size") String size,
            @Field("offset") String offset,
            @Field("subscriptionPlanId") String subscriptionPlanId

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SubscriptionSrv>> consumeSubscription(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("usedAmount") String usedAmount

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SubscriptionPlanSrv>> updateSubscriptionPlan(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("periodTypeCode") String periodTypeCode,
            @Field("periodTypeCount") String periodTypeCount,
            @Field("usageCountLimit") String usageCountLimit,
            @Field("name") String name,
            @Field("Price") String Price,
            @Field("enable") String enable


    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SubscriptionPlanSrv>> addSubscriptionPlan(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("periodTypeCount") String periodTypeCount,
            @Field("usageCountLimit") String usageCountLimit,
            @Field("usageAmountLimit") String usageAmountLimit,
            @Field("permittedGuildCode[]") List<String> permittedGuildCode,
            @Field("permittedBusinessId[]") List<String> permittedBusinessId,
            @Field("permittedProductId[]") List<String> permittedProductId,
            @Field("productId") String entityId,
            @Field("name") String name,
            @Field("price") String price,
            @Field("periodTypeCode") String periodTypeCode,
            @Field("type") String type,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<SubscriptionPlanSrv>>> subscriptionPlanList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("periodTypeCode") String periodTypeCode,
            @Field("periodTypeCountFrom") String periodTypeCountFrom,
            @Field("periodTypeCountTo") String periodTypeCountTo,
            @Field("fromPrice") String fromPrice,
            @Field("toPrice") String toPrice,
            @Field("offset") String offset,
            @Field("enable") String enable,
            @Field("size") String size,
            @Field("permittedGuildCode[]") List<String> permittedGuildCode,
            @Field("permittedBusinessId[]") List<String> permittedBusinessId,
            @Field("permittedProductId[]") List<String> permittedProductId,
            @Field("id") String id,
            @Field("typeCode") String typeCode,
            @Field("currencyCode") String currencyCode);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SubscriptionSrv>> requestSubscription(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("userId") String userId,
            @Field("subscriptionPlanId") String subscriptionPlanId);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SubscriptionSrv>> confirmSubscription(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("code") String code,
            @Field("subscriptionId") String subscriptionId);
}
