import java.util.*;

public class MatrixSearch {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int k = scn.nextInt();
        System.out.print(searchMatrix(arr, k));
    }

    public static int searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                return 1;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return 0;
    }
}