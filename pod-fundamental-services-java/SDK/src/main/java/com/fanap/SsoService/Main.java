package com.fanap.SsoService;

import com.fanap.SsoService.controller.SsoService;
import com.fanap.SsoService.data.modelSrv.*;
import com.fanap.SsoService.data.modelVo.*;
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
    public static String client_id = "8143676n3b334f48ad57a37261fcd9bb";
    public static String client_secret = "ed914df1";
    public static String api_key = "db9a684c135843a7bc6cb4d4aafa6563";
    public static String sampleSignature = "L4pKBjweKcK8LWhg/+DV/gtPrMjpIH5fLmIOnMfHqvnTy08+qwFkXzlvODmYB6P7DWo3c+7+hicGHOZZdXS1DNG3LOoucTI/60NlvKePvrQzpuTbuDO6Soz4KIQ+gpethyV7UL88h6l8YVl1fY+r0B2r5p2RE7ElcfZg4TthkzM=";
    public static String sampleKeyID = "2053896bca5aa5c1560931570";
    public static String sampleIdentity = "shahabces@yahoo.com";
    public static String sampleHeader = "sampleHeader";
    public static String sample_uid = "5421548";

    public static void main(String[] args) {
//        getAccessToken();
//        refreshAccessToken();
//        getTokenInfo();
//        revokeToken();

//        handshake();
        authorize();
//        verify();
//        getAccessTokenByOtp();

//        getOtpScenario();
//        GetAccessTokenByOtpScenario("");
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
                    .setKeyId(sampleKeyID)
                    .setSignature(sampleSignature)
                    .setHeaders(sampleHeader)
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
                            .setClientInfoVo(clientInfoVo)
                            .setGrant_type(grant_type)
                            .setCode(verifySrv.getCode())
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
                            .setResponse_type("code")
                            .setKeyId(handshakeSrv.getKeyId())
                            .setSignature(sampleSignature)
                            .setHeaders(sampleHeader)
                            .setIdentity(sampleIdentity)
//                .setReferrer("")
//                .setReferrerType("")
//                .setState("")
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
                    .setResponse_type("code")
//                    .setKeyId(sampleKeyID)
//                    .setSignature(sampleSignature)
//                    .setHeaders(sampleHeader)
                    .setIdentity(sampleIdentity)
                    .setScope("email")
//                .setReferrer("")
//                .setReferrerType("")
//                .setState("")
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
                    .setIdentity(sampleIdentity)
                    .setOtp("")
                    .setKeyId(sampleKeyID)
                    .setSignature(sampleSignature)
                    .setHeaders(sampleHeader)
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
                    .setClientInfoVo(clientInfoVo)
                    .setGrant_type(grant_type)
                    .setCode("")
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
                    .setClientInfoVo(clientInfoVo)
                    .setGrant_type(grant_type)
                    .setRedirect_uri(redirect_uri)
                    .setCode("86650b1e4a124f07b6646dfc65c36724")
//                .setCode_verifier("")
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
                    .setClientInfoVo(clientInfoVo)
                    .setGrant_type("refresh_token")
                    .setRefresh_token("e5ded84ac41e479996c19932052f9605")
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
                    .setClientInfoVo(clientInfoVo)
                    .setToken_type_hint("refresh_token")
                    .setToken("e5ded84ac41e479996c19932052f9605")
                    .build();

            ssoService.getTokenInfo(tokenInfoVo, new OnGetResponseListenerGetTokenInfo() {
                @Override
                public void onResponse(TokenInfoSrv tokenInfoSrv) {
                    System.out.println("Active state: " + tokenInfoSrv.isActive());
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
                    .setClientInfoVo(clientInfoVo)
                    .setToken_type_hint("refresh_token")
                    .setToken("e5ded84ac41e479996c19932052f9605")
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
        List<String> scops = new ArrayList<>();
        scops.add("email");
        String url;


        LoginUrlVo loginUrlVo = null;
        try {
            loginUrlVo = new LoginUrlVo.Builder()

                    .setClientId(client_id)
                    .setResponseType("code")
                    .setRedirectUri(redirect_uri)
                    .setScope(scops)
                    .build();
        } catch (PodException e) {
            e.printStackTrace();
        }
        url = loginUrlVo.getLink();
        return url;


    }
}
