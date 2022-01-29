//package com.company;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();

        switch (line){
            case "shanbe":
                System.out.println("perspolis");
                break;
            case "yekshanbe":
                System.out.println("bahman");
                break;
            case "doshanbe":
                System.out.println("perspolis");
                break;
            case "seshanbe":
                System.out.println("bahman");
                break;
            case "chaharshanbe":
                System.out.println("perspolis");
                break;
            case "panjshanbe":
                System.out.println("bahman");
                break;
            default:
                System.out.println("tatil");

        }
    }
}
