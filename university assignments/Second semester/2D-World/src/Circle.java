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

}
