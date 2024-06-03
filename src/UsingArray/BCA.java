package UsingArray;

public class BCA {
    public static void main(String[] args) {
        String[] students = {"Sujan", "Nishant", "Prashant", "ishwor", "Aayushman"};
        System.out.println("Student Names:");
        for (String student : students) {
            System.out.println(student);
        }
        Car[] cars = new Car[3];
        cars[0] = new Car("GTR ", 85000);
        cars[1] = new Car("Honda Accord", 26000);
        cars[2] = new Car("Ford Mustang", 30000);
        System.out.println("\nCar Details:");
        for (Car car : cars) {
            car.display();
        }
    }
}

