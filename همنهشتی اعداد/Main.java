import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();

        for (int i = 2; i <Integer.max(n,m) ; i++) {
            if (m%i == n%i) {
                System.out.print(i+" ");
            }
        }
    }
}
