package DSA.LinearSearch;

public class Excercise2 {
    public static void main(String[] args) {
        //Q: Find min number in array
        int[] arr = { 10, 50, 6, 2, 11, 9, 6, 3, 8, 7, 8, 100, 500, 20, 2 };

        System.out.println(minNum(arr));
    }

    static int minNum(int[] arr)
    {
        int minNum = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < minNum)
            {
                minNum = arr[i];
            }
        }
        return minNum;
    }
}
