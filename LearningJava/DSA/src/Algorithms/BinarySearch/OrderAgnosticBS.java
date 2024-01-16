package Algorithms.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //Order would be unknown in thsi scanrio
        int[] uarr = { 24, 22, 20, 18, 15, 14, 11, 9, 3 };

        int target = 3;

        int ans = orderAgnosticBS(uarr, target);

        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target == arr[mid])
            {
                return mid;
            }

            if(isAsc)
            {
                if(target > arr[mid])
                {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target < arr[mid])
                {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
