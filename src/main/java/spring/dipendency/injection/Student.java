package spring.dipendency.injection;

/**
 * Created by JitendraSingh on 18/12/17.
 */
public class Student {
    private int rollNumber;
    private String name;
    private String sclass;

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(String name) {
        this.name = name;
    }
    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getSclass() {
        return sclass;
    }

    public void displayInfo(){
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Name : "+name);
        System.out.println("Class : "+sclass);
    }
}
