public class Pattern4 {
    public static void main(String[] args) {
         int n = 5; // last number (height of the pyramid)

        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = i; j < n - 1; j++) {
                System.out.print("  ");
            }

            // print numbers from (n-i) to n
            for (int j = n - i; j <= n; j++) {
                System.out.print(j + "   ");
            }

            System.out.println();
        }
    }
}