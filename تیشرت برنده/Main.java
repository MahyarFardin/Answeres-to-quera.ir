import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        int c= scan.nextInt();
        int d= scan.nextInt();

        if (d <= b && a >= c) {
            System.out.println("yes");
            return;
        }

        System.out.println("no");
    }
}
