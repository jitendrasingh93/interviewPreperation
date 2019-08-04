package mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by jeetu on 08/09/17.
 */
public class Mongoconnection {

    public static void main(String[] args) {

        // Creating a Mongo client
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoCredential credential;
        credential = MongoCredential.createCredential("user", "myDb", "password".toCharArray());
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongoClient.getDatabase("myDb");
        System.out.println("Credentials ::"+ credential);

        //Creating a collection
        if (null == database.getCollection("demoCollection")) {
            database.createCollection("demoCollection");
            System.out.println("Collection created successfully");
        }

        //retriving collection
        MongoCollection<Document> collection = database.getCollection("demoCollection");
        System.out.println("Collection demoCollection selected successfully");

        Document document = new Document("title", "student")
                .append("id", 1)
                .append("name", "jeetu")
                .append("age", 23)
                .append("address", "Gurgaon")
                .append("mobile", "7417780456");
        collection.insertOne(document);
        System.out.println("Document inserted successfully");

    }
}
