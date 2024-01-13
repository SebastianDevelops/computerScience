public class App {
    public static void main(String[] args) {
        //variable declaration
        int x;
        //variable assignment
        x = 123;

        System.out.println(x);
        
        //initialization
        int y = 123;

        System.out.println(y);
        // >> 123

        String name;
        name = "Sebastian";

        String lastName = "Van Rooyen";

        //reference data type
        RefType referenceDT = new RefType();

        referenceDT.name = name;
        referenceDT.lastName = lastName;
        referenceDT.sayFullName();
    }
}
