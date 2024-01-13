import java.util.Scanner;

//if a task needs to repeat itself, we can use loops
public class forLoops {
    public static void main(String[] args) throws Exception {
        /*
          For loop syntax
          for(initialization; condition; increment/decrement)
            {
                Body
            }
         */

        //Set to true if you want user input
        Boolean userInputWanted = true;

        

        // Q: Print numbers from 1 to 5
        if(!userInputWanted)
        {
            for(int num = 1; num <= 5; num++)
            {
                    System.out.println(num);
            }
        }else{
            Scanner scanner = new Scanner(System.in);

            //Q Print numbers from 1 to n
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();

            for(int i = 1; i <= n; i++)
            {
                System.out.print(i + " ");
            }

            scanner.close();
        }   
    }
}
