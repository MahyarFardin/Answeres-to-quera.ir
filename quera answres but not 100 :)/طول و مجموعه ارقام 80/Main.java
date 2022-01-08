//package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        long length=scan.nextInt();
        int sum= scan.nextInt();

        if (sum >(9*length)|| length==0) {
            System.out.println("-1 -1");
            return;
        }

        int processSum=0;
        String[] temp;
        ArrayList<Integer> sumList=new ArrayList<Integer>();

        for (int i=(int)Math.pow(10,length-1);i<Math.pow(10,length);i++){
            processSum=0;
            temp=String.valueOf(i).split("");
            for(String s: temp){
                processSum+=Integer.parseInt(s);
            }
            if (processSum == sum) {
                sumList.add(i);
            }

        }

        if (sumList.size() == 0) {
            System.out.println("-1 -1");
            return;
        }
        else
            System.out.println(sumList.get(0)+" "+sumList.get(sumList.size()-1));
    }
}
