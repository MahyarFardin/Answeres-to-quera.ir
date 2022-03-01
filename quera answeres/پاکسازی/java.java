import java.util.ArrayList;
import java.util.Scanner;

public class java {

    public static int Police(int people, int counter) {
        for (int i = 0; i < 10; i++) {
            if (Math.pow(2, i) == people) {
                counter++;
                return counter;
            } else if (Math.pow(2, i) > people) {
                people -= Math.pow(2, i - 1);
                counter++;
                return Police(people, counter);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.nextInt();
        scan.nextLine();

        String way = scan.nextLine();
        String temp = scan.nextLine();

        int start = Integer.min(Integer.parseInt(temp.split(" ")[0]), Integer.parseInt(temp.split(" ")[1]));
        int end = Integer.max(Integer.parseInt(temp.split(" ")[0]), Integer.parseInt(temp.split(" ")[1]));

        int badCounter = 0;

        ArrayList<Integer> bad = new ArrayList<>();

        for (int i = start - 1; i <= end - 1; i++) {

            if (way.charAt(i) == 'H') {
                badCounter++;
            } else if (badCounter != 0) {
                bad.add(badCounter);
                badCounter = 0;
            }

        }

        int result = 0;

        for (int i : bad) {
            result += Police(i, 0);
        }

        System.out.println(result);
    }
}