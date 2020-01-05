package com.fanap.podNeshan.controller;

import com.fanap.podNeshan.data.modelVo.*;
import com.fanap.podNeshan.exception.PodException;
import com.fanap.podNeshan.service.Service;
import com.fanap.podNeshan.util.OnGetResponseListener;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class PodNeshan {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();


    /**
     * search.
     *
     * @param searchVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodNeshan search(SearchVo searchVo,
                            OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.search(searchVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * reverse.
     *
     * @param reverseGeoVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodNeshan reverseGeo(ReverseGeoVo reverseGeoVo,
                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.reverseGeo(reverseGeoVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * direction.
     *
     * @param directionVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodNeshan direction(DirectionVo directionVo,
                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.direction(directionVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * no Traffic Direction.
     *
     * @param noTrafficDirectionVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodNeshan noTrafficDirection(NoTrafficDirectionVo noTrafficDirectionVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.noTrafficDirection(noTrafficDirectionVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * distance Matrix.
     *
     * @param distanceMatrixVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodNeshan distanceMatrix(DistanceMatrixVo distanceMatrixVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.distanceMatrix(distanceMatrixVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * no Traffic DistanceSrv Matrix.
     *
     * @param noTrafficDistanceMatrix
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodNeshan noTrafficDistanceMatrix(NoTrafficDistanceMatrix noTrafficDistanceMatrix,
                                             OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.noTrafficDistanceMatrix(noTrafficDistanceMatrix, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * map Matching.
     *
     * @param mapMatchingVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodNeshan mapMatching(MapMatchingVo mapMatchingVo,
                                 OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.mapMatching(mapMatchingVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


}
