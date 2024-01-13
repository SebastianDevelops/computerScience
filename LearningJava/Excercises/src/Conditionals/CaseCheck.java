package Conditionals;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().trim().charAt(0);

        if(Character.isUpperCase(ch))
        {
            System.out.println("This is a capital letter");
        } else if(Character.isLowerCase(ch))
        {
            System.out.println("This is a lower case letter");
        }
        else{
            System.out.println("This is not a letter");
        }
    }
}
