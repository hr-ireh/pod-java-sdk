package com.fanap.SsoService;

import com.fanap.SsoService.controller.SsoService;
import com.fanap.SsoService.data.modelSrv.*;
import com.fanap.SsoService.data.modelVo.*;
import com.fanap.SsoService.enums.*;
import com.fanap.SsoService.exception.PodException;
import com.fanap.SsoService.util.interfaces.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class Main {

    public static String grant_type = "authorization_code";
    public static String redirect_uri = "https://www.google.com/";
    public static String client_id = "";
    public static String client_secret = "";
    public static String api_key = "";
    public static String sampleIdentity = "09154961631";
    public static String sample_uid = "5421548";
    public static String keyId = "";
    public static String privateKey = "";

    public static void main(String[] args) {
//        getAccessToken();
//        refreshAccessToken();
//        getTokenInfo();
//        revokeToken();
//        handshake();
//        authorize();
//        verify();
//        getAccessTokenByOtp();
//        getOtpScenario();
//        GetAccessTokenByOtpScenario("308482");
        String s = getLoginUrl();
        System.out.println(s);
    }

    private static void GetAccessTokenByOtpScenario(String otp) {
        SsoService ssoService = new SsoService();

        try {
            VerifyVo verifyVo = new VerifyVo
                    .Builder()
                    .setIdentity(sampleIdentity)
                    .setOtp(otp)
                    .setAuthorization(keyId, privateKey)
                    .build();

            ssoService.verify(verifyVo, new OnGetResponseListenerVerify() {
                @Override
                public void onResponse(VerifySrv verifySrv) throws PodException {
                    SsoService ssoService = new SsoService();

                    ClientInfoVo clientInfoVo = new ClientInfoVo();
                    clientInfoVo.setClient_id(client_id);
                    clientInfoVo.setClient_secret(client_secret);

                    GetAccessTokenByOtpVo getAccessTokenByOtpVo = new GetAccessTokenByOtpVo
                            .Builder()
//                            .setGrant_type(grant_type)
                            .setCode(verifySrv.getCode())
                            .setClientInfoVo(clientInfoVo)
                            .build();

                    ssoService.getAccessTokenByOtp(getAccessTokenByOtpVo, new OnGetResponseListenerGetAccessTokenOtp() {
                        @Override
                        public void onResponse(GetAccessTokenOtpSrv getAccessTokenOtpSrv) {
                            System.out.println("Access token: " + getAccessTokenOtpSrv.getAccess_token() + "\n" +
                                    "Refresh token: " + getAccessTokenOtpSrv.getRefresh_token());
                        }

                        @Override
                        public void onFailed(PodException e) {
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        }
                    });
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

    private static void getOtpScenario() {
        SsoService ssoService = new SsoService();
        ClientInfoVo clientInfoVo = new ClientInfoVo();
        clientInfoVo.setClient_id(client_id);
        clientInfoVo.setClient_secret(client_secret);

        try {
            HandshakeVo handshakeVo = new HandshakeVo
                    .Builder()
                    .setAuthorization(api_key)
                    .setDevice_uid(sample_uid)
                    .setClient_id(client_id)
                    .build();

            ssoService.handshake(handshakeVo, new OnGetResponseListenerHandshake() {
                @Override
                public void onResponse(HandshakeSrv handshakeSrv) throws PodException {
                    SsoService ssoService = new SsoService();
                    AuthorizeVo authorizeVo = new AuthorizeVo
                            .Builder()
                            .setResponse_type(EnumResponseType.CODE)
                            .setAuthorization(keyId, privateKey)
                            .setIdentity("09154961631")
                            .setScope(EnumScopeType.PROFILE)
                            .build();

                    ssoService.authorize(authorizeVo, new OnGetResponseListenerAuthorize() {
                        @Override
                        public void onResponse(AuthorizeSrv authorizeSrv) {
                            System.out.println("expire_in: " + authorizeSrv.getExpires_in() + "\n" +
                                    "user_id: " + authorizeSrv.getUser_id());
                        }

                        @Override
                        public void onFailed(PodException e) {
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        }
                    });
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

    private static void authorize() {
        SsoService ssoService = new SsoService();
        try {
            AuthorizeVo authorizeVo = new AuthorizeVo
                    .Builder()
                    .setResponse_type(EnumResponseType.CODE)
                    .setAuthorization(keyId, privateKey)
                    .setIdentity("09154961631")
                    .setScope(EnumScopeType.PROFILE)
                    .build();

            ssoService.authorize(authorizeVo, new OnGetResponseListenerAuthorize() {
                @Override
                public void onResponse(AuthorizeSrv authorizeSrv) {
                    System.out.println("expire_in: " + authorizeSrv.getExpires_in() + "\n" +
                            "user_id: " + authorizeSrv.getUser_id());
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

    private static void verify() {
        SsoService ssoService = new SsoService();
        try {
            VerifyVo verifyVo = new VerifyVo
                    .Builder()
                    .setIdentity("09154961631")
                    .setOtp("308593")
                    .setAuthorization(keyId, privateKey)
                    .build();

            ssoService.verify(verifyVo, new OnGetResponseListenerVerify() {
                @Override
                public void onResponse(VerifySrv verifySrv) {
                    System.out.println("code: " + verifySrv.getCode());
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

    private static void getAccessTokenByOtp() {
        SsoService ssoService = new SsoService();
        ClientInfoVo clientInfoVo = new ClientInfoVo();
        clientInfoVo.setClient_id(client_id);
        clientInfoVo.setClient_secret(client_secret);
        try {
            GetAccessTokenByOtpVo getAccessTokenByOtpVo = new GetAccessTokenByOtpVo
                    .Builder()
                    .setGrant_type(EnumGrantType.AUTHORIZATION_CODE)
                    .setCode("cbcc9220017d4466b09201391ba1b811")
                    .setClientInfoVo(clientInfoVo)
                    .build();

            ssoService.getAccessTokenByOtp(getAccessTokenByOtpVo, new OnGetResponseListenerGetAccessTokenOtp() {
                @Override
                public void onResponse(GetAccessTokenOtpSrv getAccessTokenOtpSrv) {
                    System.out.println("Access token: " + getAccessTokenOtpSrv.getAccess_token() + "\n" +
                            "Refresh token: " + getAccessTokenOtpSrv.getRefresh_token());
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

    private static void handshake() {
        SsoService ssoService = new SsoService();
        try {
            HandshakeVo handshakeVo = new HandshakeVo
                    .Builder()
                    .setAuthorization(api_key)
                    .setDevice_uid(sample_uid)
                    .setClient_id(client_id)
                    .build();

            ssoService.handshake(handshakeVo, new OnGetResponseListenerHandshake() {
                @Override
                public void onResponse(HandshakeSrv handshakeSrv) {
                    System.out.println("KeyId: " + handshakeSrv.getKeyId());
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

    private static void getAccessToken() {
        SsoService ssoService = new SsoService();
        ClientInfoVo clientInfoVo = new ClientInfoVo();
        clientInfoVo.setClient_id(client_id);
        clientInfoVo.setClient_secret(client_secret);
        try {
            AccessTokenVo accessTokenVo = new AccessTokenVo
                    .Builder()
                    .setGrant_type(grant_type)
                    .setRedirect_uri(redirect_uri)
                    .setCode("9e80cf4bd4e7487abf64c74efecb5eab")
                    .setClientInfoVo(clientInfoVo)
                    .build();
            ssoService.getAccessToken(accessTokenVo, new OnGetResponseListenerGetAccessToken() {
                @Override
                public void onResponse(GetAccessTokenSrv getAccessTokenSrv) {
                    System.out.println("Access token: " + getAccessTokenSrv.getAccess_token() + "\n" +
                            "Refresh token: " + getAccessTokenSrv.getRefresh_token());
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

    private static void refreshAccessToken() {
        SsoService ssoService = new SsoService();
        ClientInfoVo clientInfoVo = new ClientInfoVo();
        clientInfoVo.setClient_id(client_id);
        clientInfoVo.setClient_secret(client_secret);
        try {
            RefreshAccessTokenVo refreshAccessTokenVo = new RefreshAccessTokenVo
                    .Builder()
                    .setGrant_type(EnumGrantType.REFRESH_TOKEN)
                    .setRefresh_token("c44fe6297fbf494b9cd8ed5924efd6bf")
                    .setClientInfoVo(clientInfoVo)
                    .build();

            ssoService.refreshAccessToken(refreshAccessTokenVo, new OnGetResponseListenerRefreshAccessToken() {
                @Override
                public void onResponse(RefreshAccessTokenSrv refreshAccessTokenSrv) {
                    System.out.println("Access token: " + refreshAccessTokenSrv.getAccess_token() + "\n" +
                            "Refresh token: " + refreshAccessTokenSrv.getRefresh_token());
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

    private static void getTokenInfo() {
        SsoService ssoService = new SsoService();
        ClientInfoVo clientInfoVo = new ClientInfoVo();
        clientInfoVo.setClient_id(client_id);
        clientInfoVo.setClient_secret(client_secret);

        try {
            TokenInfoVo tokenInfoVo = new TokenInfoVo
                    .Builder()
                    .setToken_type_hint(EnumTokenType.ACCESS_TOKEN)
                    .setToken("6185be1575534a49a0cf327f04d1fc6e")
                    .setClientInfoVo(clientInfoVo)
                    .build();

            ssoService.getTokenInfo(tokenInfoVo, new OnGetResponseListenerGetTokenInfo() {
                @Override
                public void onResponse(TokenInfoSrv tokenInfoSrv) {
                    System.out.println("Active state: " + tokenInfoSrv.getClient_id());
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

    private static void revokeToken() {
        SsoService ssoService = new SsoService();
        ClientInfoVo clientInfoVo = new ClientInfoVo();
        clientInfoVo.setClient_id(client_id);
        clientInfoVo.setClient_secret(client_secret);
        try {
            RevokeTokenVo revokeTokenVo = new RevokeTokenVo
                    .Builder()
                    .setToken_type_hint(EnumRevokeTokenType.ACCESS_TOKEN)
                    .setToken("bc9812bea6e54c28abd3714250dd3255")
                    .setClientInfoVo(clientInfoVo)
                    .build();

            ssoService.revokeToken(revokeTokenVo, new OnGetResponseListenerRevokeToken() {

                @Override
                public void onResponse(Void result) {
                    System.out.println("code : 200" + "\nmessage : " + "The operation was successful");
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

    private static String getLoginUrl() {
        SsoService ssoService = new SsoService();
        List<EnumScopeType> scops = new ArrayList<>();
        scops.add(EnumScopeType.EMAIL);
        scops.add(EnumScopeType.PROFILE);
        String url;


        LoginUrlVo loginUrlVo = null;
        try {
            loginUrlVo = new LoginUrlVo.Builder()

                    .setClientId("348205q060c48b7985ed9be002a2822")
                    .setResponseType(EnumResponseType.CODE)
                    .setRedirectUri("http://localhost:3000/sign-in")
                    .setScope(scops)
                    .build();
        } catch (PodException e) {
            e.printStackTrace();
        }
        url = loginUrlVo.getLink();
        return url;


    }
}
