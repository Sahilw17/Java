import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int sum = 0;

        System.out.println("Prime numbers between 2 and " + num + ":");

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");  
                sum += i;                  
            }
        }

        System.out.println("\nSum of prime numbers is: " + sum);
    }
}
