import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void Function(ArrayList<String> digits,String pattern){

        String addons="";
        String previousAnswer="";


        // Finding duplicates
        for (int i = 0; i < digits.size(); i++) {
            int counter=0;
            for (int j = 0; j < digits.size(); j++) {
                if (digits.get(i).equals(digits.get(j))) {
                    counter++;
                }
            }

            if (counter > 1) {
                addons += counter;
            }
            digits=Remover(digits,digits.get(i),counter);
        }



        // Adding duplicated incidences to the array
        for (int i = 0; i < addons.length(); i++) {
            digits.add(String.valueOf(addons.charAt(i)));
        }


        // Making a pattern for the next function
        for (String s: digits ) {
            previousAnswer += s;
        }

        // Checking whether we are done
        if (previousAnswer.equals(pattern)) {
            String temp="";

            // Sorting
            for (int i = 0; i < digits.size(); i++) {
                for (int j = i+1; j < digits.size(); j++) {
                    if (Integer.parseInt(digits.get(i)) > Integer.parseInt(digits.get(j))) {
                        temp=digits.get(j);
                        digits.set(j,digits.get(i));
                        digits.set(i,temp);
                    }
                }
            }

            // Printing
            for (String s: digits) {
                System.out.print(s);
            }

            return;
        }

        Function(digits,previousAnswer);

    }

    // Removing duplicates
    public static ArrayList<String> Remover(ArrayList<String> digits, String number, int counter){
        for (int i = digits.size()-1; i >= 0  ; i--) {

            if (counter == 1) {
               return digits;
            }

            if (digits.get(i).equals(number)) {
                    digits.remove(i);
                    counter--;
            }
        }

        return digits;
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String input=scan.nextLine();
        ArrayList<String> digits=new ArrayList<>();
        String [] temp=input.split("");

        for (String s: temp)
            digits.add(s);

        Function(digits,"");

    }
}
