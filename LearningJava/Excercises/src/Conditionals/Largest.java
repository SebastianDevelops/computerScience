package Conditionals;
import java.util.Scanner;


//Could've used Math.max in this scenario but was testing knowledge on
//conditionals 
public class Largest {
    public static void main(String[] args) throws Exception {
        //Q: Find Largest Number In Given Input

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        //placeholder variable
        int max = x;

        if(y < max)
        {
            max = y;
        }
        if(z > max)
        {
            max = z;
        }

        System.out.println(max);
    }
}
