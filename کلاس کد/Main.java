//package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int counter=1;
        String s="";

        while (true){
            s+=counter;
            if (s.length() >= n) {
                System.out.println(s.charAt(n-1));
                System.exit(0);
            }

            counter++;
        }
    }
}
