import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        //Matrix

        /*
         
            1 2 3
            4 5 6
            7 8 9

            3x3 2 Dimensional Array
         */
        int[][] arr = new int[3][3];

        //directly declaring
        // int[][] a = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        //input into multidimensional array 
            for(int row = 0; row < arr.length; row++)
            {
                for(int column = 0; column < arr[row].length; column++)
                {
                    arr[row][column] = (column * column) + (row * row);
                }
            }

            for (int[] arrs : arr) {
                System.out.println(Arrays.toString(arrs));
            }
    }
}
