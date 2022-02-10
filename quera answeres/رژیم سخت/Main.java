import java.util.Scanner;


public class java {
    public static void main(String[] args) throws Exception {
        //is it healthy?
        Scanner scan=new Scanner(System.in);
        String barchasb=new String();
        barchasb=scan.nextLine();
        int counteryellow=0,counterred=0;
        boolean flag=false;

        for(int i=0;i<barchasb.length();i++)
        {
            if(barchasb.charAt(i)=='Y')
                counteryellow++;
            else if(barchasb.charAt(i)=='R')
                counterred++;
            else{
                flag=true;
            }

        }

        if(counterred>=3 || flag==false || (counteryellow>=2 && counterred>=2))
            System.out.println("nakhor lite");
        else
            System.out.println("rahat baash");
    }
}
