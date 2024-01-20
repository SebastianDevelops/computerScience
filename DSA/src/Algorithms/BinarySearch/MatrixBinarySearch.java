package Algorithms.BinarySearch;

import java.util.Arrays;

public class MatrixBinarySearch{
    public static void main(String[] args) {
        int matrix[][] =
        {
            //3x3
            {10, 20, 30},
            {45, 50, 55},
            {70, 96, 102}
        };

        int target = 102;

        //int ans[] = matrixSearch(matrix, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] matrixSearch(int[][] matrix, int target)
    {
        //lower bound
        int r = 0; //index
        //Upper bound
        int c = matrix.length - 1; //index

        while(r < matrix.length && c >= 0){
            //if upper bound is target, return
            if(matrix[r][c] == target)
            {
                return new int[] { r, c };
            }
            //if upper bound is less than target, remove row
            if(matrix[r][c] < target){
                //we increment row because we moving one row downward 
                r++;
            }

            //if upper bound is > target remove colunm
            if(matrix[r][c] > target)
            {
                //we decrement the column because we moving it from right to left
                c--;
            }
        }
        return new int[] { -1, -1 };
    }


    //Binary search through a Matrix

    static int[] matrixBinarySearch(int[][] matrix, int target)
    {
        int r = matrix.length;

        int c = martix[0].length; //caution: matrix may be empty
    }


    static int binarySearch(int[] arr, int target, int row, int cStart, int cEnd)
    {
        while(cStart <= cEnd)
        {
            int mid = cStart + (cEnd - cStart) / 2;

            if(target > arr[mid])
            {
                cStart = mid + 1;
            } else if(target < arr[mid])
            {
                cEnd = mid - 1;
            }
            else{
                return arr[mid];
            }
        }

        return -1;
    }

} 