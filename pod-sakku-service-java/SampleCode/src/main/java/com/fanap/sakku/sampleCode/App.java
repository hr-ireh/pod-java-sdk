package com.fanap.sakku.sampleCode;

import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.*;
import com.fanap.podSakku.data.modelVo.*;
import com.fanap.podSakku.enums.*;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import com.fanap.podSakku.util.OnGetResponseListenerExportLogs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class App {

    private static String TOKEN = "";

    public static void main(String[] args) {

//        getUserApplicationsList();
//        commitApplicationContainer();
//        getRealTimeDeploy();
//        logsExport();
//        getFakeApplicationState();
        rebuildApplication();
//        createApplication();
//        deleteApplication();
//        updateApplication();
//        restartApplication();
//        getApplicationSetting();
//        startApplicationById();
//        stopApplicationById();
//        stopApplicationDeploy();
//        getApplicationVersions();
//        createApplicationWebhooks();
//        getApplicationById();
//        getApplicationActivity();
//        getChatData();
//        checkApplicationHealth();
//        checkApplicationHealthById();
//        getApplicationCollaborators();
//        addApplicationCollaborator();
//        updateAppCollaborator();
//        deleteAppCollaborator();
//        verifyUserCommandPermission();
//        getAppHealthCheck();
//        addAppHealthCheck();
//        deleteAllAppHealthChecks();
//        updateHealthCheckById();
//        deleteHealthCheckById();
//        getRealTimeAppLogsById();
//        transferAppById();
//        getAppWebHooks();
//        getAppWebHookById();
//        deleteAppWebHookById();
//        getApplicationByName();
//        createAppByDockerCompose();
//        createPipeline();
//        createAppByMachineMechanism();
//        getUserAppsStatusList();
//        stopAppDeployWithQueueId();
//        updateAppWebHookById();
//        getNetworks();
//        addAppToNetwork();
//        removeAppFromNetwork();
//        createNetwork();
//        getAllCatalogs();
//        updateCatalog();
//        getCatalogApp();
//        createCatalogApp();
//        createCatalogAppBySakkuApp();
//        getAllCatalogAppById();
//        getUserFeedbackCatalog();
//        addUserFeedbackCatalogs();
//        getAllMetaData();
//        validateMetaData();
//        deployAppFromCatalog();
//        getAllDomainOfUser();
//        getAppDomains();
//        removeDomain();
//        addDomain();
//        getBasicAuthUsers();
//        addBasicAuthUsers();
//        deleteBasicAuthUsers();
//        getAvailablePortOptions();
//        getDomainRecords();
//        addDomainRecords();
//        updateDomainRecords();
//        deleteDomainRecords();
    }

    private static void getUserApplicationsList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetUserApplicationsListVo getUserApplicationsListVo = new GetUserApplicationsListVo.Builder(baseInfoVo)
                    .setPage(1)
                    .build();
            podSakku.getUserApplicationsList(getUserApplicationsListVo, new OnGetResponseListener<List<ApplicationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ApplicationSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void commitApplicationContainer() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CommitApplicationContainerVo commitApplicationContainerVo = new CommitApplicationContainerVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.commitApplicationContainer(commitApplicationContainerVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getRealTimeDeploy() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetRealTimeDeployVo getRealTimeDeployVo = new GetRealTimeDeployVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.getRealTimeDeploy(getRealTimeDeployVo, new OnGetResponseListener<DeployStateSrv>() {
                @Override
                public void onResponse(ResultVo<DeployStateSrv> result) {
                    System.out.println(result.getResult().getSteps().get(0).getTitle());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void logsExport() {
        PodSakku podSakku = new PodSakku();
        try {
            LogsExportVo logsExportVo = new LogsExportVo.Builder()
                    .setAppId(2664L)
                    .setToken(TOKEN)
                    .setSaveTo("logs1111.txt")
                    .build();
            podSakku.logsExport(logsExportVo, new OnGetResponseListenerExportLogs() {
                @Override
                public void onResponse(String result) {
                    System.out.println(result);
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getFakeApplicationState() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetFakeApplicationStateVo getFakeApplicationStateVo = new GetFakeApplicationStateVo.Builder(baseInfoVo)
                    .setAppId(2212L)
                    .build();
            podSakku.getFakeApplicationState(getFakeApplicationStateVo, new OnGetResponseListener<DeployStateSrv>() {
                @Override
                public void onResponse(ResultVo<DeployStateSrv> result) {
                    System.out.println(result.getResult().getTitle());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void rebuildApplication() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            RebuildApplicationVo rebuildApplicationVo = new RebuildApplicationVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.rebuildApplication(rebuildApplicationVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void createApplication() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        ApplicationGitVo applicationGitVo = new ApplicationGitVo();
        applicationGitVo.setUrl("https://gitlab.com/negarnegma/testbuildmaz.git");
        applicationGitVo.setDockerFile("Dockerfile");
        applicationGitVo.setUsername("negarnegma");
        applicationGitVo.setAccessToken("rJC7f9uz-2gvQbSxeuRu");
//        applicationGitVo.setType(2);
        ConfigContentVo configContentVo = null;
        try {
            configContentVo = new ConfigContentVo.Builder()
                    .setName("z58hkfyjfk")
                    .setMem(1)
                    .setCpu(1)
                    .setScalingMode("OFF")
                    .setDeployType(EnumDeployType.CODE)
                    .setGit(applicationGitVo)
                    .setDisk(1)
                    .build();
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        try {
            CreateApplicationVo createApplicationVo = new CreateApplicationVo.Builder(baseInfoVo)
                    .setConfig(configContentVo)
                    .build();
            podSakku.createApplication(createApplicationVo, new OnGetResponseListener<CreateApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<CreateApplicationSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void deleteApplication() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteApplicationVo deleteApplicationVo = new DeleteApplicationVo.Builder(baseInfoVo)
                    .setAppId(2212L)
                    .build();
            podSakku.deleteApplication(deleteApplicationVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void updateApplication() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        ApplicationGitVo applicationGitVo = new ApplicationGitVo();
        applicationGitVo.setUrl("https://gitlab.com/negarnegma/testbuildmaz.git");
        applicationGitVo.setDockerFile("Dockerfile");
        applicationGitVo.setUsername("negarnegma");
        applicationGitVo.setAccessToken("rJC7f9uz-2gvQbSxeuRu");
//        applicationGitVo.setType(2);
        UpdateConfigVo updateConfigVo = new UpdateConfigVo();
        updateConfigVo.setCpu(2);
        updateConfigVo.setScalingMode("OFF");
        updateConfigVo.setGit(applicationGitVo);
        updateConfigVo.setDisk(2);
        try {
            UpdateApplicationVo updateApplicationVo = new UpdateApplicationVo.Builder(baseInfoVo)
                    .setAppId(2306L)
                    .setBody(updateConfigVo)
                    .build();
            podSakku.updateApplication(updateApplicationVo, new OnGetResponseListener<UpdateConfSrv>() {
                @Override
                public void onResponse(ResultVo<UpdateConfSrv> result) {
                    System.out.println(result.getResult().getDisk());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void restartApplication() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            RestartApplicationVo restartApplicationVo = new RestartApplicationVo.Builder(baseInfoVo)
                    .setAppId(2306L)
                    .build();
            podSakku.restartApplication(restartApplicationVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getApplicationSetting() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationSettingVo getApplicationSettingVo = new GetApplicationSettingVo.Builder(baseInfoVo)
                    .setAppId(2306L)
                    .build();
            podSakku.getApplicationSetting(getApplicationSettingVo, new OnGetResponseListener<AppInfoSrv>() {
                @Override
                public void onResponse(ResultVo<AppInfoSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void startApplicationById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            StartApplicationByIdVo startApplicationByIdVo = new StartApplicationByIdVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.startApplicationById(startApplicationByIdVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void stopApplicationById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            StopApplicationByIdVo stopApplicationByIdVo = new StopApplicationByIdVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.stopApplicationById(stopApplicationByIdVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void stopApplicationDeploy() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            StopApplicationDeployVo stopApplicationDeployVo = new StopApplicationDeployVo.Builder(baseInfoVo)
                    .setAppId(2444L)
                    .build();
            podSakku.stopApplicationDeploy(stopApplicationDeployVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getApplicationVersions() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationVersionsVo getApplicationVersionsVo = new GetApplicationVersionsVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.getApplicationVersions(getApplicationVersionsVo, new OnGetResponseListener<List<DockerTagsSrv>>() {
                @Override
                public void onResponse(ResultVo<List<DockerTagsSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void createApplicationWebhooks() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookContentVo webhookContentVo = new WebhookContentVo();
        webhookContentVo.setApplicationId(2338L);
        webhookContentVo.setSecured(true);
        webhookContentVo.setTopics("delete");
        webhookContentVo.setUrl("192.168.6.22:8088");
        try {
            CreateApplicationWebhooksVo createApplicationWebhooksVo = new CreateApplicationWebhooksVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .setWebhookVO(webhookContentVo)
                    .build();
            podSakku.createApplicationWebhooks(createApplicationWebhooksVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getApplicationById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationByIdVo getApplicationByIdVo = new GetApplicationByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.getApplicationById(getApplicationByIdVo, new OnGetResponseListener<ApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationSrv> result) {
                    System.out.println(result.getResult().getInstances().get(0).getContainerId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getApplicationActivity() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationActivityVo getApplicationActivityVo = new GetApplicationActivityVo.Builder(baseInfoVo)
                    .setId(2306L)
                    .build();
            podSakku.getApplicationActivity(getApplicationActivityVo, new OnGetResponseListener<List<ActivitySrv>>() {
                @Override
                public void onResponse(ResultVo<List<ActivitySrv>> result) {
                    System.out.println(result.getResult().get(0).getAppName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getChatData() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxOTciLCJyb2xlIjpbIlJPTEVfVVNFUiJdLCJpc3MiOiJTQUtLVS1JU1MiLCJwb2Rzc29fdG9rZW4iOiJmYTdlM2EyZDg2Njk0YWUyOTBkN2FkNTdjNzdiMDgyMCIsImV4cCI6MTU4NTIwMzI4MX0.y2TZjmr7sY99uK6NZDT5KiCSQB9TuKMobzwGtciOd7wHPihFSToGjdP9zuZZS05eighfUoY_3DM2IAQrDAZ7mg")
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetChatDataVo getChatDataVo = new GetChatDataVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.getChatData(getChatDataVo, new OnGetResponseListener<ChatCredentialSrv>() {
                @Override
                public void onResponse(ResultVo<ChatCredentialSrv> result) {
                    System.out.println(result.getResult().getThreadId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void checkApplicationHealth() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CheckApplicationHealthVo checkApplicationHealthVo = new CheckApplicationHealthVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.checkApplicationHealth(checkApplicationHealthVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void checkApplicationHealthById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CheckApplicationHealthByIdVo checkApplicationHealthByIdVo = new CheckApplicationHealthByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setHid(44L)
                    .build();
            podSakku.checkApplicationHealthById(checkApplicationHealthByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getLastStatus());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getApplicationCollaborators() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationCollaboratorsVo getApplicationCollaboratorsVo = new GetApplicationCollaboratorsVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.getApplicationCollaborators(getApplicationCollaboratorsVo, new OnGetResponseListener<List<ApplicationAccessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ApplicationAccessSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void addApplicationCollaborator() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            AddApplicationCollaboratorVo addApplicationCollaboratorVo = new AddApplicationCollaboratorVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setAccessRequestVO(accessRequestContentVo)
                    .build();
            podSakku.addApplicationCollaborator(addApplicationCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void updateAppCollaborator() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            UpdateAppCollaboratorVo updateAppCollaboratorVo = new UpdateAppCollaboratorVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setAccessRequestVO(accessRequestContentVo)
                    .setCid(135L)
                    .build();
            podSakku.updateAppCollaborator(updateAppCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void deleteAppCollaborator() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteAppCollaboratorVo deleteAppCollaboratorVo = new DeleteAppCollaboratorVo.Builder(baseInfoVo)
                    .setCid(135L)
                    .setId(2338L)
                    .build();
            podSakku.deleteAppCollaborator(deleteAppCollaboratorVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void verifyUserCommandPermission() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            VerifyUserCommandPermissionVo verifyUserCommandPermissionVo = new VerifyUserCommandPermissionVo.Builder(baseInfoVo)
                    .setCmd("cd")
                    .setId(2338L)
                    .build();
            podSakku.verifyUserCommandPermission(verifyUserCommandPermissionVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void getAppHealthCheck() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAppHealthCheckVo getAppHealthCheckVo = new GetAppHealthCheckVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.getAppHealthCheck(getAppHealthCheckVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void addAppHealthCheck() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        HealthCheckVo healthCheckVo = new HealthCheckVo();
        healthCheckVo.setScheme("http");
        healthCheckVo.setEndpoint("/ping");
        healthCheckVo.setResponseString("pong");
        try {
            AddAppHealthCheckVo addAppHealthCheckVo = new AddAppHealthCheckVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setHealthCheckVoVO(healthCheckVo)
                    .build();
            podSakku.addAppHealthCheck(addAppHealthCheckVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void deleteAllAppHealthChecks() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteAllAppHealthChecksVo deleteAllAppHealthChecksVo = new DeleteAllAppHealthChecksVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setPath("/ping")
                    .build();
            podSakku.deleteAllAppHealthChecks(deleteAllAppHealthChecksVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void updateHealthCheckById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        HealthCheckVo healthCheckVo = new HealthCheckVo();
        healthCheckVo.setScheme("http");
        healthCheckVo.setEndpoint("/ping");
        healthCheckVo.setResponseString("pong");
        try {
            UpdateHealthCheckByIdVo updateHealthCheckByIdVo = new UpdateHealthCheckByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setHid(41L)
                    .setUpdateRequest(healthCheckVo)
                    .build();
            podSakku.updateHealthCheckById(updateHealthCheckByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void deleteHealthCheckById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteHealthCheckByIdVo deleteHealthCheckByIdVo = new DeleteHealthCheckByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setHid(43L)
                    .build();
            podSakku.deleteHealthCheckById(deleteHealthCheckByIdVo, new OnGetResponseListener<HealthCheckSrv>() {
                @Override
                public void onResponse(ResultVo<HealthCheckSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getRealTimeAppLogsById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetRealTimeAppLogsByIdVo getRealTimeAppLogsByIdVo = new GetRealTimeAppLogsByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setTime(System.currentTimeMillis())
                    .build();
            podSakku.getRealTimeAppLogsById(getRealTimeAppLogsByIdVo, new OnGetResponseListener<DockerLogsSrv>() {
                @Override
                public void onResponse(ResultVo<DockerLogsSrv> result) {
                    System.out.println(result.getResult().getStart());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void transferAppById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        TransferRequestVo transferRequestVo = new TransferRequestVo();
        transferRequestVo.setCustomerEmail("zmazloom@pod.ir");
        transferRequestVo.setTransferImageRepo(true);
        try {
            TransferAppByIdVo transferAppByIdVo = new TransferAppByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setRequestVO(transferRequestVo)
                    .build();
            podSakku.transferAppById(transferAppByIdVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getAppWebHooks() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAppWebHooksVo getAppWebHooksVo = new GetAppWebHooksVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.getAppWebHooks(getAppWebHooksVo, new OnGetResponseListener<List<WebhookSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WebhookSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getAppWebHookById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookVo webhookVo = new WebhookVo();
        webhookVo.setSecured(false);
        webhookVo.setUrl("192.168.6.22:8088");
        webhookVo.setApplicationId(2338L);
        try {
            GetAppWebHookByIdVo getAppWebHookByIdVo = new GetAppWebHookByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setWid(10L)
                    .setVo(webhookVo)
                    .build();
            podSakku.getAppWebHookById(getAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void deleteAppWebHookById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteAppWebHookByIdVo deleteAppWebHookByIdVo = new DeleteAppWebHookByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setWid(10L)
                    .build();
            podSakku.deleteAppWebHookById(deleteAppWebHookByIdVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getApplicationByName() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationByNameVo getApplicationByNameVo = new GetApplicationByNameVo.Builder(baseInfoVo)
                    .setName("elhamapp1")
                    .build();
            podSakku.getApplicationByName(getApplicationByNameVo, new OnGetResponseListener<ApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void createAppByDockerCompose() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CreateAppByDockerComposeVo createAppByDockerComposeVo = new CreateAppByDockerComposeVo.Builder(baseInfoVo)
                    .setComposeFile("docker-compose.yml")
                    .build();
            podSakku.createAppByDockerCompose(createAppByDockerComposeVo, new OnGetResponseListener<AppGroupSrv>() {
                @Override
                public void onResponse(ResultVo<AppGroupSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void createPipeline() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        ApplicationGitVo applicationGitVo = new ApplicationGitVo();
        ApplicationImageVo image = new ApplicationImageVo();
        image.setRegistry("nginx");
        image.setName("Docker Hub");
        applicationGitVo.setImageName("nginx");
//        applicationGitVo.setDockerFile("Dockerfile");
//        applicationGitVo.setUsername("negarnegma");
//        applicationGitVo.setAccessToken("rJC7f9uz-2gvQbSxeuRu");
        ConfigContentVo configContentVo = null;
        ConfigContentVo configContentVo1 = null;
        PortVo portVo = new PortVo();
        portVo.setPort(80);
        List<PortVo> portVos = new ArrayList<>();
        portVos.add(portVo);
        try {
            configContentVo = new ConfigContentVo.Builder()
                    .setName("zahra10")
                    .setMem(1)
                    .setCpu(1)
                    .setDeployType(EnumDeployType.DOCKER_IMAGE)
                    .setGit(applicationGitVo)
                    .setDisk(1)
                    .setPortVos(portVos)
                    .setImage(image)
                    .build();
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        try {
            configContentVo1 = new ConfigContentVo.Builder()
                    .setName("zahra11")
                    .setMem(1)
                    .setCpu(1)
                    .setDeployType(EnumDeployType.DOCKER_IMAGE)
                    .setGit(applicationGitVo)
                    .setDisk(1)
                    .setPortVos(portVos)
                    .setImage(image)
                    .build();
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        List<ConfigContentVo> configContentVos = new ArrayList<>();
        configContentVos.add(configContentVo);
        configContentVos.add(configContentVo1);
        try {
            CreatePipelineVo createPipelineVo = new CreatePipelineVo.Builder(baseInfoVo)
                    .setConfig(configContentVos)
                    .build();
            podSakku.createPipeline(createPipelineVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getMessage());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void createAppByStateMachine() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        ApplicationBaseConfig applicationBaseConfig = new ApplicationBaseConfig();
        applicationBaseConfig.setDeployType(EnumDeployType.DOCKER_IMAGE);
        ApplicationImageVo image = new ApplicationImageVo();
        image.setRegistry("nginx");
        image.setName("Docker Hub");
        applicationBaseConfig.setImage(image);
        applicationBaseConfig.setName("zahra1000");
        List<PortMapping> ports = new ArrayList<>();
        PortMapping portMapping = new PortMapping();
        portMapping.setPort(80);
        ports.add(portMapping);
        applicationBaseConfig.setPorts(ports);
        applicationBaseConfig.setDisk(1);
        applicationBaseConfig.setCpu(1);
        applicationBaseConfig.setMem(1);
        try {
            CreateAppByStateMachineVo createAppByStateMachineVo = new CreateAppByStateMachineVo.Builder(baseInfoVo)
                    .setConfig(applicationBaseConfig)
                    .build();
            podSakku.createAppByStateMachine(createAppByStateMachineVo, new OnGetResponseListener<ApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getUserAppsStatusList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetUserAppsStatusListVo getUserAppsStatusListVo = new GetUserAppsStatusListVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.getUserAppsStatusList(getUserAppsStatusListVo, new OnGetResponseListener<List<AppStatusChangeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AppStatusChangeSrv>> result) {
                    System.out.println(result.getResult().get(0).getStatus());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void stopAppDeployWithQueueId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            StopAppDeployWithQueueIdVo stopAppDeployWithQueueIdVo = new StopAppDeployWithQueueIdVo.Builder(baseInfoVo)
                    .setDeployQueueId("8aa31651-5704-4682-bb07-8ebedfdc4b1e")
                    .build();
            podSakku.stopAppDeployWithQueueId(stopAppDeployWithQueueIdVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void updateAppWebHookById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookContentVo webhookContentVo = new WebhookContentVo();
        webhookContentVo.setApplicationId(2338L);
        webhookContentVo.setSecured(true);
        webhookContentVo.setTopics("delete");
        webhookContentVo.setUrl("192.168.6.22:8088");
        try {
            UpdateAppWebHookByIdVo updateAppWebHookByIdVo = new UpdateAppWebHookByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setVo(webhookContentVo)
                    .setWid(10L)
                    .build();
            podSakku.updateAppWebHookById(updateAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getNetworks() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetNetworksVo getNetworksVo = new GetNetworksVo.Builder(baseInfoVo)
                    .build();
            podSakku.getNetworks(getNetworksVo, new OnGetResponseListener<List<AppNetworkSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AppNetworkSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void deleteNetworkByUser() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteNetworkByUserVo deleteNetworkByUserVo = new DeleteNetworkByUserVo.Builder(baseInfoVo)
                    .setName("default_user_network_197")
                    .setForce(false)
                    .build();
            podSakku.deleteNetworkByUser(deleteNetworkByUserVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void addAppToNetwork() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddAppToNetworkVo addAppToNetworkVo = new AddAppToNetworkVo.Builder(baseInfoVo)
                    .setName("testCreateNetwork")
                    .setAppId(2443L)
                    .build();
            podSakku.addAppToNetwork(addAppToNetworkVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void removeAppFromNetwork() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            RemoveAppFromNetworkVo removeAppFromNetworkVo = new RemoveAppFromNetworkVo.Builder(baseInfoVo)
                    .setName("default_user_network_197")
                    .setAppId(2443L)
                    .build();
            podSakku.removeAppFromNetwork(removeAppFromNetworkVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void createNetwork() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CreateNetworkVo createNetworkVo = new CreateNetworkVo.Builder(baseInfoVo)
                    .setName("testCreateNetwork")
                    .build();
            podSakku.createNetwork(createNetworkVo, new OnGetResponseListener<AppNetworkSrv>() {
                @Override
                public void onResponse(ResultVo<AppNetworkSrv> result) {
                    System.out.println(result.getResult().getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getAllCatalogs() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllCatalogsVo getAllCatalogsVo = new GetAllCatalogsVo.Builder(baseInfoVo)
                    .build();
            podSakku.getAllCatalogs(getAllCatalogsVo, new OnGetResponseListener<List<CatalogClassSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogClassSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void updateCatalog() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogUpdate catalogUpdate = new CatalogUpdate();
        catalogUpdate.setName("zahratest");
        catalogUpdate.setMetadata(new ArrayList<CatalogAppMetadata>() {
        });
        try {
            UpdateCatalogVo updateCatalogVo = new UpdateCatalogVo.Builder(baseInfoVo)
                    .setCatalogAppId(63L)
                    .setCatalogUpdate(catalogUpdate)
                    .build();
            podSakku.updateCatalog(updateCatalogVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
                    System.out.println(result.getResult().getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getCatalogApp() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetCatalogAppVo getCatalogAppVo = new GetCatalogAppVo.Builder(baseInfoVo)
                    .setCatalogAppId(63L)
                    .setCatalogId(4L)
                    .build();
            podSakku.getCatalogApp(getCatalogAppVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
                    System.out.println(result.getResult().getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void createCatalogApp() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AddCatalogAppVo addCatalogAppVo = new AddCatalogAppVo();
        addCatalogAppVo.setName("testZahra");
        addCatalogAppVo.setDescription("test zahra");
        addCatalogAppVo.setPrice(0);
        addCatalogAppVo.setDeployLimitCount(1000);
        ApplicationBaseConfig config = new ApplicationBaseConfig();
        config.setCpu(1);
        config.setDisk(1);
        config.setMem(1);
        config.setName("testzahra21");
        PortMapping port = new PortMapping();
        port.setPort(80);
        port.setProtocol(EnumProtocol.HTTP);
        port.setSsl(false);
        port.setBasicAuthentication(false);
        port.setBasicAuthentication(false);
        List<PortMapping> ports = new ArrayList<>();
        ports.add(port);
        config.setPorts(ports);
        addCatalogAppVo.setConfig(config);
        addCatalogAppVo.setMetadata(new ArrayList<CatalogAppMetadata>());
        try {
            CreateCatalogAppVo createCatalogAppVo = new CreateCatalogAppVo.Builder(baseInfoVo)
                    .setCatalogId(4L)
                    .setAddCatalogAppVo(addCatalogAppVo)
                    .build();
            podSakku.createCatalogApp(createCatalogAppVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void createCatalogAppBySakkuApp() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AddCatalogAppVo addCatalogAppVo = new AddCatalogAppVo();
        addCatalogAppVo.setName("testZahra3");
        addCatalogAppVo.setDescription("test zahra 3");
        addCatalogAppVo.setPrice(0);
        addCatalogAppVo.setDeployLimitCount(1000);
        ApplicationBaseConfig config = new ApplicationBaseConfig();
        config.setCpu(1);
        config.setDisk(1);
        config.setMem(1);
        config.setName("testzahra21");
        PortMapping port = new PortMapping();
        port.setPort(80);
        port.setProtocol(EnumProtocol.HTTP);
        port.setSsl(false);
        port.setBasicAuthentication(false);
        port.setBasicAuthentication(false);
        List<PortMapping> ports = new ArrayList<>();
        ports.add(port);
        config.setPorts(ports);
        addCatalogAppVo.setConfig(config);
        addCatalogAppVo.setMetadata(new ArrayList<CatalogAppMetadata>());
        try {
            CreateCatalogAppBySakkuAppVo createCatalogAppBySakkuAppVo = new CreateCatalogAppBySakkuAppVo.Builder(baseInfoVo)
                    .setCatalogId(4L)
                    .setAddCatalogAppVo(addCatalogAppVo)
                    .setAppId(2443L)
                    .build();
            podSakku.createCatalogAppBySakkuApp(createCatalogAppBySakkuAppVo, new OnGetResponseListener<CatalogAppFullSrv>() {
                @Override
                public void onResponse(ResultVo<CatalogAppFullSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void getAllCatalogAppById() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllCatalogAppByIdVo getAllCatalogAppByIdVo = new GetAllCatalogAppByIdVo.Builder(baseInfoVo)
                    .setId(4L)
                    .build();
            podSakku.getAllCatalogAppById(getAllCatalogAppByIdVo, new OnGetResponseListener<List<CatalogAppFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogAppFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getUserFeedbackCatalog() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetUserFeedbackCatalogVo getUserFeedbackCatalogVo = new GetUserFeedbackCatalogVo.Builder(baseInfoVo)
                    .setStatus(false)
                    .build();
            podSakku.getUserFeedbackCatalog(getUserFeedbackCatalogVo, new OnGetResponseListener<List<CatalogAppFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogAppFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void addUserFeedbackCatalogs() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogFeedbackVo catalogFeedbackVo = new CatalogFeedbackVo();
        catalogFeedbackVo.setType(EnumCatalogFeedbackType.PROBLEM);
//        catalogFeedbackVo.setId(63L);
        catalogFeedbackVo.setSubject("problem");
        catalogFeedbackVo.setDescription("test SDK");
        try {
            AddUserFeedbackCatalogsVo addUserFeedbackCatalogsVo = new AddUserFeedbackCatalogsVo.Builder(baseInfoVo)
                    .setCatalogFeedbackVo(catalogFeedbackVo)
                    .build();
            podSakku.addUserFeedbackCatalogs(addUserFeedbackCatalogsVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getAllMetaData() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllMetadataVo getAllMetadataVo = new GetAllMetadataVo.Builder(baseInfoVo)
                    .setPage(1)
                    .setSize(10)
                    .build();
            podSakku.getAllMetaData(getAllMetadataVo, new OnGetResponseListener<List<CatalogMetadata>>() {
                @Override
                public void onResponse(ResultVo<List<CatalogMetadata>> result) {
                    System.out.println(result.getResult().get(0).getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void validateMetaData() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogMetadata catalogMetadata = new CatalogMetadata();
        catalogMetadata.setDescription("test sdk");
        catalogMetadata.setName("version");
        catalogMetadata.setScope(CatalogMetadataScope.CONFIG);
        try {
            ValidateMetadataVo validateMetadataVo = new ValidateMetadataVo.Builder(baseInfoVo)
                    .setMetadataVO(catalogMetadata)
                    .build();
            podSakku.validateMetaData(validateMetadataVo, new OnGetResponseListener<CatalogMetadata>() {
                @Override
                public void onResponse(ResultVo<CatalogMetadata> result) {
                    System.out.println(result.getResult().getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void deployAppFromCatalog() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        DeployCatalogVo deployCatalogVo = new DeployCatalogVo();
        deployCatalogVo.setCpu(1);
        deployCatalogVo.setDisk(1);

        try {
            DeployAppFromCatalogVo deployAppFromCatalogVo = new DeployAppFromCatalogVo.Builder(baseInfoVo)
                    .setCatalogAppId(21L)
                    .setSettings("{\n" +
                            " \"name\": \"newapp\",\n" +
                            " \"mem\": 1,\n" +
                            " \"cpu\": 0.2,\n" +
                            " \"disk\": 2,\n" +
                            " \"metadata\": [\n" +
                            "  {\n" +
                            "   \"name\": \"version\",\n" +
                            "   \"scope\": \"CONFIG\",\n" +
                            "   \"value\": \"latest\"\n" +
                            "  }\n" +
                            " ]\n" +
                            "}")
                    .build();
            podSakku.deployAppFromCatalog(deployAppFromCatalogVo, new OnGetResponseListener<ApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getAllDomainOfUser() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllDomainsOfUserVo getAllDomainsOfUserVo = new GetAllDomainsOfUserVo.Builder(baseInfoVo)
                    .build();
            podSakku.getAllDomainsOfUser(getAllDomainsOfUserVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getAppDomains() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAppDomainsVo getAppDomainsVo = new GetAppDomainsVo.Builder(baseInfoVo)
                    .setAppId(2664L)
                    .build();
            podSakku.getAppDomains(getAppDomainsVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void removeDomain() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            RemoveDomainVo removeDomainVo = new RemoveDomainVo.Builder(baseInfoVo)
                    .setAppId(2664L)
                    .setDomain("test8.com")
                    .build();
            podSakku.removeDomain(removeDomainVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void addDomain() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddDomainVo addDomainVo = new AddDomainVo.Builder(baseInfoVo)
                    .setAppId(2664L)
                    .setDomain("test8.com")
                    .build();
            podSakku.addDomain(addDomainVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult().get(0).getDomain());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getBasicAuthUsers() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetBasicAuthUsersVo getBasicAuthUsersVo = new GetBasicAuthUsersVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.getBasicAuthUsers(getBasicAuthUsersVo, new OnGetResponseListener<List<BasicAuthenticationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BasicAuthenticationSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void addBasicAuthUsers() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        BasicAuthenticationVo basicAuthenticationVo = new BasicAuthenticationVo();
        basicAuthenticationVo.setUsername("user");
        basicAuthenticationVo.setPassword("pass");
        List<BasicAuthenticationVo> basicAuthenticationVos = new ArrayList<>();
        basicAuthenticationVos.add(basicAuthenticationVo);
        try {
            AddBasicAuthUserVo addBasicAuthUserVo = new AddBasicAuthUserVo.Builder(baseInfoVo)
                    .setAppId(2420L)
                    .setBasicAuthenticationVo(basicAuthenticationVos)
                    .build();
            podSakku.addBasicAuthUsers(addBasicAuthUserVo, new OnGetResponseListener<List<BasicAuthenticationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BasicAuthenticationSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void deleteBasicAuthUsers() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteBasicAuthUsersVo deleteBasicAuthUsersVo = new DeleteBasicAuthUsersVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .setBasicAuthId(42L)
                    .build();
            podSakku.deleteBasicAuthUsers(deleteBasicAuthUsersVo, new OnGetResponseListener<List<BasicAuthenticationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BasicAuthenticationSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void getAvailablePortOptions() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAvailablePortOptionsVo getAvailablePortOptionsVo = new GetAvailablePortOptionsVo.Builder(baseInfoVo)
                    .build();
            podSakku.getAvailablePortOptions(getAvailablePortOptionsVo, new OnGetResponseListener<List<String>>() {
                @Override
                public void onResponse(ResultVo<List<String>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void getDomainRecords() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetDomainRecordsVo getDomainRecordsVo = new GetDomainRecordsVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .build();
            podSakku.getDomainRecords(getDomainRecordsVo, new OnGetResponseListener<List<DomainRRSet>>() {
                @Override
                public void onResponse(ResultVo<List<DomainRRSet>> result) {
                    System.out.println(result.getResult().get(0).getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void addDomainRecords() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        DomainRecord domainRecord = new DomainRecord();
        domainRecord.setContent("ns.sakku.cloud. hostmaster.sakku.cloud. 2019112302 5400 1800 302400 1800");
        domainRecord.setDisabled(false);
        List<DomainRecord> domainRecords = new ArrayList<>();
        domainRecords.add(domainRecord);
        DomainRRSet domainRRSet = new DomainRRSet();
        domainRRSet.setName("testk");
        domainRRSet.setTtl(1);
        domainRRSet.setType("SOA");
        domainRRSet.setRecords(domainRecords);
        try {
            AddDomainRecordVo addDomainRecordVo = new AddDomainRecordVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .setRecord(domainRRSet)
                    .build();
            podSakku.addDomainRecord(addDomainRecordVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void updateDomainRecords() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        DomainRecord domainRecord = new DomainRecord();
        domainRecord.setContent("ns.sakku.cloud. hostmaster.sakku.cloud. 2019112302 5400 1800 302400 1800");
        domainRecord.setDisabled(false);
        List<DomainRecord> domainRecords = new ArrayList<>();
        domainRecords.add(domainRecord);
        DomainRRSet domainRRSet = new DomainRRSet();
//        domainRRSet.setName("testSDk");
        domainRRSet.setTtl(1);
        domainRRSet.setType("SOA");
        domainRRSet.setRecords(domainRecords);
        try {
            UpdateDomainRecordVo updateDomainRecordVo = new UpdateDomainRecordVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .setRecord(domainRRSet)
                    .setName("testk")
                    .setType(EnumRecordType.SOA)
                    .build();
            podSakku.updateDomainRecord(updateDomainRecordVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void deleteDomainRecords() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteDomainRecordVo deleteDomainRecordVo = new DeleteDomainRecordVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .setName("testk")
                    .setType(EnumRecordType.SOA)
                    .build();
            podSakku.deleteDomainRecord(deleteDomainRecordVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
