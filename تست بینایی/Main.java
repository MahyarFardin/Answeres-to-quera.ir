import java.util.ArrayList;
import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        String first=scan.nextLine();
        String second=scan.nextLine();
        int counter=0;

        for (int i = 0; i < n; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
