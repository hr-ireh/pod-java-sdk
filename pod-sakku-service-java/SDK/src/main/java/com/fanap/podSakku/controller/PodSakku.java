package com.fanap.podSakku.controller;

import com.fanap.podSakku.data.modelVo.*;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.service.Service;
import com.fanap.podSakku.util.OnGetResponseListener;
import com.fanap.podSakku.util.OnGetResponseListenerExportLogs;

/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class PodSakku {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();

    /**
     * get User Applications List.
     *
     * @param getUserApplicationsListVo
     * @param onGetResponseListener     A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                  InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getUserApplicationsList(GetUserApplicationsListVo getUserApplicationsListVo,
                                            OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getUserApplicationsList(getUserApplicationsListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * commit Application Container.
     *
     * @param commitApplicationContainerVo
     * @param onGetResponseListener        A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                     InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku commitApplicationContainer(CommitApplicationContainerVo commitApplicationContainerVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.commitApplicationContainer(commitApplicationContainerVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Real Time Deploy.
     *
     * @param getRealTimeDeployVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getRealTimeDeploy(GetRealTimeDeployVo getRealTimeDeployVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getRealTimeDeploy(getRealTimeDeployVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * logs Export with from/to date.
     *
     * @param logsExportVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku logsExport(LogsExportVo logsExportVo,
                               OnGetResponseListenerExportLogs onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.logsExport(logsExportVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Fake Application State.
     *
     * @param getFakeApplicationStateVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getFakeApplicationState(GetFakeApplicationStateVo getFakeApplicationStateVo,
                                            OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getFakeApplicationState(getFakeApplicationStateVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * rebuild Application.
     *
     * @param rebuildApplicationVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku rebuildApplication(RebuildApplicationVo rebuildApplicationVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.rebuildApplication(rebuildApplicationVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * create Application.
     *
     * @param createApplicationVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku createApplication(CreateApplicationVo createApplicationVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.createApplication(createApplicationVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * delete Application.
     *
     * @param deleteApplicationVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku deleteApplication(DeleteApplicationVo deleteApplicationVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deleteApplication(deleteApplicationVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update Application.
     *
     * @param updateApplicationVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku updateApplication(UpdateApplicationVo updateApplicationVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateApplication(updateApplicationVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * restart Application.
     *
     * @param restartApplicationVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku restartApplication(RestartApplicationVo restartApplicationVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.restartApplication(restartApplicationVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Application Setting.
     *
     * @param getApplicationSettingVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getApplicationSetting(GetApplicationSettingVo getApplicationSettingVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getApplicationSetting(getApplicationSettingVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * start Application By Id.
     *
     * @param startApplicationByIdVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku startApplicationById(StartApplicationByIdVo startApplicationByIdVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.startApplicationById(startApplicationByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * stop Application By Id.
     *
     * @param stopApplicationByIdVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku stopApplicationById(StopApplicationByIdVo stopApplicationByIdVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.stopApplicationById(stopApplicationByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * stop Application Deploy.
     *
     * @param stopApplicationDeployVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku stopApplicationDeploy(StopApplicationDeployVo stopApplicationDeployVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.stopApplicationDeploy(stopApplicationDeployVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Application Versions.
     *
     * @param getApplicationVersionsVo
     * @param onGetResponseListener    A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                 InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getApplicationVersions(GetApplicationVersionsVo getApplicationVersionsVo,
                                           OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getApplicationVersions(getApplicationVersionsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * create Application Webhooks.
     *
     * @param createApplicationWebhooksVo
     * @param onGetResponseListener       A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                    InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku createApplicationWebhooks(CreateApplicationWebhooksVo createApplicationWebhooksVo,
                                              OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.createApplicationWebhooks(createApplicationWebhooksVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Application By Id.
     *
     * @param getApplicationByIdVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getApplicationById(GetApplicationByIdVo getApplicationByIdVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getApplicationById(getApplicationByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Application Activity.
     *
     * @param getApplicationActivityVo
     * @param onGetResponseListener    A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                 InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getApplicationActivity(GetApplicationActivityVo getApplicationActivityVo,
                                           OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getApplicationActivity(getApplicationActivityVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Chat Data.
     *
     * @param getChatDataVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getChatData(GetChatDataVo getChatDataVo,
                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getChatData(getChatDataVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * check Application Health.
     *
     * @param checkApplicationHealthVo
     * @param onGetResponseListener    A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                 InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku checkApplicationHealth(CheckApplicationHealthVo checkApplicationHealthVo,
                                           OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.checkApplicationHealth(checkApplicationHealthVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * check Application Health.
     *
     * @param checkApplicationHealthByIdVo
     * @param onGetResponseListener        A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                     InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku checkApplicationHealthById(CheckApplicationHealthByIdVo checkApplicationHealthByIdVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.checkApplicationHealthById(checkApplicationHealthByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Application Collaborators.
     *
     * @param getApplicationCollaboratorsVo
     * @param onGetResponseListener       A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                    InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getApplicationCollaborators(GetApplicationCollaboratorsVo getApplicationCollaboratorsVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getApplicationCollaborators(getApplicationCollaboratorsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * add Application Collaborator.
     *
     * @param addApplicationCollaboratorVo
     * @param onGetResponseListener        A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                     InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku addApplicationCollaborator(AddApplicationCollaboratorVo addApplicationCollaboratorVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addApplicationCollaborator(addApplicationCollaboratorVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update App Collaborator.
     *
     * @param updateAppCollaboratorVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku updateAppCollaborator(UpdateAppCollaboratorVo updateAppCollaboratorVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateAppCollaborator(updateAppCollaboratorVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * delete App Collaborator.
     *
     * @param deleteAppCollaboratorVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku deleteAppCollaborator(DeleteAppCollaboratorVo deleteAppCollaboratorVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deleteAppCollaborator(deleteAppCollaboratorVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * verify User Command Permission.
     *
     * @param verifyUserCommandPermissionVo
     * @param onGetResponseListener         A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                      InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku verifyUserCommandPermission(VerifyUserCommandPermissionVo verifyUserCommandPermissionVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.verifyUserCommandPermission(verifyUserCommandPermissionVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get App Health Check.
     *
     * @param getAppHealthCheckVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getAppHealthCheck(GetAppHealthCheckVo getAppHealthCheckVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAppHealthCheck(getAppHealthCheckVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * add App Health Check.
     *
     * @param addAppHealthCheckVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku addAppHealthCheck(AddAppHealthCheckVo addAppHealthCheckVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addAppHealthCheck(addAppHealthCheckVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * delete All App Health Checks.
     *
     * @param deleteAllAppHealthChecksVo
     * @param onGetResponseListener      A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                   InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku deleteAllAppHealthChecks(DeleteAllAppHealthChecksVo deleteAllAppHealthChecksVo,
                                             OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deleteAllAppHealthChecks(deleteAllAppHealthChecksVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update Health Check By Id.
     *
     * @param updateHealthCheckByIdVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku updateHealthCheckById(UpdateHealthCheckByIdVo updateHealthCheckByIdVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateHealthCheckById(updateHealthCheckByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * delete Health Check ById.
     *
     * @param deleteHealthCheckByIdVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku deleteHealthCheckById(DeleteHealthCheckByIdVo deleteHealthCheckByIdVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deleteHealthCheckById(deleteHealthCheckByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Real Time App LogsSrv ById.
     *
     * @param getRealTimeAppLogsByIdVo
     * @param onGetResponseListener    A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                 InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getRealTimeAppLogsById(GetRealTimeAppLogsByIdVo getRealTimeAppLogsByIdVo,
                                           OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getRealTimeAppLogsById(getRealTimeAppLogsByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * transfer App By Id.
     *
     * @param transferAppByIdVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku transferAppById(TransferAppByIdVo transferAppByIdVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.transferAppById(transferAppByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get App WebHooks.
     *
     * @param getAppWebHooksVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getAppWebHooks(GetAppWebHooksVo getAppWebHooksVo,
                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAppWebHooks(getAppWebHooksVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get App Web Hook By Id.
     *
     * @param getAppWebHookByIdVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getAppWebHookById(GetAppWebHookByIdVo getAppWebHookByIdVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAppWebHookById(getAppWebHookByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * delete App Web Hook By Id.
     *
     * @param deleteAppWebHookByIdVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku deleteAppWebHookById(DeleteAppWebHookByIdVo deleteAppWebHookByIdVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deleteAppWebHookById(deleteAppWebHookByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Application By Name.
     *
     * @param getApplicationByNameVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getApplicationByName(GetApplicationByNameVo getApplicationByNameVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getApplicationByName(getApplicationByNameVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * create App By Docker Compose.
     *
     * @param createAppByDockerComposeVo
     * @param onGetResponseListener      A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                   InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku createAppByDockerCompose(CreateAppByDockerComposeVo createAppByDockerComposeVo,
                                             OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.createAppByDockerCompose(createAppByDockerComposeVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * create Pipeline.
     *
     * @param createPipelineVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku createPipeline(CreatePipelineVo createPipelineVo,
                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.createPipeline(createPipelineVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * create App By Machine Mechanism.
     *
     * @param createAppByMachineMechanismVo
     * @param onGetResponseListener         A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                      InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku createAppByMachineMechanism(CreateAppByMachineMechanismVo createAppByMachineMechanismVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.createAppByMachineMechanism(createAppByMachineMechanismVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get User Apps Status List.
     *
     * @param getUserAppsStatusListVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getUserAppsStatusList(GetUserAppsStatusListVo getUserAppsStatusListVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getUserAppsStatusList(getUserAppsStatusListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * stop App Deploy With Queue Id.
     *
     * @param stopAppDeployWithQueueIdVo
     * @param onGetResponseListener      A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                   InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku stopAppDeployWithQueueId(StopAppDeployWithQueueIdVo stopAppDeployWithQueueIdVo,
                                             OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.stopAppDeployWithQueueId(stopAppDeployWithQueueIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update App WebHook By Id.
     *
     * @param updateAppWebHookByIdVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku updateAppWebHookById(UpdateAppWebHookByIdVo updateAppWebHookByIdVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateAppWebHookById(updateAppWebHookByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Networks.
     *
     * @param getNetworksVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getNetworks(GetNetworksVo getNetworksVo,
                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getNetworks(getNetworksVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * delete Network By User.
     *
     * @param deleteNetworkByUserVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku deleteNetworkByUser(DeleteNetworkByUserVo deleteNetworkByUserVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deleteNetworkByUser(deleteNetworkByUserVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * add App To Network.
     *
     * @param addAppToNetworkVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku addAppToNetwork(AddAppToNetworkVo addAppToNetworkVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addAppToNetwork(addAppToNetworkVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * remove App From Network.
     *
     * @param removeAppFromNetworkVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku removeAppFromNetwork(RemoveAppFromNetworkVo removeAppFromNetworkVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.removeAppFromNetwork(removeAppFromNetworkVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * create Network.
     *
     * @param createNetworkVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku createNetwork(CreateNetworkVo createNetworkVo,
                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.createNetwork(createNetworkVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get All Catalogs.
     *
     * @param getAllCatalogsVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getAllCatalogs(GetAllCatalogsVo getAllCatalogsVo,
                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAllCatalogs(getAllCatalogsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update Catalog.
     *
     * @param updateCatalogVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku updateCatalog(UpdateCatalogVo updateCatalogVo,
                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateCatalog(updateCatalogVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Catalog App.
     *
     * @param getCatalogAppVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getCatalogApp(GetCatalogAppVo getCatalogAppVo,
                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getCatalogApp(getCatalogAppVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * create Catalog App.
     *
     * @param createCatalogAppVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku createCatalogApp(CreateCatalogAppVo createCatalogAppVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.createCatalogApp(createCatalogAppVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * create a new catalog app from existing sakku app.
     *
     * @param createCatalogAppBySakkuAppVo
     * @param onGetResponseListener      A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                   InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku createCatalogAppBySakkuApp(CreateCatalogAppBySakkuAppVo createCatalogAppBySakkuAppVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.createCatalogAppBySakkuApp(createCatalogAppBySakkuAppVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get all catalog app by id of catalogClass.
     *
     * @param getAllCatalogAppByIdVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getAllCatalogAppById(GetAllCatalogAppByIdVo getAllCatalogAppByIdVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAllCatalogAppById(getAllCatalogAppByIdVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get user feedback on catalogs.
     *
     * @param getUserFeedbackCatalogVo
     * @param onGetResponseListener    A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                 InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getUserFeedbackCatalog(GetUserFeedbackCatalogVo getUserFeedbackCatalogVo,
                                           OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getUserFeedbackCatalog(getUserFeedbackCatalogVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get All MetaData.
     *
     * @param addUserFeedbackCatalogsVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku addUserFeedbackCatalogs(AddUserFeedbackCatalogsVo addUserFeedbackCatalogsVo,
                                            OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addUserFeedbackCatalogs(addUserFeedbackCatalogsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get all metadata.
     *
     * @param getAllMetadataVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getAllMetaData(GetAllMetadataVo getAllMetadataVo,
                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAllMetaData(getAllMetadataVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Validate a metadata. Checks "name" and "scope".returns founded metadata or 404 BadRequestException.
     *
     * @param validateMetadataVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku validateMetaData(ValidateMetadataVo validateMetadataVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.validateMetaData(validateMetadataVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Create a new sakku app from existing catalog app.
     *
     * @param deployAppFromCatalogVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku deployAppFromCatalog(DeployAppFromCatalogVo deployAppFromCatalogVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deployAppFromCatalog(deployAppFromCatalogVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get all domains of user.
     *
     * @param getAllDomainsOfUserVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getAllDomainsOfUser(GetAllDomainsOfUserVo getAllDomainsOfUserVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAllDomainsOfUser(getAllDomainsOfUserVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get domains of app.
     *
     * @param getAppDomainsVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getAppDomains(GetAppDomainsVo getAppDomainsVo,
                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAppDomains(getAppDomainsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * remove domain of app.
     *
     * @param removeDomainVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku removeDomain(RemoveDomainVo removeDomainVo,
                                 OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.removeDomain(removeDomainVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * add domain of app.
     *
     * @param addDomainVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku addDomain(AddDomainVo addDomainVo,
                              OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addDomain(addDomainVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get basic authentication users for app.
     *
     * @param getBasicAuthUsersVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getBasicAuthUsers(GetBasicAuthUsersVo getBasicAuthUsersVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getBasicAuthUsers(getBasicAuthUsersVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * add a (list of) basic authentication user(s) for app. returns all authentications of app.
     *
     * @param addBasicAuthUserVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku addBasicAuthUsers(AddBasicAuthUserVo addBasicAuthUserVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addBasicAuthUsers(addBasicAuthUserVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * delete a basic authentication user of app by basicAuthId.
     *
     * @param deleteBasicAuthUsersVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku deleteBasicAuthUsers(DeleteBasicAuthUsersVo deleteBasicAuthUsersVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deleteBasicAuthUsers(deleteBasicAuthUsersVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get available/valid port options.
     *
     * @param getAvailablePortOptionsVo
     * @param onGetResponseListener     A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                  InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getAvailablePortOptions(GetAvailablePortOptionsVo getAvailablePortOptionsVo,
                                            OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAvailablePortOptions(getAvailablePortOptionsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get records of user domains.
     *
     * @param getDomainRecordsVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku getDomainRecords(GetDomainRecordsVo getDomainRecordsVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getDomainRecords(getDomainRecordsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * add record to domain.
     *
     * @param addDomainRecordVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku addDomainRecord(AddDomainRecordVo addDomainRecordVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addDomainRecord(addDomainRecordVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update record of domain.
     *
     * @param updateDomainRecordVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku updateDomainRecord(UpdateDomainRecordVo updateDomainRecordVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateDomainRecord(updateDomainRecordVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * delete record of domain by name and type that are unique.
     *
     * @param deleteDomainRecordVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSakku deleteDomainRecord(DeleteDomainRecordVo deleteDomainRecordVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.deleteDomainRecord(deleteDomainRecordVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

}

