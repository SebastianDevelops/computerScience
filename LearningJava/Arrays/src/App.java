import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Syntax
        //dataType[] variable_name = new dataType[size];

        //int array
        int[] numbers = new int[5];

        //String array
        String[] names = new String[5];

        //array input

        names[0] = "Sebastian";
        names[1] = "Mike";
        names[2] = "Harvey";
        //{ "Sebastian", "Mike", "Harvey" }

        //inputting with a loop
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i * i;
        }
        
        //foreach loop to get the item directly
        for (int num : numbers) {
            //num represents the elements in the array at the time.
            System.out.println(num);
        }

        //converting array to string
        System.out.println(Arrays.toString(names));
    }
}
