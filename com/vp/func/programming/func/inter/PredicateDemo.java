package com.vp.func.programming.func.inter;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
//        Predicate<String> containA = text -> text.contains("a");
        Predicate<String> containA = text -> text.toLowerCase().contains("a");
        boolean hasA = containA.test("VuthaPhai");
        System.out.println(hasA);
    }
}
