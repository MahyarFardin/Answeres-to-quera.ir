import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> soil=new ArrayList<Integer>();
        int n=scan.nextInt();
        int b=scan.nextInt();
        int a=scan.nextInt();
        int cost=0;
        int truck=1;
        boolean flag=false;

        for (int i = 0; i < n; i++) {
            soil.add(scan.nextInt());
        }


        int road=soil.size();
        while (truck<road){
            if (soil.get(truck)<soil.get(0)) {
                cost += (soil.get(0)-soil.get(truck))*b;
                soil.set(truck,soil.get(0));
                flag=false;
            }
            else if (truck<soil.size()-1 && soil.get(truck)>soil.get(0)) {
                soil.set(truck+1,soil.get(truck+1)+soil.get(truck)-soil.get(0));
                soil.set(truck,soil.get(0));
                if (flag == false) {
                    cost += a;
                    flag=true;
                }
            }
            else if (truck==soil.size()-1 && soil.get(truck)>soil.get(0)) {
                soil.add(0);
                road= soil.size();
                soil.set(truck+1,soil.get(truck+1)+soil.get(truck)-soil.get(0));
                soil.set(truck,soil.get(0));
                if (flag == false) {
                    cost += a;
                    flag=true;
                }
            }

            truck++;
        }

        System.out.println(Math.abs(cost));
    }
}
