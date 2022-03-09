public class Point {
    private double m_x;
    private double m_y;

    // If no input is given
    Point(){
        m_x=0;
        m_y=0;
    }

    // If both inputs are given
    Point(double x , double y){
        m_x=x;
        m_y=y;
    }

    // To set each seperately 
    public void setM_x(double m_x) {
        this.m_x = m_x;
    }
    public void setM_y(double m_y) {
        this.m_y = m_y;
    }

    // getters
    public double getM_x() {
        return m_x;
    }
    public double getM_y() {
        return m_y;
    }

    // Printer
    public void Show(){
        System.out.println("x: "+m_x+" "+"y: "+m_y);
    }

    // To move point
    public void Move(double x_shift, double y_shift){
        System.out.println("Before: ");
        Show();

        setM_x(m_x+x_shift);
        setM_y(m_y+y_shift);
    
        System.out.println("After: ");
        Show();
    }


    // Distance calculator
    public void Distance(Point point1, Point point2){
        double x=Math.abs(point1.getM_x()-point2.getM_x());
        double y=Math.abs(point1.getM_y()-point2.getM_y());
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        System.out.println("Euclidean: "+Math.sqrt(x*x+y*y));
    }
        
    public void Help(){
        System.out.println("First initilize the line then you can use:");
        System.out.println("1.setters and getters");
        System.out.println("2.Show");
        System.out.println("3.Move");
        System.out.println("4.Distance");
    }
}
