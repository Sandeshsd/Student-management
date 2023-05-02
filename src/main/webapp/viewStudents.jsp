<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <table>
      <tr>
      <th>student id</th>
      <th>student name</th>
      <th>student phone number</th>
      <th>update student</th>
      <th>delete student</th>
      </tr>
      <c:forEach var="student" items="${students}">
      <tr>
      <td>${student.getStudentId()}</td>
      <td>${student.getStudentName()}</td>
      <td>${student.getStudentPhoneNumber()}</td>
      <td><a href="updateStudent?id=${student.getStudentId()} ">update</a></td>
      <td><%-- <a href="deleteStudent?id=${student.getStudentId()} ">update</a> --%></td>
      </tr>
     </c:forEach>
      
     
      </table>
</body>
</html>