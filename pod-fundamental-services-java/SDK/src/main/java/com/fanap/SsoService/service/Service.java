package com.fanap.SsoService.service;

import com.fanap.SsoService.data.modelVo.*;
import com.fanap.SsoService.util.*;
import com.fanap.SsoService.util.interfaces.*;

/**
 * Created By Askarian on 5/28/2019
 */
public class Service {

    public void getAccessToken(AccessTokenVo accessTokenVo,
                               OnGetResponseListenerGetAccessToken onGetResponseListenerGetAccessToken) {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultGetAccessToken(service.getAccessToken(
                accessTokenVo.getGrant_type(),
                accessTokenVo.getRedirect_uri(),
                accessTokenVo.getCode(),
                accessTokenVo.getCode_verifier(),
                accessTokenVo.getClientInfoVo().getClient_id(),
                accessTokenVo.getClientInfoVo().getClient_secret()
        ), onGetResponseListenerGetAccessToken).get();
    }

    public void getAccessTokenUsingRefreshToken(RefreshAccessTokenVo refreshAccessTokenVo,
                                                OnGetResponseListenerRefreshAccessToken onGetResponseListenerRefreshAccessToken) {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultGetAccessTokenUsingRefreshToken(service.getAccessTokenUsingRefreshToken(
                refreshAccessTokenVo.getGrant_type(),
                refreshAccessTokenVo.getRefresh_token(),
                refreshAccessTokenVo.getClientInfoVo().getClient_id(),
                refreshAccessTokenVo.getClientInfoVo().getClient_secret()
        ), onGetResponseListenerRefreshAccessToken).get();
    }

    public void tokeInfo(TokenInfoVo tokenInfoVo,
                         OnGetResponseListenerGetTokenInfo onGetResponseListenerGetTokenInfo) {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultTokenInfo(service.tokenInfo(
                tokenInfoVo.getToken_type_hint(),
                tokenInfoVo.getToken(),
                tokenInfoVo.getClientInfoVo().getClient_id(),
                tokenInfoVo.getClientInfoVo().getClient_secret()
        ), onGetResponseListenerGetTokenInfo).get();
    }

    public void revokeToken(RevokeTokenVo revokeTokenVo,
                            OnGetResponseListenerRevokeToken onGetResponseListenerRevokeToken) {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultRevokeToken(service.revokeToken(
                revokeTokenVo.getToken_type_hint(),
                revokeTokenVo.getToken(),
                revokeTokenVo.getClientInfoVo().getClient_id(),
                revokeTokenVo.getClientInfoVo().getClient_secret()
        ), onGetResponseListenerRevokeToken).get();
    }

    public void handshake(HandshakeVo handshakeVo,
                          OnGetResponseListenerHandshake onGetResponseListenerHandshake) {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultHandshake(service.handshake(
                handshakeVo.getClient_id(),
                handshakeVo.getAuthorization(),
                handshakeVo.getDevice_uid(),
                handshakeVo.getDevice_lat(),
                handshakeVo.getDevice_lon(),
                handshakeVo.getDevice_os(),
                handshakeVo.getDevice_os_version(),
                handshakeVo.getDevice_type(),
                handshakeVo.getDevice_name(),
                handshakeVo.getAlgorithm()
        ), onGetResponseListenerHandshake).get();
    }

    public void getAccessTokenOtp(GetAccessTokenByOtpVo getAccessTokenByOtpVo,
                                  OnGetResponseListenerGetAccessTokenOtp onGetResponseListenerGetAccessTokenOtp) {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultGetAccessTokenOtp(service.getAccessTokenOtp(
                getAccessTokenByOtpVo.getGrant_type(),
                getAccessTokenByOtpVo.getCode(),
                getAccessTokenByOtpVo.getClientInfoVo().getClient_id(),
                getAccessTokenByOtpVo.getClientInfoVo().getClient_secret()
        ), onGetResponseListenerGetAccessTokenOtp).get();
    }

    public void verify(VerifyVo verifyVo,
                       OnGetResponseListenerVerify onGetResponseListenerVerify) {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultVerify(service.verify(
                verifyVo.getIdentity(),
                verifyVo.getAuthorization(),
                verifyVo.getOtp()
        ), onGetResponseListenerVerify).get();
    }

    public void authorize(AuthorizeVo authorizeVo,
                          OnGetResponseListenerAuthorize onGetResponseListenerAuthorize) {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultAuthorize(service.authorize(
                authorizeVo.getIdentity(),
                authorizeVo.getAuthorization(),
                authorizeVo.getResponse_type(),
                authorizeVo.getState(),
                authorizeVo.getReferrerType(),
                authorizeVo.getReferrer(),
                authorizeVo.getScope()
        ), onGetResponseListenerAuthorize).get();
    }



//    public void revokeToken(RevokeTokenVo2 revokeTokenVo2,
//                            OnGetResponseListenerGetAccessToken onGetResponseListener) {
//
//        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);
//
//        new GetResultGetAccessToken<Void>(service.revokeToken(revokeTokenVo2),
//                onGetResponseListener).get();
//    }
//
//    public void revokeToken(RevokeTokenVo revokeTokenVo,
//                            OnGetResponseListenerGetAccessToken onGetResponseListenerGetAccessToken) {
//
//        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);
//
//        new GetResultGetAccessToken<Void>(service.revokeToken(
//                revokeTokenVo.getToken_type_hint(),
//                revokeTokenVo.getToken(),
//                revokeTokenVo.getClient_id(),
//                revokeTokenVo.getClient_secret()
//        ), onGetResponseListenerGetAccessToken).get();
//    }

}
