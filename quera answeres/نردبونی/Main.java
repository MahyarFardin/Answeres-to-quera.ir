import java.util.Scanner;

public class java {
    public static void Function(int first, int second) {
        if (second==0) {
            System.out.println(Math.abs(first));
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
