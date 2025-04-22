public class Car{
    private String make;
    private String model;
    private int year;

public Car(String make,String model,int year){
    this.make=make;
    this.model=model;
    this.year=year;
}
public void startEngine(){
    System.out.println("Engine started for " + make + " " + model + " " + year);
}
public void showDetails(){
    System.out.println("Car make: " + make);
    System.out.println("Car model: " + model);
    System.out.println("Car year: " + year);
}

public static void main(String[] args){
    Car car1=new Car("Toyota","Camry",2020);
    car1.startEngine();
    car1.showDetails();


    
}}
