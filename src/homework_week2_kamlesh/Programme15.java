package homework_week2_kamlesh;

/**
 * Java program to swap two variables.
 *
 */
public class Programme15 {
    public void instMethod() {
        int a = 10, b = 20;
        int t = a;
        a = b;
        b = t;
        System.out.println(" After swapping value are .." + a + " " + b);
    }

    public static void main(String[] args) {
        Programme15 obj = new Programme15();
        obj.instMethod();


    }
}
