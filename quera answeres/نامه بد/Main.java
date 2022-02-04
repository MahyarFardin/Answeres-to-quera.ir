import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        if (s.length() == 1) {
            System.out.println("bad");
            return;
        }

        int counter=1;
        int sum=0;

        for (int i = 1; i <s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                counter++;
            }
            else{
                if (counter%2 != 0) {
                    System.out.println("bad");
                    return;
                }
                counter=1;

            }
        }
        if(s.charAt(s.length()-2) != s.charAt(s.length()-1)){
            System.out.println("bad");
        }
        else{
            System.out.println("khoob");
        }
    }

}
