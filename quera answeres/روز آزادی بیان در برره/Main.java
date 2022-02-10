import java.util.Scanner;

public class java {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);

        int a= scan.nextInt();
        boolean flag=false;
        int sum=0;

        for (int i = 0; i < 10000; i++) {
            sum += i;
            flag = !flag;
            if (i == a) {
                System.out.println(flag==false ? "Payin Barare":"Bala Barare");
                break;
            }
        }

    }
}
