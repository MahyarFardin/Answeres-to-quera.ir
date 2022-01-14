//package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        String [] seperatedNumbers;
        seperatedNumbers=s.split("");
        String reverseNumber="";

        for (int i=seperatedNumbers.length-1; i>=0 ;i--){

            reverseNumber += seperatedNumbers[i];
        }

        if(s.equals(reverseNumber))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
