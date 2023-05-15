package homework_week2_kamlesh;

/**
 *         1.1 Declare two instance variables.
 *         1.2 Declare one instance method.
 *         1.3 Call both instance variables into the instance method inside the print statement.
 *         1.4 Declare the Main method.
 *         1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Programme1 {
    int d = 21;
    String name = "Java";

    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        System.out.println(obj.d);
        System.out.println(obj.name);
    }

    public void m1() {
       Programme1 a = new Programme1();
        System.out.println(a.d);
        System.out.println(a.name);
    }

}

