<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/cheakusermes.css" type="text/css">
</head>
<body>
     <%@ include file="hostfunchead.jsp" %>
     <img alt="" src="image/05.jpeg">
     <form action="Usermesservlet" method="post">
     <div class="div1">
          请输入账号：<input class="tx1" type="text" name="useraccount">
          <table class="tb" border="1" style="margin-top:auto;">
             <tr class="tr1">
                <th align="center">用户账号</th>
                <th align="center">用户ID</th>
                <th align="center">用户年龄</th>
                <th align="center">用户性别</th>
                <th align="center">用户电话</th>
             </tr>
             
             <tr class="tr2">
                 <td align="center">${user.useraccount }</td>
                 <td align="center">${user.userID }</td>
                 <td align="center">${user.useryear }</td>
                 <td align="center">${user.usersex }</td>
                 <td align="center">${user.usertelephone }</td>                        
             </tr>
          </table>
          <input class="bu1" type="submit" value="查询" >&nbsp;&nbsp;
          <input class="bu2" type="button" value="返回" onclick="location.href='usermain.jsp'">
     </div>
     </form>
</body>
</html>