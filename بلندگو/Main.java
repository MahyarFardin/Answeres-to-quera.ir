import java.util.Scanner;

public class java {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(input.charAt(i));
            }
            System.out.print(input.substring(i)+"\n");
        }
    }
}
