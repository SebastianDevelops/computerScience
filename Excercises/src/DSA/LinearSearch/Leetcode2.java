package DSA.LinearSearch;
// https://leetcode.com/problems/richest-customer-wealth/
public class Leetcode2 {
    public static void main(String[] args) {
        
    }

    public static int maximumWealth(int[][] accounts) {
        int maxValue = Integer.MIN_VALUE;

        for(int[] person : accounts)
        {
            int sum = 0;
            for (int account : person) {
                sum += account;
            }
            if(sum > maxValue)
            {
                maxValue = sum;
            }
        }

        return maxValue;
    }


}
