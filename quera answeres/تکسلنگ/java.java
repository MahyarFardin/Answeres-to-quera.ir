import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String [] lines=new String[3];

        for (int i = 0; i < 3; i++) {
            lines[i]=scan.nextLine();
        }

        for (int i = 0; i < lines[0].length()/5; i++) {
            if (!lines[0].substring(5*i,5*i+5).contains("o")) {
                System.out.print("T");
                continue;
            }
            else if(lines[0].charAt((2*(5*i)+5)/2)=='*'){
                System.out.print("A");
                continue;
            }
            else if(lines[0].charAt(5*i+1)=='*' && lines[0].charAt(5*i+4)=='*'){
                System.out.print("M");
                continue;
            }
            else if(lines[1].charAt(5*i)=='*'){
                System.out.print("N");
                continue;
            }
            else{
                System.out.print("X");
                continue;
            }

        }

    }
}