package com.vp.func.programming.func.inter;

import com.vp.func.programming.imperative_declarative.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
<<<<<<< HEAD

   /*     Comparator<Student> sortByAge = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };*/

        //Use lambda expression

//        Comparator<Student> sortByAge = (Student o1, Student o2) -> o1.getAge() - o2.getAge();
//        Comparator<Student> sortByAge = ( o1,  o2) -> o1.getAge() - o2.getAge();


         students.stream()
                 .filter(st -> st.getGender() == "F")
                 .limit(3)
                 .sorted(( o1,  o2) -> o1.getAge() - o2.getAge())
                 .forEach(System.out::println);
=======
         /*students.stream()
                 .filter(st -> st.getGender() == "F")
                 .limit(3)
                 .forEach(System.out::println);*/

        /*Map<String, List<Student>> mapGroupByGender = students.stream()
                .collect(Collectors.groupingBy(p -> p.getGender()));
                 System.out.println(mapGroupByGender);
                 */

        Map<Integer, List<Student>> mapGroupByAge = students.stream()
                .collect(Collectors.groupingBy(p -> p.getAge()));

        System.out.println(mapGroupByAge);

        Map<Integer, Long> mapGroupByAgeCount = students.stream()
                .collect(Collectors.groupingBy(p -> p.getAge(), Collectors.counting()));
        System.out.println(mapGroupByAgeCount);

        // group student who can vote and cannot vote

        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(st -> st.getAge() > 17));
        System.out.println(map);

>>>>>>> 4d904b8cb064d8104471f62fece9d3fe49766db6





    }
}
