SparkCassandra
==============

Describes How Spark Cassandra connctor can be used to acces data on Cassandra, applying analytics using Inmemory capabilites of spark on cassandra No_SQL data base

Run the Spark submission:

vinodh@localhost bin]$ ./spark-submit --class AccessingData \
--master spark://localhost.localdomain:7077 \
--driver-class-path /home/vinodh/Desktop/spark-cassandra-connector-assembly-1.2.0-SNAPSHOT.jar \
/home/vinodh/Desktop/eclipse/workspace/SparkCassandra/target/SparkCassandra-0.0.1-SNAPSHOT.jar



Note: spark-cassandra-connector-assembly-1.2.0-SNAPSHOT.jar
Is built using "sbt assembly", on the cloning of github-datastax's 
https://github.com/datastax/spark-cassandra-connector

Note: Cassandr should be started "cassandr -f"
