// 1 x x x
// 2 3 x x
// 4 5 6 x
// 7 8 9 10

public class Pattern1 {
    public static void main(String[] args) {
        int n=1;
        int r=4;
        for(int i=1;i<=r;i++){
           for (int j=1;j<=i;j++){
            System.out.print(n+" ");
            n+=1;
           }
           System.out.println("");
        }
    }
}