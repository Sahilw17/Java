package pack2;
import pack1.Student;

public class Percentage {
    public static void main(String[] args) {
        Student data=new Student();
        data.inputData();
        int percentage=(data.python+data.java+data.rm+data.peace+data.dcn)/5;
        System.out.println("Percentage= "+percentage);
    }
}