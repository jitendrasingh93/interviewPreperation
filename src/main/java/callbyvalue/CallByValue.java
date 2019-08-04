package callbyvalue;

/**
 * Created by jeetu on 24/08/17.
 */
public class CallByValue {

    public static void main(String[] args) {

        Employee employee = new Employee(13);
        int i=1;  //primitive type
        String str = "a"; //String object

        System.out.println("In main(), BEFORE passing by value i.e. BEFORE calling method m()");
        //System.out.println("i = "+i+", str = "+str);
        System.out.println("employee.id = "+employee.id);

        //m(i, str); //PASS int primitive type and String object by VALUE
        m(employee); //PASS int primitive type and String object by VALUE

        //System.out.println("\n In main(), AFTER passing by value i.e. AFTER calling method m()");
        //System.out.println("i = "+i+", str = "+str);

    }

    static void m(Employee employee1) {
        employee1.id = 12;
        System.out.println("\n In method m(), after making changes to parameters");
        System.out.println("employee1.id = "+employee1.id);
    }
}
