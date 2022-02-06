import java.util.ArrayList;
import java.util.Scanner;

public class java {

    public static void Bye(ArrayList<String> names){
        System.out.println(names.get(0)+":"+" khodafez bacheha!");

        for (int i = 1; i < names.size(); i++) {
            System.out.println(names.get(i)+": khodafez "+names.get(0)+"!");
        }

        names.remove(0);
        if (names.size() == 0) {
            return;
        }

        Bye(names);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<String> names=new ArrayList<>();

        for (int i=0;i<n ; i++){
            names.add(scan.next());
        }

        for (int i = 1; i < names.size(); i++) {
            for (int j = i-1; j >= 0; j--) {
                System.out.println(names.get(i)+": salam "+names.get(j)+"!");
            }
        }

        Bye(names);
    }
}
