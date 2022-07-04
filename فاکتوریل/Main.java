import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fact=1;

        for (int i=1;i<=n;i++){
            fact *= i;
        }

        System.out.println(fact);
    }
}
