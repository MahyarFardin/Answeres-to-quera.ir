
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            String[] fourByFour = input.split("");
            int[] digits = new int[16];
            int counter = 0;
            boolean flag = false;

            for (String t : fourByFour) {
                if (!(t.equals("0")||t.equals(" "))) {
                    flag = true;
                }
                if (!t.equals(" ")){
                    digits[counter] = Integer.parseInt(t);
                    counter++;
                }
            }

            if (flag == false) {
                break;
            }

            int Sum = 0;

            for (int i = 0; i < 16; i++) {
                if (i % 2 == 0) {
                    Sum += digits[i] * 2 > 9 ? digits[i] * 2 - 9 : digits[i] * 2;
                } else
                    Sum += digits[i];
            }

            if ((Sum) % 10 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}

/*
6104 3376 7866 15465
6104 3376 7866 1546
6104 3376 7866 1545
0000 0000 0000 0000
*/
