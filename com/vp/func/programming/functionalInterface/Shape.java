package com.vp.func.programming.functionalInterface;

@FunctionalInterface
public interface Shape {
    //FunctionalInterface has only abstract method
    double getArea();
   default void show(){
        System.out.println("This is new feature");
    };

    static void show3(){
        System.out.println("This is new feature");
    };
}
