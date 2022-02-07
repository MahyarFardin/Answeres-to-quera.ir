import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        boolean caps=false;

        for (int i = 0; i < n; i++) {
            String input=scan.nextLine();
            if (input.equals("CAPS")) {
                caps= !caps;
            }
            else {
                if (caps == true) {
                    System.out.print(input.toUpperCase(Locale.ROOT));
                }
                else
                    System.out.print(input);
            }
        }
    }
}
