import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int base=scan.nextInt();
        String pattern="";
        ArrayList<Integer> answer=new ArrayList<Integer>();

        for (int i = 0; i <base; i++) {
            pattern += i;
        }

        if (n < base) {
            String temp=String.valueOf(pattern.charAt(n));
            answer.add(Integer.parseInt(temp));
        }
        else{
            while (n>=base){
                int reminder= n%base;
                answer.add(Integer.parseInt(String.valueOf(pattern.charAt(reminder))));
                n /= base;
            }

            answer.add(Integer.parseInt(String.valueOf(pattern.charAt(n))));
        }

        int sum1=0,sum2=0;

        for (int i = 1; i < answer.size(); i += 2) {
            sum1 += answer.get(i);
            sum2 += answer.get(i-1);
        }
        if (answer.size()%2 != 0) {
            sum2 += answer.get(answer.size()-1);
        }

        if (sum1 == sum2) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
