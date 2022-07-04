import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    //this is a program that will show the room division
    Scanner scan=new Scanner(System.in);
    int count=scan.nextInt();

    //printing
    System.out.println("########.......########");
    
    for (int j = 1; j < 9; j++) 
    {
        if(j<=count)
        {
            if(j%2!=0)    
                System.out.print("#ghorfe"+j+".......");
            else if(j%2==0)
                System.out.println("ghorfe"+j+"#");
            else
                System.out.println(".......");
        }
        else
        {
            if(j%2!=0)    
                System.out.print("#..............");
            else if(j%2==0)
                System.out.println(".......#");
        }
        if(j%2==0 && j!=8)
            System.out.println("########.......########");
        if(j==8)
            System.out.println("#######################");
    }
    
    
    
    }
}
