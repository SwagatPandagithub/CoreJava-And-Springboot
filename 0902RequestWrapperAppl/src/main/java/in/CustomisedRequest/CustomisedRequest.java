package in.CustomisedRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CustomisedRequest extends HttpServletRequestWrapper{

	//the parent class Parameterised constructor is inherited by the child class.
	
	public CustomisedRequest(HttpServletRequest request) {
		super(request);
		
	}
	
	public String getParameter(String name) {
		
		System.out.println("CustomisedRequest.getParameter()");
		System.out.println("name is"+name);
		
		String word = super.getParameter(name);
		System.out.println("Word type is :: "+word);
		
		if(word.equalsIgnoreCase("java")||word.equalsIgnoreCase("spring")||word.equalsIgnoreCase("jee")) 
			return "SLEEP";
		
		return word;
	}

}
