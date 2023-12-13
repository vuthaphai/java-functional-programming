package com.vp.func.programming.functionalInterface;

public class Main {

    //Functional Interface is SAM
    //SAM: Single Abstract Method

    public static void main(String[] args) {
        AddFive addFive = new AddFiveImpl();
        int result = addFive.add(20);
        System.out.println(result);

        AddNumber addNumber = new AddNumber() {
            @Override
            public int add(int number) {
                return number + 100;
            }
        };

        int add = addNumber.add(25);
        System.out.println(add);

        //===================

        AddNumber addNumberLambda = (int n) -> n + 300;
        System.out.println(addNumberLambda.add(20));
    }
}
