import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String first= scan.nextLine();
        String second= scan.nextLine();
        String temp1="";
        String temp2="";
        for (int i = 2; i >=0 ; i--) {
            temp1 += first.charAt(i);
            temp2 += second.charAt(i);
        }
        
        int num1=Integer.parseInt(temp1);
        int num2=Integer.parseInt(temp2);

        if (num2 == num1) {
            System.out.println(first + " = " + second);
        }
        else
            System.out.println((Integer.min(num1,num2)==num1 ? first:second) + " < " + (Integer.max(num1,num2)==num1 ? first:second));
    }
}
