public class App {
    public static void main(String[] args) throws Exception {
        //Incrementing a value by 10
        int friends = 10;
        friends = friends + 10;
        // >> 20

        //Long form increment by 1
        int byOne = 1;
        byOne = byOne + 1;
        // >> 2

        //Short form increment by 1
        int shortForm = 1;
        shortForm++;
        System.out.println(shortForm);
        // >> 2


        //Decrementing a value by 10
        int Brothers = 20;
        Brothers = Brothers - 10;
        // >> 20

        //Long form decrement by 1
        int decByOne = 2;
        decByOne = decByOne - 1;
        // >> 2

        //Short form increment by 1
        int shortFormDec = 2;
        shortFormDec--;
        System.out.println(shortFormDec);
        // >> 1



        //Truncating with division
        int val = 10;
        //val = val / 3;

        //System.out.println("Truncate: " + val);
        // >> 3

        //Casting
        double newNum;

        newNum = (double)val / 3;
        System.out.println(newNum);
        // >> 3.3333
    }
}
