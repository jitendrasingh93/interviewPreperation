package serialization;

import java.io.*;

/**
 * Created by JitendraSingh on 25/09/17.
 */
public class SerializeEmployee {

    // serialize object
    private static void serialize(Employee object1) throws IOException {
        OutputStream fout = null;
        ObjectOutput oout = null;
        try {
             fout = new FileOutputStream("ser.txt");
            oout = new ObjectOutputStream(fout);
            System.out.println("Serialization process has started, serializing employee objects...");
            oout.writeObject(object1);
            System.out.println("Object Serialization completed.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            oout.close();
            fout.close();

        }
    }

    //deserialize object
    private static void deserialize() throws IOException, ClassNotFoundException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("ser.txt");
            ObjectInput oin=new ObjectInputStream(inputStream);
            System.out.println("DeSerialization process has started, displaying employee objects...");
            Employee emp;
            emp = (Employee) oin.readObject();
            System.out.println("name ===>> "+emp.getName() + "Id ==> "+emp.getId());
        } catch (FileNotFoundException e) {
            e.printStackTrace();

    } finally {
            inputStream.close();
        }
    }

    public static void main(String[] args) {

        Employee object1 = new Employee();
        object1.setId(1);
        object1.setName("jeetu");
        try {
            serialize(object1);
            deserialize();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
