//package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int counter=0;
        int [] list=new int[n];

        for(int i=0;i<n;i++){
            list[i]=scan.nextInt();
        }

        Arrays.sort(list);

        for(int i=0;i<n;i++){
            for (int j = i+1; j < n; j++) {
                if (list[j]-list[i] ==1) {
                    counter++;
                }
                else if(list[j]-list[i] >= 1){
                    break;
                }
            }
        }

        System.out.println(counter);


    }
    //6 5 5 7 8 6 9
}
