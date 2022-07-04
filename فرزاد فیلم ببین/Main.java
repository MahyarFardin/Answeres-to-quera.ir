import java.util.Scanner;

public class App {
    public static void upper(String [] lst){
        String[] temp;
        String gather="";

        for (String s: lst) {
            gather="";
            boolean flag=false;

            s=s.toLowerCase();

            temp=s.split("");
            for (String t: temp) {

                if (flag == false) {
                    t=t.toUpperCase();
                    flag=true;
                    gather += t;
                }
                else {
                    gather += t;
                }
            }
            System.out.print(gather+" ");
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int incidence= scan.nextInt();
        scan.nextLine();
        String [] lst;

        for (int i = 0; i < incidence; i++) {
            String line= scan.nextLine();
            lst = line.split(" ");

            upper(lst);
            System.out.println();
        }
    }
}
