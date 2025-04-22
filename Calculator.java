public class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public String add(String a,String b){
        return a+b;
    }
    Calculator calc = new Calculator();
    int sumInt = calc.add(5, 10);
    double sumDouble = calc.add(5.5, 10.5);
    String sumString = calc.add("Hello, ", "World!");
    public static void main(String[] args){
        Calculator calc=new Calculator();
        System.out.println("Integer addition: " + calc.add(5, 10));
        System.out.println("Double addition: " + calc.add(5.5, 10.5));
        System.out.println("String concatenation: " + calc.add("Hello, ", "World!"));
    }
    
}

