package com.vp.func.programming.func.inter;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> nameSupplier = () -> "VuthaPhai";

        List<Integer> list = List.of(31,55,41,23,44);

        Optional<Integer> firstEven = list.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

//        if (firstEven.isPresent()) {
//            System.out.println(firstEven.get()+10);
//        }
//        firstEven.ifPresent(integer -> System.out.println(integer + 10));


        //Use Supplier

        Integer evenNum = list.stream()
                .filter(n -> n%2 == 0)
                .findFirst()
                .orElseGet(() -> 0); //Use Supplier
        System.out.println(evenNum + 10);



       /* Integer findFirstEven = findFirstEven(list);
        if (findFirstEven != null) {
            System.out.println(findFirstEven + 20);
        }*/


    }

    private static Integer findFirstEven(List<Integer> list) {
        for(Integer n : list){
            if(n%2 == 0){
                return n;
            }
        }
        return null;
    }
}
