package exercises.E4exercsies.E4;

public class GeometryTester {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2, 5);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        System.out.println(rectangle.calculateAreah());
        System.out.println(rectangle.calculatePerimeter());
    }

}
