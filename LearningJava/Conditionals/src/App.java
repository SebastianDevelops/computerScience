public class App {
    public static void main(String[] args) throws Exception {
        /*
        Syntax of if statement

        if(boolean expression)
        {
            if true do this
        }
        else{
            if false do this
        }
         */

        //make true for first example and false for second

        Boolean firstExample = false;
        int salary = 24700;
        //if - else statments
        if(firstExample)
        {
         if(salary > 10000)
         {
            salary = salary + 2000;
         }
         else{
            salary = salary + 1000;
         }

         System.out.println(salary);
        }


        //multiple if-else statments
        if(!firstExample)
        {
            if(salary > 10000)
            {
                salary += 1000;
            } else if(salary > 20000) {
                salary += 500;
            }
            else{
                salary += 2000;
            }
        }

    }
}
