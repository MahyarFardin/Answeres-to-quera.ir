import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double x1=scan.nextInt();
        double y1=scan.nextInt();
        double x2=scan.nextInt();
        double y2=scan.nextInt();

        System.out.println((int)Math.ceil(Double.min(x1,y1)/Double.max(x2,y2)));



    }
}
