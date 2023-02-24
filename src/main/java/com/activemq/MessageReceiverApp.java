package com.activemq;

import com.activemq.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MessageReceiverApp {
    public static final Logger logger = LoggerFactory.getLogger(MessageReceiverApp.class);
    public static void main(String args[]){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        logger.info("--- Message Listener started ---");
        try{
            Thread.sleep(6000000);
        }catch (Exception e){
            e.printStackTrace();
        }
        ((AbstractApplicationContext) context).close();
    }
}
