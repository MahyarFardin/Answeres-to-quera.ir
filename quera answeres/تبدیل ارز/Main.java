//package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //=======================initializing variables
        Scanner scan= new Scanner(System.in);
        int debt=scan.nextInt();

        int amountOfA=scan.nextInt();
        int amountOfB=scan.nextInt();
        int amountOfC=scan.nextInt();

        int valueOfA=scan.nextInt();
        int valueOfB=scan.nextInt();
        int valueOfC=scan.nextInt();

        int counter=0;

        for(int i=0;i<=amountOfA;i++){
            if(i*valueOfA>debt)
                break;
            for(int j=0;j<=amountOfB;j++){
                if(j*valueOfB>debt || (i*valueOfA)+(j*valueOfB)>debt)
                    break;
                int temp=(debt-(i*valueOfA+j*valueOfB));
                if( temp%valueOfC==0 && temp/valueOfC<=amountOfC)
                    counter++;
            }
        }

        System.out.println(counter);

    }
}
