import java.util.Scanner;

public class java {
    //be elate protocole asharie java 1 test case wrong answere migire pa python ya cpp benevisid

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        double answer=0;

        for(int i=-10 ;i<=m ;i++){
            for (int j = 1; j <=n; j++) {
                answer +=(int) Math.pow(i+j,3)/Math.pow(j,2);
            }
        }

        System.out.println(answer);
    }
}
