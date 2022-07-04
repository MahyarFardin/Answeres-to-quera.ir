import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String temp="";
        boolean flag=false;

        for (int i = 0; i < 5; i++) {
            String line=scan.nextLine();
            for (int j = 1; j < line.length()-1; j++) {
                temp="";
                temp += String.valueOf(line.charAt(j-1));
                temp += String.valueOf(line.charAt(j));
                temp += String.valueOf(line.charAt(j+1));

                if (temp.equals("FBI")) {
                    System.out.print(i+1+" ");
                    flag=true;
                }
            }
        }

        if (flag != true) {
            System.out.println("HE GOT AWAY!");
        }

    }
}
