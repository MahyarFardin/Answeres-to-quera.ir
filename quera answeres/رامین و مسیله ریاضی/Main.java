import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int incidence=scan.nextInt();

        for (int i = 0; i < incidence; i++) {
            int first=scan.nextInt();
            int second=scan.nextInt();
            int counter=0;
            int temp=0;

            while (temp*temp<first)
                temp++;

            while (temp*temp<=second){
                counter++;
                temp++;
            }

            System.out.println(counter);
        }
    }
}
