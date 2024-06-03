package vectorClassExample;

import java.util.Vector;

public class VectorClass {
    /*Write a Java program to use Vector for storing the custom
class objects and use following functions:
- size()
- isEmpty()
- add()
- remove()
- get()
- indexOf()*/
    public static void main(String[] args) {
        Vector<Car> carChargingList = new Vector<>();
        System.out.println("vector size:"+carChargingList.size());
        System.out.println("Vector isEmpty:"+carChargingList.isEmpty());
        carChargingList.add(new Car(100000,"GTR"));
        System.out.println("Vector Size:"+carChargingList.size());
        System.out.println("Vector isEmpty:"+carChargingList.isEmpty());
        carChargingList.add(new Car(2000,"MUSTANG"));
        carChargingList.add(new Car(30000,"LAMBO"));
        System.out.println("vector Size:"+carChargingList.size());
        Car car = carChargingList.get(0);
        System.out.println("Model Name:"+car.modelName+"\tprice:"+car.price);
        car = carChargingList.remove(0);
        System.out.println("after remove modelName:"+car.modelName+"\tprice" +car.price);
        System.out.println("Vector Size:"+carChargingList.size());
        System.out.println("Vector index of:"+carChargingList.indexOf(car));
    }
}
