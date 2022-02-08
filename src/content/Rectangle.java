
package content;
public class Rectangle extends General{
    private double width;
    private double height;
    public Rectangle(){
       super();
       this.width=1;
       this.height=1;       
    }
    public Rectangle(double width,double height,String color,boolean fill){
       super(color,fill);
       this.width=1;
       this.height=1;       
    }
     
    
    public double getArea(){
        double area= width*height;
        return area;
    }
    public double getPerimeter(){
        double area= 2*(width+height);
        return area;
    }
    
    
}
