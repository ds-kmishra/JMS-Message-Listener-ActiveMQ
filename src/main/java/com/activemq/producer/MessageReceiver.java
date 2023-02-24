package com.activemq.producer;

import com.activemq.MessageReceiverApp;
import com.activemq.model.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.Message;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
    private static final String MESSAGE_QUEUE = "message_queue_object";

    public static final Logger logger = LoggerFactory.getLogger(MessageReceiver.class);

    @JmsListener(destination = MESSAGE_QUEUE)
    public void receiveMessage(final Message<Product> message)
            throws JMSException
    {
        MessageHeaders headers = message.getHeaders();
        logger.info("headers = " + headers);

        Product product = message.getPayload();
        logger.info("product = " + product);

    }
}
