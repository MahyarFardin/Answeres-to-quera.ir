//package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);
        double[] root = new double[2];

        if(a==0 && b!=0){
            System.out.printf("%.3f",-(c/b));
        }
        else if (delta > 0) {
            root[0]=(-b+Math.sqrt(delta))/(2*a);
            root[1]=(-b-Math.sqrt(delta))/(2*a);
            System.out.printf("%.3f", Double.min(root[0], root[1]));
            System.out.println();

            System.out.printf("%.3f", Double.max(root[0], root[1]));
        }
        else if(delta==0 && b!=0){
            root[0]=-(-b/(2*a));
            System.out.printf("%.3f",root[0]);
        }
        else
            System.out.println("IMPOSSIBLE");
    }
}
