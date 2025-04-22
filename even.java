import java.util.Scanner;
public class even{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=scanner.nextInt();
        if(num%2==0 && num>0){
            System.out.println("Number is even and positive!");
        }
        else{
            System.out.println("Number does not satisfy the condition");
        }
        scanner.close();
    }
}