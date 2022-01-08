//package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int dim=scan.nextInt();
        double[] numlist= new double[dim];

        double min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,mean=0;

        for (int i = 0; i < dim; i++) {
            numlist[i]=scan.nextDouble();
            max=Double.max(numlist[i],max);
            min=Double.min(numlist[i],min);
            mean+=numlist[i];
        }
        System.out.printf("Max: %.3f",max);
        System.out.println();
        System.out.printf("Min: %.3f",min);
        System.out.println();
        System.out.printf("Avg: %.3f",(double)mean/dim);
    }
}
