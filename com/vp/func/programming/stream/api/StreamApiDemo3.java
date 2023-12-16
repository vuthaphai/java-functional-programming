package com.vp.func.programming.stream.api;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiDemo3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(23,45,25,12,15);
//        Integer total = list.stream().reduce(0, (a, b) -> a + b); //Use lambda expression
        Integer total = list.stream().reduce(0, Integer::sum);//Use method reference
        System.out.println(total);

        List<String> names = List.of("Vutha Phai","Vutha Phai", "Sovan Dawin Heng","Sovan Dawin Heng", "Seyma", "Sokcheng", "Dany", "Seyha"); // Stream source

        Map<String, Long> mapListString = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapListString);


    }
}
