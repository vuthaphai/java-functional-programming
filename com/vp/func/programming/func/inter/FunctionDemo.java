package com.vp.func.programming.func.inter;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String, Integer> getLength = new ToLength();
        Integer stLength = getLength.apply("Vutha PHai");
        System.out.println(stLength);

        // ------------------
        Function<String,Integer> getLength2 = (String name) -> name.length();
        System.out.println(getLength2.apply("VuthaPhai"));

        //--------------------

        Function<String, Character> firstChar = text -> text.charAt(0);
        System.out.println(firstChar.apply("VuthaPhai"));

        //---------------------
        Function<Integer, Integer> power = n -> n*n;
        System.out.println(power.apply(4));


    }

   static class ToLength implements Function<String, Integer>{

        @Override
        public Integer apply(String t) {
            return t.length();
        }
    }

}
