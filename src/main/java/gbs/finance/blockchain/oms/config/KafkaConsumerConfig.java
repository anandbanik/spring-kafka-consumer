package gbs.finance.blockchain.oms.config;

import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.AbstractMessageListenerContainer.AckMode;
import gbs.finance.blockchain.oms.util.KafkaConfig;


@EnableKafka
@Configuration
public class KafkaConsumerConfig {

	Logger log = LoggerFactory.getLogger(KafkaConsumerConfig.class);
	
	@Autowired
	private KafkaConfig kafkaConfig;
			
	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		log.info("Inside consumerFactory");
		Map<String, Object> props = new HashMap<>();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaConfig.getBindAddress());
		props.put(ConsumerConfig.GROUP_ID_CONFIG, kafkaConfig.getGroupId());
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, kafkaConfig.isEnableAutoCommit());
		props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, kafkaConfig.getOffsetConfig());
		return new DefaultKafkaConsumerFactory<>(props);
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {

		log.info("Inside kafkaListenerContainerFactory");
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		factory.getContainerProperties().setAckMode(AckMode.MANUAL_IMMEDIATE);
		return factory;
	}
}
