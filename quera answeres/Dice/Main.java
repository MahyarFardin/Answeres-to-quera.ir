import java.util.Scanner;

public class App
{
    public static void main(String[] args) 
    {

        Scanner scan=new Scanner(System.in);
        String GunnerString=scan.nextLine();
        String Gunner[]=new String[GunnerString.length()/2];
        Gunner=GunnerString.split(" ");
        String EmmaString=scan.nextLine();
        String Emma[]=new String[GunnerString.length()/2];
        Emma=EmmaString.split(" ");
        int sumG=0;
        int sumE=0;
        for (int i = 0; i < Emma.length; i++) 
        {
            sumE+=Integer.parseInt(Emma[i]);
            sumG+=Integer.parseInt(Gunner[i]);
        }

        if (sumE>sumG)
            System.out.println("Emma");
        else if(sumE<sumG)
            System.out.println("Gunnar");
        else
            System.out.println("Tie");
    }
}
