import java.math.BigInteger;
import java.util.Scanner;

class java {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char b=scan.next().charAt(0);

        BigInteger fac=BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }

        String factorial=String.valueOf(fac);
        int counter=0;

        for (int i = 0; i < factorial.length(); i++) {
            if (factorial.charAt(i) == b) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
