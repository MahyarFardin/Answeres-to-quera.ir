import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] weekdays= new int[7];

        for (int i = 0; i < 3; i++) {
            scan.nextInt();
            scan.nextLine();
            String [] temp = scan.nextLine().split(" ");

            for (String s:
                 temp) {
                switch (s.charAt(0)){
                    case 's':
                        weekdays[0]=1;
                        break;
                    case '1':
                        weekdays[1]=1;
                        break;
                    case '2':
                        weekdays[2]=1;
                        break;
                    case '3':
                        weekdays[3]=1;
                        break;
                    case '4':
                        weekdays[4]=1;
                        break;
                    case '5':
                        weekdays[5]=1;
                        break;
                    case 'j':
                        weekdays[6]=1;
                        break;

                }
            }

        }


        int counter=0;
        for (int i:
             weekdays) {
            if (i == 0) {
                counter++;
            }
        }


        System.out.println(counter);

    }
}
