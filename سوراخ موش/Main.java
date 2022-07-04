import java.util.Scanner;

public class java {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);

        int start= scan.nextInt();
        int end=scan.nextInt();

        if (start == end) {
            System.out.println("Saal Noo Mobarak!");
            return;
        }

        String label= start>end ? "L":"R";

        for (int i = 0; i < Math.abs(start-end); i++) {
            System.out.print(label);
        }
    }
}
