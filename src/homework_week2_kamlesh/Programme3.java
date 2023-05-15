package homework_week2_kamlesh;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {

    String name = "Sony";



    static int number = 500;

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        System.out.println(obj.name);
        System.out.println(Programme3.number);
    }
    public void m1() {
        Programme3 a = new Programme3();
        System.out.println(a.name);
    }
    public static void myname(){
        System.out.println(Programme3.number);

    }
}
