/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Cyberfaour
 */
public class Circles {
    private double radius=1;
    
    public Circles(){
        
    }
    public Circles(double rad){
        radius=rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius, 2)*Math.PI;
    }
    public double diameter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circles" + "radius=" + radius + " Area: "+getArea()+" Paramete: "+getRadius();
    }
    
    
}
