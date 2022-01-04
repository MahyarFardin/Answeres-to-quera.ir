import java.security.DomainCombiner;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Dimension=scan.nextInt();

        //head
        for(int i=0;i<Dimension;i++)
        {

            for (int j = 2*Dimension+(Dimension-i); j >0; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //body
        //up
        for (int i = 0; i < Dimension; i++)
        {

            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < (3*Dimension+1)-i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //middel
        for (int i = 0; i < Dimension; i++)
        {
            System.out.print(" ");
        }
        for (int i = 0; i < 2*Dimension+1; i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        //down
        for (int i = 0; i < Dimension; i++ )
        {
            for (int j = 0; j < Dimension-i-1; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < (3*Dimension+i-Dimension+2); k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //tail
        for(int i=0;i<Dimension;i++)
        {

            for (int j =0; j < 2*Dimension+1+i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <Dimension-i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
