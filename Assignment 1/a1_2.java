// wap to acccept  numbers and find avg
import java.util.* ;
class a1_2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number= ");
        int avg=0;
        for(int i=0 ; i<5; i++){
            int a=sc.nextInt();
            avg=avg+a;
        }
        System.out.println("Avg="+avg/5);
    }
}