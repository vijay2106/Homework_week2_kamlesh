package homework_week2_kamlesh;
/**
 * Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */
import java.util.Scanner;

public class Programme17 {
    public void insMethod(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input decimal number :  " );
        int a = sc.nextInt();
        System.out.println(" Binary number is : " + Integer.toBinaryString (a));
    }
    public static void main(String[] args) {
        Programme17 obj = new Programme17();
        obj.insMethod();
    }

}
