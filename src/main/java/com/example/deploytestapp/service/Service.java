package com.example.deploytestapp.service;

import java.util.HashMap;
import java.util.Map;

public class Service {

    public static void main(String[] args) {

        System.out.println("solution(\"Wed\", 2) = " + solution("Wed", 2));
        System.out.println("solution(\"Wed\", 210) = " + solution("Wed", 2100));
        System.out.println("solution(\"Fri\", 5) = " + solution("Fri", 5));

        String abc = null;
        System.out.println("abc = " + abc);
    }

    public static String solution(String S, int K) {
        // write your code in Java SE 11
        int day =1;
        for (Map.Entry<Integer, String> eachEntry : getDayMap().entrySet()) {
            if(S.equals(eachEntry.getValue())){
                day=eachEntry.getKey();
                break;
            }
        }
        K = (K+day)%7;
        return getDayMap().get(K);
    }

    private static Map<Integer,String> getDayMap(){

        Map<Integer,String> daysMap = new HashMap<>();
        daysMap.put(1,"Mon");
        daysMap.put(2,"Tue");
        daysMap.put(3,"Wed");
        daysMap.put(4,"Thu");
        daysMap.put(5,"Fri");
        daysMap.put(6,"Sat");
        daysMap.put(7,"Sun");
        return  daysMap;
    }
}
