package DivideAndConquer;

public class QuickSort {

    public static void quickS(int arr[], int si, int ei) {
        if (si < ei) {
            int pIdx = sort(arr, si, ei); // partition index
            quickS(arr, si, pIdx - 1);    // left part
            quickS(arr, pIdx + 1, ei);    // right part
        }
    }

    public static int sort(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1;
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 8, 2, 5};

        quickS(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
