import java.util.*;

public class PaintersPartition {
    public static boolean isPossible(int[] arr, int k, int n, int mid) {
        int paintersCount = 1;
        int pageSum = 0;
        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                paintersCount++;
                if (paintersCount > k || arr[i] > mid) {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }

    public static int paintersPartition(int[] arr, int k, int n) {
        int s = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int e = sum;
        int mid = s + (e - s) / 2;
        int ans = -1;
        while (s <= e) {
            if (isPossible(arr, k, n, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(paintersPartition(arr, k, n));
    }
}