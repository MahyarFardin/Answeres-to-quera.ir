import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int bottles= scan.nextInt();
        int liters= scan.nextInt();
        int wholeVolume=0;

        for (int i = 0; i < bottles; i++) {
            wholeVolume += scan.nextInt();
        }

        System.out.println(wholeVolume>=liters ? "YES":"NO");
    }
}
