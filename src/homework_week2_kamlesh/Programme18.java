package homework_week2_kamlesh;
import java.util.Scanner;
/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme18 {
    public void instMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        int num1 = sc.nextInt();
        System.out.print("Input second number : ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
    }
    public static void main(String[] args) {
        Programme18 obj = new Programme18 ();
        obj.instMethod();
    }

}
