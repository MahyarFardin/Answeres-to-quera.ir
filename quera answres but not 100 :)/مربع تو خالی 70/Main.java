//package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int b=scan.nextInt();
        int a=scan.nextInt();

        if (a >= b || (b-a)%2!=0) {

            System.out.println("Wrong difference!");
            return;
        }

        if (b%2 == 0) {
            for (int i = 0; i < b; i++) {
                if (!((i >= Math.ceil(b / 2) - Math.ceil(a / 2))) || !(i <Math.ceil(b / 2) + Math.ceil(a / 2))) {
                    for (int j = 0; j < b; j++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = 0; j < b; j++) {
                        if (j >= Math.ceil(b / 2) - Math.ceil(a / 2) && j <Math.ceil(b / 2) + Math.ceil(a / 2)) {
                            System.out.print("  ");
                        } else
                            System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
        else{
            for (int i = 0; i < b; i++) {
                if (!((i >= Math.ceil(b / 2) - Math.ceil(a / 2))) || !(i <=Math.ceil(b / 2) + Math.ceil(a / 2))) {
                    for (int j = 0; j < b; j++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = 0; j < b; j++) {
                        if (j >= Math.ceil(b / 2) - Math.ceil(a / 2) && j <=Math.ceil(b / 2) + Math.ceil(a / 2)) {
                            System.out.print("  ");
                        } else
                            System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
