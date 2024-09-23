package exercises.E4exercsies.E4;
import java.math.*;
public class Circle {

    private double radius;
    private double diameter;

    public Circle(double radius, double diamter) {
        this.radius = radius;
        this.diameter = diamter;
    }

    public double calculateCircumference(){
        return Math.PI *this.diameter;
    }

    public double calculateArea(){
        return Math.PI*Math.pow(this.radius, 2.0); 
    }

}
