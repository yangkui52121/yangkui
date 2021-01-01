<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/purchasepet.css" type="text/css">
</head>
<body>
        <%@ include file="hostfunchead.jsp" %>
        <form action="Purchaselaterservlet" method="post">
        <div class="div1">
        <img class="img" src="image/02.jpg">
           <span>请输入用户名：<input type="text" name="username"></span>
           <br>
           <br>
          <span> 请输入宠物名：<input type="text" name="upetname"></span>
           <br>
           <br>
          <span>请输入购买数量：<input type="text" name="upetnum"></span>
           <br>
           <br>
           <span><input class="bu1" type="submit" value="购买"></span>&nbsp;&nbsp;
           <span><input class="bu2" type="button" value="取消" onclick="location.href='usermain.jsp'"></span>
              <br>
              <br>    
        </div>
        </form>
</body>
</html>