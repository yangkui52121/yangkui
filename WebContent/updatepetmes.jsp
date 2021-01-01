<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/updatepetmes.css" type="text/css">
</head>
<body>
      <%@ include file="hostfunchead.jsp" %>
      <form action="Updatepetmesservlet" method="post">
      <div class="updatediv">
              重复宠物名：<input type="text" name="petname" placeholder="${name.petname }">
              <br>
              <br>
              宠物类型：<input type="text" name="pettype">
              <br>
              <br>
              宠物年龄：<input type="text" name="petyear">
              <br>
              <br>
              宠物价格：<input type="text" name="petprice">
              <br>
              <br>
              宠物体型：<input type="text" name="petshape">
              <br>
              <br>
              宠物健康状况：<input type="text" name="petstatus">
              <br>
              <br>
              <input class="bu1" type="submit" value="修改">
              <br>
              <br>
              <input class="bu2" type="button" value="返回" onclick="location.href='hostmain.jsp'">
        
      </div>
      </form>
</body>
</html>