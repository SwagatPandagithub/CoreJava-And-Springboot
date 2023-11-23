package in.cg;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloHandler implements Tag {

	PageContext pageContext;
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println("HelloHandler.doEndTag()");
		
		try {
			JspWriter out = pageContext.getOut();
			out.println("<h1>This is from Tag Handler class</h1>");
			
			if(name==null)
				out.println("<h1>hello Guest... welcome to the jsp custom actions </h1>");
			else
				out.println("<h1>hello "+name+"... welcome to the jsp custom actions </h1>");
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
		
		
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("HelloHandler.doStartTag()");
		return 0;
	}

	@Override
	public Tag getParent() {
		System.out.println("HelloHandler.getParent()");
		return null;
	}

	@Override
	public void release() {
		System.out.println("HelloHandler.release()");
	

	}

	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext=pageContext;
				System.out.println("HelloHandler.setPageContext()");
	}

	@Override
	public void setParent(Tag arg0) {
		System.out.println("HelloHandler.setParent()");
	}

}
