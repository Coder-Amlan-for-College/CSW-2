import java.util.*;
class Car implements Comparable<Car>{
    private int modelNo;
    private String name;
    private int stock;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }
    public int getModelNo() {
        return modelNo;
    }
    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int compareTo(Car car) {
         return Integer.compare(this.stock, this.stock);
    }
    public String toString() {
        return "Car [Model Number: " + modelNo + ", name: " + name + ", stock: "+stock+"]";
    }
}
public class H3CarApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
         cars.add(new Car(2013,"Creta",10));
         cars.add(new Car(2020,"MG",13));
         cars.add(new Car(2018,"Kia",20));
         cars.add(new Car(2017,"Audi",45));
         cars.add(new Car(2015,"BMW",55));
         Collections.sort(cars);
         System.out.println("List of sorted cars: ");
         for(Car car:cars){
            System.out.println(car);
         }
    }
}
