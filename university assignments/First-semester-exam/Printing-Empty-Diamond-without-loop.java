import java.util.Scanner;

public class  App{
    public static void printer(int length,int first,int second,int row,int column) {
        if (column==first || column==second) {
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }

        if (column==length && row<length/2) {
            column=0;
            row++;
            System.out.println();
            first--;
            second++;
            printer(length, first, second, row, column);
        }
        else if(column==length && row>=length/2){
            column=0;
            row++;
            System.out.println();
            first++;
            second--;
            printer(length, first, second, row, column);
        }
        
        if (length%2!=0 && row==length) {
            System.exit(0);
        }
        else if(length%2==0 && row==length+1){
            System.exit(0);
        }
        column++;
        printer(length, first, second, row, column);
    }
    public static void main(String []args) {
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        printer(length,(int) Math.floor(length/2),(int) Math.floor(length/2),0,0);
    }
}
