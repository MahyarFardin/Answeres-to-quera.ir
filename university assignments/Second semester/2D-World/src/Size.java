public class Size {
    private double m_width;
    private double m_height;

    Size(double width, double height){
        m_width=width;
        m_height=height;
    }

    public void setM_height(double m_height) {
        this.m_height = m_height;
    }
    public void setM_width(double m_width) {
        this.m_width = m_width;
    }
    public double getM_height() {
        return m_height;
    }
    public double getM_width() {
        return m_width;
    }

    public void Show(){
        System.out.println("Height is: "+m_height);
        System.out.println("Width is: "+m_width);
    }
}
