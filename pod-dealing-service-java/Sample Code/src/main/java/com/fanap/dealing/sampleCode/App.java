package com.fanap.dealing.sampleCode;

import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.*;
import com.fanap.podDealing.data.modelVo.*;
import com.fanap.podDealing.util.OnGetResponseListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  Z.Gholinia on 8/11/2019.
 */

public class App {

    private static String TOKEN = "c43049a626e5462ab85c0a8e4028e9fe";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    public static void main(String[] args) {


//        addUserAndBusiness();
//        listUserCreatedBusiness();
//        updateBusiness();
//        getApiTokenForCreatedBusiness();
//        rateBusiness();
//        commentBusiness();
//        businessFavorite();
//        userBusinessInfos();
//        commentBusinessList();
//        confirmComment();
//        guildList();
//        unconfirmComment();
//        addDealerProductPermission();
//        dealerProductPermissionList();
//        dealingProductPermissionList();
//        disableDealerProductPermission();
//        enableDealerProductPermission();
//        addDealer();
//        dealerList();
//        enableDealer();
//        disableDealer();
//        businessDealingList();
    }


    private static void addUserAndBusiness() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)

                .build();

        PodDealing podDealing = new PodDealing();


        List<String> permittedGuildCodeList = new ArrayList<>();
        String[] tags = {"tags1", "tags2"};
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("qghx")
                    .setBusinessName("rfghggb")
                    .setEmail("biiz.1biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
//                    .setTags(tags)

                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
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


    private static void listUserCreatedBusiness() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<Long> permittedBizIdList = new ArrayList<>();
        permittedBizIdList.add(5204L);
        PodDealing podDealing = new PodDealing();

        try {
            ListUserCreatedBusinessVo listUserCreatedBusinessVo = new ListUserCreatedBusinessVo.Builder(baseInfoVo)
                    .build();
            podDealing.listUserCreatedBusiness(listUserCreatedBusinessVo, new OnGetResponseListener<List<BusinessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessSrv>> result) {
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

    private static void updateBusiness() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        String[] tags = {"tags1", "tags2"};


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName("biz2")
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
//                    .setScVoucherHash(scVoucherHashs)
//                    .setTags(tags)
//                    .setTagTrees(tagTrees)
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
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


    private static void getApiTokenForCreatedBusiness() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            GetApiTokenForCreatedBusinessVo getApiTokenForCreatedBusinessVo = new GetApiTokenForCreatedBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(12564L)
                    .build();
            podDealing.getApiTokenForCreatedBusiness(getApiTokenForCreatedBusinessVo, new OnGetResponseListener<BusinessApiTokenSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessApiTokenSrv> result) {
                    System.out.println(result.getResult().getApiToken());
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

    private static void rateBusiness() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("6ed0ae116a5644b99fef974201ab01be")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            RateBusinessVo rateBusinessVo = new RateBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(12564L)
                    .setRate(2L)
                    .build();
            podDealing.rateBusiness(rateBusinessVo, new OnGetResponseListener<RateSrv>() {
                @Override
                public void onResponse(ResultVo<RateSrv> result) {
                    System.out.println(result.getResult().getRate());
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

    private static void commentBusiness() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessVo commentBusinessVo = new CommentBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(12564L)
                    .setText("akhjooon")
                    .build();
            podDealing.commentBusiness(commentBusinessVo, new OnGetResponseListener<Long>() {
                @Override
                public void onResponse(ResultVo<Long> result) {
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

    private static void businessFavorite() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            BusinessFavoriteVo businessFavoriteVo = new BusinessFavoriteVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setDisfavorite(true)
                    .build();
            podDealing.businessFavorite(businessFavoriteVo, new OnGetResponseListener<Boolean>() {
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

    private static void userBusinessInfos() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<Long> permittedIdList = new ArrayList<>();
        permittedIdList.add(5188L);
        PodDealing podDealing = new PodDealing();


        try {
            UserBusinessInfosVo userBusinessInfosVo = new UserBusinessInfosVo.Builder(baseInfoVo)
                    .setId(permittedIdList)
                    .build();
            podDealing.userBusinessInfos(userBusinessInfosVo, new OnGetResponseListener<List<UserBusinessInfoSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserBusinessInfoSrv>> result) {
                    System.out.println(result.getResult().get(0).getRate().getRate());
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


    private static void commentBusinessList() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setOffset(0)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
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

    private static void confirmComment() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("475fd39223cd47289a8977d0f73f1bf7")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            ConfirmCommentVo confirmCommentVo = new ConfirmCommentVo.Builder(baseInfoVo)
                    .setCommentId(7224L)

                    .build();
            podDealing.confirmComment(confirmCommentVo, new OnGetResponseListener<Boolean>() {
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

    private static void guildList() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            GuildListVo guildListVo = new GuildListVo.Builder(baseInfoVo)
                    .setOffset(1)
                    .setSize(3)
                    .build();
            podDealing.guildList(guildListVo, new OnGetResponseListener<List<GuildSrv>>() {
                @Override
                public void onResponse(ResultVo<List<GuildSrv>> result) {
                    System.out.println(result.getResult().get(2).getName());
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


    private static void unconfirmComment() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c26d02dc98b04325b2edb0b86bcf9fe1")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            UnconfirmCommentVo unconfirmCommentVo = new UnconfirmCommentVo.Builder(baseInfoVo)
                    .setCommentId(943L)

                    .build();
            podDealing.unconfirmComment(unconfirmCommentVo, new OnGetResponseListener<Boolean>() {
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


    private static void addDealer() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2bf53fedbd8a4e07ba73fe21e4e70cda")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            AddDealerVo addDealerVo = new AddDealerVo.Builder(baseInfoVo)
                    .setDealerBizId(9364L)
                    .build();
            podDealing.addDealer(addDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
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

    private static void dealerList() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2bf53fedbd8a4e07ba73fe21e4e70cda")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            DealerListVo dealerListVo = new DealerListVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .build();
            podDealing.dealerList(dealerListVo, new OnGetResponseListener<List<BusinessDealerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessDealerSrv>> result) {
                    System.out.println(result.getResult().get(0).getBusiness().getId());
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


    private static void enableDealer() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            EnableDealerVo enableDealerVo = new EnableDealerVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .build();
            podDealing.enableDealer(enableDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
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

    private static void disableDealer() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            DisableDealerVo disableDealerVo = new DisableDealerVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .build();
            podDealing.disableDealer(disableDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
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


    private static void businessDealingList() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            BusinessDealingListVo businessDealingListVo = new BusinessDealingListVo.Builder(baseInfoVo)
                    .build();
            podDealing.businessDealingList(businessDealingListVo, new OnGetResponseListener<List<BusinessDealerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessDealerSrv>> result) {
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

    private static void addDealerProductPermission() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            AddDealerProductPermissionVo addDealerProductPermissionVo = new AddDealerProductPermissionVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .setEntityId(30343L)
                    .build();
            podDealing.addDealerProductPermission(addDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
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

    private static void dealerProductPermissionList() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("99cb42376f6d4ec8ba6bbab265c79ff1")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            DealerProductPermissionListVo dealerProductPermissionListVo = new DealerProductPermissionListVo.Builder(baseInfoVo)
                    .build();
            podDealing.dealerProductPermissionList(dealerProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
                @Override
                public void onResponse(ResultVo<List<DealerProductPermissionSrv>> result) {
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


    private static void dealingProductPermissionList() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();
        try {
            DealingProductPermissionListVo dealingProductPermissionListVo = new DealingProductPermissionListVo.Builder(baseInfoVo)
                    .setSize(5)
                    .build();
            podDealing.dealingProductPermissionList(dealingProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
                @Override
                public void onResponse(ResultVo<List<DealerProductPermissionSrv>> result) {
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

    private static void disableDealerProductPermission() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            DisableDealerProductPermissionVo disableDealerProductPermissionVo = new DisableDealerProductPermissionVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .setEntityId(30343L)
                    .build();
            podDealing.disableDealerProductPermission(disableDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
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

    private static void enableDealerProductPermission() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("d23eeafbb48949e8944e94576ff78d83")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("SDFJKSHFJwshfJshfDJH")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodDealing podDealing = new PodDealing();

        try {
            EnableDealerProductPermissionVo enableDealerProductPermissionVo = new EnableDealerProductPermissionVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .setEntityId(30343L)
                    .build();
            podDealing.enableDealerProductPermission(enableDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
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
