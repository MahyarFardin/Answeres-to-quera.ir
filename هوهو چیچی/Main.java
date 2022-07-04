import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int temp=scan.nextInt();

        for (int i=2; i<=temp; i+=2) {
            System.out.print(i+" ");
        }

        for (int i=1; i<=temp; i+=2) {
            System.out.print(i+" ");
        }
    }
}
