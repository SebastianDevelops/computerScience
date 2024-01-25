package Algorithms.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        
    }

    static void selectionSort(int[] arr)
    {
        //find max in array and swap with correct index

        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;

            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        } 
    }

     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }
}
