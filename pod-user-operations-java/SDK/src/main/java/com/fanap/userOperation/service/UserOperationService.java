package com.fanap.userOperation.service;

import com.fanap.userOperation.data.modelSrv.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created By Askarian on 5/28/2019
 */
public interface UserOperationService {

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<CustomerProfileSrv>> getUserProfile(
            @Field("_token_") String token,
            @Field("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("client_id") String client_id,
            @Field("client_secret") String client_secret);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<CustomerProfileSrv>> editProfileWithConfirmation(
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("firstName") String firstName,
            @Field("lastName") String lastName,
            @Field("nickName") String nickName,
            @Field("email") String email,
            @Field("phoneNumber") String phoneNumber,
            @Field("cellphoneNumber") String cellphoneNumber,
            @Field("nationalCode") String nationalCode,
            @Field("gender") String gender,
            @Field("address") String address,
            @Field("birthDate") String birthDate,
            @Field("country") String country,
            @Field("state") String state,
            @Field("city") String city,
            @Field("postalcode") String postalcode,
            @Field("sheba") String sheba,
            @Field("profileImage") String profileImage,
            @Field("client_metadata") String client_metadata,
            @Field("birthState") String birthState,
            @Field("identificationNumber") String identificationNumber,
            @Field("fatherName") String fatherName,
            @Field("_token_") String token,
            @Field("_token_issuer_") String token_issuer,
            @Field("client_id") String client_id,
            @Field("client_secret") String client_secret);




    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<CustomerProfileSrv>> confirmEditProfile(
            @Field("_token_") String token,
            @Field("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("code") String code,
            @Field("cellphoneNumber") String cellphoneNumber);



    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<List<AddressSrv>>> getListAddress(
            @Field("_token_") String token,
            @Field("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("offset") String offset,
            @Field("size") String size);

}
