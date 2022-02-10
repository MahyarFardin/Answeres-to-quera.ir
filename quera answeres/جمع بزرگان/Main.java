import java.math.BigInteger;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BigInteger first=new BigInteger(scan.nextLine());
        String operator= scan.nextLine();
        BigInteger second=new BigInteger(scan.nextLine());

        if (operator.equals("*")) {
            System.out.println(first.multiply(second));
        }
        else
            System.out.println(first.add(second));
    }
}
