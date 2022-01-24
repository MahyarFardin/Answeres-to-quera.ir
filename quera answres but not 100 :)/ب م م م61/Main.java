import java.util.ArrayList;
import java.util.Scanner;

public class java {

    public static int bmm(int a, int b){
        if(b==0){
            return a;
        }
        else
            return bmm(b,a%b);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int len= scan.nextInt();
        int [] lst=new int[len];
        int maximum=0;

        ArrayList<Integer> bmms=new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            lst[i]= scan.nextInt();
        }

        int returnOfFunction=0;
        for (int i=0;i<len;i++){
            if (lst[i] == 1) {
                continue;
            }
            for (int j=i+1;j<len;j++){
                returnOfFunction=bmm(Integer.max(lst[i],lst[j]),Integer.min(lst[i],lst[j]));
                if(returnOfFunction>maximum){
                    maximum=returnOfFunction;
                }
            }
        }

        System.out.println(maximum);

    }
}
