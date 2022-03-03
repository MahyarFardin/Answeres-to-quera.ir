import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int t=scan.nextInt();

        double sum=0;
        for (int i = 0; i<= t/2; i++) {
            sum += Integer.min(i, t-i);
        }

        sum *= 2;

        System.out.println(sum/(t+1));

    }
}
