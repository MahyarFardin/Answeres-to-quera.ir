import java.util.Scanner;

public class java {
    public static void Table(int number, int row, int column){
        System.out.print(row*column+" ");
        if (column == number) {
            System.out.println();
            row++;
            column=1;

            if (row == number+1) {
                System.exit(0);
            }
            Table(number,row,column);
        }
        column++;
        Table(number,row,column);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        Table(number,1,1);
    }
}
