import java.util.ArrayList;
import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int [] lamp=new  int[a];
        int counter=0;

        for (int i = 0; i < a ; i++) {
            lamp[i]=scan.nextInt();
        }
        for (int i = 1; i < a; i++) {
            if (lamp[i] != lamp[i-1]) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
