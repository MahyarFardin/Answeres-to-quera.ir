//package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int b=scan.nextInt();
        int a=scan.nextInt();
        int c=scan.nextInt();

        if (    Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2) ||
                Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2) ||
                Math.pow(c,2)==Math.pow(b,2)+Math.pow(a,2)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");

    }
}
