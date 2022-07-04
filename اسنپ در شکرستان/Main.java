import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        int rusta=input.nextInt();
        int NumberOfTravels=input.nextInt();
        int Ajnas[][]=new int[rusta][rusta];
        int sum=0;

        //initializin
        for (int i = 0; i < Ajnas.length; i++) 
        {
            for (int j = 0; j < Ajnas.length; j++) 
            {
                Ajnas[i][j]=input.nextInt();    
            }    
        }

        //the cities jafar has traveled
        for (int i = 0; i < NumberOfTravels;i++) 
        {
            int x=input.nextInt(),y=input.nextInt();
            sum+=Ajnas[x-1][y-1];
        }

        System.out.println(sum);
    }
}
