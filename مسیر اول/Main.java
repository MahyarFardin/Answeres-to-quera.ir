//package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //this will check for prim numbers
    public static boolean PrimFinder(int number){
        if (number == 2)
            return true;
        else if(number%2==0 || number==1)
            return false;
        else
            for (int i = 1; i < 1+(number/2); i+=2) {
                if (number%i == 0 && i!=1) {
                    return false;
                }
            }

        return true;
    }


    //this will do the game it self
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();


        //number of times we are going to play
        for (int i = 0; i < a; i++) {
            System.out.println();
            int dim=scan.nextInt();
            int[][] board= new int[dim][dim];
            ArrayList<String> way= new ArrayList<String>();
            //initializing board
            for (int j = 0; j < dim; j++) {
                for (int k = 0; k < dim; k++) {
                    int temp= scan.nextInt();
                    if (PrimFinder(temp) == true) {
                        board[j][k]=0;
                        continue;
                    }
                    board[j][k]=temp;
                }
            }

            //determining start and end points
            int xstart=scan.nextInt();
            int ystart=scan.nextInt();
            int xend=scan.nextInt();
            int yend=scan.nextInt();
            boolean flagR=false,flagL=false,flagD=false,flagU=false,invalid=false;

            //game starts
            while (xstart != xend || ystart != yend){

                //Is Right valid?
                if(ystart+1<dim && board[xstart][ystart+1]==0 && flagL==false){
                    ystart++;
                    flagR=true;
                    flagL=false;flagD=false;flagU=false;
                    way.add("R");
                }
                else {
                    //Is down valid?
                    if(xstart+1<dim && board[xstart+1][ystart]==0 && flagU==false){
                        xstart++;
                        flagD=true;
                        flagL=false;flagR=false;flagU=false;
                        way.add("D");
                    }
                    else {
                        //Is left valid?
                        if(ystart-1>=0 && board[xstart][ystart-1]==0 && flagR==false){
                            ystart--;
                            flagL=true;
                            flagR=false;flagD=false;flagU=false;
                            way.add("L");
                        }
                        else {
                            //Is up valid?
                            if(xstart-1>=0 && board[xstart-1][ystart]==0 && flagD==false){
                                xstart--;
                                flagU=true;
                                flagR=false;flagD=false;flagL=false;
                                way.add("U");
                            }
                            else {
                                invalid=true;
                                break;
                            }

                        }

                    }
                }
            }

            if (invalid == true) {
                System.out.println("No Monaseb Masir!");
            }
            else{
                for(String s:way){
                    System.out.print(s);
                }
            }
        }

    }
}
