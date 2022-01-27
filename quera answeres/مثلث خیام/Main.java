import java.util.Scanner;

public class java {
    public static int [][] Khayam(int [][] triangle,int row,int column){
        triangle[row][column]=triangle[row-1][column-1] + triangle[row-1][column];
        column++;
        if (triangle[row][column] ==1) {
            row++;
            column=1;
            if (row==triangle.length) {
                return triangle;
            }
        }

        return triangle=Khayam(triangle,row,column);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();

        if (number == 1) {
            System.out.println(1);
            return;
        }
        if (number == 2) {
            System.out.println(1);
            System.out.println(1+" "+1);
            return;
        }

        int [][] triangle=new int[number][number];

        for (int i = 0; i < number; i++) {
            triangle[i][i]=1;
            triangle[i][0]=1;
        }

        triangle=Khayam(triangle,2,1);

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println();
        }
    }
}
