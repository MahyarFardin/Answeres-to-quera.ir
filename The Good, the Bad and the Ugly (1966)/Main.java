import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        /*
        ArrayList<String> graves=new ArrayList<String>();
        */
        ArrayList<String> names1=new ArrayList<String>();

        String [] graves=new String[n];
        String [] names=new String[n-1];
        boolean flag=false;


        for (int i = 0; i < n; i++) {
            graves[i]=scan.nextLine();
        }

        for (int i = 0; i < n-1; i++) {
            names[i]=scan.nextLine();
        }

        Arrays.sort(graves);
        Arrays.sort(names);

        for (int i = 0; i < names.length; i++) {
            names1.add(names[i]);
        }


        for (int j = 0; j < graves.length; j++) {
            flag=false;
            for (int i = 0; i < names1.size(); i++) {
                if (graves[j].equals(names1.get(i))) {
                    names1.remove(i);
                    flag = true;
                    break;
                }
            }

            if (flag == false) {
                System.out.println(graves[j]);
                return;
            }
        }


    }
}
