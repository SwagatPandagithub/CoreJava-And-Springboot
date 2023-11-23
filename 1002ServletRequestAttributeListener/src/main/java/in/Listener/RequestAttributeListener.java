package in.Listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class RequestAttributeListener implements ServletRequestAttributeListener {

    static{
    	System.out.println("The listener is loading.....");
    }
    public RequestAttributeListener() {
    	System.out.println("Listener is instantiated......");
    }

	
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
    	System.out.println(srae.getName()+"........attribute Removed");
    }

	
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	System.out.println(srae.getName()+"........attribute Added");
         // TODO Auto-generated method stub
    }

	
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
    	System.out.println(srae.getName()+"........attribute Replaced");
         // TODO Auto-generated method stub
    }
	
}
