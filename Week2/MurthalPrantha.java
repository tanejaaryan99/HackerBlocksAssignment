import java.util.*;

public class MurthalPrantha {
    public static int CookedParatha(int arr[], int time) {
        int cooked = 0;
        for (int i = 0; i < arr.length; i++) {
            int pos = arr[i];
            int j = 1;
            int sum = 0;
            while (sum <= time) {
                sum += pos * j;
                if (sum <= time) {
                    cooked++;
                }
                j++;
            }
        }
        return cooked;
    }

    public static int getTime(int rank[], int p) {
        int low = 0;
        int high = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            int paratha = CookedParatha(rank, mid);
            if (paratha >= p) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        int l = scn.nextInt();
        int rank[] = new int[l];
        for (int i = 0; i < l; i++) {
            rank[i] = scn.nextInt();
        }
        int ans = getTime(rank, p);
        System.out.println(ans);
    }
}