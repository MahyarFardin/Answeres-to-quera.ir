import java.util.Scanner;
public class tamrin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int counter=3;

        if(n%2==0)
        {
            System.out.println(n/2);
        }
        else
        {
            while(true)
            {
                if(n%counter==0)
                {
                    System.out.println(n/counter);
                    return;
                }
                counter++;
            }
        }
    }
    
}
