package com.vp.func.programming.stream.api;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperatorDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Vutha Phai", "Sovan Dawin Heng","Sovan Dawin Heng", "Cheata", "thida", "Dany", "Seyha"); // Stream source

       /* boolean nameEndWithN = names.stream()
                .anyMatch(name -> name.endsWith("win"));
        System.out.println(nameEndWithN);*/

      /*  boolean allConstainerA = names.stream()
                .allMatch(p -> p.contains("a"));
        System.out.println(allConstainerA);*/

     /*   Stream<String> nameStream = names.stream();
        long count = nameStream.count();
        System.out.println(count);*/

      /*  Optional<String> findFirst = names.stream()
                .filter(name -> name.length() > 3)
                .findFirst();
        System.out.println(findFirst);*/

//        Optional<String> maxLengthName = names.stream()
//                .max((x, y) -> x.length() - y.length());
//        System.out.println(maxLengthName);

        //Reduce
        //Concate all name

//        Optional<String> concateName = names.stream()
//                .reduce((a, b) -> a + "-" + b);
//        System.out.println(concateName.get());

        String concteName2 = names.stream()
                .reduce("", (a, b) -> a + " => " + b);
        System.out.println(concteName2);

    }
}
