package spring.dipendency.injection.ci.inheritingbean;

/**
 * Created by JitendraSingh on 27/12/17.
 */
public class Employee {
    private int e_id;
    private String e_name;
    private Address address;

    public Employee(int e_id, String e_name) {
        super();
        this.e_id = e_id;
        this.e_name = e_name;
    }

    public Employee(int e_id, String e_name, Address address) {
        super();
        this.e_id = e_id;
        this.e_name = e_name;
        this.address = address;
    }

    public void show() {
        System.out.println("Employee id :"+e_id);
        System.out.println("Employee Name : "+e_name);
        System.out.println("Address : "+address.toString());
    }
}
