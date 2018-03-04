import com.mongodb.casbah.Imports._


class MongoDB {

  def connectToMongo () : Unit = {
    val mongoClient = MongoClient("localhost", 27017)
    val db = mongoClient("CouponsDB")
    println(db.collectionNames)
  }

}
