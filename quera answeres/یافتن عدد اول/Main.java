import java.util.Scanner;

public class java {
    public static boolean Prime(int n){
        if (n == 2) {
            return true;
        }
        else if(n%2==0 || n<=1){
            return false;
        }
        else {
            for (int i = 3; i <=Math.sqrt(n); i += 2) {
                if (n%i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String stringNumber=scan.next();
        String [] digitsString=stringNumber.split("");
        int b=0;
        int n=Integer.parseInt(stringNumber);
        int counter=0;

        for(String s:digitsString){
            b += Integer.parseInt(s);
        }

        while (true){
            n++;
            if(Prime(n)){
                counter++;
                if (counter == b) {
                    System.out.println(n);
                    return;
                }
            }
        }




    }
}
