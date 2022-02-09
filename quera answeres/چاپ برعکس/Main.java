import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        ArrayList<Integer> num=new ArrayList<>();
        num.add(5);

        while (num.get(num.size()-1)!=0){
            num.add(scan.nextInt());
        }

        for (int i = num.size()-2; i >= 1 ; i--) {
            System.out.println(num.get(i));
        }


    }
}
