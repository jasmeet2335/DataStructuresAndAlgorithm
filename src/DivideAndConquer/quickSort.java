package DivideAndConquer;

public class quickSort {
    public static void printArr(int arr[]) {
        for(int i = 0; i <arr.length; i ++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        // last element 
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1); // left part
        quickSort(arr, pidx+1, ei); // left part
    }

    public static void partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make space for elements smaller that the pivot

        for(int j = 0; j <ei; j++){
            if(arr[j] <= pivot ){
                i
            }
        }
// ==================================================================CONTINUE FROM 3 MINS
    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
    }
}
/*
 * Average case time complexity O(n log n)
 * Worst case time complexity o(N^2)
 * Space complexity o(1) 
 * 
 * We use pivot and partition
 * pivot - last element
 * partition - parts. 
 * quicksort(left) // calling the functions recursively
 * quicksort(right)
 */
