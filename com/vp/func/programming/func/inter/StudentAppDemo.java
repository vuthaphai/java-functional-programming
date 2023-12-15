package com.vp.func.programming.func.inter;

import com.vp.func.programming.imperative_declarative.Student;

import java.util.List;

public class StudentAppDemo {

    private static List<Student> students = List.of(
            new Student(1,"Vutha","M", 37),
            new Student(2,"Bormey","F", 25),
            new Student(3,"Seyha","M", 18),
            new Student(4,"Tola","M", 19),
            new Student(5,"Cheata","F", 17),
            new Student(6,"Pheak","F", 16),
            new Student(7,"Van","F", 15),
            new Student(8,"Dalin","F", 20),
            new Student(9,"Mada","M", 20)
    );
    public static void main(String[] args) {
         students.stream()
                 .filter(st -> st.getGender() == "F")
                 .limit(3)

                 .forEach(System.out::println);





    }
}
