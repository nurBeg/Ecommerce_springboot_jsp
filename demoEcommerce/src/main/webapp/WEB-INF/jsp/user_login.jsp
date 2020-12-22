<%@ include file="header.jsp" %>

	<form:form modelAttribute="user" method="post">
		<form:input path="username" type="text" />
		<form:input path="password" type="password"/>
		<form:button>Login</form:button>
	</form:form>
	
	
</body>
</html>