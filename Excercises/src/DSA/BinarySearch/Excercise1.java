package DSA.BinarySearch;

public class Excercise1 {
    public static void main(String[] args) {
    //Q: Ceiling of a number, -> 
    //Find the target element or the smallest element after target element
    int[] arr = { 12, 15, 17, 22, 26, 30 };
    int target = 16;

    int ans = binarySearch(arr, target);
    System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target > arr[mid])
            {
                start = mid + 1;
            }else if( target < arr[mid])
            {
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
