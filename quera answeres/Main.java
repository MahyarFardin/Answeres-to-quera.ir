import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int Ajnas[]=new int[n];
        int MaximumTaxfif=input.nextInt();
        int temp=0;

        //initializing number of things
        for (int i = 0; i < n; i++) 
        {
            Ajnas[i]=input.nextInt();
        }
        
        //sorting
        quicksort(Ajnas, 0, Ajnas.length-1);
        
        temp=1;
        //the main part
        for (int i = 1; i < Ajnas.length; i++) 
        {
             if(Ajnas[i]+Ajnas[i-1]<=MaximumTaxfif)
                temp++;
        }
        System.out.println(temp);

    }       
    private static void quicksort(int[] a, int s, int e) {
        if(s>=e)
            return;
        int q = partition(a,s,e);
        quicksort(a, s, q-1);
        quicksort(a, q+1, e);

   }

   private static int partition(int[] a, int s, int e) {
        int x = a[e];
        int i = s-1;
        for(int j = s;j<e;++j){
            if(a[j]<=x){
                 ++i;
                 int temp = a[i];
                 a[i]= a[j];
                 a[j]=temp;
            }
        }
        ++i;
        int temp = a[i];
        a[i]= a[e];
        a[e]=temp;
        return i;
   }                          
}
