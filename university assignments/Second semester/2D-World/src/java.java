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


        Point point=new Point(scan.nextDouble(), scan.nextDouble());
        Point point1=new Point(scan.nextDouble(), scan.nextDouble());
        Point point2=new Point(scan.nextDouble(), scan.nextDouble());

        Line line=new Line(point1, point2);
        Circle circle = new Circle(point, line);
        circle.Show();

    }
}

