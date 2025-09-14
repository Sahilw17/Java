import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int newnum=num;
        int result=0;
        while(num>0){
            int digit=num%10;
           result += (int)Math.pow(digit, 3); 
            num=num/10;
        }
        if(newnum==result){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }
}
