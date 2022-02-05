import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int counter=0;

        while (a != 0){
            if (b > a) {
                counter++;
                break;
            }
            a -= b;
            counter++;

        }

        System.out.println(counter);
    }
}
