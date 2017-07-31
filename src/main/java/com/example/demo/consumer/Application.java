package com.example.demo.consumer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import com.sun.deploy.net.HttpResponse;
import junit.framework.TestResult;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhife on 2017/7/29.
 */
public class Application {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(QuoteRequest.class);

//    GET /maps/api/geocode/json?address=Damascus,+Syrian&amp;key=AIzaSyC5w1Ke3Ql4p7Q7MJuJp_yc_gfa2yp5UxA HTTP/1.1
//    Host: maps.googleapis.com
//    Content-Type: application/json
//    Cache-Control: no-cache
//    Postman-Token: 2452770e-2268-af13-637d-33e4ffcef4f1

    //https://github.com/googlemaps/google-maps-services-java
    //https://github.com/googlemaps/google-maps-services-java
    static  String key = "AIzaSyC5w1Ke3Ql4p7Q7MJuJp_yc_gfa2yp5UxA";
    //https://developers.google.com/maps/web-services/client-library
    public static void main(String[] args) throws InterruptedException, ApiException, IOException {

        //String url = "http://gturnquist-quoters.cfapps.io/api/random";
        //String url = "https://maps.googleapis.com/maps/api/geocode/json?address=Damascus,+Syrian&key=AIzaSyC5w1Ke3Ql4p7Q7MJuJp_yc_gfa2yp5UxA";
        //log.info(QuoteRequest.getQuote(url).toString());
        //log.info(QuoteRequest.getGeo(url).toString());

//        GeoApiContext context = new GeoApiContext.Builder()
//                .apiKey(key)
//                .build();
        GeoApiContext ct = new GeoApiContext.Builder()
                .apiKey(key)
                .connectTimeout(3, TimeUnit.MINUTES)
                .readTimeout(3,TimeUnit.MINUTES)
                .maxRetries(10)
                .build();

        GeocodingResult[] results =  GeocodingApi.geocode(ct,
                "1600 Amphitheatre Parkway Mountain View, CA 94043").await();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(results[0].addressComponents));
    }

    public void onClick() {
        String url = "http://maps.googleapis.com/maps/api/geocode/json?latlng=40.714224,-73.961452&sensor=false";
        //创建一个HttpClient对象

    }
}
