package com.example.runnr;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by timothy on 9/19/15.
 */
public class SnapToRoadsService {

    boolean interpolate;
    String key;

    public SnapToRoadsService(Context c){
        key = c.getString(R.string.gmapsKey);
        Resources res = c.getResources();
        interpolate = res.getBoolean(R.bool.interpolate);
    }

    public String getSnappedWaypoints(GeoLoc[] initialPoints) {
        String URI = "https://roads.googleapis.com/v1/snapToRoads?path=";
        for(GeoLoc loc: initialPoints) {
            URI = URI.concat(Float.toString(loc.getLatitude()));
            URI = URI.concat(",");
            URI = URI.concat(Float.toString(loc.getLongitude()));
            URI = URI.concat("|");
        }
        URI = URI.substring(0, URI.length() - 1);
        URI = URI.concat("&interpolate=");
        URI = URI.concat(Boolean.toString(interpolate));
        URI = URI.concat("&key=");
        URI = URI.concat(key);

        RequestHandlerService requestHandlerService = new RequestHandlerService();
        return requestHandlerService.sendRequestAndGetResponse(URI);

    }
}
