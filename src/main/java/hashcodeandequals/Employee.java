package hashcodeandequals;

/**
 * Created by JitendraSingh on 25/11/17.
 */
public class Employee  implements Cloneable {

    private String firstName;
    private String lastName;
    private int age;
    private int id;

    public Employee(String firstName, String lastName, int age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return  false;
        if (obj == this) return true;

        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee employee = (Employee) obj;

        if (this.getId() == employee.getId()
                && this.getFirstName().equals(employee.getFirstName())
                && this.lastName.equals(employee.lastName)
                && this.age == employee.age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {

        int result = 13;
        return 11 * result + id
                + firstName.hashCode()
                + lastName.hashCode()
                + age;
    }

    @Override
    public String toString() {

        return "firstName =" + this.getFirstName() + ","
                + "lastName = " + this.lastName + ","
                + "Id = " + this.id + ","
                + "age = " + this.age;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        int age = this.age;
        int id = this.id;
        Employee employee = new Employee(new String(this.firstName), new String(this.lastName), age, id);
        return employee;
    }
}

