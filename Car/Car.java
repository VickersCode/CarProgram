public class Car {
    
    // Attributes
    private int yearModel;
    private String make;
    private int speed;

    //Constructor - speed always starts at 0
    public Car(int year, String carMake) {
        yearModel = year;
        make = carMake;
        speed = 0;
    }

    // Accessors
    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    // Method increments 5 to speed field each time it is called
    public void accelerate() {
        speed += 5;
    }

    // Method decrements 5 to speed field each time it is called
    public void brake() {
        speed -= 5;
    }
}
