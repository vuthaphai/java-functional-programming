package com.vp.func.programming.lambda.expression;

public class MyFinderImp implements Finder{
    @Override
    public int find(String source, String textToFind) {
        return source.indexOf(textToFind);
    }
}
