import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] list=new int[n];
        boolean flag=false;
        int sum=0;
        int maxSum=0;

        for(int i=0; i<n ;i++){ 
            list[i]=scan.nextInt();
            if (list[i]>=0) {
                flag=true;
            }
        }

        if (flag==false) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                sum=0;
                for (int j2 = i; j2 <=j; j2++) {
                    sum += list[j2];
                }

                if (maxSum<sum) {
                    maxSum=sum;
                }

            }
        }

        System.out.println(maxSum);
    }
}
