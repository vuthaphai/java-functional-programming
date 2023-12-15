package com.vp.func.programming.func.inter;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> print = text -> System.out.println(text);

//        print.accept("Vutha is software engineer");

        List<Integer> list = List.of(23,30,50,49,65);
//        Consumer<List<Integer>> display = intList -> {
//            System.out.println("======================");
//            System.out.println(intList);
//        };

//        display.accept(list);

        Consumer<Integer> display2 = num -> System.out.println(num);

//        list.forEach(display2);

//        list.forEach(n -> System.out.print(n+","));

        //Method reference
        list.forEach(System.out::println);

    }
}
