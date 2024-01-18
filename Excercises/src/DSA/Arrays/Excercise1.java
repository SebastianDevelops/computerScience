package DSA.Arrays;

import java.util.Arrays;

public class Excercise1 {
    public static void main(String[] args) {
        //Q: Swap Values of Array;
        int[] arr = { 10, 15, 29, 100, 8, 5 };

        swap(arr, 4, 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2)
    {
        /*
            num1 = 5
            num2 = 6
            temp

            temp : 6 = num2

            num2 : 5 = num1

            num1 : 6 = temp
         */

         int temp = arr[index2];

         arr[index2] = arr[index1];
         arr[index1] = temp;

    }
}
