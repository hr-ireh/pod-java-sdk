package com.fanap.podDealing.service;

import com.fanap.podDealing.data.modelSrv.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created By Z.gholinia on 8/11/2019
 */
public interface PodDealing {

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<BusinessSrv>> addUserAndBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("username") String username,
            @Field("businessName") String businessName,
            @Field("firstName") String firstName,
            @Field("lastName") String lastName,
            @Field("sheba") String sheba,
            @Field("nationalCode") String nationalCode,
            @Field("economicCode") String economicCode,
            @Field("registrationNumber") String registrationNumber,
            @Field("email") String email,
            @Field("guildCode") List<String> guildCode,
            @Field("cellphone") String cellphone,
            @Field("phone") String phone,
            @Field("fax") String fax,
            @Field("postalCode") String postalCode,
            @Field("country") String country,
            @Field("state") String state,
            @Field("city") String city,
            @Field("address") String address,
            @Field("description") String description,
            @Field("newsReader") String newsReader,
            @Field("logoImage") String logoImage,
            @Field("coverImage") String coverImage,
            @Field("tags") String tags,
            @Field("tagTrees") String tagTrees,
            @Field("tagTreeCategoryName") String tagTreeCategoryName,
            @Field("link") String link,
            @Field("lat") String lat,
            @Field("lng") String lng,
            @Field("agentFirstName") String agentFirstName,
            @Field("agentLastName") String agentLastName,
            @Field("agentCellphoneNumber") String agentCellphoneNumber,
            @Field("agentNationalCode") String agentNationalCode);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<BusinessSrv>>> listUserCreatedBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("bizId") List<String> bizId,
            @Field("guildCode") List<String> guildCod,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("Field") String Field,
            @Field("tags") List<String> tags,
            @Field("tagTrees") List<String> tagTrees,
            @Field("country") String active,
            @Field("country") String country,
            @Field("state") String state,
            @Field("city") String city,
            @Field("ssoId") String ssoId,
            @Field("username") String username,
            @Field("businessName") String businessName,
            @Field("sheba") String sheba,
            @Field("nationalCode") String nationalCode,
            @Field("economicCode") String economicCode,
            @Field("email") String email,
            @Field("cellphone") String cellphone);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<BusinessSrv>> updateBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("bizId") String bizId,
            @Field("businessName") String businessName,
            @Field("companyName") String companyName,
            @Field("shopName") String shopName,
            @Field("shopNameEn") String shopNameEn,
            @Field("website") String website,
            @Field("dateEstablishing") String dateEstablishing,
            @Field("firstName") String firstName,
            @Field("lastName") String lastName,
            @Field("sheba") String sheba,
            @Field("nationalCode") String nationalCode,
            @Field("economicCode") String economicCode,
            @Field("registrationNumber") String registrationNumber,
            @Field("email") String email,
            @Field("guildCode") List<String> guildCode,
            @Field("cellphone") String cellphone,
            @Field("phone") String phone,
            @Field("fax") String fax,
            @Field("postalCode") String postalCode,
            @Field("country") String country,
            @Field("state") String state,
            @Field("city") String city,
            @Field("address") String address,
            @Field("description") String description,
            @Field("changeLogo") String changeLogo,
            @Field("changeCover") String changeCover,
            @Field("logoImage") String logoImage,
            @Field("coverImage") String coverImage,
            @Field("tags") String tags,
            @Field("tagTrees") String tagTrees,
            @Field("tagTreeCategoryName") String tagTreeCategoryName,
            @Field("link") String link,
            @Field("lat") String lat,
            @Field("lng") String lng,
            @Field("agentFirstName") String agentFirstName,
            @Field("agentLastName") String agentLastName,
            @Field("agentCellphoneNumber") String agentCellphoneNumber,
            @Field("agentNationalCode") String agentNationalCode,
            @Field("changeAgent") String changeAgent);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<BusinessApiTokenSrv>> getApiTokenForCreatedBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("businessId") String businessId);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<RateSrv>> rateBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("businessId") String businessId,
            @Field("rate") String rate);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Long>> commentBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("businessId") String businessId,
            @Field("text") String rate);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> businessFavorite(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("businessId") String businessId,
            @Field("disfavorite") String disfavorite);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<UserBusinessInfoSrv>>> userBusinessInfos(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("id[]") List<String> id);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<CommentSrv>>> commentBusinessList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("businessId") String businessId,
            @Field("firstId") String firstId,
            @Field("lastId") String lastId,
            @Field("offset") String offset,
            @Field("size") String size);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> confirmComment(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("commentId") String commentId);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<GuildSrv>>> guildList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("name") String name,
            @Field("offset ") String offset,
            @Field("size ") String size);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<Boolean>> unconfirmComment(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("commentId") String commentId);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<DealerProductPermissionSrv>> addDealerProductPermission(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("productId") String productId,
            @Field("dealerBizId") String dealerBizId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<DealerProductPermissionSrv>>> dealerProductPermissionList(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("productId") String productId,
            @Field("dealerBizId") String dealerBizId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("enable") String enable
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<DealerProductPermissionSrv>>> dealingProductPermissionList(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("productId") String productId,
            @Field("dealingBusinessId") String dealingBusinessId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("enable") String enable
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<DealerProductPermissionSrv>> disableDealerProductPermission(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("productId") String productId,
            @Field("dealerBizId") String dealerBizId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<DealerProductPermissionSrv>> enableDealerProductPermission(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("productId") String productId,
            @Field("dealerBizId") String dealerBizId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<BusinessDealerSrv>> addDealer(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("dealerBizId") String dealerBizId,
            @Field("allProductAllow") String allProductAllow
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<BusinessDealerSrv>>> dealerList(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("dealerBizId") String dealerBizId,
            @Field("enable") String enable,
            @Field("offset") String offset,
            @Field("size") String size
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<BusinessDealerSrv>> enableDealer(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("dealerBizId") String dealerBizId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<BusinessDealerSrv>> disableDealer(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("dealerBizId") String dealerBizId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("nzh/doServiceCall")
    Call<ResultSrv<List<BusinessDealerSrv>>> businessDealingList(
            @Field("_token_") String token,
            @Field("_token_issuer_") String tokenIssuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("dealingBusinessId") String dealingBusinessId,
            @Field("enable") String enable,
            @Field("offset") String offset,
            @Field("size") String size
    );


}
