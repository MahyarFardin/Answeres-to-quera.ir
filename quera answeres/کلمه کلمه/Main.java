import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int counter=0;

        for(int i=0;i<name.length();i++){
            if (name.charAt(i) == 'a' ||
                name.charAt(i) == 'e' ||
                name.charAt(i) == 'i' ||
                name.charAt(i) == 'o' ||
                name.charAt(i) == 'u') {
                counter++;
            }
        }

        System.out.println((int)Math.pow(2,counter));

    }
}
