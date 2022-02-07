import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();


        if (b == 0) {
            System.out.println(20);
        }
        else if(b==7)
            System.out.println(a);
        else{
            System.out.println(a-b<0 ? 0:a-b);
        }


        
    }
}
