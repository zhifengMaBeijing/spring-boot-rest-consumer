package com.example.demo.consumer;

import org.springframework.web.client.RestTemplate;


/**
 * Created by zhife on 2017/7/29.
 */
public class QuoteRequest {


    public static Quote getQuote(String url) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject(url, Quote.class);
        return quote;
    }
}
