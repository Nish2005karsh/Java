import java.util.Scanner;
public class Main1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1=scanner.nextInt();
        System.out.println("Enter number 2:");
        int num2=scanner.nextInt(); 
        int sum=num1+num2;
        System.out.println("Sum is: " + sum);
        scanner.close();
    }
}