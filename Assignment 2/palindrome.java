import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int num2=num;
        int reversed=0;
        while (num > 0){
            int digit=num%10;
            reversed=reversed * 10 + digit;
            num=num/10;
        }
        if (num2==reversed){
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
}