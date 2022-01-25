import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        System.out.println("saal:"+line.charAt(0)+line.charAt(1));
        System.out.println("maah:"+line.charAt(2)+line.charAt(3));
    }
}
