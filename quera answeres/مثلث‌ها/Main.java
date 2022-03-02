import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();

        for (int z = 0; z < t; z++) {
            int rows=scan.nextInt();

            scan.nextLine();

            int [][] plant= new int[rows][rows];

            for (int i = 0; i < rows; i++) {
                // Initializing tree
                for (int j = 0; j <= i; j++) {
                    plant[i][j]=scan.nextInt();
                }
            }


            for (int i = rows-2; i >= 0 ; i--) {
                for (int j=0; j<=i; j++) {
                    plant[i][j] += Integer.max(plant[i+1][j],plant[i+1][j+1]);
                }
            }
            System.out.println(plant[0][0]);
        }
    }
}
