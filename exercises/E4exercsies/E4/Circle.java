package exercises.E4exercsies.E4;
public class Circle {

    private double radius;
    private double diameter;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius*2;
    }

    public double calculateCircumference(){
        return Math.PI *this.diameter;
    }

    public double calculateArea(){
        return Math.PI*Math.pow(this.radius, 2.0); 
    }

}
