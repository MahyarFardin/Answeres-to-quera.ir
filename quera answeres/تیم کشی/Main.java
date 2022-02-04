import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;

        for (int i = 0; i < 3 ; i++) {
            int a=scan.nextInt();
            int b=scan.nextInt();

            sum += Integer.min(a,b);
        }

        System.out.println(sum);
    }
}
