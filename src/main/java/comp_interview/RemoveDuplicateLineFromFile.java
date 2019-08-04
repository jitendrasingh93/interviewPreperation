package comp_interview;

import java.io.*;
import java.util.HashSet;

/**
 * Created by JitendraSingh on 14/05/18.
 */
public class RemoveDuplicateLineFromFile {
    private  PrintWriter writer;
    private BufferedReader reader;

    //remove duplicate line
    void removeDuplicateLine() throws IOException {

        try {
            writer  = new PrintWriter("duplicateLine.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        reader = new BufferedReader(new FileReader("file.txt"));
        String line = reader.readLine();
        HashSet<String> set = new HashSet<>();

        while (line !=null) {
            if (set.add(line)) {
                writer.println(line);
            }
            line = reader.readLine();
        }
        writer.flush();
        reader.close();
        writer.close();

        System.out.println("remove duplicate");
    }

    public static void main(String[] args) throws IOException {
        RemoveDuplicateLineFromFile duplicateLineFromFile = new RemoveDuplicateLineFromFile();
        duplicateLineFromFile.removeDuplicateLine();
    }
}
