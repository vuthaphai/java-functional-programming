package com.vp.func.programming.lambda.expression;

import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        MyPrinter printer1 = text -> System.out.println(text);
        printer1.print("Hello Dawin");

        Calculator calculator = new MyCalculator();
        Calculator calculator1 = (n1,n2) -> n1*n2*10; // lambda act like as object



    }

  static class MyCalculator implements Calculator {

       @Override
       public int calcu(int a, int b) {
           return (a+b) *2;
       }
   }

    void test1(){

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

       /* Info myinfo = () -> System.out.println("Company Infomation");
        myinfo.showInfo();

        Comparator<Integer> compareByNumber = (p1, p2) -> p1 - p2;

        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(15);
        list1.add(42);

        System.out.println(list1);
        System.out.println("===========================");

        Collections.sort(list1, compareByNumber);

        System.out.println(list1);*/

        List<String> list2 = new ArrayList<>();

        list2.add("thida");
        list2.add("vada");
        list2.add("bormey");
        list2.add("dawin");

//        System.out.println(list2);
//
////        Collections.sort(list2, (p1,p2) -> p1.compareTo(p2));
//        Collections.sort(list2,(o1, o2) -> o1.compareTo(o2));
////        list2.sort(String::compareTo);
//        System.out.println("After sorted");
//        System.out.println(list2);

        Map<String, Long> priceMap = new HashMap<>();
        priceMap.put("Apple", 30L);

//        Calculator calculator = (a,b) -> a+b;
//        Calculator calculator = Integer::sum;

        Calculator calculator = (a,b) -> {
            a = a*2;
            System.out.println(a + "*" + b + "=?");
            return a * b;
        };

        System.out.println(calculator.calcu(3,6));

    }
}
