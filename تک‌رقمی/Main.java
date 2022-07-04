import java.util.Scanner;

public class java {
    public static void summer(String input){
        int sum=0;
        String [] digits=input.split("");

        for (int i = 0; i < digits.length; i++) {
            sum += Integer.parseInt(digits[i]);
        }

        if (sum < 10) {
            System.out.println(sum);
            return;
        }

        summer(String.valueOf(sum));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();

        summer(input);
    }
}
