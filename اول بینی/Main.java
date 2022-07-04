import java.util.Scanner;

public class java {
    public static boolean primeFinder(int i){
        if(i==2)
            return true;
        else if(i==1 || i%2==0){
            return false;
        }
        else{
            for(int j=3;j<(i/2)+1;j += 2){
                if (i % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int firstNumber=scan.nextInt();
        int secondNumber=scan.nextInt();
        boolean flag=false;

        for(int i=firstNumber+1 ; i<secondNumber ; i++){

            if(primeFinder(i) == true) {

                if (flag == false) {
                    System.out.print(i);
                    flag=true;
                }
                else{
                    System.out.print(","+i);

                }
            }
        }
    }
}
