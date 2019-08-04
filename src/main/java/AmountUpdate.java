import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by JitendraSingh on 08/01/19.
 */
public class AmountUpdate {

    /*
    * amount receive from customer
    * */
    public static void receiveAmt(int amount) {

        // write query heare for reteriving data from datababe

        int receive_100000 = 0; // e.g col1 = 1234
        int receive_20000 = 0; // g.g. col2 = 2345

        if (amount > 10000) {
            receive_100000 = receive_100000 + 10000;
            receive_20000 = receive_20000 + (amount-10000);
        } else {
            receive_100000 = receive_100000 + amount;
        }

        updateAmt(receive_100000, receive_20000);
    }

     /*
     * update amount in table
     * */
    public static void updateAmt(int receive_10000, int receive_20000) {

        // update sql query here

        System.out.println("receive_100000 : "+ receive_10000 + " \n receive_200000 : " +receive_20000);
        int totaAmt = receive_10000 + receive_20000;
        System.out.println("Total amount  : "+totaAmt);
    }

    public static void dbConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestDB", "root", "root");
        } catch (SQLException e) {
            for(Throwable ex : e) {
                System.err.println("Error occurred " + ex);
            }
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("Connected to database!");
        } else {
            System.out.println("Failed to make connection!");
        }

        try {
            Statement stmt = connection.createStatement();
            String query = "select * from person ;";
            //person is the table name
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getObject(1).toString();
                String gender = rs.getObject(2).toString();
                System.out.println("Name of the person is " + name + " and his gender is " + gender);
                //Person table has name and gender column

            }
        } catch (SQLException e) {
            e.printStackTrace();
            for(Throwable ex : e) {
                System.err.println("Error occurred " + ex);
            }
            System.out.println("Error in fetching data");
        }
    }

    public static void main(String[] args) {

        dbConnection();

        // for client side
        System.out.println("Enter amount to add : ");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        receiveAmt(amt);
    }
}
