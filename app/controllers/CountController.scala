package controllers

import javax.inject._

import com.mongodb.casbah.Imports.MongoClient
import play.api.mvc._
import services.Counter

/**
 * This controller demonstrates how to use dependency injection to
 * bind a component into a controller class. The class creates an
 * `Action` that shows an incrementing count to users. The [[Counter]]
 * object is injected by the Guice dependency injection system.
 */

class MongoDBn() {

  def connectToMongo () : Unit = {
    val mongoClient = MongoClient("localhost", 27017)
    val db = mongoClient("CouponsDB")
    println(db.collectionNames)
  }

}

@Singleton
class CountController @Inject() (cc: ControllerComponents,
                                 counter: Counter) extends AbstractController(cc) {

  /**
   * Create an action that responds with the [[Counter]]'s current
   * count. The result is plain text. This `Action` is mapped to
   * `GET /count` requests by an entry in the `routes` config file.
   */
  def count = Action {
    val x = MongoDBn()
     Ok(8.toString)
  }

}
