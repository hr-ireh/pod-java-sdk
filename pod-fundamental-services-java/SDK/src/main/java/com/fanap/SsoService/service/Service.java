package com.fanap.SsoService.service;

import com.fanap.SsoService.data.modelSrv.*;
import com.fanap.SsoService.data.modelVo.*;
import com.fanap.SsoService.exception.PodException;
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
                accessTokenVo.getClientInfoVo().getClient_id(),
                accessTokenVo.getClientInfoVo().getClient_secret()
        ), onGetResponseListenerGetAccessToken).get();
    }

    public GetAccessTokenSrv getAccessToken(AccessTokenVo accessTokenVo) throws PodException {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        return new GetResultGetAccessToken(service.getAccessToken(
                accessTokenVo.getGrant_type(),
                accessTokenVo.getRedirect_uri(),
                accessTokenVo.getCode(),
                accessTokenVo.getClientInfoVo().getClient_id(),
                accessTokenVo.getClientInfoVo().getClient_secret()
        )).getResponse();
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

    public RefreshAccessTokenSrv getAccessTokenUsingRefreshToken(RefreshAccessTokenVo refreshAccessTokenVo) throws PodException {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        return new GetResultGetAccessTokenUsingRefreshToken(service.getAccessTokenUsingRefreshToken(
                refreshAccessTokenVo.getGrant_type(),
                refreshAccessTokenVo.getRefresh_token(),
                refreshAccessTokenVo.getClientInfoVo().getClient_id(),
                refreshAccessTokenVo.getClientInfoVo().getClient_secret()
        )).getResponse();
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

    public TokenInfoSrv tokeInfo(TokenInfoVo tokenInfoVo) throws PodException {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        return new GetResultTokenInfo(service.tokenInfo(
                tokenInfoVo.getToken_type_hint(),
                tokenInfoVo.getToken(),
                tokenInfoVo.getClientInfoVo().getClient_id(),
                tokenInfoVo.getClientInfoVo().getClient_secret()
        )).getResponse();
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

    public void revokeToken(RevokeTokenVo revokeTokenVo) throws PodException {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultRevokeToken(service.revokeToken(
                revokeTokenVo.getToken_type_hint(),
                revokeTokenVo.getToken(),
                revokeTokenVo.getClientInfoVo().getClient_id(),
                revokeTokenVo.getClientInfoVo().getClient_secret()
        )).getResponse();
    }

    public void handshake(HandshakeVo handshakeVo,
                          OnGetResponseListenerHandshake onGetResponseListenerHandshake) {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        new GetResultHandshake(service.handshake(
                handshakeVo.getAuthorization(),
                handshakeVo.getClient_id(),
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

    public HandshakeSrv handshake(HandshakeVo handshakeVo) throws PodException {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        return new GetResultHandshake(service.handshake(
                handshakeVo.getAuthorization(),
                handshakeVo.getClient_id(),
                handshakeVo.getDevice_uid(),
                handshakeVo.getDevice_lat(),
                handshakeVo.getDevice_lon(),
                handshakeVo.getDevice_os(),
                handshakeVo.getDevice_os_version(),
                handshakeVo.getDevice_type(),
                handshakeVo.getDevice_name(),
                handshakeVo.getAlgorithm()
        )).getResponse();
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

    public GetAccessTokenOtpSrv getAccessTokenOtp(GetAccessTokenByOtpVo getAccessTokenByOtpVo) throws PodException {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        return new GetResultGetAccessTokenOtp(service.getAccessTokenOtp(
                getAccessTokenByOtpVo.getGrant_type(),
                getAccessTokenByOtpVo.getCode(),
                getAccessTokenByOtpVo.getClientInfoVo().getClient_id(),
                getAccessTokenByOtpVo.getClientInfoVo().getClient_secret()
        )).getResponse();
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

    public VerifySrv verify(VerifyVo verifyVo) throws PodException {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        return new GetResultVerify(service.verify(
                verifyVo.getIdentity(),
                verifyVo.getAuthorization(),
                verifyVo.getOtp()
        )).getResponse();
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
                authorizeVo.getScope(),
                authorizeVo.getClientId(),
                authorizeVo.getCallbackUri(),
                authorizeVo.getCodeChallenge(),
                authorizeVo.getCodeChallengeMethod(),
                authorizeVo.getIdentityType(),
                authorizeVo.getLoginAsUserId(),
                authorizeVo.getRedirectUri()
        ), onGetResponseListenerAuthorize).get();
    }

    public AuthorizeSrv authorize(AuthorizeVo authorizeVo) throws PodException {

        UserAuthenticationService service = RetrofitUtil.getInstance().create(UserAuthenticationService.class);

        return new GetResultAuthorize(service.authorize(
                authorizeVo.getIdentity(),
                authorizeVo.getAuthorization(),
                authorizeVo.getResponse_type(),
                authorizeVo.getState(),
                authorizeVo.getReferrerType(),
                authorizeVo.getReferrer(),
                authorizeVo.getScope(),
                authorizeVo.getClientId(),
                authorizeVo.getCallbackUri(),
                authorizeVo.getCodeChallenge(),
                authorizeVo.getCodeChallengeMethod(),
                authorizeVo.getIdentityType(),
                authorizeVo.getLoginAsUserId(),
                authorizeVo.getRedirectUri()
        )).getResponse();
    }
}
