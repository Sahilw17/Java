import java.util.Scanner;
public class a1_binarytodec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        String bin=sc.nextLine();
        int decimal=Integer.parseInt(bin, 2);
        System.out.println("decimal:"+decimal);
    }
}