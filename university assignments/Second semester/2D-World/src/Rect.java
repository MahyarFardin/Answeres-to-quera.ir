public class Rect {
    private Point m_center;
    private Size m_size;
    private double m_angle;

    Rect(Point point,Size size, double angle){
        m_center= point;
        m_size=size;
        m_angle=angle;
    }
}
