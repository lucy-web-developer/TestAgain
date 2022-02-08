/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package content;

/**
 *
 * @author seanz
 */
public class General {
    private String color;
    private boolean fill;
    public General(){
        this.color="white";
        this.fill=true;        
    }
    public General(String color,boolean fill){
        this.color=color;
        this.fill=fill;        
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public boolean getFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
    
}
