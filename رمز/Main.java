import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        scan.nextLine();

        String code=scan.nextLine();

        String [] wheels=new String[n];

        for (int i = 0; i < n; i++) {
            wheels[i]=scan.nextLine();
        }

        int rotation=0,placeHolder=0;


        for (int i = 0; i < n; i++) {
            for (int j=0; j<wheels[i].toCharArray().length; j++) {
                if (wheels[i].charAt(j) == code.charAt(i)) {

                    placeHolder = j;
                    break;

                }
            }

            rotation += placeHolder<5 ? placeHolder:9-placeHolder ;
        }

        System.out.println(rotation);
    }
}

