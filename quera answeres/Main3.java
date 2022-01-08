import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    //is it healthy?
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        int num1=1,num2=2;
        int temp=0;

        for (int i = 1; i <=input; i++) 
        {
            if(i==num1 || i==num2)
            {
                System.out.print("+");   // 1 2
                temp=num2;
                num2=num1+num2;
                num1=temp;
            }
            else
                System.out.print("-");
        }

    }
}
