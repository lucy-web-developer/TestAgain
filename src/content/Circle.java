/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package content;

/**
 *
 * @author seanz
 */
public class Circle extends General{
    private double radius;
    public Circle(){
        this.radius=1;        
    }
     public Circle(double radius){
        this.radius=radius;        
    }
    public Circle(double radius, String color, boolean fill){
        this.radius=radius;  
        setColor(color);
        setFill(fill);        
    }

    public double getRadius() {
        return radius;
    }
    
    public double getArea(){
        double area= Math.PI*radius*radius;
        return area;
    }
    public double getPerimeter(){
        double area= 2*Math.PI*radius;
        return area;
    }
}
