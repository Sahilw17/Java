package pack1;
import java.util.Scanner;
public class Student{
    public int prn;
    public int phno;
    public int python;
    public int java;
    public int dcn;
    public int rm;
    public int peace;

    // public Student(int prn,int phno,int python,int java,int dcn,int rm,int peace){
    //     this.prn=prn;
    //     this.phno=phno;
    //     this.python=python;
    //     this.java=java;
    //     this.dcn=dcn;
    //     this.rm=rm;
    //     this.peace=peace;
    // }

    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the prn:");
        prn = sc.nextInt();

        System.out.println("Enter the phno:");
        phno = sc.nextInt();

        System.out.println("Enter the Python:");
        python = sc.nextInt();

        System.out.println("Enter the Java:");
        java = sc.nextInt();

        System.out.println("Enter the DCN:");
        dcn = sc.nextInt();

        System.out.println("Enter the RM:");
        rm = sc.nextInt();

        System.out.println("Enter the PEACE:");
        peace = sc.nextInt();

        sc.close();
    }
}