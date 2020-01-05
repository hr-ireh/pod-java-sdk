package com.fanap.podNeshan;

import com.fanap.podNeshan.controller.PodNeshan;
import com.fanap.podNeshan.data.modelSrv.*;
import com.fanap.podNeshan.data.modelVo.*;
import com.fanap.podNeshan.exception.PodException;
import com.fanap.podNeshan.util.OnGetResponseListener;
import com.fanap.podNeshan.util.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */

public class Main {

    private static String TOKEN = "55c549bc0108451cbb9e6c3f8cd992a9";
    private static String API_KEY = "328a2508178d4d16b769712917c16dcc";


    public static void main(String[] args) {

        search();
//        reverseGeo();
//        direction();
//        noTrafficDirection();
//        distanceMatrix();
//        noTrafficDistanceMatrix();
//        mapMatching();
    }


    private static void search() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("AKUGFRR");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodNeshan podNeshan = new PodNeshan();


        try {
            SearchVo searchVo = new SearchVo.Builder(baseInfoVo)

                    .setTerm("حرم")
                    .setLat(59.6157432)
                    .setLng(36.2880443)
                    .build();
            podNeshan.search(searchVo, new OnGetResponseListener<SearchSrv>() {
                @Override
                public void onResponse(ResultVo<SearchSrv> result) {
                    System.out.println(result.getResult().getResult().getItems().get(10).getLocation().getY());
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


    private static void reverseGeo() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("AKUGFRR");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodNeshan podNeshan = new PodNeshan();

        try {
            ReverseGeoVo reverseGeoVo = new ReverseGeoVo.Builder(baseInfoVo)
                    .setLat(59.6157432)
                    .setLng(36.2880443)
                    .build();
            podNeshan.reverseGeo(reverseGeoVo, new OnGetResponseListener<ReverseGeoSrv>() {
                @Override
                public void onResponse(ResultVo<ReverseGeoSrv> result) {
                    System.out.println(result.getResult().getResult().getRouteName());
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


    private static void direction() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("AKUGFRR");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodNeshan podNeshan = new PodNeshan();
        Point[] origin = {new Point(59.6157432, 36.2880443)};
        Point[] destination = {new Point(36.307656, 59.530862)};
        Point[] waypoints = {new Point(36.306134, 59.544371), new Point(36.301223, 59.55407)};
        try {
            DirectionVo directionVo = new DirectionVo.Builder(baseInfoVo)
                    .setOrigin(origin)
                    .setDestination(destination)
                    .setWaypoints(waypoints)
                    .build();
            podNeshan.direction(directionVo, new OnGetResponseListener<DirectionSrv>() {
                @Override
                public void onResponse(ResultVo<DirectionSrv> result) {
                    System.out.println(result.getResult().getResult().getRoutes().get(0).getOverviewPolyline().getPoints());
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


    private static void noTrafficDirection() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("AKUGFRR");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodNeshan podNeshan = new PodNeshan();
        Point[] origin = {new Point(59.6157432, 36.2880443)};
        Point[] destination = {new Point(36.307656, 59.530862)};
        Point[] waypoints = {new Point(36.306134, 59.544371), new Point(36.301223, 59.55407)};
        try {
            NoTrafficDirectionVo noTrafficDirectionVo = new NoTrafficDirectionVo.Builder(baseInfoVo)
                    .setOrigin(origin)
                    .setDestination(destination)
                    .setWaypoints(waypoints)
                    .build();
            podNeshan.noTrafficDirection(noTrafficDirectionVo, new OnGetResponseListener<DirectionSrv>() {
                @Override
                public void onResponse(ResultVo<DirectionSrv> result) {
                    System.out.println(result.getResult().getResult().getRoutes().get(0).getLegs().get(0).getSteps().get(0).getManeuver());
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

    private static void distanceMatrix() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("AKUGFRR");

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodNeshan podNeshan = new PodNeshan();
        Point[] origin = {new Point(59.6157432, 36.2880443), new Point(36.304889, 59.544595)};
        Point[] destination = {new Point(36.307656, 59.530862), new Point(36.296865, 59.554208)};
        try {
            DistanceMatrixVo distanceMatrixVo = new DistanceMatrixVo.Builder(baseInfoVo)
                    .setOrigins(origin)
                    .setDestinations(destination)
                    .build();
            podNeshan.distanceMatrix(distanceMatrixVo, new OnGetResponseListener<DistanceMatrixSrv>() {
                @Override
                public void onResponse(ResultVo<DistanceMatrixSrv> result) {
                    System.out.println(result.getResult().getResult().getOriginAddresses());
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

    private static void noTrafficDistanceMatrix() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("AKUGFRR");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodNeshan podNeshan = new PodNeshan();
        Point[] origin = {new Point(59.6157432, 36.2880443)};
        Point[] destination = {new Point(36.307656, 59.530862), new Point(36.296865, 59.554208)};

        try {
            DistanceMatrixVo distanceMatrixVo = new DistanceMatrixVo.Builder(baseInfoVo)
                    .setOrigins(origin)
                    .setDestinations(destination)
                    .build();
            podNeshan.distanceMatrix(distanceMatrixVo, new OnGetResponseListener<DistanceMatrixSrv>() {
                @Override
                public void onResponse(ResultVo<DistanceMatrixSrv> result) {
                    System.out.println(result.getResult().getResult().getRows().get(0).getElements().get(0).getDuration().getText());
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

    private static void mapMatching() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("AKUGFRR");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodNeshan podNeshan = new PodNeshan();
        Point[] path = {new Point(36.299394, 59.606211)};


        try {
            MapMatchingVo mapMatchingVo = new MapMatchingVo.Builder(baseInfoVo)
                    .setPath(path)
                    .build();
            podNeshan.mapMatching(mapMatchingVo, new OnGetResponseListener<MapMatchingSrv>() {
                @Override
                public void onResponse(ResultVo<MapMatchingSrv> result) {
                    System.out.println(result.getResult().getResult());
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
