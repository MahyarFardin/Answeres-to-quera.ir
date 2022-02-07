import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x1=scan.nextInt();
        int y1=scan.nextInt();
        int x2=scan.nextInt();
        int y2=scan.nextInt();

        if (x2>x1)
            System.out.println("Right");
        else
            System.out.println("Left");
        
    }
}
