import java.util.ArrayList;
import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String melon=scan.nextLine();
        String [] melons=melon.split(" ");
        int counter=0;

        for (String s: melons) {
            if (Integer.parseInt(s) >= 80) {
                counter++;
            }
        }

        if (counter > 2) {
            System.out.println("Mamma mia!");
        }
        else if(counter>0){
            System.out.println("Mamma mia!!");
        }
        else
            System.out.println("Mamma mia!!!");

    }
}
