import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();

        int [] stair=new int[40];
        stair[0]=1;
        stair[1]=1;
        stair[2]=2;

        for (int i = 3; i <=number; i++) {
            stair[i]=stair[i-1]+stair[i-2];
            if (i >=5) {
                stair[i] += stair[i-5];
            }
        }

        System.out.println(stair[number]);
    }
}
