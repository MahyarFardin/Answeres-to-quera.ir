import java.util.Scanner;

public class Line implements Drawable{

    private Point m_start;
    private Point m_end;

    // Line without initilizatin is invalid because there will be two duplicated points (0,0) (0,0)

    Line(Point start, Point end){
        m_start=start;
        m_end=end;
    }


    public void set_start(Point start){
        m_start=start;
    }
    public void set_end(Point end){
        m_end=end;
    }

    public Point getM_end() {
        return m_end;
    }
    public Point getM_start() {
        return m_start;
    }

    public void Show(){
        System.out.println("Start point: ");
        m_start.Show();
        System.out.println("End point: ");
        m_end.Show();
    }

    public void Help(){
        System.out.println("First initilize the line then you can use:");
        System.out.println("1.Show");
        System.out.println("2.Slop");
        System.out.println("3.Equation");
        System.out.println("4.Line_Point_Distance(Point)");
        System.out.println("5.Line_Line_Distance(Line)");
        System.out.println("6.Move(double, double, double, double)");
        System.out.println("7.setters and getters");
        System.out.println("8.length");


    }

    private double[] delt(){
        double [] delt= new double[2];
        delt[0]=m_end.getM_x()-m_start.getM_x();
        delt[1]=m_end.getM_y()-m_start.getM_y();

        return  delt;
    }
    public void Slop_Show(){
        System.out.println('\u0394'+"x: "+delt()[0]);
        System.out.println('\u0394'+"y: "+delt()[1]);

        System.out.println("Slop is: "+delt()[0]/delt()[1]);
    }

    private double Slop(){
        return delt()[0]/delt()[1];
    }

    public void Equation(){
        System.out.println("y = "+Slop()+" x +("+(-Slop()*m_start.getM_x()+m_start.getM_y()+")"));

    }

    public void Line_Point_Distance(Point point){
        System.out.println("Distance of Point ");
        point.Show();
        System.out.println("from line ");
        Equation();

        System.out.println("Is "+ Math.abs(point.getM_y()+(-(Slop()*point.getM_x())+(Slop()*m_start.getM_x()+m_start.getM_y())/
        Math.sqrt(1+(Slop()*point.getM_x())*(Slop()*point.getM_x())))));
    }

    public void Line_Line_Distance(Line line) {
        if(Slop() != line.Slop()){
            System.out.println("These lines have contacts");
            return;
        }

        System.out.println("Distance is: "+Math.abs(((Slop()*m_start.getM_x()-m_start.getM_y())-(line.Slop()*line.getM_start().getM_x()-line.getM_start().getM_y()))
        /Math.sqrt(1+(Slop()*m_start.getM_x())*(Slop()*m_start.getM_x()))));

    }

    public void Move(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your input as: double double double double");
        double one=scan.nextDouble();
        double two=scan.nextDouble();
        double three=scan.nextDouble();
        double four=scan.nextDouble();

        System.out.println("Before:");
        Show();
        System.out.println("After:");
        m_start.setM_x(m_start.getM_x()+one);
        m_start.setM_y(m_start.getM_y()+two);
        m_end.setM_x(m_end.getM_x()+three);
        m_end.setM_y(m_end.getM_y()+four);
        Show();
    }

    public double length(){
        double len=Math.sqrt(Math.pow(m_start.getM_x()-m_end.getM_x(),2)+Math.pow(m_start.getM_y()-m_end.getM_y(),2));
        System.out.println(len);
        return len;
    }
    public double line_Leght(){
        return (Math.sqrt(Math.pow(m_start.getM_x()-m_end.getM_x(),2)+Math.pow(m_start.getM_y()-m_end.getM_y(),2)));
    }


    @Override
    public Point[] getPoints() {
        Point[] point = new Point[2];
        point[0]=this.m_start;
        point[1]=this.m_end;
        return point;
    }

    @Override
    public double tangantCalculator(Line distance, double angel) {
        return this.Slop();
    }

    @Override
    public Point[] boundingBox() {
        Point [] endPoints=new Point[4];
        endPoints=this.getPoints();

        double [] borders= new double[4]; //maximums and minimums ind x-y axis

        borders[0]=borders[1]=Double.MIN_VALUE;
        borders[3]=borders[2]=Double.MAX_VALUE;

        for(Point p : endPoints){
            if (p.getM_x() > borders[0]) {
                borders[0]=p.getM_x();
            }
            else if(p.getM_x() < borders[2]){
                borders[2]=p.getM_x();
            }

            if (p.getM_y() > borders[1]) {
                borders[1]=p.getM_y();
            }
            else if(p.getM_y() < borders[3]){
                borders[3]=p.getM_y();
            }
        }

        int counter=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                counter++;
                endPoints[counter]=new Point(borders[i]+borders[0], borders[j]+borders[1]);
            }
        }

        return endPoints;
    }
}