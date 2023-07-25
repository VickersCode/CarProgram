
/**
 * Excercise from Starting Out With Java 5th Edition
 * Chapter 6 Question 2
 * 
 * Program creates a "Car" class which hold year, make, and speed attributes.
 * 
 * accelerate() increments speed by 5
 * brake() decrements speed by 5
 */
public class CarProgram {
    public static void main(String[] args) {
        
        // Create a car object
        Car toyota = new Car(1983, "Prius");

        for (int i = 1; i <= 5; i++) {
            toyota.accelerate();
            System.out.println("The speed of the car is: " + toyota.getSpeed() + " mph.");
        }

        for (int i = 1; i <= 5; i++) {
            toyota.brake();
            System.out.println("The speed of the car is: " + toyota.getSpeed() + " mph.");
        }
    }
}
