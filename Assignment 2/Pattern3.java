//         *
//      *     *
//    *    *    *
//      *     *
//         *


public class Pattern3 {
    public static void main(String[] args) {
 int n = 3; // height of the upper pyramid (middle line length will be 3 stars)

        // upper part (including middle line)
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}