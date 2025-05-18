import java.util.Arrays;

public class reverseArray {
    public static void reverse(int arr[]) {
        int start= 0, end =arr.length-1, temp;
        while(start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 3, 7, 24, 45, 67, 89, 126 };
        System.out.println(Arrays.toString(arr1));
        reverse(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
