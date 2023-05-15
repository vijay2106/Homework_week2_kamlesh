package homework_week2_kamlesh;
import java.util.Scanner;

public class Programme13 {


    public void instMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter value A :  ");
        Double a = sc.nextDouble();
        System.out.println(" Enter value B :  ");
        Double b = sc.nextDouble();
        System.out.println(" Enter value C :  ");
        Double c = sc.nextDouble();
        Double avg = a + b + c / 3;
        System.out.println("Average : " + avg);

    }

    public static void main(String[] args) {
        Programme13 obj = new Programme13();
        obj.instMethod();

    }

}