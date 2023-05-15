package homework_week2_kamlesh;
/**4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the
 print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.
 */


public class Programme4 {
    int d = 31;
    String name = "samsung";
    static  int a = 40;

    static int number = 80;


    public static void main(String[] args) {
        Programme4 obj = new Programme4();
        System.out.println(obj.d);
        System.out.println(obj.name);

        System.out.println(Programme4.a);
        System.out.println(Programme4.number);
    }


    public void m1() {
        Programme4 a = new Programme4();
        System.out.println(a.d);
        System.out.println(a.name);
    }
    public static void myname(){
        System.out.println(Programme4.a);
        System.out.println(Programme4.number);
    }

}
