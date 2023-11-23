package in.Listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.annotation.WebListener;


@WebListener
public class ServletContextAttributeListener implements javax.servlet.ServletContextAttributeListener {

    static {
    	System.out.println("Servlet Context Attribute Listener file is Loaded...");
    	
    }
    public ServletContextAttributeListener() {
    	System.out.println("Servlet Context Attribute Listener file is Instantiated...");
    }

	
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
         System.out.println("ServletContextAttributeListener.attributeAdded()");
    }

	
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    	System.out.println("ServletContextAttributeListener.attributeRemoved()");
    }


    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	System.out.println("ServletContextAttributeListener.attributeReplaced()");
         // TODO Auto-generated method stub
    }
	
}
