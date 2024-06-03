package UsingArray;
/*Write a Java program to initialize array with 5 student’s
name and another array to store the custom class data
such as Car with model and price.*/
class Car {
    String model;
    double price;
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}