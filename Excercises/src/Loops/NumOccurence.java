package Loops;

public class NumOccurence {
    public static void main(String[] args) {
        //Q: Check how many times a specfied number is occuring

        int n = 45555;
        int count = 0;

        while(n > 0)
        {
            int rem = n % 10;

            if(rem == 5){
                count++;
            }
            n /= 10;
        }

        System.out.println(count);
    }
}
