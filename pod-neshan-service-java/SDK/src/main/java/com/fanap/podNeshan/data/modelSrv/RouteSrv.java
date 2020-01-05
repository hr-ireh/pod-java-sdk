package com.fanap.podNeshan.data.modelSrv;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */


public class RouteSrv {


    private List<LegSrv> legs = null;
    private OverviewPolylineSrv overview_polyline;

    public List<LegSrv> getLegs() {
        return legs;
    }


    public void setLegs(List<LegSrv> legs) {
        this.legs = legs;
    }


    public OverviewPolylineSrv getOverviewPolyline() {
        return overview_polyline;
    }


    public void setOverviewPolyline(OverviewPolylineSrv overviewPolyline) {
        this.overview_polyline = overviewPolyline;
    }


}
