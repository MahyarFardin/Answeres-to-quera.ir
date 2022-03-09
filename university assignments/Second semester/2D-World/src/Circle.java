public class Circle {

    private Point m_center;
    private Line m_radios;

    Circle(Point center, Line radios){
        m_center=center;
        m_radios=radios;
    }
    Circle(Line radious){
        m_center.setM_x(0);
        m_center.setM_y(0);
        
        m_radios=radious;
    }
    Circle(Point center){
        System.out.println("Invalid this is a point!");
    }

    public void setM_center(Point m_center) {
        this.m_center = m_center;
    }
    public void setM_radios(Line m_radios) {
        this.m_radios = m_radios;
        if(m_radios.getM_start()!=m_center){
            System.out.println("Your radious is not centered!");
            setM_center(m_center);
        }
    }
    public Point getM_center() {
        return m_center;
    }
    public Line getM_radios() {
        return m_radios;
    }

    public void Show() {
        System.out.println("Center is: ");
        m_center.Show();
        System.out.println("Radious is: ");
        m_radios.length();
    }

    public void Move(double deltax, double deltay) {
        m_center.Move(deltax, deltay);
        System.out.println("Center & radious start moved to: ");
        m_center.Show();
        m_radios.set_start(m_center);
    }

    public void Area(){
        System.out.println("Area is: "+ 3.14*Math.pow(m_radios.line_Leght(),2));
    }

    public void Perimeter(){
        System.out.println("perimeter is: "+ 6.28*m_radios.line_Leght());
    }

    public void Resize(Point point){
        System.out.println("Center is not chaingable you are chainging the head of radious on the circle: ");
        m_radios.set_end(point);
    }

    public void Help(){
        System.out.println("First initialize the Circle with a center point and radious:");
        System.out.println("PS: Though radious is a semi-arrow in this project the start of it should be centered so the radious is a point on the circle!!!");
        System.out.println("1.Getters and Setters");
        System.out.println("2.Show");
        System.out.println("3.Move");
        System.out.println("4.Resize");
        System.out.println("5.Area");
        System.out.println("6.Perimeter");
    }

}