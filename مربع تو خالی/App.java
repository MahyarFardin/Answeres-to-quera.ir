
import java.util.Scanner;

public class App {
    public static void HL(int a) {

        for (int i = 0; i < a; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

    public static void WL(int a, int b) {
        for (int i = 0; i < a; i++) {

            if (i < ((a - b) / 2) || i >= ((a + b) / 2)) {
                HL(a);
                continue;
            }

            for (int j = 0; j < a; j++) {
                if (j < ((a - b) / 2) || j >= ((a + b) / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        scan.close();

        if (a < b) {
            System.out.println("Wrong order!");
        } else if ((a - b) % 2 != 0) {
            System.out.println("Wrong difference!");
        } else {
            WL(a, b);
        }
    }
}

