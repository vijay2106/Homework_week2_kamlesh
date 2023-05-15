package homework_week2_kamlesh;

import java.util.Scanner;
/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */


    public class Programme6 {
        double PI = 3.14;
        public void staticMethod() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input first number : ");
            int num1 = sc.nextInt();
            Programme6 obj = new Programme6();
            System.out.println("Formula of Area A = " + (obj.PI * num1 * num1));
        }
        public static void main(String[] args) {
            Programme6 obj = new Programme6();
            obj.staticMethod();
        }
    }

