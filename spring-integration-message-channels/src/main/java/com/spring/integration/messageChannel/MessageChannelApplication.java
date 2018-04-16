package com.spring.integration.messageChannel;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class MessageChannelApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/spring-integration-message-channel.xml");
		while(true) { }
		//MessageChannel channel = context.getBean("messageChannel", MessageChannel.class);
		//Message<String> message1 = MessageBuilder.withPayload("Sending Message to Channel - 1").build();
		//System.out.println("sending message1");
		//channel.send(message1);
	}
}
