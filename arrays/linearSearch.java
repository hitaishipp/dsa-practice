public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int target = 30;

        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }
}
