<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <%out.println("welcome to jsp login page");
  	//String name =(String) request.getAttribute("name");
  	String name =(String) session.getAttribute("name");
  %>
  
  <h3>Welcome : <%=name %></h3>
  
  <a href="login.jsp">login</a>
  <a href="about.jsp">About us</a>

</body>
</html>