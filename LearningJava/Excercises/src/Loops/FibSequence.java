package Loops;

import java.util.Scanner;

public class FibSequence {
    public static void main(String[] args) throws Exception {
        //Q: Find the nth Fib number

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n)
        {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);

    }
}
