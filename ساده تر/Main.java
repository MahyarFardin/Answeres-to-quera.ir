import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sum=0;
        double prod=1;
        double max=-10000;
        double min=10000;
        double t=0;

        for (int i = 0; i < 4; i++) {
            t = scan.nextInt();
            sum += t;
            prod *= t;

            if (t > max) {
                max=t;
            }
            if(t<min){
                min=t;
            }
        }

        System.out.printf("Sum : %.6f\n",sum);
        System.out.printf("Average : %.6f\n",sum/4.0);
        System.out.printf("Product : %.6f\n",prod);
        System.out.printf("MAX : %.6f\n",max);
        System.out.printf("MIN : %.6f",min);


    }
}
