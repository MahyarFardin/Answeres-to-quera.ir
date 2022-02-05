import java.util.ArrayList;
import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String name= scan.next();

        for (int i = 0; i < a; i++) {
            System.out.print("copy of ");
        }

        System.out.println(name);

    }
}
