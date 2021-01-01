<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/deletpet.css" type="text/css" />
</head>
<body>
       <%@ include file="hostfunchead.jsp" %>
       
       <form action="Deletepetservlet" method="post">
       <div class="deletpetdiv">
                请输入需要删除宠物的名称：<input type="text" name="petname">
                <br>
                <br>
                <input class="bu1" type="submit" value="确定">
                <br>
                <br>
                <input class="bu2" type="button" value="返回" onclick="location.href='hostmain.jsp'">
       </div>
       </form>
</body>
</html>