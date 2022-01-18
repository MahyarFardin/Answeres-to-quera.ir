
import java.util.Random;
import java.util.Scanner;


public class java {
    public static void QuickSort(int[] numbers, int start, int end){
        if (start >= end) {
            return;
        }
        int pivot= new Random().nextInt(end-start)+start;
        int center=numbers[pivot];
        Swap(numbers,pivot,end);
        int lp=start;
        int rp=end;

        while (lp<rp){
            while (numbers[lp]<=center && lp<rp){
                lp++;
            }
            while (numbers[rp]>=center && lp<rp){
                rp--;
            }

            Swap(numbers, lp,rp);
        }
        Swap(numbers,lp,end);

        QuickSort(numbers,0,lp-1);
        QuickSort(numbers,lp+1,end);
    }

    public static void Swap(int [] numbers, int firstPoint, int secondPoint){
        int temp=numbers[firstPoint];
        numbers[firstPoint]=numbers[secondPoint];
        numbers[secondPoint]=temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line=scan.nextLine();
        String [] lineSplit=line.split(" ");
        int [] numbers=new int[lineSplit.length];

        for (int i = 0; i < lineSplit.length; i++) {
            numbers[i] = Integer.parseInt(lineSplit[i]);
        }

        QuickSort(numbers,0,numbers.length-1);

        for(int i: numbers){
            System.out.print(i+" ");
        }
    }
}
