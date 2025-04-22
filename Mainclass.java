class c1 {
    int l = 5; 

    void display() {
        System.out.println("Value of l = " + l);
    }
}

class c2 extends c1 { 
    int b = 10; 

    void calc() {
        System.out.println("Calculation = " + (l * b)); 
    }
}

public class Mainclass {
    public static void main(String[] args) {
        c2 obj = new c2();
         obj.display();
         obj.calc();
    }
}