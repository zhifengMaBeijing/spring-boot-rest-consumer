package com.example.demo.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhife on 2017/7/31.
 */
public class TheFactory {

    private java.util.Map<String, TheInterface> algorithms;

    public TheFactory() {
        algorithms = new HashMap<>();
        algorithms.put(TheImplA.getType(), new TheImplA());
        algorithms.put(TheImplB.getType(), new TheImplB());
    }

    public Map<String, TheInterface> getAlgorithms() {
        return algorithms;
    }

    public static void main(String[] args){
        TheFactory f = new TheFactory();

        f.getAlgorithms().forEach((k,v)->System.out.println("k="+k+",v="+v));
    }

}
