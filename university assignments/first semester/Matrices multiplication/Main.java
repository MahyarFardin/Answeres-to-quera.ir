import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //initializing variables
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int d=scan.nextInt();
        int c=scan.nextInt();
        int matrix1[][]=new int[a][b];
        int matrix2[][]=new int[b][c];
        int matrix3[][]=new int[a][c];
        int sum=0;

        if(a<=0||b<=0||c<=0||d<=0)
        {
            System.out.println("invalid matrix size");
            return;
        }
        if (d!=b)
        {
            System.out.println("impossible to multiply");
            return;
        }
        //getting the first matrix
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                matrix1[i][j]=scan.nextInt();
            }
        }
        //getting the second matrix
        for (int i = 0; i < b; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matrix2[i][j]=scan.nextInt();
            }
        }

        //multiplication matrix
        for (int i = 0; i < a; i++)
        {

            for (int j = 0; j < c; j++)
            {
                sum=0;
                for (int j2 = 0; j2 < b; j2++)
                {
                    sum+=matrix1[i][j2]*matrix2[j2][j];
                }
                matrix3[i][j]=sum;
            }
        }

        //printing

        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
