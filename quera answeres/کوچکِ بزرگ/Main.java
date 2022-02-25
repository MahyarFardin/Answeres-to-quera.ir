import java.util.Scanner;

public class java {
    public static boolean PrimeFinder(int number){
        if(number==2) return true;
        else{
            for (int i = 2; i <= Math.sqrt(number) ; i++) {
                if (number % i == 0) return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();

        if (a == 1) {
            System.out.println(1);
            return;
        }
        if (a == 4) {
            System.out.println(4);
            return;
        }

        for (int i = a; i >= 1; i--) {
            if(PrimeFinder(i)) {
                System.out.println(i);
                return;
            }
        }

    }
}

