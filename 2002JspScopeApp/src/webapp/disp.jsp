<h1 style = "color:blue;text-align: center">
	Data recieved from Particular Scope :: <%=pageContext.getAttribute("p") %>
</h1>
the data recieved for the page scope will be null since the page value doesnot travels to other page
<h1 style = "color:green;text-align: center">
	Data recieved from Particular Scope :: <%=request.getAttribute("r") %>
</h1>
<h1 style = "color:teal;text-align: center">
	Data recieved from Particular Scope :: <%=session.getAttribute("s") %>
</h1>
<h1 style = "color:red;text-align: center">
	Data recieved from Particular Scope :: <%=application.getAttribute("a") %>
</h1>


find some other twists in the lecture "pagecontext.findAttribute()"


<h1 style = "color:red;text-align: center">
	Data recieved from Particular Scope  using pageContext.findAttribute:: <%=pageContext.findAttribute("s") %>
</h1>