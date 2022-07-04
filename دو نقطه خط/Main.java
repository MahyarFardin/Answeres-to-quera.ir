import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x1=scan.nextInt();
        int y1=scan.nextInt();
        int x2=scan.nextInt();
        int y2=scan.nextInt();

        if (x1 == x2) {
            System.out.println("Vertical");
        }
        else if(y1 == y2)
            System.out.println("Horizontal");
        else
            System.out.println("Try again");
    }
}
