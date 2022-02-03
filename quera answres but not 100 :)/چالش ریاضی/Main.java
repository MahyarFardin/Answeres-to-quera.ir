import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        int gap=scan.nextInt();
        boolean flag = false;


        for (int i = 1; i <=9; i++) {
            int temp=i;
            String number="";
            number += temp;
            for (int j = 0; j < length-1; j++) {

                if (temp+gap <10) {
                    temp += gap;
                    number += temp;
                }
                else if (temp-gap >= 0){
                    temp -= gap;
                    number += temp;
                }

            }

            if (number.length() != 1) {
                if (flag == true) {
                    System.out.print(",");
                }
                System.out.print(number);
                flag=true;
            }
        }



    }
}
