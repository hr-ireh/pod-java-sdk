package com.fanap.baseService.sampleCode;

import com.fanap.podBaseService.controller.PodBaseService;
import com.fanap.podBaseService.data.modelSrv.GuildSrv;
import com.fanap.podBaseService.data.modelSrv.TagTreeCategorySrv;
import com.fanap.podBaseService.data.modelSrv.TagTreeSrv;
import com.fanap.podBaseService.data.modelVo.*;
import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.OnGetResponseListener;

import java.util.List;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class App {

    private static String TOKEN = "c43049a626e5462ab85c0a8e4028e9fe";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    public static void main(String[] args) {


//        addTagTreeCategory();
//        getTagTreeCategoryList();
//        updateTagTreeCategory();
//        addTagTree();
//        getTagTreeList();
//        updateTagTree();
//        getCurrencyList();
    }


    private static void addTagTreeCategory() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBaseService podBaseService = new PodBaseService();


        try {
            AddTagTreeCategoryVo addTagTreeCategoryVo = new AddTagTreeCategoryVo.Builder(baseInfoVo)
                    .setName("bbjjebbbb")
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podBaseService.addTagTreeCategory(addTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
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


    private static void getTagTreeCategoryList() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBaseService podBaseService = new PodBaseService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        try {
            GetTagTreeCategoryListVo getTagTreeCategoryListVo = new GetTagTreeCategoryListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podBaseService.getTagTreeCategoryList(getTagTreeCategoryListVo, new OnGetResponseListener<List<TagTreeCategorySrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeCategorySrv>> result) {
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

    private static void updateTagTreeCategory() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBaseService podBaseService = new PodBaseService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        try {
            UpdateTagTreeCategoryVo updateTagTreeCategoryVo = new UpdateTagTreeCategoryVo.Builder(baseInfoVo)
                    .setId(361L)
                    .setName("hi")
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podBaseService.updateTagTreeCategory(updateTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
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

    private static void addTagTree() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBaseService podBaseService = new PodBaseService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        try {
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .setName("ta222g2")
                    .setCategoryId(012L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
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


    private static void getTagTreeList() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBaseService podBaseService = new PodBaseService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
//                    .setCategoryId(441L)
//                    .setLevelCount(1)
                    .setLevel(0)
//                    .setParentId(1124L)
                    .setId(1121L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
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


    private static void updateTagTree() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBaseService podBaseService = new PodBaseService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        try {
            UpdateTagTreeVo updateTagTreeVo = new UpdateTagTreeVo.Builder(baseInfoVo)
                    .setId(854L)
                    .setName("hiiii   ")
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podBaseService.updateTagTree(updateTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
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

    private static void getCurrencyList() {
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBaseService podBaseService = new PodBaseService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            CurrencyListVo currencyListVo = new CurrencyListVo.Builder(baseInfoVo)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            podBaseService.getCurrencyList(currencyListVo, new OnGetResponseListener<List<GuildSrv>>() {
                @Override
                public void onResponse(ResultVo<List<GuildSrv>> result) {
                    System.out.println(result.getResult().get(0).getCode());
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
