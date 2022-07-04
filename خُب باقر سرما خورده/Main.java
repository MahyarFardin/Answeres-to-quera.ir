import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean flag=false;

        for (int i = 0; i < 5; i++) {
            String input=scan.nextLine();

            if(input.contains("MOLANA") || input.contains("HAFEZ")){
                System.out.print(i+1+" ");
                flag=true;
            }

        }

        if (flag == false) {
            System.out.println("NOT FOUND!");
        }
    }
}
