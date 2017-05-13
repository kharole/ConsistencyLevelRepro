# ConsistencyLevelRepro
Run cassandra with docker: docker run -p 9042:9042 -m 2g -d cassandra:3.10

Change replication factor: ALTER KEYSPACE "repro" WITH REPLICATION =  { 'class' : 'org.apache.cassandra.locator.SimpleStrategy', 'replication_factor': '3' };
