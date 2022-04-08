import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        You can use help method for each object to see its methods 

        Ex:
        Point point = new Point();
        point.Help()

        */

        Rect rect= new Rect(new Point(1,1), new Size(2,3), 0,2,10);
        rect.setM_width(5);
        rect.Show();
    }
}

