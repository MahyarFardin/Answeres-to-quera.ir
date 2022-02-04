import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();

        if (a > 100) {
            System.out.println("Steam");
            return;
        }
        else if (a < 0) {
            System.out.println("Ice");
            return;
        }

        System.out.println("Water");

    }
}
