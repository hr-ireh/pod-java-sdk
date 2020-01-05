package com.fanap.podDealing.service;

import com.fanap.podBaseService.util.RetrofitUtil;
import com.fanap.podBaseService.util.ServerTypeSelectionUtil;
import com.fanap.podDealing.data.modelSrv.*;
import com.fanap.podDealing.data.modelVo.*;
import com.fanap.podDealing.util.GetResult;
import com.fanap.podDealing.util.OnGetResponseListener;

import java.util.List;

/**
 * Created By Z.Gholinia on 8/10/2019
 */
public class Service {


    public void addUserAndBusiness(AddUserAndBusinessVo addUserAndBusinessVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addUserAndBusinessVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<BusinessSrv>(service.addUserAndBusiness(
                addUserAndBusinessVo.getBaseInfoVo().getToken(),
                addUserAndBusinessVo.getBaseInfoVo().getToken_issuer(),
                addUserAndBusinessVo.getScProductId(),
                addUserAndBusinessVo.getBaseInfoVo().getScVoucherHash(),
                addUserAndBusinessVo.getBaseInfoVo().getScApiKey(),
                addUserAndBusinessVo.getUsername(),
                addUserAndBusinessVo.getBusinessName(),
                addUserAndBusinessVo.getFirstName(),
                addUserAndBusinessVo.getLastName(),
                addUserAndBusinessVo.getSheba(),
                addUserAndBusinessVo.getNationalCode(),
                addUserAndBusinessVo.getEconomicCode(),
                addUserAndBusinessVo.getRegistrationNumber(),
                addUserAndBusinessVo.getEmail(),
                addUserAndBusinessVo.getGuildCode(),
                addUserAndBusinessVo.getCellphone(),
                addUserAndBusinessVo.getPhone(),
                addUserAndBusinessVo.getFax(),
                addUserAndBusinessVo.getPostalCode(),
                addUserAndBusinessVo.getCountry(),
                addUserAndBusinessVo.getState(),
                addUserAndBusinessVo.getCity(),
                addUserAndBusinessVo.getAddress(),
                addUserAndBusinessVo.getDescription(),
                addUserAndBusinessVo.getNewsReader(),
                addUserAndBusinessVo.getLogoImage(),
                addUserAndBusinessVo.getCoverImage(),
                addUserAndBusinessVo.getTags(),
                addUserAndBusinessVo.getTagTrees(),
                addUserAndBusinessVo.getTagTreeCategoryName(),
                addUserAndBusinessVo.getLink(),
                addUserAndBusinessVo.getLat(),
                addUserAndBusinessVo.getLng(),
                addUserAndBusinessVo.getAgentFirstName(),
                addUserAndBusinessVo.getAgentLastName(),
                addUserAndBusinessVo.getAgentCellphoneNumber(),
                addUserAndBusinessVo.getAgentNationalCode()


        ), onGetResponseListener).get();
    }

    public void listUserCreatedBusiness(ListUserCreatedBusinessVo listUserCreatedBusinessVo,
                                        OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(listUserCreatedBusinessVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<List<BusinessSrv>>(service.listUserCreatedBusiness(
                listUserCreatedBusinessVo.getBaseInfoVo().getToken(),
                listUserCreatedBusinessVo.getBaseInfoVo().getToken_issuer(),
                listUserCreatedBusinessVo.getScProductId(),
                listUserCreatedBusinessVo.getBaseInfoVo().getScVoucherHash(),
                listUserCreatedBusinessVo.getBaseInfoVo().getScApiKey(),
                listUserCreatedBusinessVo.getBizId(),
                listUserCreatedBusinessVo.getGuildCode(),
                listUserCreatedBusinessVo.getOffset(),
                listUserCreatedBusinessVo.getSize(),
                listUserCreatedBusinessVo.getQuery(),
                listUserCreatedBusinessVo.getTags(),
                listUserCreatedBusinessVo.getTagTrees(),
                listUserCreatedBusinessVo.getActive(),
                listUserCreatedBusinessVo.getCountry(),
                listUserCreatedBusinessVo.getState(),
                listUserCreatedBusinessVo.getCity(),
                listUserCreatedBusinessVo.getSsoId(),
                listUserCreatedBusinessVo.getUsername(),
                listUserCreatedBusinessVo.getBusinessName(),
                listUserCreatedBusinessVo.getSheba(),
                listUserCreatedBusinessVo.getNationalCode(),
                listUserCreatedBusinessVo.getEconomicCode(),
                listUserCreatedBusinessVo.getEmail(),
                listUserCreatedBusinessVo.getCellphone()


        ), onGetResponseListener).get();
    }

    public void updateBusiness(UpdateBusinessVo updateBusinessVo,
                               OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(updateBusinessVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<BusinessSrv>(service.updateBusiness(
                updateBusinessVo.getBaseInfoVo().getToken(),
                updateBusinessVo.getBaseInfoVo().getToken_issuer(),
                updateBusinessVo.getScProductId(),
                updateBusinessVo.getBaseInfoVo().getScVoucherHash(),
                updateBusinessVo.getBaseInfoVo().getScApiKey(),
                updateBusinessVo.getBizId(),
                updateBusinessVo.getBusinessName(),
                updateBusinessVo.getCompanyName(),
                updateBusinessVo.getShopName(),
                updateBusinessVo.getShopNameEn(),
                updateBusinessVo.getWebsite(),
                updateBusinessVo.getDateEstablishing(),
                updateBusinessVo.getFirstName(),
                updateBusinessVo.getLastName(),
                updateBusinessVo.getSheba(),
                updateBusinessVo.getNationalCode(),
                updateBusinessVo.getEconomicCode(),
                updateBusinessVo.getRegistrationNumber(),
                updateBusinessVo.getEmail(),
                updateBusinessVo.getGuildCode(),
                updateBusinessVo.getCellphone(),
                updateBusinessVo.getPhone(),
                updateBusinessVo.getFax(),
                updateBusinessVo.getPostalCode(),
                updateBusinessVo.getCountry(),
                updateBusinessVo.getState(),
                updateBusinessVo.getCity(),
                updateBusinessVo.getAddress(),
                updateBusinessVo.getDescription(),
                updateBusinessVo.getChangeLogo(),
                updateBusinessVo.getChangeCover(),
                updateBusinessVo.getLogoImage(),
                updateBusinessVo.getCoverImage(),
                updateBusinessVo.getTags(),
                updateBusinessVo.getTagTrees(),
                updateBusinessVo.getTagTreeCategoryName(),
                updateBusinessVo.getLink(),
                updateBusinessVo.getLat(),
                updateBusinessVo.getLng(),
                updateBusinessVo.getAgentFirstName(),
                updateBusinessVo.getAgentLastName(),
                updateBusinessVo.getAgentCellphoneNumber(),
                updateBusinessVo.getAgentNationalCode(),
                updateBusinessVo.getChangeAgent()

        ), onGetResponseListener).get();
    }


    public void getApiTokenForCreatedBusiness(GetApiTokenForCreatedBusinessVo getApiTokenForCreatedBusinessVo,
                                              OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getApiTokenForCreatedBusinessVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<BusinessApiTokenSrv>(service.getApiTokenForCreatedBusiness(
                getApiTokenForCreatedBusinessVo.getBaseInfoVo().getToken(),
                getApiTokenForCreatedBusinessVo.getBaseInfoVo().getToken_issuer(),
                getApiTokenForCreatedBusinessVo.getScProductId(),
                getApiTokenForCreatedBusinessVo.getBaseInfoVo().getScVoucherHash(),
                getApiTokenForCreatedBusinessVo.getBaseInfoVo().getScApiKey(),
                getApiTokenForCreatedBusinessVo.getBusinessId()


        ), onGetResponseListener).get();
    }

    public void rateBusiness(RateBusinessVo rateBusinessVo,
                             OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(rateBusinessVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<RateSrv>(service.rateBusiness(
                rateBusinessVo.getBaseInfoVo().getToken(),
                rateBusinessVo.getBaseInfoVo().getToken_issuer(),
                rateBusinessVo.getScProductId(),
                rateBusinessVo.getBaseInfoVo().getScVoucherHash(),
                rateBusinessVo.getBaseInfoVo().getScApiKey(),
                rateBusinessVo.getBusinessId(),
                rateBusinessVo.getRate()

        ), onGetResponseListener).get();
    }

    public void commentBusiness(CommentBusinessVo commentBusinessVo,
                                OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(commentBusinessVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<Long>(service.commentBusiness(
                commentBusinessVo.getBaseInfoVo().getToken(),
                commentBusinessVo.getBaseInfoVo().getToken_issuer(),
                commentBusinessVo.getScProductId(),
                commentBusinessVo.getBaseInfoVo().getScVoucherHash(),
                commentBusinessVo.getBaseInfoVo().getScApiKey(),
                commentBusinessVo.getBusinessId(),
                commentBusinessVo.getText()

        ), onGetResponseListener).get();
    }

    public void businessFavorite(BusinessFavoriteVo businessFavoriteVo,
                                 OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(businessFavoriteVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<Boolean>(service.businessFavorite(
                businessFavoriteVo.getBaseInfoVo().getToken(),
                businessFavoriteVo.getBaseInfoVo().getToken_issuer(),
                businessFavoriteVo.getScProductId(),
                businessFavoriteVo.getBaseInfoVo().getScVoucherHash(),
                businessFavoriteVo.getBaseInfoVo().getScApiKey(),
                businessFavoriteVo.getBusinessId(),
                businessFavoriteVo.getDisfavorite()

        ), onGetResponseListener).get();
    }


    public void userBusinessInfos(UserBusinessInfosVo userBusinessInfosVo,
                                  OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(userBusinessInfosVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<List<UserBusinessInfoSrv>>(service.userBusinessInfos(
                userBusinessInfosVo.getBaseInfoVo().getToken(),
                userBusinessInfosVo.getBaseInfoVo().getToken_issuer(),
                userBusinessInfosVo.getScProductId(),
                userBusinessInfosVo.getBaseInfoVo().getScVoucherHash(),
                userBusinessInfosVo.getBaseInfoVo().getScApiKey(),
                userBusinessInfosVo.getId()


        ), onGetResponseListener).get();
    }


    public void commentBusinessList(CommentBusinessListVo commentBusinessListVo,
                                    OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(commentBusinessListVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<List<CommentSrv>>(service.commentBusinessList(
                commentBusinessListVo.getBaseInfoVo().getToken(),
                commentBusinessListVo.getBaseInfoVo().getToken_issuer(),
                commentBusinessListVo.getScProductId(),
                commentBusinessListVo.getBaseInfoVo().getScVoucherHash(),
                commentBusinessListVo.getBaseInfoVo().getScApiKey(),
                commentBusinessListVo.getBusinessId(),
                commentBusinessListVo.getFirstId(),
                commentBusinessListVo.getLastId(),
                commentBusinessListVo.getOffset(),
                commentBusinessListVo.getSize()


        ), onGetResponseListener).get();
    }

    public void confirmComment(ConfirmCommentVo confirmCommentVo,
                               OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(confirmCommentVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<Boolean>(service.confirmComment(
                confirmCommentVo.getBaseInfoVo().getToken(),
                confirmCommentVo.getBaseInfoVo().getToken_issuer(),
                confirmCommentVo.getScProductId(),
                confirmCommentVo.getBaseInfoVo().getScVoucherHash(),
                confirmCommentVo.getBaseInfoVo().getScApiKey(),
                confirmCommentVo.getCommentId()


        ), onGetResponseListener).get();
    }

    public void guildList(GuildListVo guildListVo,
                          OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(guildListVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<List<GuildSrv>>(service.guildList(
                guildListVo.getBaseInfoVo().getToken(),
                guildListVo.getBaseInfoVo().getToken_issuer(),
                guildListVo.getScProductId(),
                guildListVo.getBaseInfoVo().getScVoucherHash(),
                guildListVo.getBaseInfoVo().getScApiKey(),
                guildListVo.getName(),
                guildListVo.getOffset(),
                guildListVo.getSize()


        ), onGetResponseListener).get();
    }

    public void unconfirmComment(UnconfirmCommentVo unconfirmCommentVo,
                                 OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(unconfirmCommentVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<Boolean>(service.unconfirmComment(
                unconfirmCommentVo.getBaseInfoVo().getToken(),
                unconfirmCommentVo.getBaseInfoVo().getToken_issuer(),
                unconfirmCommentVo.getScProductId(),
                unconfirmCommentVo.getBaseInfoVo().getScVoucherHash(),
                unconfirmCommentVo.getBaseInfoVo().getScApiKey(),
                unconfirmCommentVo.getCommentId()


        ), onGetResponseListener).get();
    }


    public void addDealerProductPermission(AddDealerProductPermissionVo addDealerProductPermissionVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addDealerProductPermissionVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<DealerProductPermissionSrv>(service.addDealerProductPermission(
                addDealerProductPermissionVo.getBaseInfoVo().getToken(),
                addDealerProductPermissionVo.getBaseInfoVo().getToken_issuer(),
                addDealerProductPermissionVo.getScProductId(),
                addDealerProductPermissionVo.getBaseInfoVo().getScVoucherHash(),
                addDealerProductPermissionVo.getBaseInfoVo().getScApiKey(),
                addDealerProductPermissionVo.getEntityId(),
                addDealerProductPermissionVo.getDealerBizId()
        ), onGetResponseListener).get();
    }

    public void dealerProductPermissionList(DealerProductPermissionListVo dealerProductPermissionListVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(dealerProductPermissionListVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<List<DealerProductPermissionSrv>>(service.dealerProductPermissionList(
                dealerProductPermissionListVo.getBaseInfoVo().getToken(),
                dealerProductPermissionListVo.getBaseInfoVo().getToken_issuer(),
                dealerProductPermissionListVo.getScProductId(),
                dealerProductPermissionListVo.getBaseInfoVo().getScVoucherHash(),
                dealerProductPermissionListVo.getBaseInfoVo().getScApiKey(),
                dealerProductPermissionListVo.getEntityId(),
                dealerProductPermissionListVo.getDealerBizId(),
                dealerProductPermissionListVo.getOffset(),
                dealerProductPermissionListVo.getSize(),
                dealerProductPermissionListVo.getEnable()
        ), onGetResponseListener).get();
    }

    public void dealingProductPermissionList(DealingProductPermissionListVo dealingProductPermissionListVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(dealingProductPermissionListVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<List<DealerProductPermissionSrv>>(service.dealingProductPermissionList(
                dealingProductPermissionListVo.getBaseInfoVo().getToken(),
                dealingProductPermissionListVo.getBaseInfoVo().getToken_issuer(),
                dealingProductPermissionListVo.getScProductId(),
                dealingProductPermissionListVo.getBaseInfoVo().getScVoucherHash(),
                dealingProductPermissionListVo.getBaseInfoVo().getScApiKey(),
                dealingProductPermissionListVo.getEntityId(),
                dealingProductPermissionListVo.getDealingBusinessId(),
                dealingProductPermissionListVo.getOffset(),
                dealingProductPermissionListVo.getSize(),
                dealingProductPermissionListVo.getEnable()

        ), onGetResponseListener).get();
    }

    public void disableDealerProductPermission(DisableDealerProductPermissionVo disableDealerProductPermissionVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(disableDealerProductPermissionVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<DealerProductPermissionSrv>(service.disableDealerProductPermission(
                disableDealerProductPermissionVo.getBaseInfoVo().getToken(),
                disableDealerProductPermissionVo.getBaseInfoVo().getToken_issuer(),
                disableDealerProductPermissionVo.getScProductId(),
                disableDealerProductPermissionVo.getBaseInfoVo().getScVoucherHash(),
                disableDealerProductPermissionVo.getBaseInfoVo().getScApiKey(),
                disableDealerProductPermissionVo.getEntityId(),
                disableDealerProductPermissionVo.getDealerBizId()

        ), onGetResponseListener).get();
    }

    public void enableDealerProductPermission(EnableDealerProductPermissionVo enableDealerProductPermissionVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(enableDealerProductPermissionVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<DealerProductPermissionSrv>(service.enableDealerProductPermission(
                enableDealerProductPermissionVo.getBaseInfoVo().getToken(),
                enableDealerProductPermissionVo.getBaseInfoVo().getToken_issuer(),
                enableDealerProductPermissionVo.getScProductId(),
                enableDealerProductPermissionVo.getBaseInfoVo().getScVoucherHash(),
                enableDealerProductPermissionVo.getBaseInfoVo().getScApiKey(),
                enableDealerProductPermissionVo.getEntityId(),
                enableDealerProductPermissionVo.getDealerBizId()

        ), onGetResponseListener).get();
    }

    public void addDealer(AddDealerVo addDealerVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addDealerVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<BusinessDealerSrv>(service.addDealer(
                addDealerVo.getBaseInfoVo().getToken(),
                addDealerVo.getBaseInfoVo().getToken_issuer(),
                addDealerVo.getScProductId(),
                addDealerVo.getBaseInfoVo().getScVoucherHash(),
                addDealerVo.getBaseInfoVo().getScApiKey(),
                addDealerVo.getDealerBizId(),
                addDealerVo.getAllProductAllow()
        ), onGetResponseListener).get();
    }

    public void dealerList(DealerListVo dealerListVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(dealerListVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<List<BusinessDealerSrv>>(service.dealerList(
                dealerListVo.getBaseInfoVo().getToken(),
                dealerListVo.getBaseInfoVo().getToken_issuer(),
                dealerListVo.getScProductId(),
                dealerListVo.getBaseInfoVo().getScVoucherHash(),
                dealerListVo.getBaseInfoVo().getScApiKey(),
                dealerListVo.getDealerBizId(),
                dealerListVo.getEnable(),
                dealerListVo.getOffset(),
                dealerListVo.getSize()
        ), onGetResponseListener).get();
    }

    public void enableDealer(EnableDealerVo enableDealerVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(enableDealerVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<BusinessDealerSrv>(service.enableDealer(
                enableDealerVo.getBaseInfoVo().getToken(),
                enableDealerVo.getBaseInfoVo().getToken_issuer(),
                enableDealerVo.getScProductId(),
                enableDealerVo.getBaseInfoVo().getScVoucherHash(),
                enableDealerVo.getBaseInfoVo().getScApiKey(),
                enableDealerVo.getDealerBizId()
        ), onGetResponseListener).get();
    }

    public void disableDealer(DisableDealerVo disableDealerVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(disableDealerVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<BusinessDealerSrv>(service.disableDealer(
                disableDealerVo.getBaseInfoVo().getToken(),
                disableDealerVo.getBaseInfoVo().getToken_issuer(),
                disableDealerVo.getScProductId(),
                disableDealerVo.getBaseInfoVo().getScVoucherHash(),
                disableDealerVo.getBaseInfoVo().getScApiKey(),
                disableDealerVo.getDealerBizId()
        ), onGetResponseListener).get();
    }


    public void businessDealingList(BusinessDealingListVo businessDealingListVo, OnGetResponseListener onGetResponseListener) {
        PodDealing service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(businessDealingListVo.getBaseInfoVo().getServerType()))
                .create(PodDealing.class);

        new GetResult<List<BusinessDealerSrv>>(service.businessDealingList(
                businessDealingListVo.getBaseInfoVo().getToken(),
                businessDealingListVo.getBaseInfoVo().getToken_issuer(),
                businessDealingListVo.getScProductId(),
                businessDealingListVo.getBaseInfoVo().getScVoucherHash(),
                businessDealingListVo.getBaseInfoVo().getScApiKey(),
                businessDealingListVo.getDealingBusinessId(),
                businessDealingListVo.getEnable(),
                businessDealingListVo.getOffset(),
                businessDealingListVo.getSize()
        ), onGetResponseListener).get();
    }


}
