package com.vp.func.programming.functionalInterface;

public interface Test {
    void show();
    default void show2(String name){
        System.out.println(name);
    };

    static int getNumber(){
        return 2;
    }
}
