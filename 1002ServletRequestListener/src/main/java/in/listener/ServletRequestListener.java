package in.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;


@WebListener
public class ServletRequestListener implements javax.servlet.ServletRequestListener {
	
	public static int count = 0; 

    static {
    	System.out.println("Request listener .class file is loading");
    }
    public ServletRequestListener() {
    	System.out.println("Request listener object is instantiated");
    }

	
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("ServletRequestListener.requestDestroyed()");
    }

	
    public void requestInitialized(ServletRequestEvent sre)  { 
    	count ++;
    	System.out.println("Request object created at :: "+new java.util.Date());
    	System.out.println("Hit count of the application :: "+count);
    	System.out.println("ServletRequestListener.requestInitialized()");
    }
	
}
