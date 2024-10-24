import javax.swing.text.html.HTMLDocument.Iterator;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JavaMongoImpl {

	public static void main(String[] args) {

		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("Created mongo Connection successfully");

		// creating database
		MongoDatabase database = client.getDatabase("mongodatabase");
		System.out.println("database created successfully");
		
		MongoCollection<Document> collection = database.getCollection("channel");
		System.out.println("collection created");
	
		Document doc = new Document("name", "SimplyfyingTech");
		doc.append("id", 101);
		doc.append("name", "Kapil");
		doc.append("Location", "Indore");
		collection.insertOne(doc);
		System.out.println("insert complete");
		
		Document doc2 = new Document("name", "Employee");
		doc2.append("id", 102);
		doc2.append("name", "Sumit");
		doc2.append("Location", "Bhopal");
		collection.insertOne(doc2);
		System.out.println("insert complete");
		
		FindIterable<Document> iterable=collection.find();
		
		int i=1;
		
		MongoCursor<Document> cursor=iterable.iterator();
		
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
			i++;
		}
		
		
		//specific document retrieving in a collection 
		BasicDBObject dbObject=new BasicDBObject();
		
		dbObject.put("name", "SimplyfyingTech");
		System.out.println("Retrieving");
		
		cursor=collection.find(dbObject).iterator();
		
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
	}

}
