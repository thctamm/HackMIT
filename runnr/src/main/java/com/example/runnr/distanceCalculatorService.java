package com.example.runnr;


/**
 * Created by usa on 9/19/2015.
 */
public class distanceCalculatorService {
    public double[] generateNewPoint(){
        double R = 6378.1; //Radius of the Earth
        double bearing = 1.57; //Bearing is 90 degrees converted to radians.
        double d = 15; //distance in km

        double lat1 = Math.toRadians(52.20472); //Current lat point converted to radians
        double lon1 = Math.toRadians(0.14056);  //Current long point converted to radians

        double lat2 = Math.asin(Math.sin(lat1) * Math.cos(d / R) +
                Math.cos(lat1) * Math.sin(d / R) * Math.cos(bearing));

        double lon2 = lon1 + Math.atan2(Math.sin(bearing) * Math.sin(d / R) * Math.cos(lat1),
                Math.cos(d / R) - Math.sin(lat1) * Math.sin(lat2));

        lat2 = Math.toDegrees(lat2);
        lon2 = Math.toDegrees(lon2);

        //System.out.println(lat2);
        //System.out.println(lon2);
        double[] a = {lat2, lon2};
        return a;
    }
}
