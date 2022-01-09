//package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();
        int base= scan.nextInt();
        String list="";
        ArrayList<String> answer=new ArrayList<String>();

        if (base > 10) {
            for(int i=0;i<10;i++){
                list += i;
            }
            for (int i = 0; i < base-10; i++) {
                char A='A';
                A += i;
                list += String.valueOf(A);
            }
        }
        else {
            for(int i=0;i<base;i++){
                list += i;
            }
        }

        if (number < base) {
            System.out.println(list.charAt(number));
        }
        else {
            while (number >= base){
                int remainder=number % base;
                answer.add(String.valueOf(list.charAt(remainder)));
                number /= base;
            }

            answer.add(String.valueOf(list.charAt(number)));

            for (int i = answer.size()-1; i>= 0; i--) {
                System.out.print(answer.get(i));
            }
        }

    }
}
