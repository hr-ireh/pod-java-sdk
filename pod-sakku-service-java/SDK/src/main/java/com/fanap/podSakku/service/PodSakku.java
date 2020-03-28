package com.fanap.podSakku.service;

import com.fanap.podSakku.data.modelSrv.*;
import com.fanap.podSakku.data.modelSrv.HealthCheckSrv;
import com.fanap.podSakku.data.modelVo.*;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public interface PodSakku {

    @GET("/app")
    Call<ResultSrv<List<ApplicationSrv>>> getUserApplicationsList(
            @Header("Authorization") String Authorization,
            @Query("page") String page,
            @Query("size") String size);

    @GET("/app/{appId}/commit")
    Call<ResultSrv<String>> commitApplicationContainer(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Query("containerId") String containerId,
            @Query("tag") String tag);

    @GET("/app/{appId}/deploy/state")
    Call<ResultSrv<DeployStateSrv>> getRealTimeDeploy(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId);


    @GET("/app/{appId}/logs/export")
    @Streaming
    Call<ResponseBody> logsExport(
            @Path("appId") String appId,
            @Query("toDate") String toDate,
            @Query("fromDate") String fromDate,
            @Query("token") String token);

    @GET("/app/{appId}/deploy/state/fake")
    Call<ResultSrv<DeployStateSrv>> getFakeApplicationState(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId);


    @GET("/app/{appId}/rebuild")
    Call<ResultSrv<String>> rebuildApplication(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId);


    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app")
    Call<ResultSrv<CreateApplicationSrv>> createApplication(
            @Header("Authorization") String Authorization,
            @Body ConfigContentVo config);

    @DELETE("/app/{appId}")
    Call<ResultSrv<String>> deleteApplication(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Query("force") String force);

    @PUT("/app/{appId}/config")
    Call<ResultSrv<UpdateConfSrv>> updateApplication(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Body UpdateConfigVo body);

    @GET("/app/{appId}/restart")
    Call<ResultSrv<Boolean>> restartApplication(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Query("commitStart") String commitStart,
            @Query("commitStop") String commitStop,
            @Query("tagStart") String tagStart,
            @Query("tagStop") String tagStop);

    @GET("/app/{appId}/setting")
    Call<ResultSrv<AppInfoSrv>> getApplicationSetting(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId);

    @GET("/app/{appId}/start")
    Call<ResultSrv<String>> startApplicationById(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Query("committed") String committed,
            @Query("force") String force,
            @Query("tag") String tag);

    @GET("/app/{appId}/stop")
    Call<ResultSrv<String>> stopApplicationById(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Query("commit") String commit,
            @Query("tag") String tag);

    @GET("/app/{appId}/stopDeploying")
    Call<ResultSrv<String>> stopApplicationDeploy(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId);

    @GET("/app/{appId}/versions")
    Call<ResultSrv<List<DockerTagsSrv>>> getApplicationVersions(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/{appId}/webhooks")
    Call<ResultSrv<WebhookSrv>> createApplicationWebhooks(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Body WebhookContentVo config);

    @GET("/app/{id}")
    Call<ResultSrv<ApplicationSrv>> getApplicationById(
            @Header("Authorization") String Authorization,
            @Path("id") String id);

    @GET("/app/{id}/activity")
    Call<ResultSrv<List<ActivitySrv>>> getApplicationActivity(
            @Header("Authorization") String Authorization,
            @Path("id") String id,
            @Query("page") String page,
            @Query("size") String size);

    @GET("/app/{id}/chat")
    Call<ResultSrv<ChatCredentialSrv>> getChatData(
            @Header("Authorization") String Authorization,
            @Path("id") String id);

    @GET("/app/{id}/check")
    Call<ResultSrv<List<HealthCheckSrv>>> checkApplicationHealth(
            @Header("Authorization") String Authorization,
            @Path("id") String id);

    @GET("/app/{id}/check/{hid}")
    Call<ResultSrv<HealthCheckSrv>> checkApplicationHealthById(
            @Header("Authorization") String Authorization,
            @Path("hid") String hid,
            @Path("id") String id);


    @GET("/app/{id}/collaborators")
    Call<ResultSrv<List<ApplicationAccessSrv>>> getApplicationCollaborators(
            @Header("Authorization") String Authorization,
            @Path("id") String id,
            @Query("all") String all,
            @Query("page") String page,
            @Query("size") String size);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/{id}/collaborators")
    Call<ResultSrv<ApplicationAccessSrv>> addApplicationCollaborator(
            @Header("Authorization") String Authorization,
            @Body AccessRequestContentVo accessRequestVO,
            @Path("id") String id,
            @Query("level") String level);


    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/{id}/collaborators/{cid}")
    Call<ResultSrv<ApplicationAccessSrv>> updateAppCollaborator(
            @Header("Authorization") String Authorization,
            @Body AccessRequestContentVo accessRequestVO,
            @Path("cid") String cid,
            @Path("id") String id,
            @Query("level") String level);

    @DELETE("/app/{id}/collaborators/{cid}")
    Call<ResultSrv<String>> deleteAppCollaborator(
            @Header("Authorization") String Authorization,
            @Path("cid") String cid,
            @Path("id") String id);


    @GET("/app/{id}/exec/verify")
    Call<ResultSrv<Boolean>> verifyUserCommandPermission(
            @Header("Authorization") String Authorization,
            @Path("id") String id,
            @Query("cmd") String cmd);

    @GET("/app/{id}/healthCheck")
    Call<ResultSrv<List<HealthCheckSrv>>> getAppHealthCheck(
            @Header("Authorization") String Authorization,
            @Path("id") String id);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/{id}/healthCheck")
    Call<ResultSrv<List<HealthCheckSrv>>> addAppHealthCheck(
            @Header("Authorization") String Authorization,
            @Path("id") String id,
            @Body HealthCheckVo healthCheckVoVO);

    @DELETE("/app/{id}/healthCheck")
    Call<ResultSrv<List<HealthCheckSrv>>> deleteAllAppHealthChecks(
            @Header("Authorization") String Authorization,
            @Path("id") String id,
            @Query("path") String path);

    @PUT("/app/{id}/healthCheck/{hid}")
    Call<ResultSrv<HealthCheckSrv>> updateHealthCheckById(
            @Header("Authorization") String Authorization,
            @Path("hid") String hid,
            @Path("id") String id,
            @Body HealthCheckVo updateRequest);

    @DELETE("/app/{id}/healthCheck/{hid}")
    Call<ResultSrv<HealthCheckSrv>> deleteHealthCheckById(
            @Header("Authorization") String Authorization,
            @Path("hid") String hid,
            @Path("id") String id);

    @GET("/app/{id}/logs")
    Call<ResultSrv<DockerLogsSrv>> getRealTimeAppLogsById(
            @Header("Authorization") String Authorization,
            @Path("id") String id,
            @Query("time") String time);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/{id}/transfer")
    Call<ResultSrv<Boolean>> transferAppById(
            @Header("Authorization") String Authorization,
            @Path("id") String id,
            @Body TransferRequestVo requestVO);

    @GET("/app/{id}/webhooks")
    Call<ResultSrv<List<WebhookSrv>>> getAppWebHooks(
            @Header("Authorization") String Authorization,
            @Path("id") String id);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/{id}/webhooks/{wid}")
    Call<ResultSrv<WebhookSrv>> getAppWebHookById(
            @Header("Authorization") String Authorization,
            @Path("id") String id,
            @Path("wid") String wid,
            @Body WebhookVo vo);

    @DELETE("/app/{id}/webhooks/{wid}")
    Call<ResultSrv<String>> deleteAppWebHookById(
            @Header("Authorization") String Authorization,
            @Path("wid") String wid,
            @Path("id") String id);

    @GET("/app/byName/{name}")
    Call<ResultSrv<ApplicationSrv>> getApplicationByName(
            @Header("Authorization") String Authorization,
            @Path("name") String name);

    @Multipart
    @POST("/app/group")
//    @Headers("Content-Type:multipart/form-data; charset=UTF-8")
    Call<ResultSrv<AppGroupSrv>> createAppByDockerCompose(
            @Header("Authorization") String Authorization,
            @Part MultipartBody.Part composeFile
//            @Part("composeFile") RequestBody name,
    );


    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/pipeline")
    Call<ResultSrv<String>> createPipeline(
            @Header("Authorization") String Authorization,
            @Body List<ConfigContentVo> config);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/sm")
    Call<ResultSrv<ApplicationSrv>> createAppByStateMachine(
            @Header("Authorization") String Authorization,
            @Body ApplicationBaseConfig config);

    @GET("/app/status")
    Call<ResultSrv<List<AppStatusChangeSrv>>> getUserAppsStatusList(
            @Header("Authorization") String Authorization,
            @Query("id") String id);

    @GET("/app/stopDeploying")
    Call<ResultSrv<String>> stopAppDeployWithQueueId(
            @Header("Authorization") String Authorization,
            @Query("deployQueueId") String deployQueueId);


    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/{id}/webhooks/{wid}")
    Call<ResultSrv<WebhookSrv>> updateAppWebHookById(
            @Header("Authorization") String Authorization,
            @Path("id") String id,
            @Path("wid") String wid,
            @Body WebhookContentVo vo);

    @GET("/app/network")
    Call<ResultSrv<List<AppNetworkSrv>>> getNetworks(
            @Header("Authorization") String Authorization);

    @DELETE("/app/network/{name}")
    Call<ResultSrv<String>> deleteNetworkByUser(
            @Header("Authorization") String Authorization,
            @Path("name") String name,
            @Query("force") String force);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/network/{name}/addApp")
    Call<ResultSrv<String>> addAppToNetwork(
            @Header("Authorization") String Authorization,
            @Path("name") String name,
            @Query("appId") String appId);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/network/{name}/removeApp")
    Call<ResultSrv<String>> removeAppFromNetwork(
            @Header("Authorization") String Authorization,
            @Path("name") String name,
            @Query("appId") String appId);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/app/network/create")
    Call<ResultSrv<AppNetworkSrv>> createNetwork(
            @Header("Authorization") String Authorization,
            @Query("name") String name);

    @GET("/catalog")
    Call<ResultSrv<List<CatalogClassSrv>>> getAllCatalogs(
            @Header("Authorization") String Authorization);

    @PUT("/catalog/{catalogAppId}/update")
    Call<ResultSrv<CatalogAppFullSrv>> updateCatalog(
            @Header("Authorization") String Authorization,
            @Path("catalogAppId") String catalogAppId,
            @Body CatalogUpdate catalogUpdate);

    @GET("/catalog/{catalogId}/{catalogAppId}")
    Call<ResultSrv<CatalogAppFullSrv>> getCatalogApp(
            @Header("Authorization") String Authorization,
            @Path("catalogAppId") String catalogAppId,
            @Path("catalogId") String catalogId);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/catalog/{catalogId}/create")
    Call<ResultSrv<CatalogAppFullSrv>> createCatalogApp(
            @Header("Authorization") String Authorization,
            @Path("catalogId") String catalogId,
            @Body AddCatalogAppVo addCatalogAppVo);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/catalog/{catalogId}/create/fromApplication")
    Call<ResultSrv<CatalogAppFullSrv>> createCatalogAppBySakkuApp(
            @Header("Authorization") String Authorization,
            @Path("catalogId") String catalogId,
            @Query("appId") String appId,
            @Body AddCatalogAppVo addCatalogApp);

    @GET("/catalog/{id}")
    Call<ResultSrv<List<CatalogAppFullSrv>>> getAllCatalogAppById(
            @Header("Authorization") String Authorization,
            @Path("id") String id);

    @GET("/catalog/feedback")
    Call<ResultSrv<List<CatalogAppFullSrv>>> getUserFeedbackCatalog(
            @Header("Authorization") String Authorization,
            @Query("status") String status);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/catalog/feedback")
    Call<ResultSrv<Boolean>> addUserFeedbackCatalogs(
            @Header("Authorization") String Authorization,
            @Body CatalogFeedbackVo catalogFeedbackVo);

    @GET("/catalog/metadata")
    Call<ResultSrv<List<CatalogMetadata>>> getAllMetaData(
            @Header("Authorization") String Authorization,
            @Query("page") String page,
            @Query("size") String size);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/catalog/metadata/validate")
    Call<ResultSrv<CatalogMetadata>> validateMetaData(
            @Header("Authorization") String Authorization,
            @Body CatalogMetadata metadataVO);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/catalog/deploy/{catalogAppId}/test")
    Call<ResultSrv<ApplicationSrv>> deployAppFromCatalog(
            @Header("Authorization") String Authorization,
            @Path("catalogAppId") String catalogAppId,
            @Query("settings") String settings);
//            @Body String files);

    @GET("/domain")
    Call<ResultSrv<List<UserDomainSrv>>> getAllDomainsOfUser(
            @Header("Authorization") String Authorization);

    @GET("/domain/app/{appId}")
    Call<ResultSrv<List<UserDomainSrv>>> getAppDomains(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId);

    @DELETE("/domain/app/{appId}")
    Call<ResultSrv<Boolean>> removeDomain(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Query("domain") String domain);


    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/domain/app/{appId}/addDomain")
    Call<ResultSrv<List<UserDomainSrv>>> addDomain(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Query("certid") String certid,
            @Query("domain") String domain);

    @GET("/domain/app/{appId}/basicAuthentication")
    Call<ResultSrv<List<BasicAuthenticationSrv>>> getBasicAuthUsers(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/domain/app/{appId}/basicAuthentication")
    Call<ResultSrv<List<BasicAuthenticationSrv>>> addBasicAuthUsers(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Body List<BasicAuthenticationVo> basicAuthentication);

    @DELETE("/domain/app/{appId}/basicAuthentication/{basicAuthId}")
    Call<ResultSrv<List<BasicAuthenticationSrv>>> deleteBasicAuthUsers(
            @Header("Authorization") String Authorization,
            @Path("appId") String appId,
            @Path("basicAuthId") String basicAuthId);

    @GET("/domain/options")
    Call<ResultSrv<List<String>>> getAvailablePortOptions(
            @Header("Authorization") String Authorization);

    @GET("/domain/record")
    Call<ResultSrv<List<DomainRRSet>>> getDomainRecords(
            @Header("Authorization") String Authorization,
            @Query("domain") String domain);

    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("/domain/record")
    Call<ResultSrv<Boolean>> addDomainRecord(
            @Header("Authorization") String Authorization,
            @Query("domain") String domain,
            @Body DomainRRSet record);

    @PUT("/domain/record")
    Call<ResultSrv<Boolean>> updateDomainRecord(
            @Header("Authorization") String Authorization,
            @Query("domain") String domain,
            @Query("name") String name,
            @Query("type") String type,
            @Body DomainRRSet record);

    @DELETE("/domain/record")
    Call<ResultSrv<Boolean>> deleteDomainRecord(
            @Header("Authorization") String Authorization,
            @Query("domain") String domain,
            @Query("name") String name,
            @Query("type") String type);

}