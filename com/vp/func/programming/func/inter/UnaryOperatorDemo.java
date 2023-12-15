package com.vp.func.programming.func.inter;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> toUpperCase = (String n) ->n.toUpperCase();
        UnaryOperator<String> toUpperCase1 = String::toLowerCase;
        String upper = toUpperCase1.apply("VUTHA PHAi");
        System.out.println(upper);

        //--------------
        UnaryOperator<Integer> power = n -> n*n;

        Integer apply = power.apply(5);
        System.out.println(apply);
        
        
//        Vutha => 5 => 25

        Function<String, Integer> toLength = String::length;
        Function<Integer, Integer> myPower = n -> n * n;
        Integer vutha = toLength.andThen(myPower).apply("VuthaPhai");
        System.out.println(vutha);
    }
}
