import java.util.Scanner;

public class java
{
    public static void fib(int low,int high)
    {
        if (high == 1) {
            System.out.println(1);
            return;
        }

        int temp=low;
        low = high-low;
        high=temp;
        System.out.println(high);

        fib(low,high);
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int n1=scan.nextInt();
        fib(n,n1);
    }
}
 
