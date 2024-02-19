package Algorithms.Recursion;

public class Recursive {
    public static void main(String[] args) {
        //print all numbers leading up to input of 5
        countUp(1);
    }

    static void countUp(int n)
    {
        if(n > 5)
        {
            return;
        }
        System.out.println(n);
        countUp(n + 1);
    }
}
