import java.util.Scanner;

public class App {
    public static void Function(int first, int second) {
        if (first%second==0) {
            System.out.println(Math.abs(second));
            return;
        }
        else{
            Function(second,first % second);
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();

        Function(Integer.max(m, n),Integer.min(m, n));
    }
}
