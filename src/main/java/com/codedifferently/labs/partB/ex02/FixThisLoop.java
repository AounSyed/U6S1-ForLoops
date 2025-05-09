package com.codedifferently.labs.partB.ex02;

public class FixThisLoop {

    public static String hello(){
        String response = "";
        int i = 0;
        while (i < 5)
        {
            System.out.println("Hello");
            i++;
        }
        return response;

    }
    public static void main(String[] args) {

        String outputFromHello = hello();
        System.out.println(outputFromHello);
    }
}
