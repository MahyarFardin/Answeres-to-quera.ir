import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void Remover(int number , int step){
        int start=2;
        for (int i = 1; i <=number; i++) {
            start=(start+step+-1)%i+1;
        }
        System.out.println(start);
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        Remover(number,2);
    }
}
