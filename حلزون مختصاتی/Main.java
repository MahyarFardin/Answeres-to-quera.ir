import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int x=0;
        int y=0;

        for (int i = 0; i < number-1; i++) {
            if (i%4 == 0) {
                x=Math.abs(x)+1;
            }
            else if(i%4 == 1){
                y=Math.abs(y)+1;
            }
            else if(i%4 == 2){
                x=-x;
            }
            else {
                y=-y;
            }
        }

        System.out.println(x+" "+y);
    }
}
