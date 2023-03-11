import java.util.*;

public class SubArrayWithMaxPro {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        System.out.print(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            temp *= nums[i];
            max = Math.max(temp, max);
            if (temp == 0) {
                temp = 1;
            }
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            temp *= nums[i];
            max = Math.max(temp, max);
            if (temp == 0) {
                temp = 1;
            }
        }
        return max;

    }
}