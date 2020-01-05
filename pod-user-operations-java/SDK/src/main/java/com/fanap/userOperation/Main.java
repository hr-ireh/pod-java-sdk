package com.fanap.userOperation;

import com.fanap.userOperation.controller.UserOperationMethodInvoke;
import com.fanap.userOperation.data.modelSrv.AddressSrv;
import com.fanap.userOperation.data.modelSrv.CustomerProfileSrv;
import com.fanap.userOperation.data.modelVo.*;
import com.fanap.userOperation.exception.PodException;
import com.fanap.userOperation.util.OnGetResponseListener;

import java.util.List;

/**
 * Created by Z.Gholinia on 10/12/2019.
 */
public class Main {

    private static String TOKEN = "1c0898d03cef4c0a80741653aaa1b8ad";
    private static String TOKEN_ISSUER = "1";

    public static void main(String[] args) {

//        getUserProfile();
//        editProfileWithConfirmation();
//        confirmEditProfile();
//        getListAddress();
    }

    private static void getUserProfile() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo();
        baseInfoVo
                .setToken(TOKEN)
                .setToken_issuer("1")
//        .setScApiKey("")
//        .setScVoucherHash(scVoucherHashs)
//                .setClient_id("")
//                .setClient_secret("")
        ;

        UserOperationMethodInvoke userOperationMethodInvoke = new UserOperationMethodInvoke();

        try {
            GetUserProfileVo getUserProfileVo = new GetUserProfileVo.Builder(baseInfoVo)
                    .build();
            userOperationMethodInvoke.getUserProfile(getUserProfileVo, new OnGetResponseListener<CustomerProfileSrv>() {
                @Override
                public void onResponse(ResultVo<CustomerProfileSrv> result) {
                    System.out.println(result.getResult().getNickName());
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

    private static void editProfileWithConfirmation() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo();
        baseInfoVo
                .setToken(TOKEN)
                .setToken_issuer("1")
//                .setScApiKey("")
//        .setScVoucherHash(scVoucherHashs)
//                .setClient_id("")
//                .setClient_secret("")
        ;

        UserOperationMethodInvoke userOperationMethodInvoke = new UserOperationMethodInvoke();


        try {
            EditProfileWithConfirmationVo editProfileWithConfirmationVo =
                    new EditProfileWithConfirmationVo.Builder(baseInfoVo)
                            .setNickName("testces100")
                            .build();
            userOperationMethodInvoke.editProfileWithConfirmation(editProfileWithConfirmationVo, new OnGetResponseListener<CustomerProfileSrv>() {
                @Override
                public void onResponse(ResultVo<CustomerProfileSrv> result) {
                    System.out.println(result.getResult().getNickName());
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


    private static void confirmEditProfile() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo();
        baseInfoVo
                .setToken(TOKEN)
                .setToken_issuer("1");
//           .setScApiKey("")
//        .setScVoucherHash(scVoucherHashs);

        UserOperationMethodInvoke userOperationMethodInvoke = new UserOperationMethodInvoke();

        try {
            ConfirmEditProfileVo confirmEditProfileVo = new ConfirmEditProfileVo.Builder(baseInfoVo)
                    .setCode(4001450L)
                    .setCellphoneNumber("09375334941")
                    .build();
            userOperationMethodInvoke.confirmEditProfile(confirmEditProfileVo, new OnGetResponseListener<CustomerProfileSrv>() {
                @Override
                public void onResponse(ResultVo<CustomerProfileSrv> result) {
                    System.out.println(result.getResult().getNickName());
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


    private static void getListAddress() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo();
        baseInfoVo
                .setToken(TOKEN)
                .setToken_issuer("1");
//           .setScApiKey("")
//        .setScVoucherHash(scVoucherHashs);

        UserOperationMethodInvoke userOperationMethodInvoke = new UserOperationMethodInvoke();

        try {
            ListAddressVo listAddressVo = new ListAddressVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .build();
            userOperationMethodInvoke.getListAddress(listAddressVo, new OnGetResponseListener<List<AddressSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AddressSrv>> result) {
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
