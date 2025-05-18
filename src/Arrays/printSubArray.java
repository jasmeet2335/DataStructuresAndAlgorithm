public class printSubArray {
    public static void pairArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }
                System.out.print("     ");
            }
            System.out.println(); 
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 7, 24, 45, 67, 89, 126 };
        pairArr(arr);
    }
}
