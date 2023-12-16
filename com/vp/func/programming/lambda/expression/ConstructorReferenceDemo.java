package com.vp.func.programming.lambda.expression;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {

//        StudentService studentService = (name, age) -> new Student(name, age); // Use lambda expression
        StudentService studentService = Student::new; // Use Construct reference
        Student student = studentService.createStudent("Dawin", 29);
        System.out.println(student);


//        String st = String::new;
//         Use Construct reference
//        StringGenerator stringGenerator = array -> new String(array); // Use lambda expression
        StringGenerator stringGenerator = String::new; // Use Construct reference
        char[] ar = {'a','b','e'};

        String myString = stringGenerator.createString(ar);
        System.out.println(myString);



    }
}
