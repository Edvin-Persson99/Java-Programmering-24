package exercises.E4exercsies.E4;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public double calculateAreah(){
        return this.width * this.length;
    }

    public double calculatePerimeter(){
        return (this.width + this.length) * 2;
    }

}
