//package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static int SumOfDigits(int number){
        String [] digits=String.valueOf(number).split("");
        ArrayList<Integer> numericDigits=new ArrayList<Integer>();
        int sum=0;

        for (String s:digits)
            sum += Integer.parseInt(s);

        return sum;
    }

    public static ArrayList<Integer> RootFinder(int number){
        ArrayList<Integer> Answer=new ArrayList<Integer>();

        for (int i = 1; i <= number; i++) {
            if(number%i==0){
                if(PrimeFinder(i)==true && i!=1)
                    Answer.add(i);
            }
        }

        return Answer;
    }

    public static boolean PrimeFinder(int i){
        if (i == 2) {
            return true;
        }
        else if(i %2 == 0){
            return false;
        }
        else
            for (int j = 2; j <i/2 ; ++j) {
                if (i%j == 0) {
                    return false;
                }
            }
            return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int b=scan.nextInt();
        int sumResult=0;
        ArrayList<Integer> rootResult=new ArrayList<Integer>();
        boolean flag=false;

        for (int j = 0; j < b; j++) {
            int number = scan.nextInt();
            for (int i = 1; i < number; i++) {
                flag=false;
                sumResult = SumOfDigits(i);
                rootResult = RootFinder(i);

                int temp = 0;
                for (int p : rootResult) {
                    temp += p;
                }
                if (i + sumResult + temp == number) {
                    System.out.println("Yes");
                    flag=true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("No");
            }

        }
    }
}
