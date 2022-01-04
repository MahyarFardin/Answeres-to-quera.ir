import java.util.Scanner;

public class Main {
    //this function will work on the rows and columns 
    public static boolean LinearChecker(int[][]table,int row , int column, int NewNumber){
        //this will check rows
        int counter=0;
        for (int i = 0; i < 9; i++) {
            if (table[i][column] == NewNumber) {
                counter++;
                if (counter == 2) {
                    return false;
                }
            }
        }
        counter=0;
        //this will check columns
        for (int i = 0; i < 9; i++) {
            if (table[row][i] == NewNumber) {
                counter++;
            }
            if (counter == 2) {
                return false;
            }
        }

        return true;

    }

    //this function will work on small squares
    public static boolean SquareChecker(int[][]table,int row , int column, int NewNumber) {
        int counter=0;
        int SquareRow=row-row%3;
        int SquareColumn=column-column%3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (NewNumber == table[i+SquareRow][j+SquareColumn]) {
                    counter++;
                }
                if (counter == 2) {
                    return false;
                }
            }

        }
        return true;
    }

    //this is a function hub
    public static boolean MainChecker(int[][]table, int row,int column,int NewNumber) {
        boolean firstFunction=LinearChecker(table,row,column,NewNumber);
        boolean secondFunction=SquareChecker(table,row,column,NewNumber);
        boolean Answere=firstFunction && secondFunction;
        return Answere;
    }


    //this is a recursive function which will correct it self each time it runs and
    //will replace wrong numbers
    public static boolean solver(int[][] table) {
        boolean MainChecker=false;
        for (int i=0;i<9;i++) {
            for (int j = 0; j < 9; j++) {
                if (table[i][j] == 0) {
                    for (int k = 1; k <=9; k++) {
                        table[i][j]=k;
                        MainChecker=MainChecker(table,i,j,k);
                        if (MainChecker == true && solver(table)==true) {
                            return true;
                        }
                        else
                            table[i][j]=0;
                    }
                    return false;
                }
            }
        }
        return true;
    }


    //this is the main function it will just initialize table
    public static void main(String[] args) {
        //initializing variables
        Scanner scan = new Scanner(System.in);
        int [][] table= new int[9][9];
        int n=scan.nextInt();
        String line;
        int a,b,c;

        //initializing table
        for(int i=0;i<n;i++)
        {
            a= scan.nextInt();
            b= scan.nextInt();
            c= scan.nextInt();
            table[a][b]=c;
        }
        if(solver(table)==true)
        {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(table[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}