package com.fanap.SsoService.service;

import com.fanap.SsoService.data.modelSrv.*;
import retrofit2.Call;
import retrofit2.http.*;


/**
 * Created By Askarian on 5/28/2019
 */
public interface UserAuthenticationService {

    @Headers({
            "Content-Type: application/x-www-form-urlencoded"
    })
    @POST("/oauth2/token")
    Call<GetAccessTokenSrv> getAccessToken(
            @Query("grant_type") String grant_type,
            @Query("redirect_uri") String redirect_uri,
            @Query("code") String code,
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret);

    @Headers({
            "Content-Type: application/x-www-form-urlencoded"
    })
    @POST("/oauth2/token")
    Call<RefreshAccessTokenSrv> getAccessTokenUsingRefreshToken(
            @Query("grant_type") String grant_type,
            @Query("refresh_token") String refresh_token,
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret);

    @Headers({
            "Content-Type: application/x-www-form-urlencoded"
    })
    @POST("/oauth2/token/info")
    Call<TokenInfoSrv> tokenInfo(
            @Query("token_type_hint") String token_type_hint,
            @Query("token") String token,
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret);

    @Headers({
            "Content-Type: application/x-www-form-urlencoded"
    })
    @POST("/oauth2/token/revoke")
    Call<Void> revokeToken(
            @Query("token_type_hint") String token_type_hint,
            @Query("token") String token,
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/oauth2/clients/handshake/{client_id}")
    Call<HandshakeSrv> handshake(
            @Header("Authorization") String authorization,
            @Path("client_id") String client_id,
            @Field("device_uid") String device_uid,
            @Field("device_lat") double device_lat,
            @Field("device_lon") double device_lon,
            @Field("device_os") String device_os,
            @Field("device_os_version") String device_os_version,
            @Field("device_type") String device_type,
            @Field("device_name") String device_name,
            @Field("algorithm") String algorithm);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/oauth2/otp/authorize/{identity}")
    Call<AuthorizeSrv> authorize(
            @Path("identity") String identity,
            @Header("Authorization") String authorization,
            @Field("response_type") String response_type,
            @Field("state") String state,
            @Field("referrerType") String referrerType,
            @Field("referrer") String referrer,
            @Field("scope") String scope,
            @Field("clientId") String clientId,
            @Field("callbackUri") String callbackUri,
            @Field("code_challenge") String codeChallenge,
            @Field("code_challenge_method") String codeChallengeMethod,
            @Field("identityType") String identityType,
            @Field("loginAsUserId") String loginAsUserId,
            @Field("redirectUri") String redirectUri);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/oauth2/otp/verify/{identity}")
    Call<VerifySrv> verify(
            @Path("identity") String identity,
            @Header("Authorization") String authorization,
            @Field("otp") String otp);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/oauth2/token")
    Call<GetAccessTokenOtpSrv> getAccessTokenOtp(
            @Field("grant_type") String grant_type,
            @Field("code") String code,
            @Field("client_id") String client_id,
            @Field("client_secret") String client_secret);


}
