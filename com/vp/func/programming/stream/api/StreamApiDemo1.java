package com.vp.func.programming.stream.api;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo1 {

    static List<String> names = List.of("Vutha", "Dawin","Dawin", "Cheata", "thida", "Dany", "Seyha"); // Stream source


    public static void main(String[] args) {
//        collectDemo();
/*        List<Integer> collect = names.stream()
//                .distinct()
                .map(String::length)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);*/


    }






    //Distinct with collection and HasSet
    static void collectDemo(){
//        Set<String> nameSet = names.stream().collect(Collectors.toSet());
        Set<String> nameSet = new HashSet<>(names);
        System.out.println(nameSet);
    }

    void test2(){
        names.stream()
//                .limit(2)
//                .filter(name -> name.contains("t"))
//                .limit(2)
                .distinct()
                .forEach(System.out::println);

    }

    void test1(){
        Stream<String> streamName = names.stream();//Obtain stream instance
/*        long d = streamName
//                .filter(name -> name.contains("D"))
//                .map(name -> name.length())//Intermediate operation, lazy
                .map(String::length)//Intermediate operation, lazy
//                .forEach(System.out::println) //terminal operation
                .count();

        System.out.println(d);*/
    }
}
