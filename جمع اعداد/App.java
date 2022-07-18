import java.math.BigInteger;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        BigInteger numbers = new BigInteger("0");
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String temp = scanner.nextLine();
            numbers = numbers.add(new BigInteger(temp));
        }

        System.out.println(numbers);
    }

}
