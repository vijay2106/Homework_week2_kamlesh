package homework_week2_kamlesh;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme9 {

    public void h1Method(){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter in Uppercase");
        String str = SC.nextLine();
        System.out.println(str.toLowerCase());

    }

    public static void main(String[] args) {
        Programme9 obj = new Programme9();
        obj.h1Method();
    }
}
