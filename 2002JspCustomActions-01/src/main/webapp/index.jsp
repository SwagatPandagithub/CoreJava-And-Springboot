<%@ taglib prefix="mytag" uri = "./WEB-INF/hello.tld"%>

<h1>hello this is index.jsp page</h1>

<mytag:hello name="swagat">
		<h1>hello this is body of custom tag....</h1>
</mytag:hello>


<mytag:hello>
		<h1>hello this is body of custom tag....</h1>
</mytag:hello>

<h1>This is after the custom tag invocation....</h1>

