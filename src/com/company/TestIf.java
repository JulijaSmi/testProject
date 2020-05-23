package com.company;

import org.w3c.dom.ls.LSOutput;

public class TestIf {
    public static void main(String[] args) {

        double temperature = 80.0;
        if (temperature >= 80.1) {
            System.out.println("Hot!");
        }else{
            System.out.println("Ok!");
            System.out.println("----------------------");

            double temp = 80.0;
            if (temp > 80.1) {
                System.out.println("Hot!");
            }else if (temp >= 75){
                    System.out.println("Just right!");
            }else if (temp < 75)
            System.out.println("Cold!");
            }

        }
    }







