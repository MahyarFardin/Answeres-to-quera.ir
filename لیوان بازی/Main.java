import java.util.Scanner;

public class java {
    public static int translator( String input){
        if (input.equals("L")) {
            return 0;
        }
        else if(input.equals("M")){
            return 1;
        }
        else{
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String ball=scan.next();
        int [] cups= new int[3];

        cups[translator(ball)]=1;


        scan.nextLine();
        for (int i = 0; i < a; i++) {
            String line=scan.nextLine();
            String [] temp= line.split(" ");
            int sub=0;

            sub=cups[translator(temp[0])];
            cups[translator(temp[0])]=cups[translator(temp[1])];
            cups[translator(temp[1])]=sub;
        }


        for (int i = 0; i < 3; i++) {
            if (cups[i]==1){
                if (i == 0) {
                    System.out.println("L");
                }
                else if(i == 1){
                    System.out.println("M");
                }
                else{
                    System.out.println("R");
                }
            }
        }

    }
}
