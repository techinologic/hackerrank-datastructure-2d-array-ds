import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int largest = Integer.MIN_VALUE;
        int sum;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = array[i][j] + array[i][j + 1] + array[i][j + 2] +
                        array[i + 1][j + 1] +
                        array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                if (sum > largest) {
                    largest = sum;
                }
            }
        }
        System.out.println(largest);
    }
}


/*

-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5

*/

