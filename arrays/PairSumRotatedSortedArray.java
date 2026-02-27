public class PairSumRotatedSortedArray {

    public static boolean pairSum(int arr[], int target) {
        int n = arr.length;
        int pivot = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        int lp = (pivot + 1) % n; // smallest
        int rp = pivot;           // largest

        while (lp != rp) {
            int sum = arr[lp] + arr[rp];

            if (sum == target) {
                return true;
            }
            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        System.out.println(pairSum(arr, 16)); // true
    }
}
