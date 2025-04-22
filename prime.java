import java.util.Scanner;
public class  prime{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=scanner.nextInt();
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                count=count+1;
            }
        }
        if(count>=2){
            System.out.println("Number is composite");
        }
        else{
            System.out.println("Number is prime");
        }
        scanner.close();
    }
}