class Persons1 {
    String name;
    int age;
    int address;
    Persons1(String n,int a,int ad) {
        name = n;
        age = a;
        address = ad;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    // This class is empty and serves as a placeholder for future development.
    // It can be used to represent a collection of Person objects or any other related functionality.
}




public class Persons {
    public static void main(String[] args) {
        Persons1 p1 = new Persons1("John", 25, 123);
        Persons1 p2 = new Persons1("Jane", 30, 456);
        Persons1 p3 = new Persons1("Bob", 35, 789);
        p1.display();
        p2.display();
        p3.display();
        // p1,p2,p3 are objects of Persons1 class 
        // Here constructor is used to initialize the values of name, age and address
    }

    
}
