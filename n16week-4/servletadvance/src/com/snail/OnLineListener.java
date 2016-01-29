package com.snail;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OnLineListener
 *
 */
public class OnLineListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public OnLineListener() {
        // TODO Auto-generated constructor stub
    }

	
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("session created");
         OnLineCount.add();
         System.out.println("现在在线人数:      "+OnLineCount.getCount());
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("session Destroyed");
    	OnLineCount.dec();
         
    }
	
}
