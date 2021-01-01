<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/updatepass.css" type="text/css">
</head>
<body>
      <%@ include file="head.jsp" %>
      <form action="Updateuserpassservlet" method="post">
      <div class="div1">
         <img alt="" src="image/05.jpeg">
         <br>
                   请输入账号：<input type="text" name="useraccount">
                   <br>
                   请输入ID：<input type="text" name="userID">
                   <br>
      请输入修改后密码：<input type="text" name="userpassword">
                   <br>
                   <input class="bu1" type="submit" value="修改">&nbsp;&nbsp;
                   <input class="bu2" type="button" value="返回" onclick="location.href='usermain.jsp'">
      
      </div>
      </form>
</body>
</html>