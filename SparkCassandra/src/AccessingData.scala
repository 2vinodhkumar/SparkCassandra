import com.datastax.spark.connector.cql.CassandraConnector
import com.datastax.spark.connector._ 
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
object AccessingData {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf(true)
        .set("spark.cassandra.connection.host", "127.0.0.1")
        .set("spark.cassandra.auth.username", "cassandra")            
        .set("spark.cassandra.auth.password", "cassandra") 
        

val sc = new SparkContext("spark://localhost.localdomain:7077", "test", conf)
  CassandraConnector(conf).withSessionDo { session =>
  session.execute("CREATE KEYSPACE test2 WITH REPLICATION = {'class': 'SimpleStrategy', 'replication_factor': 1 }")
  session.execute("CREATE TABLE test2.words (word text PRIMARY KEY, count int)")
}
  }

}