import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //ArrayLists are dynamic arrays

        //Syntax
        // ArrayList<dataType> reference_name = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(10);

        for(int i = 0; i < 5; i++)
        {
            list.add(i*i);
        }

        System.out.println(list);
    }
}
