package com.fanap.userOperation.service;

import com.fanap.userOperation.data.modelSrv.AddressSrv;
import com.fanap.userOperation.data.modelSrv.CustomerProfileSrv;
import com.fanap.userOperation.data.modelVo.*;
import com.fanap.userOperation.exception.PodException;
import com.fanap.userOperation.util.GetResult;
import com.fanap.userOperation.util.OnGetResponseListener;
import com.fanap.userOperation.util.RetrofitUtil;

import java.util.List;

/**
 * Created By Askarian on 5/28/2019
 */
public class Service {

    public void getUserProfile(GetUserProfileVo getUserProfileVo,
                               OnGetResponseListener onGetResponseListener) {

        UserOperationService service = RetrofitUtil
                .getInstance()
                .create(UserOperationService.class);

        new GetResult<CustomerProfileSrv>(service.getUserProfile(
                getUserProfileVo.getBaseInfoVo().getToken(),
                getUserProfileVo.getBaseInfoVo().getToken_issuer(),
                getUserProfileVo.getScProductId(),
                getUserProfileVo.getBaseInfoVo().getScVoucherHash(),
                getUserProfileVo.getBaseInfoVo().getScApiKey(),
                getUserProfileVo.getBaseInfoVo().getClient_id(),
                getUserProfileVo.getBaseInfoVo().getClient_secret()
        ), onGetResponseListener).get();
    }

    public ResultVo<CustomerProfileSrv> getUserProfile(GetUserProfileVo getUserProfileVo) throws PodException {

        UserOperationService service = RetrofitUtil.getInstance().create(UserOperationService.class);

        return new GetResult<>(service.getUserProfile(
                getUserProfileVo.getBaseInfoVo().getToken(),
                getUserProfileVo.getBaseInfoVo().getToken_issuer(),
                getUserProfileVo.getScProductId(),
                getUserProfileVo.getBaseInfoVo().getScVoucherHash(),
                getUserProfileVo.getBaseInfoVo().getScApiKey(),
                getUserProfileVo.getBaseInfoVo().getClient_id(),
                getUserProfileVo.getBaseInfoVo().getClient_secret()
        )).getResponse();
    }

    public void editProfileWithConfirmation(EditProfileWithConfirmationVo editProfileWithConfirmationVo,
                                            OnGetResponseListener onGetResponseListener) {

        UserOperationService service = RetrofitUtil
                .getInstance()
                .create(UserOperationService.class);

        new GetResult<CustomerProfileSrv>(service.editProfileWithConfirmation(
                editProfileWithConfirmationVo.getScProductId(),
                editProfileWithConfirmationVo.getBaseInfoVo().getScVoucherHash(),
                editProfileWithConfirmationVo.getBaseInfoVo().getScApiKey(),
                editProfileWithConfirmationVo.getFirstName(),
                editProfileWithConfirmationVo.getLastName(),
                editProfileWithConfirmationVo.getNickName(),
                editProfileWithConfirmationVo.getEmail(),
                editProfileWithConfirmationVo.getPhoneNumber(),
                editProfileWithConfirmationVo.getCellphoneNumber(),
                editProfileWithConfirmationVo.getNationalCode(),
                editProfileWithConfirmationVo.getGender(),
                editProfileWithConfirmationVo.getAddress(),
                editProfileWithConfirmationVo.getBirthDate(),
                editProfileWithConfirmationVo.getCountry(),
                editProfileWithConfirmationVo.getState(),
                editProfileWithConfirmationVo.getCity(),
                editProfileWithConfirmationVo.getPostalcode(),
                editProfileWithConfirmationVo.getSheba(),
                editProfileWithConfirmationVo.getProfileImage(),
                editProfileWithConfirmationVo.getClient_metadata(),
                editProfileWithConfirmationVo.getBirthState(),
                editProfileWithConfirmationVo.getIdentificationNumber(),
                editProfileWithConfirmationVo.getFatherName(),
                editProfileWithConfirmationVo.getBaseInfoVo().getToken(),
                editProfileWithConfirmationVo.getBaseInfoVo().getToken_issuer(),
                editProfileWithConfirmationVo.getBaseInfoVo().getClient_id(),
                editProfileWithConfirmationVo.getBaseInfoVo().getClient_secret()
        ), onGetResponseListener).get();
    }


    public void confirmEditProfile(ConfirmEditProfileVo confirmEditPrvofileVo,
                                   OnGetResponseListener onGetResponseListener) {

        UserOperationService service = RetrofitUtil
                .getInstance()
                .create(UserOperationService.class);

        new GetResult<CustomerProfileSrv>(service.confirmEditProfile(
                confirmEditPrvofileVo.getBaseInfoVo().getToken(),
                confirmEditPrvofileVo.getBaseInfoVo().getToken_issuer(),
                confirmEditPrvofileVo.getScProductId(),
                confirmEditPrvofileVo.getBaseInfoVo().getScVoucherHash(),
                confirmEditPrvofileVo.getBaseInfoVo().getScApiKey(),
                confirmEditPrvofileVo.getCode(),
                confirmEditPrvofileVo.getCellphoneNumber()
        ), onGetResponseListener).get();
    }


    public void getListAddress(ListAddressVo listAddressVo,
                               OnGetResponseListener onGetResponseListener) {

        UserOperationService service = RetrofitUtil
                .getInstance()
                .create(UserOperationService.class);

        new GetResult<List<AddressSrv>>(service.getListAddress(
                listAddressVo.getBaseInfoVo().getToken(),
                listAddressVo.getBaseInfoVo().getToken_issuer(),
                listAddressVo.getScProductId(),
                listAddressVo.getBaseInfoVo().getScVoucherHash(),
                listAddressVo.getBaseInfoVo().getScApiKey(),
                listAddressVo.getOffset(),
                listAddressVo.getSize()
        ), onGetResponseListener).get();
    }

}
