import java.util.*;

public class PatchArray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        System.out.print(minPatches(arr, k));
    }

    public static int minPatches(int[] nums, int n) {
        int count = 0;
        long sum = 0;
        for (int x : nums) {
            if (sum >= n) {
                break;
            }
            while (sum + 1 < x && sum < n) {
                count++;
                sum += sum + 1;
            }
            sum += x;
        }

        while (sum < n) {
            count++;
            sum += sum + 1;
        }
        return count;

    }
}