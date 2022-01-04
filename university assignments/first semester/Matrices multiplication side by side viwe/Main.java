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

        int matrix1[][]=new int[a][b];
        int matrix2[][]=new int[b][c];
        int matrix3[][]=new int[a][c];
        //getting the first matrix
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                matrix1[i][j]=i>j ? i:j;
            }
        }
        //getting the second matrix
        for (int i = 0; i < b; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matrix2[i][j]=i<j ? i:j;
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
        int t=5;
        if(a==b)
            t=0;
        else if(a>b)
            t=a;
        else if(a<b)
            t=b;

        int counter=0,counter2=0;
        while(true)
        {
            if (t==0)
            {
                for (int i = 0; i < a; i++)
                {
                    for (int j = 0; j < b; j++)
                    {
                        System.out.print(matrix1[i][j]+" ");
                    }
                    if (i==(a-1)/2)
                    {
                        System.out.print("x ");
                    }
                    else
                        System.out.print("  ");
                    for (int j = 0; j < c; j++)
                    {
                        System.out.print(matrix2[i][j]+" ");
                    }
                    if (i==(a-1)/2)
                    {
                        System.out.print("= ");
                    }
                    else
                        System.out.print("  ");

                    for (int j = 0; j < c; j++)
                    {
                        System.out.print(matrix3[i][j]+" ");
                    }
                    System.out.println();
                }
                return;
            }
            if(t==a)
            {
                for (int i = 0; i < t; i++)
                {
                    for (int j = 0; j < b; j++)
                    {
                        System.out.print(matrix1[i][j]+" ");
                    }
                    if (i==(t-1)/2)
                    {
                        System.out.print("x ");
                    }
                    else
                        System.out.print("  ");
                    if (i>=Math.floor((t-b)/2) && i<(Math.floor((t-b)/2)+b))
                    {
                        for (int j = 0; j < c; j++)
                        {
                            System.out.print(matrix2[counter][j]+" ");
                        }
                        counter++;
                    }
                    else
                    {
                        for (int j = 0; j < c; j++)
                        {
                            System.out.print("  ");
                        }
                    }
                    if (i==(t-1)/2)
                    {
                        System.out.print("= ");
                    }
                    else
                        System.out.print("  ");

                    for (int j = 0; j < c; j++)
                    {
                        System.out.print(matrix3[i][j]+" ");
                    }
                    System.out.println();
                }

            }
            if(t==b)
            {
                for (int i = 0; i < t; i++)
                {
                    if (i>=Math.floor((t-a)/2) && i<(Math.floor((t-a)/2)+a))
                    {
                        for (int j = 0; j < b; j++)
                        {
                            System.out.print(matrix1[counter][j]+" ");
                        }
                        counter++;
                    }
                    else
                    {
                        for (int j = 0; j < b; j++)
                        {
                            System.out.print("  ");
                        }
                    }
                    if (i==(t-1)/2)
                    {
                        System.out.print("x ");
                    }
                    else
                        System.out.print("  ");

                    for (int j = 0; j < c; j++)
                    {
                        System.out.print(matrix2[i][j]+" ");
                    }
                    if (i==(t-1)/2)
                    {
                        System.out.print("= ");
                    }
                    else
                        System.out.print("  ");

                    if (i>=Math.floor((t-a)/2) && i<(Math.floor((t-a)/2)+a))
                    {
                        for (int j = 0; j < c; j++)
                        {
                            System.out.print(matrix3[counter2][j]+" ");
                        }
                        counter2++;
                    }
                    else
                    {
                        for (int j = 0; j < c; j++)
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();

                }

            }
            return;
        }

    }
}
