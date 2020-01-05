package com.fanap.podNeshan.service;

import com.fanap.podNeshan.data.modelSrv.*;
import com.fanap.podNeshan.data.modelVo.*;
import com.fanap.podNeshan.util.GetResult;
import com.fanap.podNeshan.util.OnGetResponseListener;
import com.fanap.podNeshan.util.RetrofitUtil;
import com.fanap.podNeshan.util.ServerTypeSelectionUtil;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class Service {


    public void search(SearchVo searchVo,
                       OnGetResponseListener onGetResponseListener) {

        PodNeshan service = RetrofitUtil
                .getInstance()
                .create(PodNeshan.class);

        new GetResult<SearchSrv>(service.search(
                searchVo.getBaseInfoVo().getToken(),
                searchVo.getBaseInfoVo().getToken_issuer(),
                searchVo.getScProductId(),
                searchVo.getBaseInfoVo().getScVoucherHash(),
                searchVo.getBaseInfoVo().getScApiKey(),
                searchVo.getTerm(),
                searchVo.getLat(),
                searchVo.getLng()
        ), onGetResponseListener).get();
    }

    public void reverseGeo(ReverseGeoVo reverseGeoVo,
                           OnGetResponseListener onGetResponseListener) {

        PodNeshan service = RetrofitUtil
                .getInstance()
                .create(PodNeshan.class);

        new GetResult<ReverseGeoSrv>(service.reverseGeo(
                reverseGeoVo.getBaseInfoVo().getToken(),
                reverseGeoVo.getBaseInfoVo().getToken_issuer(),
                reverseGeoVo.getScProductId(),
                reverseGeoVo.getBaseInfoVo().getScVoucherHash(),
                reverseGeoVo.getBaseInfoVo().getScApiKey(),
                reverseGeoVo.getLat(),
                reverseGeoVo.getLng()
        ), onGetResponseListener).get();
    }


    public void direction(DirectionVo directionVo,
                          OnGetResponseListener onGetResponseListener) {

        PodNeshan service = RetrofitUtil
                .getInstance()
                .create(PodNeshan.class);

        new GetResult<DirectionSrv>(service.direction(
                directionVo.getBaseInfoVo().getToken(),
                directionVo.getBaseInfoVo().getToken_issuer(),
                directionVo.getScProductId(),
                directionVo.getBaseInfoVo().getScVoucherHash(),
                directionVo.getBaseInfoVo().getScApiKey(),
                directionVo.getOrigin(),
                directionVo.getDestination(),
                directionVo.getWaypoints(),
                directionVo.getAvoidTrafficZone(),
                directionVo.getAvoidOddEvenZone(),
                directionVo.getAlternative()
        ), onGetResponseListener).get();
    }


    public void noTrafficDirection(NoTrafficDirectionVo noTrafficDirectionVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodNeshan service = RetrofitUtil
                .getInstance()
                .create(PodNeshan.class);

        new GetResult<DirectionSrv>(service.noTrafficDirection(
                noTrafficDirectionVo.getBaseInfoVo().getToken(),
                noTrafficDirectionVo.getBaseInfoVo().getToken_issuer(),
                noTrafficDirectionVo.getScProductId(),
                noTrafficDirectionVo.getBaseInfoVo().getScVoucherHash(),
                noTrafficDirectionVo.getBaseInfoVo().getScApiKey(),
                noTrafficDirectionVo.getOrigin(),
                noTrafficDirectionVo.getDestination(),
                noTrafficDirectionVo.getWaypoints(),
                noTrafficDirectionVo.getAvoidTrafficZone(),
                noTrafficDirectionVo.getAvoidOddEvenZone(),
                noTrafficDirectionVo.getAlternative()
        ), onGetResponseListener).get();
    }


    public void distanceMatrix(DistanceMatrixVo distanceMatrixVo,
                               OnGetResponseListener onGetResponseListener) {

        PodNeshan service = RetrofitUtil
                .getInstance()
                .create(PodNeshan.class);

        new GetResult<DistanceMatrixSrv>(service.distanceMatrix(
                distanceMatrixVo.getBaseInfoVo().getToken(),
                distanceMatrixVo.getBaseInfoVo().getToken_issuer(),
                distanceMatrixVo.getScProductId(),
                distanceMatrixVo.getBaseInfoVo().getScVoucherHash(),
                distanceMatrixVo.getBaseInfoVo().getScApiKey(),
                distanceMatrixVo.getOrigins(),
                distanceMatrixVo.getDestinations()

        ), onGetResponseListener).get();
    }

    public void noTrafficDistanceMatrix(NoTrafficDistanceMatrix noTrafficDistanceMatrix,
                                        OnGetResponseListener onGetResponseListener) {

        PodNeshan service = RetrofitUtil
                .getInstance()
                .create(PodNeshan.class);

        new GetResult<DistanceMatrixSrv>(service.noTrafficDistanceMatrix(
                noTrafficDistanceMatrix.getBaseInfoVo().getToken(),
                noTrafficDistanceMatrix.getBaseInfoVo().getToken_issuer(),
                noTrafficDistanceMatrix.getScProductId(),
                noTrafficDistanceMatrix.getBaseInfoVo().getScVoucherHash(),
                noTrafficDistanceMatrix.getBaseInfoVo().getScApiKey(),
                noTrafficDistanceMatrix.getOrigins(),
                noTrafficDistanceMatrix.getDestinations()

        ), onGetResponseListener).get();
    }

    public void mapMatching(MapMatchingVo mapMatchingVo,
                            OnGetResponseListener onGetResponseListener) {

        PodNeshan service = RetrofitUtil
                .getInstance()
                .create(PodNeshan.class);

        new GetResult<MapMatchingSrv>(service.mapMatching(
                mapMatchingVo.getBaseInfoVo().getToken(),
                mapMatchingVo.getBaseInfoVo().getToken_issuer(),
                mapMatchingVo.getScProductId(),
                mapMatchingVo.getBaseInfoVo().getScVoucherHash(),
                mapMatchingVo.getBaseInfoVo().getScApiKey(),
                mapMatchingVo.getPath()

        ), onGetResponseListener).get();
    }


}
