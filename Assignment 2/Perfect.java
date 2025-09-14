import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if (num % i == 0){
                sum+=i;
            }
        }
        if(sum==num && num!=0){
            System.out.println("The number is perfect");
        }
        else{
            System.out.println("The number is not perfect");
        }
    }
}