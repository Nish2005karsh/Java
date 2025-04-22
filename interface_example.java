public class interface_example {
    public static void main(String[] args) {
        test1 obj = new test1();
        obj.addition(5, 10);
        obj.subtraction(10, 5);
        
    }
    
}

interface calculator{
    void addition(int a, int b);
    void subtraction(int a, int b);
}
class test1 implements calculator{
    public void addition(int a, int b){
        System.out.println("Addition is: " + (a + b));
    }
    public void subtraction(int a, int b){
        System.out.println("Subtraction is: " + (a - b));
    }
}

