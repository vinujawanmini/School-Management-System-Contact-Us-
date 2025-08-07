<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

      <%
         String contactid = request.getParameter("contactid");
         String name = request.getParameter("name");
         String email = request.getParameter("email");
         String message = request.getParameter("message");
      
     %>

 <form action ="update" method = "post">
         
         Contact ID  <input  type="text" name="contactid" value="<%= contactid %>" readonly><br>
         Name  <input  type="text" name="name" value="<%= name %>"><br>
         Email  <input  type="text" name="email" value="<%= email %>"><br>
         Message  <textarea  id="text" name="message" rows="5"> <%= message %></textarea><br>
         
         <input type="submit" name="submit" value="update" ><br>
    
    </form>

</body>
</html>
