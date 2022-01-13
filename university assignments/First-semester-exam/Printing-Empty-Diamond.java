
import java.util.Scanner;
public class App {
public static void main(String []args) {
    //initializing variables
    Scanner scan=new Scanner(System. in );
    int temp=0;
    System. out .println("What is the length you want: ");
    int lozi= scan.nextInt();
    // lozi's head
    for (int j = 0; j < Math. ceil (lozi/2); j++) {
        for (int k = j; k <Math. ceil (lozi/2); k++) {
            System. out .print(" ");
        }

        System. out .print("*");

        for (int t = 0; t < j*2-1; t++) {
            System. out .print(" ");
        }

        if (j != 0) {
            System. out .print("*");
        }
        System. out .println();
    }

        //lozi's tail
    for (int j =(int) Math. ceil (lozi/2) ; j>=0 ; j--) {
        for (int k = j; k <Math. ceil (lozi/2); k++) {
            System. out .print(" ");
        }

        System. out .print("*");

        for (int t = 0; t < j*2-1; t++) {
            System. out .print(" ");
        }
        if (j != 0) {
            System. out .print("*");
        }
        System.out.println();
    }
        
        
    }
}