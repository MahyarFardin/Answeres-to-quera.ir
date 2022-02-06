import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double weight= scan.nextDouble();
        double height= scan.nextDouble();

        double bmi=weight/(height*height);

        System.out.printf("%.2f\n",bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");

        else if(bmi<25)
            System.out.println("Normal");

        else if(bmi<30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}
