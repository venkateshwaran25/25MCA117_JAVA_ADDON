package Array;

public class twodimensionalarray {

    public static void main(String[] args) {
        int[][] num = {
            {25, 35},
            {23, 5},
            {47, 54},
            {62, 55}
        };

        System.out.println("Access Using Row and Column index:");
        System.out.println(num[0][0]);

        // Access all elements using for loop:
        System.out.println("\nAccess all elements using for loop:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "  ");
            }
            System.out.println();
        }

        // Access all elements using for-each loop:
        System.out.println("\nAccess all elements using for-each loop:");
        for (int[] a : num) {
            for (int b : a) {
                System.out.print(b + "  ");
            }
            System.out.println();
        }
    }
}