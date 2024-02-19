package DSA.BinarySearch;


public class Excercise2 {

    public static void main(String[] args) {
        int[] arr =  {-1,0,3,5,9,12};

        int ans = search(arr, 12);

        System.out.println(ans);
    }
    

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        // if(target == nums[start])
        // {
        //     return start;
        // }

        // if(target == nums[end])
        // {
        //     return end;
        // }

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(nums[mid] < target)
            {
                start = mid + 1;
            }else if(nums[mid] > target)
            {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}