package com.fanap.podSakku.service;

import com.fanap.podSakku.data.modelSrv.*;
import com.fanap.podSakku.data.modelVo.*;
import com.fanap.podSakku.util.*;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import java.io.File;
import java.util.List;

/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class Service {
    public void getUserApplicationsList(GetUserApplicationsListVo getUserApplicationsListVo,
                                        OnGetResponseListener onGetResponseListener) {

        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<ApplicationSrv>>(service.getUserApplicationsList(
                getUserApplicationsListVo.getBaseInfoVo().getAuthorization(),
                getUserApplicationsListVo.getPage(),
                getUserApplicationsListVo.getSize()
        ), onGetResponseListener).get();
    }


    public void commitApplicationContainer(CommitApplicationContainerVo commitApplicationContainerVo,
                                           OnGetResponseListener onGetResponseListener) {

        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.commitApplicationContainer(
                commitApplicationContainerVo.getBaseInfoVo().getAuthorization(),
                commitApplicationContainerVo.getAppId(),
                commitApplicationContainerVo.getContainerId(),
                commitApplicationContainerVo.getTag()
        ), onGetResponseListener).get();
    }

    public void getRealTimeDeploy(GetRealTimeDeployVo getRealTimeDeployVo,
                                  OnGetResponseListener onGetResponseListener) {

        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<DeployStateSrv>(service.getRealTimeDeploy(
                getRealTimeDeployVo.getBaseInfoVo().getAuthorization(),
                getRealTimeDeployVo.getAppId()
        ), onGetResponseListener).get();
    }

    public void logsExport(LogsExportVo logsExportVo,
                           OnGetResponseListenerExportLogs onGetResponseListener) {

        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        GetResultExportLogs getResultExportLogs = new GetResultExportLogs(logsExportVo.getSaveTo());
        getResultExportLogs.setPath(logsExportVo.getSaveTo());
        new GetResultExportLogs(service.logsExport(
                logsExportVo.getAppId(),
                logsExportVo.getToDate(),
                logsExportVo.getFromDate(),
                logsExportVo.getToken()
        ), onGetResponseListener).get();
    }

    public void getFakeApplicationState(GetFakeApplicationStateVo getFakeApplicationStateVo,
                                        OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<DeployStateSrv>(service.getFakeApplicationState(
                getFakeApplicationStateVo.getBaseInfoVo().getAuthorization(),
                getFakeApplicationStateVo.getAppId()
        ), onGetResponseListener).get();
    }

    public void rebuildApplication(RebuildApplicationVo rebuildApplicationVo,
                                   OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.rebuildApplication(
                rebuildApplicationVo.getBaseInfoVo().getAuthorization(),
                rebuildApplicationVo.getAppId()
        ), onGetResponseListener).get();
    }

    public void createApplication(CreateApplicationVo createApplicationVo,
                                  OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<CreateApplicationSrv>(service.createApplication(
                createApplicationVo.getBaseInfoVo().getAuthorization(),
                createApplicationVo.getConfig()
        ), onGetResponseListener).get();
    }

    public void deleteApplication(DeleteApplicationVo deleteApplicationVo,
                                  OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.deleteApplication(
                deleteApplicationVo.getBaseInfoVo().getAuthorization(),
                deleteApplicationVo.getAppId(),
                deleteApplicationVo.getForce()
        ), onGetResponseListener).get();
    }

    public void updateApplication(UpdateApplicationVo updateApplicationVo,
                                  OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<UpdateConfSrv>(service.updateApplication(
                updateApplicationVo.getBaseInfoVo().getAuthorization(),
                updateApplicationVo.getAppId(),
                updateApplicationVo.getBody()
        ), onGetResponseListener).get();
    }

    public void restartApplication(RestartApplicationVo restartApplicationVo,
                                   OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<Boolean>(service.restartApplication(
                restartApplicationVo.getBaseInfoVo().getAuthorization(),
                restartApplicationVo.getAppId(),
                restartApplicationVo.getCommitStart(),
                restartApplicationVo.getCommitStop(),
                restartApplicationVo.getTagStart(),
                restartApplicationVo.getTagStop()
        ), onGetResponseListener).get();
    }

    public void getApplicationSetting(GetApplicationSettingVo getApplicationSettingVo,
                                      OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<AppInfoSrv>(service.getApplicationSetting(
                getApplicationSettingVo.getBaseInfoVo().getAuthorization(),
                getApplicationSettingVo.getAppId()
        ), onGetResponseListener).get();
    }

    public void startApplicationById(StartApplicationByIdVo startApplicationByIdVo,
                                     OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.startApplicationById(
                startApplicationByIdVo.getBaseInfoVo().getAuthorization(),
                startApplicationByIdVo.getAppId(),
                startApplicationByIdVo.getCommitted(),
                startApplicationByIdVo.getForce(),
                startApplicationByIdVo.getTag()
        ), onGetResponseListener).get();
    }

    public void stopApplicationById(StopApplicationByIdVo stopApplicationByIdVo,
                                    OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.stopApplicationById(
                stopApplicationByIdVo.getBaseInfoVo().getAuthorization(),
                stopApplicationByIdVo.getAppId(),
                stopApplicationByIdVo.getCommit(),
                stopApplicationByIdVo.getTag()
        ), onGetResponseListener).get();
    }

    public void stopApplicationDeploy(StopApplicationDeployVo stopApplicationDeployVo,
                                      OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.stopApplicationDeploy(
                stopApplicationDeployVo.getBaseInfoVo().getAuthorization(),
                stopApplicationDeployVo.getAppId()
        ), onGetResponseListener).get();
    }

    public void getApplicationVersions(GetApplicationVersionsVo getApplicationVersionsVo,
                                       OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<DockerTagsSrv>>(service.getApplicationVersions(
                getApplicationVersionsVo.getBaseInfoVo().getAuthorization(),
                getApplicationVersionsVo.getAppId()
        ), onGetResponseListener).get();
    }


    public void createApplicationWebhooks(CreateApplicationWebhooksVo createApplicationWebhooksVo,
                                          OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<WebhookSrv>(service.createApplicationWebhooks(
                createApplicationWebhooksVo.getBaseInfoVo().getAuthorization(),
                createApplicationWebhooksVo.getAppId(),
                createApplicationWebhooksVo.getWebhookVO()
        ), onGetResponseListener).get();
    }


    public void getApplicationById(GetApplicationByIdVo getApplicationByIdVo,
                                   OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<ApplicationSrv>(service.getApplicationById(
                getApplicationByIdVo.getBaseInfoVo().getAuthorization(),
                getApplicationByIdVo.getId()
        ), onGetResponseListener).get();
    }

    public void getApplicationActivity(GetApplicationActivityVo getApplicationActivityVo,
                                       OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<ActivitySrv>>(service.getApplicationActivity(
                getApplicationActivityVo.getBaseInfoVo().getAuthorization(),
                getApplicationActivityVo.getId(),
                getApplicationActivityVo.getPage(),
                getApplicationActivityVo.getSize()
        ), onGetResponseListener).get();
    }

    public void getChatData(GetChatDataVo getChatDataVo,
                            OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<ChatCredentialSrv>(service.getChatData(
                getChatDataVo.getBaseInfoVo().getAuthorization(),
                getChatDataVo.getId()
        ), onGetResponseListener).get();
    }

    public void checkApplicationHealth(CheckApplicationHealthVo checkApplicationHealthVo,
                                       OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<HealthCheckSrv>>(service.checkApplicationHealth(
                checkApplicationHealthVo.getBaseInfoVo().getAuthorization(),
                checkApplicationHealthVo.getId()
        ), onGetResponseListener).get();
    }

    public void checkApplicationHealthById(CheckApplicationHealthByIdVo checkApplicationHealthByIdVo,
                                           OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<HealthCheckSrv>(service.checkApplicationHealthById(
                checkApplicationHealthByIdVo.getBaseInfoVo().getAuthorization(),
                checkApplicationHealthByIdVo.getHid(),
                checkApplicationHealthByIdVo.getId()
        ), onGetResponseListener).get();
    }

    public void getApplicationCollaborators(GetApplicationCollaboratorsVo getApplicationCollaboratorsVo,
                                            OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<ApplicationAccessSrv>>(service.getApplicationCollaborators(
                getApplicationCollaboratorsVo.getBaseInfoVo().getAuthorization(),
                getApplicationCollaboratorsVo.getId(),
                getApplicationCollaboratorsVo.getAll(),
                getApplicationCollaboratorsVo.getPage(),
                getApplicationCollaboratorsVo.getSize()
        ), onGetResponseListener).get();
    }

    public void addApplicationCollaborator(AddApplicationCollaboratorVo addApplicationCollaboratorVo,
                                           OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<ApplicationAccessSrv>(service.addApplicationCollaborator(
                addApplicationCollaboratorVo.getBaseInfoVo().getAuthorization(),
                addApplicationCollaboratorVo.getAccessRequestVO(),
                addApplicationCollaboratorVo.getId(),
                addApplicationCollaboratorVo.getLevel()
        ), onGetResponseListener).get();
    }

    public void updateAppCollaborator(UpdateAppCollaboratorVo updateAppCollaboratorVo,
                                      OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<ApplicationAccessSrv>(service.updateAppCollaborator(
                updateAppCollaboratorVo.getBaseInfoVo().getAuthorization(),
                updateAppCollaboratorVo.getAccessRequestVO(),
                updateAppCollaboratorVo.getCid(),
                updateAppCollaboratorVo.getId(),
                updateAppCollaboratorVo.getLevel()
        ), onGetResponseListener).get();
    }

    public void deleteAppCollaborator(DeleteAppCollaboratorVo deleteAppCollaboratorVo,
                                      OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.deleteAppCollaborator(
                deleteAppCollaboratorVo.getBaseInfoVo().getAuthorization(),
                deleteAppCollaboratorVo.getCid(),
                deleteAppCollaboratorVo.getId()
        ), onGetResponseListener).get();
    }

    public void verifyUserCommandPermission(VerifyUserCommandPermissionVo verifyUserCommandPermissionVo,
                                            OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<Boolean>(service.verifyUserCommandPermission(
                verifyUserCommandPermissionVo.getBaseInfoVo().getAuthorization(),
                verifyUserCommandPermissionVo.getId(),
                verifyUserCommandPermissionVo.getCmd()
        ), onGetResponseListener).get();
    }

    public void getAppHealthCheck(GetAppHealthCheckVo getAppHealthCheckVo,
                                  OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<HealthCheckSrv>>(service.getAppHealthCheck(
                getAppHealthCheckVo.getBaseInfoVo().getAuthorization(),
                getAppHealthCheckVo.getId()
        ), onGetResponseListener).get();
    }

    public void addAppHealthCheck(AddAppHealthCheckVo addAppHealthCheckVo,
                                  OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<HealthCheckSrv>>(service.addAppHealthCheck(
                addAppHealthCheckVo.getBaseInfoVo().getAuthorization(),
                addAppHealthCheckVo.getId(),
                addAppHealthCheckVo.getHealthCheckVO()
        ), onGetResponseListener).get();
    }

    public void deleteAllAppHealthChecks(DeleteAllAppHealthChecksVo deleteAllAppHealthChecksVo,
                                         OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<HealthCheckSrv>>(service.deleteAllAppHealthChecks(
                deleteAllAppHealthChecksVo.getBaseInfoVo().getAuthorization(),
                deleteAllAppHealthChecksVo.getId(),
                deleteAllAppHealthChecksVo.getPath()
        ), onGetResponseListener).get();
    }


    public void updateHealthCheckById(UpdateHealthCheckByIdVo updateHealthCheckByIdVo,
                                      OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<HealthCheckSrv>(service.updateHealthCheckById(
                updateHealthCheckByIdVo.getBaseInfoVo().getAuthorization(),
                updateHealthCheckByIdVo.getHid(),
                updateHealthCheckByIdVo.getId(),
                updateHealthCheckByIdVo.getUpdateRequest()
        ), onGetResponseListener).get();
    }

    public void deleteHealthCheckById(DeleteHealthCheckByIdVo deleteHealthCheckByIdVo,
                                      OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<HealthCheckSrv>(service.deleteHealthCheckById(
                deleteHealthCheckByIdVo.getBaseInfoVo().getAuthorization(),
                deleteHealthCheckByIdVo.getHid(),
                deleteHealthCheckByIdVo.getId()
        ), onGetResponseListener).get();
    }

    public void getRealTimeAppLogsById(GetRealTimeAppLogsByIdVo getRealTimeAppLogsByIdVo,
                                       OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<DockerLogsSrv>(service.getRealTimeAppLogsById(
                getRealTimeAppLogsByIdVo.getBaseInfoVo().getAuthorization(),
                getRealTimeAppLogsByIdVo.getId(),
                getRealTimeAppLogsByIdVo.getTime()
        ), onGetResponseListener).get();
    }

    public void transferAppById(TransferAppByIdVo transferAppByIdVo,
                                OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<Boolean>(service.transferAppById(
                transferAppByIdVo.getBaseInfoVo().getAuthorization(),
                transferAppByIdVo.getId(),
                transferAppByIdVo.getRequestVO()
        ), onGetResponseListener).get();
    }

    public void getAppWebHooks(GetAppWebHooksVo getAppWebHooksVo,
                               OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<WebhookSrv>>(service.getAppWebHooks(
                getAppWebHooksVo.getBaseInfoVo().getAuthorization(),
                getAppWebHooksVo.getId()
        ), onGetResponseListener).get();
    }

    public void getAppWebHookById(GetAppWebHookByIdVo getAppWebHookByIdVo,
                                  OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<WebhookSrv>(service.getAppWebHookById(
                getAppWebHookByIdVo.getBaseInfoVo().getAuthorization(),
                getAppWebHookByIdVo.getId(),
                getAppWebHookByIdVo.getWid(),
                getAppWebHookByIdVo.getVo()
        ), onGetResponseListener).get();
    }


    public void deleteAppWebHookById(DeleteAppWebHookByIdVo deleteAppWebHookByIdVo,
                                     OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.deleteAppWebHookById(
                deleteAppWebHookByIdVo.getBaseInfoVo().getAuthorization(),
                deleteAppWebHookByIdVo.getWid(),
                deleteAppWebHookByIdVo.getId()
        ), onGetResponseListener).get();
    }

    public void getApplicationByName(GetApplicationByNameVo getApplicationByNameVo,
                                     OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<ApplicationSrv>(service.getApplicationByName(
                getApplicationByNameVo.getBaseInfoVo().getAuthorization(),
                getApplicationByNameVo.getName()
        ), onGetResponseListener).get();
    }

    public void createAppByDockerCompose(CreateAppByDockerComposeVo createAppByDockerComposeVo,
                                         OnGetResponseListener onGetResponseListener) {


        File composeFile = new File(createAppByDockerComposeVo.getComposeFile());
        // Parsing any Media type file

        RequestBody requestBody = RequestBody.create(MediaType.parse("text/yaml"), composeFile);

        MultipartBody.Part multipartBody = MultipartBody.Part.createFormData("composeFile", composeFile.getName(), requestBody);
//        RequestBody filename = RequestBody.create(MediaType.parse("text/plain"), createAppByDockerComposeVo.getGlobalConfig());
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<AppGroupSrv>(service.createAppByDockerCompose(
                createAppByDockerComposeVo.getBaseInfoVo().getAuthorization(),
                multipartBody
//                filename,
        ), onGetResponseListener).get();
    }

    public void createPipeline(CreatePipelineVo createPipelineVo,
                               OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.createPipeline(
                createPipelineVo.getBaseInfoVo().getAuthorization(),
                createPipelineVo.getConfig()
        ), onGetResponseListener).get();
    }

    public void createAppByStateMachine(CreateAppByStateMachineVo createAppByStateMachineVo,
                                            OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<ApplicationSrv>(service.createAppByStateMachine(
                createAppByStateMachineVo.getBaseInfoVo().getAuthorization(),
                createAppByStateMachineVo.getConfig()
        ), onGetResponseListener).get();
    }

    public void getUserAppsStatusList(GetUserAppsStatusListVo getUserAppsStatusListVo,
                                      OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<AppStatusChangeSrv>>(service.getUserAppsStatusList(
                getUserAppsStatusListVo.getBaseInfoVo().getAuthorization(),
                getUserAppsStatusListVo.getId()
        ), onGetResponseListener).get();
    }

    public void stopAppDeployWithQueueId(StopAppDeployWithQueueIdVo stopAppDeployWithQueueIdVo,
                                         OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.stopAppDeployWithQueueId(
                stopAppDeployWithQueueIdVo.getBaseInfoVo().getAuthorization(),
                stopAppDeployWithQueueIdVo.getDeployQueueId()
        ), onGetResponseListener).get();
    }

    public void updateAppWebHookById(UpdateAppWebHookByIdVo updateAppWebHookByIdVo,
                                     OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<WebhookSrv>(service.updateAppWebHookById(
                updateAppWebHookByIdVo.getBaseInfoVo().getAuthorization(),
                updateAppWebHookByIdVo.getId(),
                updateAppWebHookByIdVo.getWid(),
                updateAppWebHookByIdVo.getVo()
        ), onGetResponseListener).get();
    }


    public void getNetworks(GetNetworksVo getNetworksVo,
                            OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<AppNetworkSrv>>(service.getNetworks(
                getNetworksVo.getBaseInfoVo().getAuthorization()
        ), onGetResponseListener).get();
    }

    public void deleteNetworkByUser(DeleteNetworkByUserVo deleteNetworkByUserVo,
                                    OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.deleteNetworkByUser(
                deleteNetworkByUserVo.getBaseInfoVo().getAuthorization(),
                deleteNetworkByUserVo.getName(),
                deleteNetworkByUserVo.getForce()
        ), onGetResponseListener).get();
    }

    public void addAppToNetwork(AddAppToNetworkVo addAppToNetworkVo,
                                OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.addAppToNetwork(
                addAppToNetworkVo.getBaseInfoVo().getAuthorization(),
                addAppToNetworkVo.getName(),
                addAppToNetworkVo.getAppId()
        ), onGetResponseListener).get();
    }

    public void removeAppFromNetwork(RemoveAppFromNetworkVo removeAppFromNetworkVo,
                                     OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<String>(service.removeAppFromNetwork(
                removeAppFromNetworkVo.getBaseInfoVo().getAuthorization(),
                removeAppFromNetworkVo.getName(),
                removeAppFromNetworkVo.getAppId()
        ), onGetResponseListener).get();
    }

    public void createNetwork(CreateNetworkVo createNetworkVo,
                              OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<AppNetworkSrv>(service.createNetwork(
                createNetworkVo.getBaseInfoVo().getAuthorization(),
                createNetworkVo.getName()
        ), onGetResponseListener).get();
    }

    public void getAllCatalogs(GetAllCatalogsVo getAllCatalogsVo,
                               OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<CatalogClassSrv>>(service.getAllCatalogs(
                getAllCatalogsVo.getBaseInfoVo().getAuthorization()
        ), onGetResponseListener).get();
    }

    public void updateCatalog(UpdateCatalogVo updateCatalogVo,
                              OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<CatalogAppFullSrv>(service.updateCatalog(
                updateCatalogVo.getBaseInfoVo().getAuthorization(),
                updateCatalogVo.getCatalogAppId(),
                updateCatalogVo.getCatalogUpdate()
        ), onGetResponseListener).get();
    }

    public void getCatalogApp(GetCatalogAppVo getCatalogAppVo,
                              OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<CatalogAppFullSrv>(service.getCatalogApp(
                getCatalogAppVo.getBaseInfoVo().getAuthorization(),
                getCatalogAppVo.getCatalogAppId(),
                getCatalogAppVo.getCatalogId()
        ), onGetResponseListener).get();
    }

    public void createCatalogApp(CreateCatalogAppVo createCatalogAppVo,
                                 OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<CatalogAppFullSrv>(service.createCatalogApp(
                createCatalogAppVo.getBaseInfoVo().getAuthorization(),
                createCatalogAppVo.getCatalogId(),
                createCatalogAppVo.getAddCatalogAppVo()
        ), onGetResponseListener).get();
    }

    public void createCatalogAppBySakkuApp(CreateCatalogAppBySakkuAppVo createCatalogAppBySakkuAppVo,
                                           OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<CatalogAppFullSrv>(service.createCatalogAppBySakkuApp(
                createCatalogAppBySakkuAppVo.getBaseInfoVo().getAuthorization(),
                createCatalogAppBySakkuAppVo.getCatalogId(),
                createCatalogAppBySakkuAppVo.getAppId(),
                createCatalogAppBySakkuAppVo.getAddCatalogAppVo()
        ), onGetResponseListener).get();
    }

    public void getAllCatalogAppById(GetAllCatalogAppByIdVo getAllCatalogAppByIdVo,
                                     OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<CatalogAppFullSrv>>(service.getAllCatalogAppById(
                getAllCatalogAppByIdVo.getBaseInfoVo().getAuthorization(),
                getAllCatalogAppByIdVo.getId()
        ), onGetResponseListener).get();
    }

    public void getUserFeedbackCatalog(GetUserFeedbackCatalogVo getUserFeedbackCatalogVo,
                                       OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<CatalogAppFullSrv>>(service.getUserFeedbackCatalog(
                getUserFeedbackCatalogVo.getBaseInfoVo().getAuthorization(),
                getUserFeedbackCatalogVo.getStatus()
        ), onGetResponseListener).get();
    }

    public void addUserFeedbackCatalogs(AddUserFeedbackCatalogsVo addUserFeedbackCatalogsVo,
                                        OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<Boolean>(service.addUserFeedbackCatalogs(
                addUserFeedbackCatalogsVo.getBaseInfoVo().getAuthorization(),
                addUserFeedbackCatalogsVo.getCatalogFeedbackVo()
        ), onGetResponseListener).get();
    }

    public void getAllMetaData(GetAllMetadataVo getAllMetadataVo,
                               OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<CatalogMetadata>>(service.getAllMetaData(
                getAllMetadataVo.getBaseInfoVo().getAuthorization(),
                getAllMetadataVo.getPage(),
                getAllMetadataVo.getSize()
        ), onGetResponseListener).get();
    }

    public void validateMetaData(ValidateMetadataVo validateMetadataVo,
                                 OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<CatalogMetadata>(service.validateMetaData(
                validateMetadataVo.getBaseInfoVo().getAuthorization(),
                validateMetadataVo.getMetadataVO()
        ), onGetResponseListener).get();
    }

    public void deployAppFromCatalog(DeployAppFromCatalogVo deployAppFromCatalogVo,
                                     OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<ApplicationSrv>(service.deployAppFromCatalog(
                deployAppFromCatalogVo.getBaseInfoVo().getAuthorization(),
                deployAppFromCatalogVo.getCatalogAppId(),
                deployAppFromCatalogVo.getSettings()
//                deployAppFromCatalogVo.getFiles()
        ), onGetResponseListener).get();
    }

    public void getAllDomainsOfUser(GetAllDomainsOfUserVo getAllDomainsOfUserVo,
                                    OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<UserDomainSrv>>(service.getAllDomainsOfUser(
                getAllDomainsOfUserVo.getBaseInfoVo().getAuthorization()
        ), onGetResponseListener).get();
    }

    public void getAppDomains(GetAppDomainsVo getAppDomainsVo,
                              OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<UserDomainSrv>>(service.getAppDomains(
                getAppDomainsVo.getBaseInfoVo().getAuthorization(),
                getAppDomainsVo.getAppId()
        ), onGetResponseListener).get();
    }


    public void removeDomain(RemoveDomainVo removeDomainVo,
                             OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<Boolean>(service.removeDomain(
                removeDomainVo.getBaseInfoVo().getAuthorization(),
                removeDomainVo.getAppId(),
                removeDomainVo.getDomain()
        ), onGetResponseListener).get();
    }

    public void addDomain(AddDomainVo addDomainVo,
                          OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<UserDomainSrv>>(service.addDomain(
                addDomainVo.getBaseInfoVo().getAuthorization(),
                addDomainVo.getAppId(),
                addDomainVo.getCertId(),
                addDomainVo.getDomain()
        ), onGetResponseListener).get();
    }

    public void getBasicAuthUsers(GetBasicAuthUsersVo getBasicAuthUsersVo,
                                  OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<BasicAuthenticationSrv>>(service.getBasicAuthUsers(
                getBasicAuthUsersVo.getBaseInfoVo().getAuthorization(),
                getBasicAuthUsersVo.getAppId()
        ), onGetResponseListener).get();
    }

    public void addBasicAuthUsers(AddBasicAuthUserVo addBasicAuthUserVo,
                                  OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<BasicAuthenticationSrv>>(service.addBasicAuthUsers(
                addBasicAuthUserVo.getBaseInfoVo().getAuthorization(),
                addBasicAuthUserVo.getAppId(),
                addBasicAuthUserVo.getBasicAuthenticationVo()
        ), onGetResponseListener).get();
    }


    public void deleteBasicAuthUsers(DeleteBasicAuthUsersVo deleteBasicAuthUsersVo,
                                     OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<BasicAuthenticationSrv>>(service.deleteBasicAuthUsers(
                deleteBasicAuthUsersVo.getBaseInfoVo().getAuthorization(),
                deleteBasicAuthUsersVo.getAppId(),
                deleteBasicAuthUsersVo.getBasicAuthId()
        ), onGetResponseListener).get();
    }

    public void getAvailablePortOptions(GetAvailablePortOptionsVo getAvailablePortOptionsVo,
                                        OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<String>>(service.getAvailablePortOptions(
                getAvailablePortOptionsVo.getBaseInfoVo().getAuthorization()
        ), onGetResponseListener).get();
    }


    public void getDomainRecords(GetDomainRecordsVo getDomainRecordsVo,
                                 OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<List<DomainRRSet>>(service.getDomainRecords(
                getDomainRecordsVo.getBaseInfoVo().getAuthorization(),
                getDomainRecordsVo.getDomain()
        ), onGetResponseListener).get();
    }

    public void addDomainRecord(AddDomainRecordVo addDomainRecordVo,
                                OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<Boolean>(service.addDomainRecord(
                addDomainRecordVo.getBaseInfoVo().getAuthorization(),
                addDomainRecordVo.getDomain(),
                addDomainRecordVo.getRecord()
        ), onGetResponseListener).get();
    }

    public void updateDomainRecord(UpdateDomainRecordVo updateDomainRecordVo,
                                   OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<Boolean>(service.updateDomainRecord(
                updateDomainRecordVo.getBaseInfoVo().getAuthorization(),
                updateDomainRecordVo.getDomain(),
                updateDomainRecordVo.getName(),
                updateDomainRecordVo.getType(),
                updateDomainRecordVo.getRecord()
        ), onGetResponseListener).get();
    }


    public void deleteDomainRecord(DeleteDomainRecordVo deleteDomainRecordVo,
                                   OnGetResponseListener onGetResponseListener) {
        PodSakku service = RetrofitUtil
                .getInstance()
                .create(PodSakku.class);
        new GetResult<Boolean>(service.deleteDomainRecord(
                deleteDomainRecordVo.getBaseInfoVo().getAuthorization(),
                deleteDomainRecordVo.getDomain(),
                deleteDomainRecordVo.getName(),
                deleteDomainRecordVo.getType()
        ), onGetResponseListener).get();
    }

}
