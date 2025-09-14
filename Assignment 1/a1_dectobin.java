import java.util.Scanner;
public class a1_dectobin {
    public static void main(String[] args) {
    //    System.out.println("Hello, World!");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the decimal: ");
    int decimal=sc.nextInt();

    String binary=Integer.toBinaryString(decimal);
    System.out.println("Binary="+binary);
    }
}