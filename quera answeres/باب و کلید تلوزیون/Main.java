import java.util.ArrayList;
import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int x=scan.nextInt();
        int k=scan.nextInt();
        String []channel=new String[n];
        scan.nextLine();


        for (int i = 0; i < n; i++) {
            channel[i]=scan.nextLine();
        }

        if ((k+x)%n == 0) {
            System.out.println(channel[n-1]);
            return;
        }
        System.out.println(channel[(k+x)%n-1]);
    }
}
