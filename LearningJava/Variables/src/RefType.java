public class RefType{
    String name;
    String lastName;
    public void sayFullName()
    {
        if((name != null && !name.trim().isEmpty()) &&
        (lastName != null && !lastName.trim().isEmpty()))
        {
            System.out.println(name + " " + lastName);
        }
        else
        {
            System.out.println("Name or last name is empty");
        }
    }
}