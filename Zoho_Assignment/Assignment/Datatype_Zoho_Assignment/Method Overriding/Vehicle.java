public class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
    void stop() {
        System.out.println("Vehicle is stopping");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
    @Override
    void stop() {
        System.out.println("Car is stopping");
    }
}
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }
    @Override
    void stop() {
        System.out.println("Bike is stopping");
    }
}
// interface interface1 {
//     void start();
//     int a=5;
// }
// interface interface2 {
//     void stop();
//     // int a=10;
// }
// class Test implements interface1, interface2 {
//     // int a=20; 
//     @Override
//     public void start() {
//         System.out.println("Start method from interface1");
//     }
//     @Override
//     public void stop() {
//         System.out.println("Stop method from interface2");
//     }
// }
class Main {        
    public static void main(String[] args) {
        // Test t = new Test();
        // t.start(); // Start method from interface1
        // System.out.println(t.a);
        Vehicle v = new Car();
        v.start(); 
        v.stop();  
        v = new Bike();
        v.start(); 
        v.stop();  
    }
}
