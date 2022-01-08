//package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static int combination(int n, int k){
        int factorialN=1,factorialK=1;
        int counter=1;
        int factorialn_k=1;

        if (n == 0) {
            factorialN=1;
        }
        else
            for (int i = 1; i <=n; i++) {
                factorialN*=i;
            }

        if (k == 0) {
            factorialK=1;
        }
        else
            for (int i = 1; i <=k; i++) {
                factorialK*=i;
            }
        if (n-k == 0) {
            factorialn_k=1;
        }
        else
            for (int i = 1; i <=n-k; i++) {
                factorialn_k*=i;
            }

        int temp=0;
        temp=factorialN/((factorialK)*(factorialn_k));
        return temp;
    }
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int a=scan.nextInt();
        int n=scan.nextInt();
        int combinationRresult;
        int temp=1;
        int finalAnswere=0;

        for (int k = 0; k <=n; k++) {
            combinationRresult=combination(n,k);
            temp=combinationRresult*(int)Math.pow(x,k)*(int)Math.pow(a,n-k);
            finalAnswere+=temp;
        }

        System.out.println(finalAnswere);

    }
}
