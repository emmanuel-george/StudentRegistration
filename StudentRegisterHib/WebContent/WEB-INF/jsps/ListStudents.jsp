<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>This is Students List</h1>
  
  <a href="addStudent">Click here to add Student</a></br></br>
  <table border="1">
  <tr>
      <th>Name</th>
      <th>Email</th>
      <th>Date of Birth</th>
      <th>Gender</th>
      <th>Hobbies</th>
      <th>City</th>
      <th>Address</th>
      <th>Action</th>
  </tr>
  <c:forEach items="${students}" var="student">
  
  <c:url var="updateLink" value="showUpdateForm">
  <c:param name="id" value="${student.id }"/>
  
  </c:url>
    <c:url var="deleteLink" value="deleteRecord">
  <c:param name="id" value="${student.id }"/>
  
  </c:url>
   <tr>
         <td>${student.name}</td>
         <td>${student.email}</td>
         <td>${student.dob}</td>
         <td>${student.gender}</td>
         <td>${student.hobbies}</td>
         <td>${student.city}</td>
         <td>${student.address}</td>
         <td>
         <a href="${ updateLink}">Update </a>|  <a href="${deleteLink }">Delete </a>
         
         </td>
    </tr>
  
  </c:forEach>
  
  </table>
  
  
</body>
</html>