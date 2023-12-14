package com.vp.func.programming.func.inter;

import java.util.List;

public class FunctionalInterfaceUsageDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Vutha","Bormey","Dalin","Tepy");

        //Print all
        System.out.println("==============Print all================");
        names.stream()
                .forEach(name -> System.out.println(name));



        //Print upper
        System.out.println("===============Print upper===============");
        names.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        //Print only length >4
        System.out.println("==============rint only length >4================");
        names.stream()
                .filter(name -> name.length()>4)
                .forEach(System.out::println);



    }
}
