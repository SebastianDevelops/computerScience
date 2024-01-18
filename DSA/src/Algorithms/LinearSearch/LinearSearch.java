package Algorithms.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        //Linear search is a basic searching algo
        int[] arr = { 5, 10, 40, 11, 56, 23, 8, 6, 24, 17, 46 };
        int target = 6;
        int ans = searchIndex(arr, target);
        System.out.println(ans);

        Boolean exists = ElemExists(arr, target);
        System.out.println(exists); 
    }

    static int searchIndex(int[] arr, int target)
    {
        /*
          Psuedo code for linear search

           check if array == 0
                return -1
            
            loop over each element
                check if element == target
                    return index
         */

        if(arr.length == 0)
        {
            return -1;
        }

        for(int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if(element == target)
            {
                return index;
            }
        }

        return -1;
    }

    static Boolean ElemExists(int[] arr, int target)
    {
        /*
          Psuedo code for linear search

           check if array == 0
                return -1
            
            loop over each element
                check if element == target
                    return index
         */

        if(arr.length == 0)
        {
            return false;
        }

        for(int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if(element == target)
            {
                return true;
            }
        }

        return false;
    }
}
