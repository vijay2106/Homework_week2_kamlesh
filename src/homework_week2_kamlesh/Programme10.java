package homework_week2_kamlesh;
import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = in.nextInt();

        for (int a=0; a< 10; a++){
            System.out.println(num1 + " x " + (a+1) + " = " +
                    (num1 * (a+1)));
        }
    }
}
