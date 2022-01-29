//package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int stairNumbers=scan.nextInt();
        int [] stairsHight=new int[stairNumbers];
        boolean up=false,down=false;
        int counter=0;

        for (int i = 0; i < stairNumbers; i++) {
            stairsHight[i]=scan.nextInt();
        }

        for (int i = 0; i < stairNumbers-1; i++) {
            if (stairsHight[i] > stairsHight[i+1]) {
                up=true;
                if (down == true) {
                    counter++;
                }
                down=false;
            }
            else {
                down=true;
                if (up == true) {
                    counter++;
                }
                up=false;
            }
            if (counter == 2) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
