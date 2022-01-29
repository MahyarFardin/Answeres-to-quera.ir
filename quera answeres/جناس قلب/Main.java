import java.util.Scanner;

public class java
{
    static boolean IsPalindrom(String str)
    {
        int l = 0;
        int h = str.length()-1;
        str = str.toLowerCase();

        while(l <= h)
        {
            char charl = str.charAt(l);
            char charh = str.charAt(h);

            if (!((charl >= 'a' && charl <= 'z') || (charl >= '0' && charl <= '9')))
                l++;

            else if(!((charh >= 'a' && charh <= 'z') || (charh >= '0' && charh <= '9')))
                h--;

            else if( charl == charh)
            {
                l++;
                h--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();

        if( IsPalindrom(line))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
 
