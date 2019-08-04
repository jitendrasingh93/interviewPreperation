package hashcodeandequals;

/**
 * Created by JitendraSingh on 25/11/17.
 */
public class HashcodeAndEquals{

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee1 = new Employee("abc", "singh", 24, 123);
        Employee employee2 = new Employee("abc", "singh", 24, 123);

        System.out.println("equals ==>>> "+employee1.equals(employee2));
        System.out.println("hashcode employee1==>>> "+employee1.hashCode()+"\n employee2==>  "+employee2.hashCode());

        System.out.println("toString ==>> "+employee1.toString());

        Employee employee3 = employee1.clone();

        System.out.println("clone ===>> "+employee3.toString());

        System.out.println("skhfks ==>> "+employee1.equals(employee3)+"\n hashcode >>>"+employee3.hashCode());
    }
}
