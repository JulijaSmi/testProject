package com.company;

public class Calculator {
    public static void main(String[] args) {
        char operators = '*';
        double number1 = 20;
        double number2 = 30;
        double result = 0;

        if (operators == '+') {
            result = number1 + number2;
            System.out.println(result);
        } else if (operators == '-') {
            result = number1 - number2;
            System.out.println(result);
        } else if (operators == '/') {
            result = number1 / number2;
            System.out.println(result);
        } else if (operators == '*') {
            result = number1 * number2;
            System.out.println(result);
        }
    }
}