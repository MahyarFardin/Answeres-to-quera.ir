import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    //maximum index of an array
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int maximum=0;
        int temp=0;
        int answere=0;

        for (int i = 0; i < number; i++) 
        {
            temp=scan.nextInt();
            if(temp>maximum)
            {
                answere=i;
                maximum=temp;
            }
        }

        System.out.println(answere+1);
    }
}
