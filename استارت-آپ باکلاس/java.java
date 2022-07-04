import java.util.Scanner;
import java.util.LinkedList;
public class java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList<Integer> candies=new LinkedList<Integer>();
        int [] people= new int[4];
        int counter=0;

        for (int i=0; i<4; i++){
            candies.add(scan.nextInt());
        }

        while (!candies.contains(0)) {
            candies.set(0, candies.get(0)-1);

            candies.addFirst(candies.get(candies.size()-1));
            candies.removeLast();

            candies.addFirst(candies.get(candies.size()-1));
            candies.removeLast();

            counter = counter==4 ? 0:counter;

            people[counter]++;

            counter++;

        }
        

        for(int i : people)
            System.out.print(i+" ");
    }
}
