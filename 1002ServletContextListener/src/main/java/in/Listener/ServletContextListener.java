package in.Listener;

import javax.servlet.ServletContextEvent;


public class ServletContextListener implements javax.servlet.ServletContextListener {

   static {
	   System.out.println("Context Listener is loading");
   }
    public ServletContextListener() {
    	System.out.println("Context Listener is instantiated...");
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("ServletContextListener.contextDestroyed()");
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("ServletContextListener.contextInitialized()");
    	
    }
	
}
