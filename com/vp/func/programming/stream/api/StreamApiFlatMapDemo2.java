package com.vp.func.programming.stream.api;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiFlatMapDemo2 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Vutha", 37, List.of("English", "Math","Khmer","IT")),
                new Student("Vutha", 37, List.of("English", "Math","Khmer","IT")),
                new Student("Dawin", 29, List.of("English", "Math","Khmer", "Accounting")),
                new Student("Dawin", 29, List.of("English", "Math","Khmer", "Accounting")),
                new Student("Thida", 23, List.of("Chimistry", "Math","Japenese")),
                new Student("Cheata", 37, List.of("English", "Math","Chinese")),
                new Student("Sopheak", 37, List.of("Physic", "Math","Khmer"))
        );

/*        Stream<List<String>> listStream = students.stream()
                .map(student -> student.getSubjects());
//                .map(Student::getSubjects);*/

/*        List<String> stringStream = students.stream()
                .flatMap(student -> student.getSubjects().stream())
                .distinct()
//                .collect(Collectors.toList());
                .toList();
        System.out.println(stringStream);*/

        Map<String, Long> collect = students.stream()
                .collect(Collectors.groupingBy(student -> student.getName(), Collectors.counting()));
        System.out.println(collect);
    }
}
