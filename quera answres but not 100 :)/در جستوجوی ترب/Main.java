import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int xA= scan.nextInt();
        int vA= scan.nextInt();
        int xb= scan.nextInt();
        int vb= scan.nextInt();

        int tva=Math.abs(vA);
        int tvb=Math.abs(vb);
        int txa=Math.abs(xA);
        int txb=Math.abs(xb);

        if (vA == vb) {
            System.out.println("WAIT WAIT");
        }
        else if ((txa>txb && tva>tvb) || (txa<txb && tva<tvb)) {
            System.out.println("BORO BORO");
        }
        else
            System.out.println("SEE YOU");

    }
}
