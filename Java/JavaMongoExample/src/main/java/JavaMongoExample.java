
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JavaMongoExample {

	public static void main(String[] args) {
		// Creating MongoClient
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("Created mongo Connection successfully");

		//creating database
		MongoDatabase database = client.getDatabase("mongodatabase");
		System.out.println("database created successfully");

		//list all databases 
		System.out.println("Below are the list of databases present in the mongoDB");
		MongoCursor<String> cursor = client.listDatabaseNames().iterator();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}

		//creating collection inside database
		MongoCollection<Document> collection = database.getCollection("channel");
		Document doc = new Document("name", "SimplyfyingTech");
		collection.insertOne(doc);
		System.out.println(".........insertion is completed.........");

		MongoCursor<String> cursorr = client.listDatabaseNames().iterator();
		while (cursorr.hasNext()) {
			System.out.println(cursorr.next());
		}
		
		//droping database
		
		client.dropDatabase("mydatabase");
		System.out.println("database droped successfully");
		
		MongoCursor<String> cursor2 = client.listDatabaseNames().iterator();
		while (cursor2.hasNext()) {
			System.out.println(cursor2.next());
		}
	}

}
