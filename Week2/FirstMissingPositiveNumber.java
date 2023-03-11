import java.util.*;

public class FirstMissingPositiveNumber {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        System.out.print(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        // Write your code here
        for (int i = 1; i <= nums.length; i++) {
            if (!search(nums, i))
                return i;
        }
        return nums.length + 1;
    }

    public static boolean search(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return true;
        }
        return false;
    }
}