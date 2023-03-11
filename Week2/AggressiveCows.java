import java.util.*;

public class AggressiveCows {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k;
        k = sc.nextInt();
        int[] stalls = new int[n];
        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }
        System.out.print(aggressiveCows(stalls, k, n));
    }

    public static int aggressiveCows(int arr[], int k, int n) {
        Arrays.sort(arr);
        int s = 0;
        int e = n - 1;
        int ans = -1;
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (isPossible(arr, k, mid, n)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;

            }
            mid = s + (e - s) / 2;
        }
        return ans;

    }

    public static boolean isPossible(int arr[], int k, int mid, int n) {
        int cowCount = 1;
        int lastPos = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] - lastPos >= mid) {
                cowCount++;
                if (cowCount == k) {
                    return true;
                }
                lastPos = arr[i];
            }
        }
        return false;
    }
}