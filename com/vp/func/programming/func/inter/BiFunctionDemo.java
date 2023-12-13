package com.vp.func.programming.func.inter;

import java.util.function.BiFunction;


public class BiFunctionDemo {
    public static void main(String[] args) {
        //Vutha, 2 => 16
        BiFunction<String, Integer, Integer> lengthAndPower = (text, power) -> (int) Math.pow(text.length(),power );
        Integer vutha = lengthAndPower.apply("Vutha", 3);
        System.out.println(vutha);
    }
}
