import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a= scan.nextInt();
        scan.nextInt();
        scan.nextLine();
        int counter=0;

        for (int i = 0; i < a; i++) {
            String [] temp=scan.nextLine().split("");
            for (String t:
                 temp) {
                if (t.equals("*")) {
                    counter++;
                } 
            }
        }

        System.out.println(counter);

    }
}
