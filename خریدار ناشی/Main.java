import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a= scan.nextInt();
        int b= scan.nextInt();
        int k= scan.nextInt();

        if (k%2 != 0) {
            System.out.println(0);
            return;
        }
        else if(a*b<=k) {
            System.out.println(-1);
            return;
        }


        int [][] table=new int[a][b];

        for(int i=0; i<k ; i++){
            table[scan.nextInt()-1][scan.nextInt()-1]=-1;
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (table[i][j]!=-1) {
                    System.out.println(1);
                    System.out.println((i+1)+" "+(j+1));
                    return;
                }
            }

        }

    }
}
