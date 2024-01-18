package DSA.Arrays;

import java.util.Arrays;

import DSA.Arrays.Excercise1;

public class Excercise2 {
    public static void main(String[] args) {
        //Q: Reverse this array
        int[] arr = { 10, 15, 29, 100, 8, 5 };

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr)
    {
        //Two pointer
        int startIndex = 0;
        int endIndex = arr.length - 1;
        
        while (startIndex < endIndex) {
            Excercise1.swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }
}
