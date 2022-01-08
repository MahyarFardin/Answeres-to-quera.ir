import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //initializing variables
        Scanner scan = new Scanner(System.in);
        String code_cup="codecup6";
        int n= scan.nextInt();

        System.out.println(code_cup.charAt((n-1)%8));

    }
}
