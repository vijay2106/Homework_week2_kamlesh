package homework_week2_kamlesh;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme8 {
    public void B1Method (){

        Scanner SC = new Scanner(System.in);
        System.out.println("input height : ");
        Float num1 = SC.nextFloat();
        System.out.println("Input base number : ");
        float num2= SC.nextFloat();
        System.out.println("Area of a triangle = " + (0.5 * num1 * num2));

    }

    public static void main(String[] args) {
        Programme8 obj = new Programme8();
        obj.B1Method();

    }

}
