import java.util.Scanner;


public class App 
{
    //universal variables
    static Scanner scan=new Scanner(System.in);
    static int dimension = scan.nextInt();
    static int matrix1[][]=new int[dimension][dimension];
    static int XEnd,YEnd,i=0,j=0,sum=0,countersqr=0;
    public static void main(String[] args) throws Exception 
    {
       //walke halazoni :)

            //determining the end point 
        switch (dimension) 
        {
            case 1:
                if(Math.sqrt(sum) - Math.floor(Math.sqrt(sum)) < 0.0)
                    System.out.println("1");
                break;

            case 2:
                XEnd=1;
                YEnd=0;
                break;

            case 3:
                XEnd=1;
                YEnd=1;
                break;

            case 4:
                XEnd=2;
                YEnd=1;
                break;

            case 5:
                XEnd=2;
                YEnd=2;
                break;
        }

        //filling the matrix
        for (int i = 0; i < dimension; i++) 
        {
            for (int j = 0; j < dimension; j++) 
            {
                matrix1[i][j]=scan.nextInt();    
            }    
        }

        //statrting to move
        ToRight();

    }

    //the four functions at the bottom will provide my movement
    public static void ToRight() 
    {
        while(matrix1[i][j]!=-1 || j<dimension)    
        {
            sum=sum+matrix1[i][j];
            matrix1[i][j]=-1;
            sqrchecker(i,j,1);    
        }
        j--;
        i++;
        ToDown();
    }
    public static void ToDown() 
    {
        while(matrix1[i][j]!=-1 || i<dimension)    
        {
            sum=sum+matrix1[i][j];
            matrix1[i][j]=-1;
            sqrchecker(i,j,2);
            
        }
        i--;
        j--;
        ToLeft();
    }
    public static void ToLeft() 
    {
        while(matrix1[i][j]!=-1 || j>0)    
        {
            sum=sum+matrix1[i][j];
            matrix1[i][j]=-1;
            sqrchecker(i,j,3);
            
        }
        j++;
        i--;
        ToUp();
    }
    public static void ToUp() 
    {
        while(matrix1[i][j]!=-1 || i>0)    
        {
            sum=sum+matrix1[i][j];
            matrix1[i][j]=-1;
            sqrchecker(i,j,4);
        }
        i++;
        j++;
        ToRight();
    }

    //this function would check wether we are at the end point or not 
    //\\and// 
    //would determine if we have a square sum
    public static void sqrchecker(int igive,int jgive,int position) 
    {
        if(Math.sqrt(sum) - Math.floor(Math.sqrt(sum)) == 0.0)
            countersqr++;
        if(igive==XEnd && jgive==YEnd)
        {
            System.out.println(countersqr);
            System.exit(0);
        }
        else
            switch (position) {
                case 1:
                    j++;
                    if(j==dimension || matrix1[i][j]==-1)
                    {
                        j--;
                        i++;
                        ToDown();
                    }
                    break;
                case 2:
                    i++;
                    if(i==dimension || matrix1[i][j]==-1)
                    {
                        i--;
                        j--;
                        ToLeft();
                    }
                    break;
                case 3:
                    j--;

                    if(j<0 || matrix1[i][j]==-1)
                    {
                        j++;
                        i--;
                        ToUp();
                    }
                    break;
                default:
                    i--;
                    if(i<0 || matrix1[i][j]==-1)
                    {
                        i++;
                        j++;
                        ToRight();
                    }
                    break;
            }
        
    }
}
