package Algorithms.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -5, -4, -2, 0, 2, 5, 7, 8, 11, 15, 16, 20 };

        int target = 15;
        int ans = search(arr, target);

        System.out.println(ans);
        //>> 9 
    }


    //return index
    static int search(int[] arr, int target)
    {
        /*
            [  5, 20, 21, 25, 30 ]
         */

         int start = 0;
         int end = arr.length - 1;

         while(start <= end)
         {
            int mid = start + (end - start) / 2;

            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
         }
         return -1;
    }
}