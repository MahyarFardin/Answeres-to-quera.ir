import java.util.Scanner;

public class java
{
    public static void mypow(double res,double base,long exp, int counter)
    {
        if (counter == exp) {
            System.out.printf("%.3f",res);
            return;
        }
        res *= base;
        counter++;
        mypow(res,base,exp,counter);
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        double base=scan.nextDouble();
        long exp=scan.nextInt();

        mypow(1,base,exp,0);

    }
}
 
