public class Command_Line_Data_type {
    public static void main(String[] args) {
        System.out.println("argument entered: ");
        for (String arg : args){
            System.out.println(arg);
        }
        System.out.println("Total argument :"+ args.length);
    }
}