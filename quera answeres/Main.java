//package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();

        for (int i = 0; i < number/2+1; i++) {
            for (int j = i; j < number/2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <2*i+1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < (number-1)-(i*2); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <2*i+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = number/2-1; i >=0 ; i--) {
            for (int j = i; j < number/2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <2*i+1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < (number-1)-(i*2); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <2*i+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
