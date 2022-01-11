import java.util.Scanner;

public class App {

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        String mainNumber= scan.nextLine();
        String [] digits=mainNumber.split("");

        for (String s:digits){
            System.out.print(s+": ");
            for (int i = 0; i < Integer.parseInt(s); i++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
