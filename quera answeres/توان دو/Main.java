import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int two=2;
        while (true) {
            two *= 2;
            if(two>n){
                System.out.println(two);
                return;
            }
        }
    }
}
