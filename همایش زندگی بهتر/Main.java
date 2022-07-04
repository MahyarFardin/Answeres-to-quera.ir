import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       //jamshid goes to cinema
        Scanner scan=new Scanner(System.in);
        int Y=scan.nextInt(),X=scan.nextInt();
        String WhichDirection;

        System.out.print(WhichDirection= X>10 ? "Left ":"Right ");

        if(WhichDirection=="Left ")
        {
            X=X-10;
            System.out.print((11-Y) +" "+ (11-X));
        }
        else
        {
            System.out.print((11-Y) +" "+ (X)); 
        }
        
    }
}

