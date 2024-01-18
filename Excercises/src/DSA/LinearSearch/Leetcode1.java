package DSA.LinearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Leetcode1 {
    public static void main(String[] args) {
        //Q: find numbers with even number of digits
        int[] nums = { 12,345,2,6,7896 };

        System.out.println(findNumbers(nums));
    }
    
    static public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i]))
            {
                count++;
            }
        }

        return count;
    }

    // Count the digits and see if it's an even number
    static public Boolean even(int num)
    {
        if(num < 0)
        {
            num *= -1;
        }

        if(num == 0)
        {
            return false;
        }

        int count = 0;

        while(num > 0)
        {
            count++;
            num /= 10;
        }

        if(count % 2 == 0)
        {
            return true;
        }

        return false;
    }

}
