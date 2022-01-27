import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=0;i<n;i++){
            if (i == 0 || i==n-1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for (int j=0 ; j< n-2 ; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
