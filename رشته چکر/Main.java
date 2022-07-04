import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String first=scan.nextLine();
        String second=scan.nextLine();

        if (first.charAt(0) == second.charAt(second.length()-1)) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");


    }
}
