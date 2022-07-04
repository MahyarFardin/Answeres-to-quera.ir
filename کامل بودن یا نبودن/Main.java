//package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int b=scan.nextInt();
        int sum=0;

        ArrayList<Integer> mge=new ArrayList<Integer>();
        for (int i = 1; i < b; i++) {
            if (b%i == 0) {
                mge.add(i);
            }
        }

        for (int t:mge)
            sum+=t;

        System.out.println(sum==b ? "YES":"NO");

    }
}
