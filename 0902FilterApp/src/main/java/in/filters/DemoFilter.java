package in.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;


public class DemoFilter extends HttpFilter implements Filter {
       
    private static final long serialVersionUID = 1L;
    
    static {
    	System.out.println("DemoFilter.class file static block is Loading... ");
    }
	
    public DemoFilter() {
       System.out.println("DemoFilter object is instantiated...");
    }

    public void init(FilterConfig fConfig) throws ServletException {
    	System.out.println("Demofilter is initialised...");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
		out.println("<h1>The control is in demofilter before processing the request...</h1>");
		

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		out.println("<h1>The control is in demofilter after processing the request...</h1>");
		
	}
	
	public void destroy() {
		
		System.out.println("Filter deinitialised");
	}
	
	
}
