package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //sorting to ascending order
    static void bubbleSort(int[] arr)
    {
        // run n -1 times
        for(int i = 0; i < arr.length; i++)
        {
            boolean swapped = false;
            //each steps takes max element to respect last position
            for(int j = 1; j < arr.length - i; j++)
            {
                //swap if item is smaller than previous
                //to get previous we take currentIndex - 1
                if(arr[j] < arr[j - 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    
                    swapped = true;
                }
            }
            // if you did not swap for a partifular value of i, means array is sorted
            if(!swapped)
            {
                break;
            }
        }
    }

    public static int maxIndex(int[] arr)
    {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[max] < arr[i] )
            {
                max = arr[i];
            }
        }
        return max;
    }
}
