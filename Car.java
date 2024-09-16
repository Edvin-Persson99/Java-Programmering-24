public class Car {

    private String make;
    private String model;
    private int year;
    private String color;

    Car(String make, String model, int year, String color){

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }

    Car(String make, String model) {

        this(make, model, 2010, "Defualt color");

    }

    public String toString(){
        return "The make is "+make+" and the model is "+model+" and this car is from "+year+ " and the color is "+color;
    }

    Car car1 = new Car("Volvo","V70", 2010, "black");

    Car car2 = new Car("Volvo", "V70");

}
