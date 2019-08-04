package serialization_deserialize;

import java.io.*;

/**
 * Created by JitendraSingh on 12/04/18.
 */
public class SerializeDeserialize {

    public static void main(String[] args) throws Exception {
        StudentSer st = new StudentSer(12, "Jeetu");
        serilizeStudent(st);
        desrializeStudent();
    }

    private static void serilizeStudent(StudentSer st) throws IOException {
        FileOutputStream fout = new FileOutputStream("file.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
        objectOutputStream.writeObject(st);
        objectOutputStream.close();
        System.out.println("write object successfully");
    }

    private static void desrializeStudent() throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("file.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        StudentSer stu = (StudentSer)oin.readObject();
        System.out.println("student data : "+stu.toString());
        oin.close();
        System.out.println("read object successfully");
    }

}
