import java.util.Scanner;

public class java {

    public static void bmm(Long a, Long b){
       if(a%b==0){
           System.out.println(b);
           return;
       }
       bmm(b,a%b);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long a= scan.nextInt();
        long b= scan.nextInt();
        if (b == 0 || a == 0) {
            System.out.println(0);
            return;
        }

        bmm(Long.max(a,b),Long.min(a,b));

    }
}
