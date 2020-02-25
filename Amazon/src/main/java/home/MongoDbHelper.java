package home;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDbHelper {

    public static MongoDatabase getDatabase(String dbName){
        return new MongoClient("localhost:27017")
                .getDatabase(dbName);
    }


}
