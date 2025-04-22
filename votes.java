import java.util.Scanner;
public class votes{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("NotEligible for voting");   
        }  
        scanner.close();
    }
}