package serialization.inheritance;

import java.io.*;

/**
 * Created by JitendraSingh on 25/09/17.
 */
public class DerivedClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        B b = new B(2, 3);

        try {
            System.out.println("i = " + b.i);
            System.out.println("j = " + b.j);

        /* Serializing B's(subclass) object */

            //Saving of object in a file
            fos = new FileOutputStream("abc.ser");
            oos = new ObjectOutputStream(fos);

            // Method for serialization of B's class object
            oos.writeObject(b);

        } catch (Exception e) {

        } finally {
            // closing streams
            oos.close();
            fos.close();
        }

        System.out.println("Object has been serialized");

        /* De-Serializing B's(subclass) object */

        try {
            // Reading the object from a file
            fis = new FileInputStream("abc.ser");
            ois = new ObjectInputStream(fis);

            // Method for de-serialization of B's class object
            B b2 = (B)ois.readObject();

            System.out.println("Object has been deserialized");

            System.out.println("i = " + b2.i);
            System.out.println("j = " + b2.j);

        }catch (Exception e) {

        } finally {
            // closing streams
            ois.close();
            fis.close();
        }
    }
}
