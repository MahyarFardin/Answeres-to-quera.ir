import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class Rect {
    private Point m_center;
    private Size m_size;
    private double m_angle;

    Rect(Point point,Size size, double angle){
        m_center= point;
        m_size=size;
        m_angle=angle;
    }

    Rect(Size size, double angle){
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
        System.out.println("Center is :"+ m_center);
        System.out.println("Angel is :"+ m_angle);
        System.out.println("Sizes are:");
        m_size.Show();
    }

    public void Move(double x, double y){
        m_center.Move(x, y);
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
}
