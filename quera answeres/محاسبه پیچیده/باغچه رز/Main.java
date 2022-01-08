import java.util.Scanner;

public class App
{
    public static void main(String[] args) 
    {

        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        String inputnumber[]=new String[2];
        inputnumber=input.split(" ");
        int columns=Integer.parseInt(inputnumber[0]);
        int rows=Integer.parseInt(inputnumber[1]);
        int CounterWhite=0;
        String FirstMatrix[]=new String[rows];
        char SecondMatrix[][]=new char[rows][columns];

        for (int i = 0; i < rows; i++) 
            FirstMatrix[i]=scan.nextLine();  

        for (int i = 0; i < columns; i++) 
        {
            for (int j = 0; j < rows; j++) 
            {
                SecondMatrix[j][i]=FirstMatrix[j].charAt(i);
            }    
        }

        for (int i = 0; i < columns; i++) 
        {
            CounterWhite=0;
            for (int j = 0; j < rows; j++) 
            {
                if (SecondMatrix[j][i]=='W') 
                {
                    CounterWhite++;
                }
            }    
            if (CounterWhite%2==0) 
            {                
                System.out.print("B");
            }
            else
                System.out.print("F");

        }


    }
}
