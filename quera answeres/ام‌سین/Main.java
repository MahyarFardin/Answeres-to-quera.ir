import java.util.Random;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        char c=97;

        for (int i = 0; i < t; i++) {
            c += i;
            System.out.println("s"+ c);
        }
    }
}
