//package com.company;


import java.util.Scanner;

public class Main {
    public static boolean Finder(int number){
        if (number == 2)
            return true;
        else if(number %2 == 0 || number==1)
            return false;
        else
            for (int i = 3; i < (number/2)+1; i+=2) {
                if (number%i == 0) {
                    return false;
                }
            }

        return true;
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int first=scan.nextInt();
        int second=scan.nextInt();

        for (int i = first; i <=second; i++) {
            if(true==Finder(i)){
                System.out.println(i);
            }
        }
    }
}
