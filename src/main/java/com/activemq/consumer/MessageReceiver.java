package com.activemq.consumer;

import com.activemq.MessageReceiverApp;
import com.activemq.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MessageReceiver implements MessageListener {
    @Autowired
    JmsTemplate jmsTemplate;
    @Autowired
    MessageConverter messageConverter;

    public static final Logger logger = LoggerFactory.getLogger(MessageReceiverApp.class);

    @Override
    public void onMessage(Message message) {
        try {
            Product product = (Product) messageConverter.fromMessage(message);
            logger.info("Received Message : "+product);
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }
}
