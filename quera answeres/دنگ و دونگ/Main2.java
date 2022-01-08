//package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //=======================initializing variables
        Scanner scan= new Scanner(System.in);
        int repeat=Integer.parseInt(scan.nextLine());
        int moneyPerPerson=0;

        for (int i = 0; i < repeat; i++) {
            int people=scan.nextInt();
            int wholeMoney=scan.nextInt();
            int tax=scan.nextInt();

            if (tax >= wholeMoney) {
                System.out.println(-1);
                continue;
            }

            moneyPerPerson=(wholeMoney-tax)/people;

            if(moneyPerPerson+tax == wholeMoney-((people-1)*moneyPerPerson) && moneyPerPerson+tax>0)
                System.out.println(moneyPerPerson);
            else
                System.out.println(-1);
        }



    }
}
