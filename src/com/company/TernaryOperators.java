package com.company;

public class TernaryOperators {
    public static void main(String[] args) {
        int time = 20;
        if(time<18){
            System.out.println("Good day!");
        }else{
            System.out.println("Good evening!");
        }
        String result = (time < 18) ? "Good day!" : "Good evening!";

        System.out.println(result);
        int time1 = 17;
        boolean result1 = (time1 <18) ? true : false;
        System.out.println(result1);
    }
}
