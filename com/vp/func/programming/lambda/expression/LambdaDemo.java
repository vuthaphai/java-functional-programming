package com.vp.func.programming.lambda.expression;

import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        /*MyPrinter printer = new MyPrinter() {
            @Override
            public void print(String text) {
                System.out.println(text);
            }
        };
        printer.print("Hello Sovan Dawin Heng");*/

//        MyPrinter printer = (String text) -> System.out.println(text);
        MyPrinter printer = (text) -> System.out.println(text); //Lambda type inferrene
        MyPrinter printer1 = text -> System.out.println(text);
        printer.print("Hello Dawin");

        /* Match Lambda to Interface
         * 1. Functional Interface
         * 2. Parameter of lambda must be the as in method of interface
         * 3. Same return type
         *
         */

        Info myinfo = () -> System.out.println("Company Infomation");
        myinfo.showInfo();

        Comparator<Integer> compareByNumber = (p1, p2) -> p1 - p2;

        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(15);
        list1.add(42);

        System.out.println(list1);
        System.out.println("===========================");

        Collections.sort(list1, compareByNumber);

        System.out.println(list1);


    }
}
