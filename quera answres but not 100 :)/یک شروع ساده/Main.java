
import java.util.ArrayList;
import java.util.Scanner;


public class java {
    public static boolean Base(int b,int n){
        String guid="";
        String numPartGuid="";
        ArrayList<String> answer=new ArrayList<String>();

        if(b>10){
            for (int i = 0; i < b-10; i++) {
                char a='A';
                a += i;
                guid +=String.valueOf(a);
            }
            for (int i = 0; i < 10; i++) {
                numPartGuid += i;
            }

            guid = numPartGuid + guid;
        }
        else {
            for (int i = 0; i < b; i++) {
                guid += i;
            }
        }

        if (n < b) {
            answer.add(String.valueOf(guid.charAt(n)));
        }
        else{
            while (n >= b){
                int remainder=n % b;
                answer.add(String.valueOf(guid.charAt(remainder)));
                n /= b;
            }

            answer.add(String.valueOf(guid.charAt(n)));


        }



        for (int i = answer.size()-1; i>= 0; i--) {
            if (!answer.get(i).equals(answer.get(answer.size()-1-i))) {
                return false;
            }
        }
        
        return true;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b=scan.nextInt();
        int n=0;

        for (int i=1 ; i<=300 ; i++){
            n=(int)Math.pow(i,2);
            if(Base(b,n)==true)
                System.out.println(i+" "+n);
        }
    }
}
