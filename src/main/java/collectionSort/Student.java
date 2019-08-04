package collectionSort;

/**
 * Created by JitendraSingh on 02/12/17.
 */
public class Student implements Comparable<Student> {

    private int rollNumber;
    private int age;
    private String firstName;
    private String lastName;
    private String location;

    public Student(int rollNumber, int age, String firstName, String lastName, String location) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
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
        return  lastName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public int compareTo(Student o) {
        if (this.rollNumber == o.getRollNumber()) {
            return 0;
        }
        if (this.rollNumber > o.getRollNumber()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "RollNumber : " + this.rollNumber
                + " Age : " + this.age
                + " First Name : " + this.firstName
                + " Last Name : " + this.lastName
                + " Location : " + this.location;
    }
}
