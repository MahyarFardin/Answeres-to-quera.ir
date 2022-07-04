import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        double xA= scan.nextDouble();
        double vA= scan.nextDouble();
        double xb= scan.nextDouble();
        double vb= scan.nextDouble();



        if (vA == vb) {
            System.out.println("WAIT WAIT");
        }
        else if ((vA>vb && xA<xb) || (vb>vA && xA>xb)) {
            System.out.println("SEE YOU");
        }
        else
            System.out.println("BORO BORO");

    }
}
