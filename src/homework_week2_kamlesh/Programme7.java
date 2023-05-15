package homework_week2_kamlesh;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7 {

    float D;
    public void Instmethod () {

        Scanner SC = new Scanner(System.in);
        System.out.println("Input temperature: ");
        D = SC.nextFloat();
        System.out.println("Temperature in a Degree Celsius = " + ((D - 32)* 5/9));
    }

    public static void main(String[] args) {
        Programme7 obj = new Programme7();
        obj.Instmethod();



    }
}
