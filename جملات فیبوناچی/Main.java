import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void Remover(ArrayList<Integer> fib, int number){
        fib.remove(fib.size()-1);
        if (fib.get(fib.size()-1) <= number) {
            number -= fib.get(fib.size()-1);
            System.out.print(fib.size()+" ");
            if (number == 0) {
                return;
            }
        }

        Remover(fib,number);


    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int a=0,b=1,sum=0;
        ArrayList<Integer> fib=new ArrayList<Integer>();

        do{
            fib.add(a+b);
            a=b;
            b=fib.get(fib.size()-1);
            sum += b;
        }while (number>=b);


        Remover(fib,number);
    }
}
