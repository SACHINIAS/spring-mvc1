<%@ taglib prefix="s" 
		   uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>


<s:form modelAttribute="empForm" enctype="multipart/form-data">
	<c:message code="firstName"/> : <s:input path="firstName"/> <br/>
	<c:message code="lastName"/> : <s:input path="lastName"/> <br/>
	<c:message code="fileLable"/> : 
	<input type="file" name="myFile"/> <br/>
	<input type="submit" value="submit"/>
</s:form>		   
		   
		   
		   