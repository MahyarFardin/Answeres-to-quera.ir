import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();

        for (int i = 0; i < t; i++) {
            int p=scan.nextInt();
            if (p > 3) {
                System.out.println("*");
            }
            else {
                for (int j = 0; j < p; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
