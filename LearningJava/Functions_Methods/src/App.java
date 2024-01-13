import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* 
         
        Syntax of method:
            access modifier return type name(params)
            {
                //body
                return statment
            }
        
        */

        sum();
    }

    static void sum()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first num:");
        int num1 = in.nextInt();

        System.out.println("Enter second num:");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);
    }
}
