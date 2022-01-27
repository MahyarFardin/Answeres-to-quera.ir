import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int max=0;

        for (int i=0;i<n;i++){
            int temp=scan.nextInt();
            if (temp>max) {
                max=temp;
            }
        }

        System.out.println(max);
    }
}
