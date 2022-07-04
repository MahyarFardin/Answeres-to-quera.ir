import java.util.Scanner;

public class java {

    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int temp= scan.nextInt();

        int area=0;

        for (int i = 0; i < temp; i++) {
            int x=scan.nextInt();
            int y=scan.nextInt();

            area += x*y;

        }

        System.out.println(area/a);
    }
}
