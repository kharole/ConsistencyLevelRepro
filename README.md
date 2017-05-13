Steps:

1. Run cassandra with docker:
docker run -p 9042:9042 -m 2g -d cassandra:3.10
2. Fetch the app
3. Run and let it autocreate keyspace "repro"
4. Stop the app and ALTER KEYSPACE "repro" WITH REPLICATION =  { 'class' : 'org.apache.cassandra.locator.SimpleStrategy', 'replication_factor': '3' };
