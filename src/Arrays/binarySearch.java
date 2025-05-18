public class binarySearch {

    public static int binSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == arr[mid]) {
                return mid;  // Key found
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 3, 7, 24, 45, 67, 89, 126 };
        int key = 1;
        int res = binSearch(arr1, key);
        System.out.println(res);
    }
}
