package homework_week2_kamlesh;
/**
 * Write a Java program to add two binary numbers.
 *
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 *
 * Sum of two binary numbers: 101
 */

import java.util.Scanner;
public class Programme16 {
    String a, b;

    public void insMethod() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first binary number :  ");
        a = sc.nextLine();
        System.out.println("Input second binary number :  ");
        b = sc.nextLine();
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;

        System.out.println(" Sum of two binary numbers : " + Integer.toBinaryString(sum));

    }

    public static void main(String[] args) {
        Programme16 obj = new Programme16();
        obj.insMethod();
    }
}
