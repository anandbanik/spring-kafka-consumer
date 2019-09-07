package gbs.finance.blockchain.oms.listener;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;

public class EditPoListener {
	
	
	
	Logger log = LoggerFactory.getLogger(CreatePoListener.class);
	private CountDownLatch latch = new CountDownLatch(3);
	
	
	@KafkaListener(topics = "#{'${edit_po_topic}'}", containerFactory = "kafkaListenerContainerFactory")
	public void listen(String message, Acknowledgment acknowledgment) {
	    log.info("Received Edit PO Messasge : " + message.toString());
	    latch.countDown();
	}

}
