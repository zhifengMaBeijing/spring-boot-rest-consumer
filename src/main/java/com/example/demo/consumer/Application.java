package com.example.demo.consumer;

import org.slf4j.LoggerFactory;

/**
 * Created by zhife on 2017/7/29.
 */
public class Application {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(QuoteRequest.class);

    public static void main(String[] args) {

        String url = "http://gturnquist-quoters.cfapps.io/api/random";
        log.info(QuoteRequest.getQuote(url).toString());

    }
}
