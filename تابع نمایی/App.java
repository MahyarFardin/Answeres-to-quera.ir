import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();

        double factorial = 1;
        double answer = 0;

        for (int i = 0; i < n; i++) {
            if(i!=0)  factorial *= i;
            answer += Math.pow(x, i) / factorial;
        }

        System.out.printf("%.3f", answer);
    }
}