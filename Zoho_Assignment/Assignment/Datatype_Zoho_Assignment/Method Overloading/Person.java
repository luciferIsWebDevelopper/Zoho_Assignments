class Person {
    String name;
    int age;
    String address;
    Person(String name) {
        this.name = name;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
class Main{
    public static void main(String[] args) {
        Person p1 = new Person("John");
        Person p2 = new Person("Jane", 25);
        Person p3 = new Person("Doe", 30, "123 Main St");

        System.out.println(" Person 1 Name: " + p1.name);
        System.out.println(" Person 2 Name: " + p2.name + ", Person 2 Age: " + p2.age);
        System.out.println(" Person 3 Name: " + p3.name + ", Person 3 Age: " + p3.age + ", Person 3 Address: " + p3.address);
        System.out.println(" Person 1 Name: " + p1.name + ", Person 1 Age: " + p1.age + ", Person 1 Address: " + p1.address);
        System.out.println(" Person 2 Name: " + p2.name + ", Person 2 Age: " + p2.age + ", Person 2 Address: " + p2.address);
        
    }
}
