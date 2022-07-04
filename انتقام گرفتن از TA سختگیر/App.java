import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int[] a = new int[n + 1];
        int[] b = new int[n + 1];

        a[0] = 1;
        a[1] = 0;
        b[0] = 0;
        b[1] = 1;

        for (int i = 2; i <= n; i++) {
            a[i]=a[i - 2] + 2 * b[i - 1];
            b[i]=a[i - 1] + b[i - 2];
        }

        System.out.println(a[n]*2);
    }
}
