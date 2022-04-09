public class Rect extends Size implements Shape2d, Drawable  {
    
    private Point m_center;
    private Size m_size;
    private double m_angle;

    Rect(Point point,Size size, double angle, int width, int height){
        super(width, height);
        m_center= point;
        m_size=size;
        m_angle=angle;
    }

    Rect(Size size, double angle, int width, int height){
        super(width, height);
        m_center= new Point();
        m_size=size;
        m_angle=angle;
    }

    public double getM_angle() {
        return m_angle;
    }
    public Point getM_center() {
        return m_center;
    }
    public Size getM_size() {
        return m_size;
    }
    public void setM_angle(double m_angle) {
        this.m_angle = m_angle;
    }
    public void setM_center(Point m_center) {
        this.m_center = m_center;
    }
    public void setM_size(Size m_size) {
        this.m_size = m_size;
    }
    public void Show(){
        System.out.print("Center is :");
        m_center.Show();
        System.out.println("Angel is :"+ m_angle);
        System.out.println("Sizes are:");
        m_size.Show_size();
    }

    @Override
    public  void setM_width(double width){
        this.m_width = width+5;
    }

    @Override
    public void Move(Point point){
        m_center.Move(point.getM_x(), point.getM_y());
        System.out.println("Center is: ");
        m_center.Show();
    }

    public void Resize(double height, double width){
        m_size.setM_height(m_size.getM_height()+height);
        m_size.setM_width(m_size.getM_width()+width);
    }

    public void ReAngle(double angle){
        setM_angle(angle);
    }

    @Override
    public void Area(){
        System.out.println("Area is: "+m_size.getM_height()*m_size.getM_width());
    }

    public void Perimeter(){
        System.out.println("Perimeter is: "+m_size.getM_height()*2+m_size.getM_width()*2);
        
    }

    public void Help(){
        System.out.println("First initialize the shape with center point height width and angle!");
        System.out.println("1.Getters and Setters");
        System.out.println("2.Area");
        System.out.println("3.Perimeter");
        System.out.println("4.Resize");
        System.out.println("5.Move");
        System.out.println("6.ReAngle");
    }

    @Override
    public Point[] getPoints() {
        double [] delt=new double[2];

        Point [] endPoints=new Point[4];
        
        double [] points= new double[4];
        points[0]=getM_center().getM_x()-(this.getM_width()/2);
        points[1]=getM_center().getM_x()+(this.getM_width()/2);
        points[2]=getM_center().getM_y()-(this.getM_width()/2);
        points[3]=getM_center().getM_y()-(this.getM_width()/2);
        
        delt[0]=tangantCalculator(new Line(this.m_center, new Point(this.m_center.getM_x(), points[0])), this.m_angle);
        delt[1]=tangantCalculator(new Line(this.m_center, new Point(this.m_center.getM_y(), points[2])), this.m_angle);

        int counter=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                counter++;
                endPoints[counter]=new Point(points[i]+delt[0], points[j]+delt[1]);
            }
        }
               
        System.out.println("These are points from top left to bottom right");
        for (Point p : endPoints) {
            p.Show();
        }

        return endPoints;
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

    @Override
    public double tangantCalculator(Line distance, double angel) {
        return (distance.length()*Math.tan(angel));
    }
}
