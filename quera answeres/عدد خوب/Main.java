import java.util.Scanner;

public class java {

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int numberIncrease=0;
        int whileCounter=0;
        int counter=0;

        while (true){
            counter=0;
            for(int i=1;i<=numberIncrease;i++){
                if (numberIncrease % i == 0) {
                    counter++;
                }
            }

            if (counter >= a) {
                System.out.println(numberIncrease);
                return;
            }
            numberIncrease += whileCounter++ ;
        }

    }
}
