package com.fanap.podDealing.controller;

import com.fanap.podDealing.data.modelVo.*;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.service.Service;
import com.fanap.podDealing.util.OnGetResponseListener;

/**
 * Created by Z.gholinia on 8/11/2019.
 */
public class PodDealing {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();


    /**
     * add user and business .
     *
     * @param addUserAndBusinessVO
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing addUserAndBusiness(AddUserAndBusinessVo addUserAndBusinessVO,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addUserAndBusiness(addUserAndBusinessVO, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * list user created business .
     *
     * @param listUserCreatedBusinessVo
     * @param onGetResponseListener     A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                  InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing listUserCreatedBusiness(ListUserCreatedBusinessVo listUserCreatedBusinessVo,
                                              OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.listUserCreatedBusiness(listUserCreatedBusinessVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update business  .
     *
     * @param updateBusinessVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing updateBusiness(UpdateBusinessVo updateBusinessVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateBusiness(updateBusinessVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get ApiToken for created business  .
     *
     * @param getApiTokenForCreatedBusinessVo
     * @param onGetResponseListener           A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                        InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing getApiTokenForCreatedBusiness(GetApiTokenForCreatedBusinessVo getApiTokenForCreatedBusinessVo,
                                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getApiTokenForCreatedBusiness(getApiTokenForCreatedBusinessVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * rate business  .
     *
     * @param rateBusinessVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing rateBusiness(RateBusinessVo rateBusinessVo,
                                   OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.rateBusiness(rateBusinessVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * comment business  .
     *
     * @param commentBusinessVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing commentBusiness(CommentBusinessVo commentBusinessVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.commentBusiness(commentBusinessVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * business favorite .
     *
     * @param businessFavoriteVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing businessFavorite(BusinessFavoriteVo businessFavoriteVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.businessFavorite(businessFavoriteVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * user business infos .
     *
     * @param userBusinessInfosVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing userBusinessInfos(UserBusinessInfosVo userBusinessInfosVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.userBusinessInfos(userBusinessInfosVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * comment business list .
     *
     * @param commentBusinessListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */

    public PodDealing commentBusinessList(CommentBusinessListVo commentBusinessListVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.commentBusinessList(commentBusinessListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * confirm comment .
     *
     * @param confirmCommentVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing confirmComment(ConfirmCommentVo confirmCommentVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.confirmComment(confirmCommentVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * guild list.
     *
     * @param guildListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing guildList(GuildListVo guildListVo,
                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.guildList(guildListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * unConfirm Comment .
     *
     * @param unconfirmCommentVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing unconfirmComment(UnconfirmCommentVo unconfirmCommentVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.unconfirmComment(unconfirmCommentVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * add Dealer Product Permission .
     *
     * @param addDealerProductPermissionVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing addDealerProductPermission(AddDealerProductPermissionVo addDealerProductPermissionVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addDealerProductPermission(addDealerProductPermissionVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * dealer Product Permission List .
     *
     * @param dealerProductPermissionListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing dealerProductPermissionList(DealerProductPermissionListVo dealerProductPermissionListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.dealerProductPermissionList(dealerProductPermissionListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * dealing Product Permission List .
     *
     * @param dealingProductPermissionListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing dealingProductPermissionList(DealingProductPermissionListVo dealingProductPermissionListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.dealingProductPermissionList(dealingProductPermissionListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * disable Dealer Product Permission .
     *
     * @param disableDealerProductPermissionVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing disableDealerProductPermission(DisableDealerProductPermissionVo disableDealerProductPermissionVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.disableDealerProductPermission(disableDealerProductPermissionVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * enable Dealer Product Permission .
     *
     * @param enableDealerProductPermissionVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing enableDealerProductPermission(EnableDealerProductPermissionVo  enableDealerProductPermissionVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.enableDealerProductPermission(enableDealerProductPermissionVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * add Dealer.
     *
     * @param addDealerVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing addDealer(AddDealerVo addDealerVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addDealer(addDealerVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * dealer List .
     *
     * @param dealerListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing dealerList(DealerListVo dealerListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.dealerList(dealerListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * enable Dealer .
     *
     * @param enableDealerVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing enableDealer(EnableDealerVo enableDealerVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.enableDealer(enableDealerVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * disableDealer .
     *
     * @param disableDealerVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing disableDealer(DisableDealerVo disableDealerVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.disableDealer(disableDealerVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * business Dealing List .
     *
     * @param businessDealingListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodDealing businessDealingList(BusinessDealingListVo businessDealingListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.businessDealingList(businessDealingListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

}
