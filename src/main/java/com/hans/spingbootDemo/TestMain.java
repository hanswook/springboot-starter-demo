package com.hans.spingbootDemo;

import java.math.BigDecimal;

public class TestMain {

    public static void main(String[] args) {
        String s = new BigDecimal(String.valueOf(0.0d)).stripTrailingZeros().toPlainString();
        System.out.println("s:" + s.toString());
    }
}
