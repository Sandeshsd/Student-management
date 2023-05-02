<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <f:form action="saveUpdateStudent" modelAttribute="student"> 
      <f:input path="studentId" readonly="true"/>
      <f:input path="studentName"/>
      <f:input path="studentPhoneNumber"/>
      <input type="submit" value="update">      
      
      </f:form>
      
</body>
</html>