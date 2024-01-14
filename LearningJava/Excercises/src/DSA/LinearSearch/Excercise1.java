package DSA.LinearSearch;

public class Excercise1 {
    public static void main(String[] args) {
        //Q: Search in string
        String str = "Sebastian";
        char target = 'i';

        System.out.println(search(str, target));
    }

    static Boolean search(String str, char target)
    {
        if(str.length() == 0)
        {
            return false;
        }

        for(int i = 0; i < str.length(); i++)
        {
            char element = str.trim().charAt(i);

            if(element == target)
            {
                return true;
            }
        }

        return false;
    }
}
