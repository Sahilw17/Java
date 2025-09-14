import java.util.Scanner;
public class str_palindrome {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");        
        String str=sc.nextLine();
        String newstr=str;
        String revstr="";
        for(int i=str.length()-1;i>=0;i--){
            revstr += str.charAt(i);
        }
        if (newstr.equals(revstr)){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }

    }
}