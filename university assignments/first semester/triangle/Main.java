import java.util.Scanner;

public class fkntriangel {
    public static void main(String[] args) {
        //getting initials

        double a,b,c,cos1,cos2,cos3,degree1,degree2,degree3;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();

        //front of each side Angels: 
        cos1=(-Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2))/(2*b*c);
        degree1=Math.toDegrees(Math.acos(cos1));
        cos2=(Math.pow(a, 2)-Math.pow(b, 2)+Math.pow(c, 2))/(2*c*a);
        degree2=Math.toDegrees(Math.acos(cos2));
        cos3=(Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2))/(2*b*a);
        degree3=Math.toDegrees(Math.acos(cos3));

        System.out.printf("Angles: %.3f, %.3f, %.3f",degree1,degree2,degree3);

        //area
        double s,heron;
        s=(b+a+c)/2;
        heron=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println();
        System.out.printf("Area: %.3fcm^2",heron);

        //min max hight
        double m1,m2,m11,m22;
        m1 =Math.min(Math.min(a,b),c);
        m2 = Math.max(Math.max(a, b),c);
        m11=(heron*2)/m2;
        m22=(heron*2)/m1;
        System.out.println();
        System.out.printf("Min & Max Height: %.3fcm, %.3fcm", m11,m22);


    }

}
