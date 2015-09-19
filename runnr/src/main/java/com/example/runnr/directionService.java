package com.example.runnr;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by Scott on 9/19/15.
 */
public class directionService {
    public getPath() {
    }

    public String getDirections(geoLoc[] initialPoints) {
        String url = "https://maps.googleapis.com/maps/api/directions/";
        SnapToRoadsService snapToRoadsService = new SnapToRoadsService();
        String snapped_json = snapToRoadsService.getSnappedWaypoints(geoLoc[] initialPoints);



    }

    private obtainJSON() {

    }
}
