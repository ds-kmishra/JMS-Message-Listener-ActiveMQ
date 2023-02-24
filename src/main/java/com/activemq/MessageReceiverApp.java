package com.activemq;

import com.activemq.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MessageReceiverApp {
    public static final Logger logger = LoggerFactory.getLogger(MessageReceiverApp.class);
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        logger.info("--- Message Listener started ---");
        try
        {
            Thread.sleep(6000000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        ((AbstractApplicationContext) context).close();
    }
}
