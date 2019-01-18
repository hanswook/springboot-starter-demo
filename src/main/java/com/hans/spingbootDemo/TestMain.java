package com.hans.spingbootDemo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class TestMain {

    public static void main(String[] args) {
//        test1();
        test2();

    }

    private static void test2() {
        String s1="core java";
        String s2=" Core java ";

        System.out.println("s1:"+s1.equalsIgnoreCase(s2));
        System.out.println("index:"+s1.indexOf("ja"));
        System.out.println("s2.length："+s2.length());
        String trim = s2.trim();
        System.out.println("s2.length："+s2.length());
        System.out.println("trim.length："+trim.length());
    }

    private static void test1() {

        String s = new BigDecimal(String.valueOf(0.0d)).stripTrailingZeros().toPlainString();
        System.out.println("s:" + s.toString());

        Map<String, Map<String, String>> mapMap;

        mapMap = new HashMap<>();

        Map<String, String> stringStringMap = mapMap.get("1");

        System.out.println("stringStringMap:" + (null == stringStringMap));

        if (stringStringMap == null) {
            stringStringMap = new HashMap<>();
            mapMap.put("1", stringStringMap);
        }
        stringStringMap.put("2-2key", "2-2value");


        String s1 = stringStringMap.get("1-1");
        System.out.println("s1:" + (null == s1));


        String s2 = mapMap.get("1").get("2-2key");
        System.out.println("s2:" + (null == s2));
    }
}
