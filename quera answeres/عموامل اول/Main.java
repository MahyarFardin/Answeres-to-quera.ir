import java.util.Scanner;

public class java
{
    public static void Function(int number, int p, boolean flag)
    {
        if (number == 1) {
            return;
        }
        int counter=0;

        while (number%p == 0){

            number /= p;
            counter++;
        }

        if (counter !=0) {

            if (flag==true) {
                System.out.print("*");
            }

            System.out.print(p);

            if (counter != 1) {
                System.out.print("^"+counter);
            }
            flag=true;
        }

        p++;
        Function(number,p,flag);
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();

        Function(number,2, false);

    }
}
 
