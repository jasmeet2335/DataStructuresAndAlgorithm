public class PairsInArray {
    public static void pairArr(int arr[]) {
        for(int i=0; i<=arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("[" + arr[i] + " , " + arr[j] + "]    ");
            }
            System.out.println(); 
        }
    }
    public static void main(String args[]) {
        int arr[] = { 1, 3, 7, 24, 45, 67, 89, 126 };
        pairArr(arr);
    }
}
