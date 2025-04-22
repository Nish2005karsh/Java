import java.util.Scanner;
public class pallindrome{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=scanner.nextInt();
        int newnum=num;
        int m=0;
        while(num>0){
            int remainder=num%10;
            m=m*10+remainder;
            num=num/10;

            

        }
        if(newnum==m){
            System.out.println("Pallindrome");

        }
        else{
            System.out.println("Non pallindorme");
        }


        
        scanner.close();
    }
}
