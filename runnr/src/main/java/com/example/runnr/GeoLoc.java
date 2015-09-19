package com.example.runnr;

/**
 * Created by timothy on 9/19/15.
 */
public class GeoLoc {

    private float longitude;
    private float latitude;

    public GeoLoc(float initLong, float initLat) {
            longitude = initLong;
            latitude = initLat;
            }

    public void setLatitude(Float newLat) {
        latitude = newLat;
    }

    public void setLongitude(Float newLong) {
        longitude = newLong;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
}
