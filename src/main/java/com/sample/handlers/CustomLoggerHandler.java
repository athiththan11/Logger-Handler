package com.sample.handlers;

import org.apache.synapse.MessageContext;
import org.apache.synapse.rest.AbstractHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomLoggerHandler extends AbstractHandler {

    private static final Logger LOG = LoggerFactory.getLogger(CustomLoggerHandler.class);

    @Override
    public boolean handleRequest(MessageContext messageContext) {

        // not a best practice to use System.out when logging / tracing. 
        // If you encounter any issue on enabling Log4J properties, then you can use the below 
        // System.out (uncomment and use) to test the working scenarios of this Custom Logger Handler
        
        // System.out.println("Custom Logger Handler Invoked :: Handle Request :: "  + System.currentTimeMillis());

        LOG.info("\n\n:: Custom Logger Handler Invoked :: Handle Request :: " + System.currentTimeMillis() + "\n\n");
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) {

        // not a best practice to use System.out when logging / tracing
        // System.out.println("Custom Logger Handler Invoked :: Handle Response :: " + System.currentTimeMillis());

        LOG.info("\n\n:: Custom Logger Handler Invoked :: Handle Response :: " + System.currentTimeMillis() + "\n\n");
        return true;
    }

}
