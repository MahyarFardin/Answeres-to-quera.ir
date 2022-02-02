import java.util.Scanner;

public class java {
    public static void Cypher(String input, int counter, int k){
        if (counter == k) {
            System.out.println(input);
            return;
        }
        input = input.charAt(input.length()-1) + input.substring(0,input.length()-1);

        String [] characters=input.split("");
        String output="";

        for (int i = 0; i < characters.length; i++) {
            char temp = characters[i].charAt(0);
            if(temp=='z')
                temp='a';
            else
                temp++;
            output += String.valueOf(temp);
        }

        counter++;
        Cypher(output,counter,k);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        scan.nextInt();
        int k=scan.nextInt();
        scan.nextLine();
        String input=scan.nextLine();


        Cypher(input,0,k);

    }
}
