import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    //is it a triangel
        Scanner scan=new Scanner(System.in);
        int a=Integer.parseInt(scan.next());
        int b=Integer.parseInt(scan.next());
        int c=Integer.parseInt(scan.next());
        if(a==0||b==0||c==0)
        {
            System.out.println("No");
            return;
        }
        if(a+b+c==180)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");

    }
}
