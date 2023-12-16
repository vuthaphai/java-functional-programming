package com.vp.func.programming.lambda.expression;

public class MedthodReferenceDemo {
    public static void main(String[] args) {
        Finder finder = new MyFinderImp(); // Use OOP
        String text = "Welcome to Cambodia";
        int index = finder.find(text,"to");
        System.out.println("Use OOP: "+index);

        Finder finder1 = FindText::getIndexFromString; //Use Method Reference
        int indexFound = finder1.find("Vutha phai is the Software engineer", "is");
        System.out.println("Use Method Reference: "+indexFound);


        Finder finder2 = (text1, text2) -> text1.indexOf(text2)+ 20; // Use Lambda expression
        System.out.println("User Lambda Expression: "+ finder2.find("Vutha phai is the Software engineer", "is"));




//        Instance method reference
     /*   MyFinder2 myFinder2 = new MyFinder2();
        Finder finderNew = myFinder2::find1;
        Finder finderNew2 = MyFinder2::find;
        System.out.println("Instance method reference: "+finderNew.find("test","e"));
        System.out.println("Instance method reference2: "+finderNew2.find("test","e"));*/

        //Use Method Reference
//        MyPrinter myPrinter = s -> System.out.println(s);
//        myPrinter.print("Test method reference");
//
//        MyPrinter myPrinter1 = System.out::println;
//        myPrinter1.print("Hello Dawin");

        //Parameter method reference

        Finder finder3 = String::indexOf;
        int indexFound1 = finder3.find("Vutha Phai is the software engineer", "is");
        System.out.println("Parameter method reference: "+indexFound1);


    }
}
