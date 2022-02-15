import java.util.Scanner;
import java.util.Arrays;


public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int [] numbers=new int[a];

        for (int i = 0; i < a; i++) {
            numbers[i]= scan.nextInt();
        }


        Arrays.sort(numbers);

        for (int i = 0; i < a/2 ; i++) {
            System.out.print(numbers[a-i-1]+" "+numbers[i]+" ");
        }

        if(a%2 != 0)
            System.out.print(numbers[a/2]+" ");

    }
}
