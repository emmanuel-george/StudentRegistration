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
  <h1>Provide Student Information</h1>
  <hr/>
  
    <s:form action="saveStudent" modelAttribute="student">
    <table border="1">
    <s:hidden path="id"/>
       <tr>
         <td>Name</td>
         <td><s:input path="name"/></td>
       
        </tr>
       <tr>
         <td>Email</td>
         <td><s:input path="email"/></td>
       
        </tr>
      <tr>
         <td>Date of Birth</td>
         <td><s:input path="dob" type="date"/></td>
       
        </tr>
        <tr>
         <td>Gender</td>
         <td>
           <s:radiobutton path="gender" value="Male"/>Male
           <s:radiobutton path="gender" value="Female"/>Female
         </td>
       
        </tr>
        <tr>
         <td>Hobbies</td>
         <td>
         <s:checkbox path="hobbies" value="Cricket"/>Cricket<br/>
          <s:checkbox path="hobbies" value="Football"/>Football<br/>
          <s:checkbox path="hobbies" value="Volleyball"/>Volleyball<br/>
          <s:checkbox path="hobbies" value="Hockey"/>Hockey<br/>
         </td>
       
        </tr>
        <tr>
         <td>City</td>
         <td>
         <s:select path="city">
         <s:option value="Davangere">Davangere</s:option>
         <s:option value="Hubli">Hubli</s:option>
         <s:option value="Dharwad">Dharwad</s:option>
         <s:option value="Mysore">Mysore</s:option>
         <s:option value="Bangalore">Bangalore</s:option>
         </s:select>
         </td>
       
        </tr>
        <tr>
         <td>Address</td>
         <td>
         <s:textarea path="address"/>

         </td>
       
        </tr>
        <tr>
         <td></td>
         <td>
          <input type="submit" value="Submit">&nbsp
          <input type="reset" value="Reset">
         </td>
       
        </tr>
    </table></br>
    
    <a href="listStudents">Click here to go for List of Students</a>
    
    
    </s:form>
</body>
</html>