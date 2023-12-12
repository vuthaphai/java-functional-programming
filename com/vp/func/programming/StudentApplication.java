package com.vp.func.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentApplication {
    public static void main(String[] args) {

        List<Student> list1 = getStudentsImperativeStyle(students);
        System.out.println("----------Imperative Style");
        for(Student st: list1){
            System.out.println(st);
        }

        List<Student> list2 = getStudentsDeclarativeStyle(students);
        System.out.println("----------Declarative Style");
//        for(Student st: list2){
//            System.out.println(st);
//        }
//        list2.forEach(student -> {
//            System.out.println(student);
//        });

        list2.forEach(System.out::println);
    }

    //select first 3 female student to get git from team

    //imperative vs declarative

    private static List<Student> students = List.of(
            new Student(1,"Vutha","M", 37),
            new Student(2,"Bormey","F", 25),
            new Student(3,"Seyha","M", 18),
            new Student(4,"Tola","M", 19),
            new Student(5,"Cheata","F", 17),
            new Student(6,"Pheak","F", 16),
            new Student(7,"Van","M", 15),
            new Student(8,"Dalin","F", 20),
            new Student(9,"Mada","M", 20)
    );


public static List<Student> getStudentsImperativeStyle(List<Student> students) {
    List<Student> list = new ArrayList<>();
    int counter = 0;
    int limit = 3;
    for(Student st: students){
        if (st.getGender().equals("F")) {
            list.add(st);
            counter++;
        }
        if(counter == limit){
            break;
        }
    }
    return list;
}

    public static List<Student> getStudentsDeclarativeStyle(List<Student> students) {
    return students.stream()
            .filter(st -> st.getGender().equals("F"))
            .limit(3)
            .collect(Collectors.toList());
    }


}
