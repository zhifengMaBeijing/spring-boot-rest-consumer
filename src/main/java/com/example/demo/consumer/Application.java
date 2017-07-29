package com.example.demo.consumer;

import org.slf4j.LoggerFactory;

/**
 * Created by zhife on 2017/7/29.
 */
public class Application {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(QuoteRequest.class);
//https://github.com/googlemaps/google-maps-services-java
    //https://github.com/googlemaps/google-maps-services-java
    //AIzaSyC5w1Ke3Ql4p7Q7MJuJp_yc_gfa2yp5UxA
    //https://developers.google.com/maps/web-services/client-library
    public static void main(String[] args) {

        //String url = "http://gturnquist-quoters.cfapps.io/api/random";
        String url = "https://maps.googleapis.com/maps/api/geocode/json?address=Damascus,+Syrian&key=AIzaSyC5w1Ke3Ql4p7Q7MJuJp_yc_gfa2yp5UxA";
        //log.info(QuoteRequest.getQuote(url).toString());
        log.info(QuoteRequest.getGeo(url).toString());
    }
}
