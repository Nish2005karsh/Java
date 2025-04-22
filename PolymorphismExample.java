class Test{
    int x = 5;
    void run(){
       System.out.println("Hello");
    }
}
class Test1 extends Test{
   void run(){
       System.out.println("Welcome");
   }
}

class final_example{
   public static void main(String[] args) {
       Test1 t = new Test1();
       t.x = 50;
       System.out.println(t.x);
   t.run();
}
}
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Demonstrating runtime polymorphism
        Animal myDog = new Dog(); // Animal reference, Dog object
        Animal myCat = new Cat(); // Animal reference, Cat object

        myDog.sound(); // Outputs: Dog barks
        myCat.sound(); // Outputs: Cat meows

        // Demonstrating compile-time polymorphism (method overloading)
        MathUtil math = new MathUtil();
        System.out.println(math.add(5, 3)); // Outputs: 8
        System.out.println(math.add(4.5, 3.7)); // Outputs: 8.2
    }
}

// Overloaded methods in a separate class
class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}