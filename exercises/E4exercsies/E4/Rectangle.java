package exercises.E4exercsies.E4;

public class Rectangle {
    private double length;
    private double width;

    public double calculateArea(double width, double length){
        return this.width * this.length;
    }

    public double calculatePerimeter(double width, double length){
        return (this.width + this.length) * 2;
    }

}
