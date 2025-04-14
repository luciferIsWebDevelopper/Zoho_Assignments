public class Vehicle {
    int noOfTyres;
    String color;
    void moving(){
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle{
    Car(int noOfTyres,String color){
        this.noOfTyres=noOfTyres;
        this.color=color;
    }
    @Override
    void moving(){
        System.out.println("Car is Moving");
    }
}
class Bike extends Vehicle{
    Bike(int noOfTyres,String color){
        this.noOfTyres=noOfTyres;
        this.color=color;
    }
    @Override
    void moving(){
        System.out.println("Bike is Moving");
    }
    void eat(){
        System.out.println("Bike is eating");
    }
}
class Main {
public static void main(String[] args) {
    Vehicle v=new Car(4, "Red");
    Car c=(Car)v;
    System.out.println(c.color);
    System.out.println(c.noOfTyres);
    c.moving();
    v=new Bike(2, "Black");
    v.moving();
    // v.eat(); // This line will cause a compile-time error because eat() is not defined in Vehicle class
    Bike b=(Bike)v;
    System.out.println(b.color);
    System.out.println(b.noOfTyres);
    b.moving();
}
    
}
