import java.util.*;
public class largestNumber {
    public static int largestNum(int arr[]) {
        int result =-1;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                result = i+1;
            }
        }
        return result;
    }
    public static void main(String args[]) {
        int arr1[] = {-1, -9, -27, -10, -56, -7, 0, -4};
        int res = largestNum(arr1);
        System.out.println(res);
    }
}
