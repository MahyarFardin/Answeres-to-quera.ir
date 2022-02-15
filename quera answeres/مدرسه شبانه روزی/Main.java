import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int [] numbers=new int[a];


        for (int i = 0; i < a; i++) {
            numbers[i]= scan.nextInt();
        }

        for (int i = 2; i < 100000; i++) {
            boolean flag=false;
            for (int j = 0; j < a; j++) {
                if (i%numbers[j] !=0 ) {
                    flag=true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(i%30+1);
                return;
            }
        }

    }
}
