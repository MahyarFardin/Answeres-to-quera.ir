import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String [][] words = new String[2][2];
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                words[i][j]=scan.next();
            }
        }
        
        if(words[0][1].equals(words[0][0]) ||
        words[0][0].equals(words[1][1]) ||
        words[1][0].equals(words[0][1]) ||
        words[1][0].equals(words[1][1])){
            System.out.println("YES");
            return;
        }
        
        System.out.println("NO");
    }
}
