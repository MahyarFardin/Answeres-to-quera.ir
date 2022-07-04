import java.util.Random;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();


        System.out.println((int)(Math.ceil(c/2.0)*a+Math.floor(c/2.0)*b));
    }
}
