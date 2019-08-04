package spring.dipendency.injection.setter.injection;

/**
 * Created by JitendraSingh on 27/12/17.
 */
public class Employee {
    private int id;
    private String name;
    private String address;
    private Address addr;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public Address getAddr() {
        return addr;
    }

    public void show() {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Addre : " +addr.toString());
    }
}
