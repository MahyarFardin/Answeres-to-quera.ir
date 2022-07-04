# in code be xatere noe data structure 90 migire age 100 mixayd BIGINT tarif konid




import java.util.Scanner;

public class java {

    public static long bmm(Long a, Long b){
       if(a%b==0){
           return b;
       }

       return bmm(b,a%b);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long a= scan.nextInt();
        long b= scan.nextInt();
        long bmm;

        if (b == 0 || a == 0) {
            System.out.println(0);
            return;
        }

        bmm=bmm(Long.max(a,b),Long.min(a,b));

        System.out.println(bmm+" "+(a*b)/bmm);

    }
}
