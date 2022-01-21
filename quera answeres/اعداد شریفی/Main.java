import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] list= new int[n];
        int sum=0;

        for(int i=0;i<n; i++){
            list[i]=scan.nextInt();
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                sum += 2*list[i]*list[j];
            }
        }

        
        for (int i = 100 ; i <=sum; i++) {
            int sharifNumber=0;
            String num=String.valueOf(i);
            int power=num.length();
            String [] digits= num.split("");

            for(String s: digits){
                sharifNumber += Math.pow(Integer.parseInt(s),power);
            }
            if (sharifNumber==i) {
                System.out.println(i);
            }
        }


    }
}
