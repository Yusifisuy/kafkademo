1: KAFKANI YUKLEMEK UCUN
https://kafka.apache.org/downloads

2:KAFKA ENVIRONMENT`INI BASLATMAQ

SIRA ILE BUNLARI RUN ELE (kafkani unzip ele sonra file olan yerde yaz bunlari cmd`e . too long erroru atsa versiyani sil file`in adini kafka ele

 ZooKeeper service - 
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Kafka broker service - 
.\bin\windows\kafka-server-start.bat .\config\server.properties

3: EVENTLERI SAXLAMAQ UCUN TOPIC YARAT
.\bin\windows\kafka-topics.bat --create --topic topic_demo --bootstrap-server localhost:9092

4: EVENT`E TOPIC YAZMAQ UCUN
.\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092

5: EVENT`I OXUMAQ UCUN
.\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092
