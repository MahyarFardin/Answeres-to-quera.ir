import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int a= scan.nextInt();
        int b= scan.nextInt();
        boolean isSecondHalf=false;
        int times=0;

        int [] time=new int[n];
        for (int i = 0; i < n; i++) {
            times=scan.nextInt();

            if (times <= 45+a && isSecondHalf==false) {
                // empty if
            }
            else if(times>= 45+a+1 && times<= 90+b){
                isSecondHalf=true;
            }
            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");



    }
}
