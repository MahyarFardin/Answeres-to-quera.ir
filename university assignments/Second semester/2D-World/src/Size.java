public class Size {
    private double m_width;
    private double m_height;

    Size(double width, double height){
        m_width=width;
        m_height=height;
    }
    protected void setM_height(double m_height) {
        this.m_height = m_height;
    }
    protected void setM_width(double m_width) {
        this.m_width = m_width;
    }
    protected double getM_height() {
        return m_height;
    }
    protected double getM_width() {
        return m_width;
    }
    public void Show_size(){
        System.out.println("width: "+ this.getM_width());
        System.out.println("height: "+ this.getM_height());
    }


}
