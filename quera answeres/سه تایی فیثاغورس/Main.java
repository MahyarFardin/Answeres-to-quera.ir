import java.util.Scanner;
import java.util.Arrays;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum= scan.nextInt();
        int c=0;

        for(int i=1 ; i<=sum ; i++){
            for (int j = 1; j <sum-i ; j++) {
                c=sum-i-j;
                if (i*i+j*j == c*c || c*c+j*j == i*i ||i*i+c*c == j*j) {
                    System.out.println(i+" "+j+" "+c);
                    return;
                }
            }
        }

        System.out.println("Impossible");
    }
}
