package com.fanap.podBaseService.service;

import com.fanap.podBaseService.data.modelSrv.GuildSrv;
import com.fanap.podBaseService.data.modelSrv.ResultSrv;
import com.fanap.podBaseService.data.modelSrv.TagTreeCategorySrv;
import com.fanap.podBaseService.data.modelSrv.TagTreeSrv;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public interface PodBaseService {

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<TagTreeCategorySrv>> addTagTreeCategory(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("name") String name,
            @Field("desc") String desc);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<TagTreeCategorySrv>>> getTagTreeCategoryList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("id") String id,
            @Field("name") String name,
            @Field("Field") String Field);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<TagTreeCategorySrv>> updateTagTreeCategory(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("name") String name,
            @Field("desc") String desc,
            @Field("enable") String enable);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<TagTreeSrv>> addTagTree(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("name") String name,
            @Field("categoryId") String categoryId,
            @Field("parentId") String parentId);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<TagTreeSrv>>> getTagTreeList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("categoryId") String categoryId,
            @Field("parentId") String parentId,
            @Field("levelCount") String levelCount,
            @Field("level") String level,
            @Field("id") String id);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<TagTreeSrv>> updateTagTree(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id") String id,
            @Field("name") String name,
            @Field("parentId") String parentId,
            @Field("enable") String enable);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<GuildSrv>>> getCurrencyList(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey);
}
