package collectionSort;

/**
 * Created by JitendraSingh on 01/12/17.
 */
public class Employee implements Comparable<Employee> {

    private Integer id;
    private String name;
    private String location;

    public Employee(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {

        return "Id = " + this.id +
                " Name = " + this.name +
                " Location = " + this.location;
    }

    public int compareTo(Employee o) {
        return o.id.compareTo(this.id);
    }
}
