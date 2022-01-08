import java.util.Scanner;
public class tamrin {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        String matrix[]=new String[x];
        char cr;
        int sum1=0,sum2=0;
        
        for (int j = 0; j <2; j++)
        {
            for (int i = 0; i <x; i++) 
                matrix[i]=scan.next();
            
            for (int k=0;k<x;k++)
            {
                for(int r=0;r<y;r++)
                {
                    cr=matrix[k].charAt(r);
                    if(cr=='*' && j==0)
                        sum1++;
                    else if(cr=='*' && j==1)
                        sum2++;
                }
            }   
        }  
        System.out.println(sum1+" "+sum2);    
    }
    
}
