package com.fanap.podProduct.service;

import com.fanap.podProduct.data.modelSrv.AttributeTemplateSrv;
import com.fanap.podProduct.data.modelSrv.ProductSrv;
import com.fanap.podProduct.data.modelSrv.ResultSrv;
import com.fanap.podProduct.data.modelSrv.SearchProductSrv;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by Z.gholinia on 9/11/2019.
 */

public interface PodProduct {


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<ProductSrv>> addProduct(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("parentProductId") String parentProductId,
            @Field("name") String name,
            @Field("description") String description,
            @Field("uniqueId") String uniqueId,
            @Field("canComment") String canComment,
            @Field("canLike") String canLike,
            @Field("enable") String enable,
            @Field("metadata") String metadata,
            @Field("businessId") String businessId,
            @Field("unlimited") String unlimited,
            @Field("availableCount") String availableCount,
            @Field("price") String price,
            @Field("discount") String discount,
            @Field("guildCode") String guildCode,
            @Field("allowUserInvoice") String allowUserInvoice,
            @Field("allowUserPrice") String allowUserPrice,
            @Field("currencyCode") String currencyCode,
            @Field("attTemplateCode") String attTemplateCode,
            @Field("attCode") List<String> attCode,
            @Field("attValue") List<String> attValue,
            @Field("attGroup") List<String> attGroup,
            @Field("lat") String lat,
            @Field("lng") String lng,
            @Field("tags") String tags,
            @Field("content") String content,
            @Field("previewImage") String previewImage,
            @Field("tagTrees") String tagTrees,
            @Field("tagTreeCategoryName") String tagTreeCategoryName,
            @Field("preferredTaxRate") String preferredTaxRate,
            @Field("quantityPrecision") String quantityPrecision


    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<ProductSrv>>> addProducts(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("bizId") String bizId,
            @Field("data") String data,
            @Field("previewImage") String previewImage,
            @Field("currencyCode") String currencyCode

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<ProductSrv>> updateProduct(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("name") String name,
            @Field("description") String description,
            @Field("version") String version,
            @Field("canComment") String canComment,
            @Field("canLike") String canLike,
            @Field("enable") String enable,
            @Field("metadata") String metadata,
            @Field("entityId") String entityId,
            @Field("unlimited") String unlimited,
            @Field("availableCount") String availableCount,
            @Field("categories[]") List<String> categories,
            @Field("guildCode") String guildCode,
            @Field("allowUserInvoice") String allowUserInvoice,
            @Field("allowUserPrice") String allowUserPrice,
            @Field("attTemplateCode") String attTemplateCode,
            @Field("attValue") List<String> attValue,
            @Field("attCode") List<String> attCode,
            @Field("attGroup") List<String> attGroup,
            @Field("groupId") String groupId,
            @Field("price") String price,
            @Field("discount") String discount,
            @Field("changePreview") String changePreview,
            @Field("lat") String lat,
            @Field("lng") String lng,
            @Field("tags") String tags,
            @Field("content") String content,
            @Field("previewImage") String previewImage,
            @Field("tagTrees") String tagTrees,
            @Field("tagTreeCategoryName") String tagTreeCategoryName,
            @Field("preferredTaxRate") String preferredTaxRate,
            @Field("quantityPrecision") String quantityPrecision


    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<ProductSrv>>> updateProducts(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("data") String data,
            @Field("changePreview") String changePreview,
            @Field("previewImage") String previewImage,
            @Field("currencyCode") String currencyCode
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<ProductSrv>>> getProductList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("businessId") String businessId,
            @Field("id") List<String> id,
            @Field("uniqueId") List<String> uniqueId,
            @Field("categoryCode") List<String> categoryCode,
            @Field("guildCode") List<String> guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("firstId") String firstId,
            @Field("lastId") String lastId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("attributeTemplateCode") String attributeTemplateCode,
            @Field("attributeCode[]") List<String> attributeCode,
            @Field("attributeValue[]") List<String> attributeValue,
            @Field("orderByLike") String orderByLike,
            @Field("orderBySale") String orderBySale,
            @Field("orderByPrice") String orderByPrice,
            @Field("tags") List<String> tags,
            @Field("tagTrees") List<String> tagTrees);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<ProductSrv>>> getBusinessProductList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("businessId") String businessId,
            @Field("id") List<String> id,
            @Field("uniqueId") List<String> uniqueId,
            @Field("categoryCode") List<String> categoryCode,
            @Field("guildCode") List<String> guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("firstId") String firstId,
            @Field("lastId") String lastId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("attributeTemplateCode") String attributeTemplateCode,
            @Field("attributeCode") List<String> attributeCode,
            @Field("attributeValue") List<String> attributeValue,
            @Field("orderByLike") String orderByLike,
            @Field("orderBySale") String orderBySale,
            @Field("orderByPrice") String orderByPrice,
            @Field("tags") List<String> tags,
            @Field("tagTrees") List<String> tagTrees,
            @Field("scope") String scope,
            @Field("attributeSearchField") String attributeSearchField
//            @Field("scVoucherHash") List<String> scVoucherHash,
//            @Field("scApiKey") String scApiKey

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<AttributeTemplateSrv>>> getAttributeTemplateList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("guildCode") List<String> guildCode,
            @Field("firstId") String firstId,
            @Field("lastId") String lastId,
            @Field("offset") String offset,
            @Field("size") String size);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<ProductSrv>> addSubProduct(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("parentProductId") String parentProductId,
            @Field("name") String name,
            @Field("description") String description,
            @Field("uniqueId") String uniqueId,
            @Field("metadata") String metadata,
            @Field("businessId") String businessId,
            @Field("unlimited") String unlimited,
            @Field("availableCount") String availableCount,
            @Field("price") String price,
            @Field("discount") String discount,
            @Field("guildCode") String guildCode,
            @Field("allowUserInvoice") String allowUserInvoice,
            @Field("allowUserPrice") String allowUserPrice,
            @Field("currencyCode") String currencyCode,
            @Field("attTemplateCode") String attTemplateCode,
            @Field("attCode[]") List<String> attCode,
            @Field("attValue[]") List<String> attValue,
            @Field("attGroup[]") List<String> attGroup,
            @Field("groupId") String groupId,
            @Field("content") String content,
            @Field("previewImage") String previewImage,
            @Field("tagTreeCategoryName") String tagTreeCategoryName,
            @Field("preferredTaxRate") String preferredTaxRate,
            @Field("quantityPrecision") String quantityPrecision


    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SearchProductSrv>> searchProduct(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("q") String q,
            @Field("id") List<String> id,
            @Field("uniqueId") List<String> uniqueId,
            @Field("businessId") String businessId,
            @Field("categoryCodes") List<String> categoryCodes,
            @Field("guildCode") List<String> guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("firstId") String firstId,
            @Field("lastId") String lastId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("attributeTemplateCode") String attributeTemplateCode,
            @Field("attributeCode") List<String> attributeCode,
            @Field("attributeValue") List<String> attributeValue,
            @Field("orderByLike") String orderByLike,
            @Field("orderBySale") String orderBySale,
            @Field("orderByPrice") String orderByPrice,
            @Field("tags") List<String> tags,
            @Field("tagTrees") List<String> tagTrees);



    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<SearchProductSrv>> searchSubProduct(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("q") String q,
            @Field("productGroupId") List<String> productGroupId ,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("attributeCode[]") List<String> attributeCode,
            @Field("attributeValue[]") List<String> attributeValue,
            @Field("orderByAttributeCode") String orderByAttributeCode,
            @Field("orderByDirection") String orderByDirection,
            @Field("tags") List<String> tags,
            @Field("tagTrees") List<String> tagTrees);

}
