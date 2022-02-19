import java.util.Scanner;

public class java {

    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();

        double half=(a+b+c+d)/2;

        System.out.printf("%.6f",Math.sqrt((half-a)*(half-b)*(half-c)*(half-d)));
    }
}
