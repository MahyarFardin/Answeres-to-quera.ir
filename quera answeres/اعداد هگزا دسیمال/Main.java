//package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int counter=0;
        Queue<String> list= new LinkedList();
        list.add("1");

        while(true){
            String s1=list.peek();
            list.remove();
            String s2=s1;
            if (Integer.parseInt(s1)>n) {
                break;
            }
            counter++;
            list.add(s1+"0");
            list.add(s2+"1");
        }

        System.out.println(counter);
    }
}
