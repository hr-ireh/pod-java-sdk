package com.fanap.podNeshan.service;

        import com.fanap.podNeshan.data.modelSrv.*;
        import retrofit2.Call;
        import retrofit2.http.*;

        import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public interface PodNeshan {

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<SearchSrv>> search(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("term") String term,
            @Field("lat") String lat,
            @Field("lng") String lng);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<ReverseGeoSrv>> reverseGeo(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("lat") String lat,
            @Field("lng") String lng);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<DirectionSrv>> direction(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("origin") String origin,
            @Field("destination") String destination,
            @Field("waypoints") String waypoints,
            @Field("avoidTrafficZone") String avoidTrafficZone,
            @Field("avoidOddEvenZone") String avoidOddEvenZone,
            @Field("alternative") String alternative);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<DirectionSrv>> noTrafficDirection(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("origin") String origin,
            @Field("destination") String destination,
            @Field("waypoints") String waypoints,
            @Field("avoidTrafficZone") String avoidTrafficZone,
            @Field("avoidOddEvenZone") String avoidOddEvenZone,
            @Field("alternative") String alternative);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<DistanceMatrixSrv>> distanceMatrix(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("origins") String origins,
            @Field("destinations") String destinations);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<DistanceMatrixSrv>> noTrafficDistanceMatrix(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("origins") String origins,
            @Field("destinations") String destinations);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/doServiceCall")
    Call<ResultSrv<MapMatchingSrv>> mapMatching(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("scProductId") String scProductId,
            @Field("scVoucherHash") List<String> scVoucherHash,
            @Field("scApiKey") String scApiKey,
            @Field("path") String path);


}
