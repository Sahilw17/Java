import java.io.*;
import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the new file name: ");
         String n2=args[0];

        try {
            FileReader fr = new FileReader("sample.txt");
            FileWriter fw = new FileWriter(n2);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            System.out.println("File copied successfully to " + n2);

            fr.close();
            fw.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
