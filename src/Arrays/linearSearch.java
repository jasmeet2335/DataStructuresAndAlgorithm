public class linearSearch {

    public static int linearSearch(int num[], int key) {
        int result = -1;
        for(int i =0; i<num.length; i++) {
            if(num[i] == key) {
                result = i+1;
            }
        }
        return result;
    }
    public static void main(String args[]) {
        int arr1[] = {1, 9, 27, 10, 56, 7, 8, 4};
        int key = 20;
        int res = linearSearch(arr1, key);
        System.out.println(res);
    }
}
