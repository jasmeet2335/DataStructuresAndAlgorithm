package DivideAndConquer;

import BinarySearchTree.search;

public class rotatedSortedarray {
    public static int search(int arr[], int tar, int si, int ei){
        if(si > ei) {
            return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == tar){
            return mid;
        }

        // mid on line 1
        if(arr[si] <= arr[mid]){
            //case a: left 
            if(arr[si] <= tar && tar<= arr[mid]){
                return search(arr, tar, si, mid-1);
            } else {
                return search(arr, tar, mid+1, ei);
            }
        } else {
            //case c: right to the line 2
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            } else {
                //case d: left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int tarIdx = search(arr, target, 0, arr.length -1);
        System.out.println(tarIdx); 

        }
}
/*
 * Input: sorted, rotated array with distinct numbers (in ascending order)
 * It is rotated at a pivot point. Find the index of the given element. 
 * 
 * Case 1: mid of Line 1 (arr[si] <= arr[mid])
 *      Case A: Line 1 left (si <= target <= mid)
 *      Case B: mid right 
 * Case 2: mid on Line 2 (arr[mid] <= arr[ei])
 *      Case C:Line 2 right (mid <= target <= ei)
 *      Case D: mid left 
 * 
 * // Time complexity O( n logn)
 * Homework: Try writing in iteration, single loop
 */