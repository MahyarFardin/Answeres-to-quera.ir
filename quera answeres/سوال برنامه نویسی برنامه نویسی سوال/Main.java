import java.util.ArrayList;
import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        scan.nextLine();

        String [] names=new String[a];
        for (int i = 0; i < a; i++) {
            names[i]=scan.next();
        }


        for (int i=a-1;i>=0;i--)
            System.out.print(names[i]+" ");
    }
}
