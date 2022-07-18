import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] recursion = new int[n];
        if (n == 1) {
            System.out.println(1);
            return;
        }
        recursion[0] = 1;
        recursion[1] = 2;
        for (int i = 2; i < recursion.length; i++) {
            recursion[i] = recursion[i - 1] + recursion[i - 2];
        }

        System.out.println(recursion[n - 1]);

    }
}
