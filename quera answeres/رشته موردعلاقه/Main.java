import java.util.Scanner;


public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        int n=scan.nextInt();
        scan.nextLine();
        int counter=0;

        for (int i = 0; i < n; i++) {
            String temp=scan.nextLine();
            int indicator=0;

            int wordCounter=0;

            for (int j = 0; j < word.length(); j++) {
                for (int k = indicator; k < temp.length(); k++) {
                    if (word.charAt(j) == temp.charAt(k)) {
                        indicator=k+1;
                        wordCounter++;
                        break;
                    }
                }
            }
            if (wordCounter == word.length()) {
                counter++;
            }
        }

        System.out.println(counter);

    }
}
