<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-management-System</title>
</head>
<body>
   <form:form action="addStudent" modelAttribute="student">
 <form:input path="studentName" placeholder="enter Name :"/>
 <form:input path="studentPhoneNumber" placeholder="enter phone number :" />
  <input type="submit" value="save">
</form:form>
</body>
</html>