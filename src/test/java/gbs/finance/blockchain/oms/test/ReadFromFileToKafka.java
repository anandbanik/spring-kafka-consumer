package gbs.finance.blockchain.oms.test;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadFromFileToKafka {
	
	
Logger logger = LoggerFactory.getLogger(ReadFromFileToKafka.class);
	
	public static void main(String[] args) {
		
		ReadFromFileToKafka readFromFileToKafka = new ReadFromFileToKafka();
		readFromFileToKafka.putMessageOnTopic("pocreate");
		
	}
	
	public void putMessageOnTopic(String topicName)
	{
		Properties props = new Properties();
		 //Kafka consumer configuration settings
		props.put("bootstrap.servers", "localhost:9092");
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		logger.info("Properties added");
		try
		{
			Producer<String, String> producer = new KafkaProducer<String,String>(props);
			
			logger.info("Got the Topic");
			for(int i = 0; i < 1; i++)
			{
				String text = new String(Files.readAllBytes(Paths.get("./src/test/resources/createPo.json")), StandardCharsets.UTF_8);
				logger.info("Sending message to Topic: "+text);
				producer.send(new ProducerRecord<String, String>(topicName, 0,String.valueOf(text.hashCode()), text));
			}
			logger.info("Message sent successfully");
			producer.close();
			
		}catch(Exception e){
			logger.error(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
