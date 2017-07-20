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

        int[] elem = new int[16];
        int hSum = 0;
        int n = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                hSum = array[i][j] + array[i][j + 1] + array[i][j + 2] +
                        array[i + 1][j + 1] +
                        array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                if (hSum > n) {
                    n = hSum;
                }
            }
        }
        System.out.println(n);
    }

}
