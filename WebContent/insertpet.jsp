<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/insertpet.css" type="text/css" />
</head>
<body>
      <%@ include file="hostfunchead.jsp" %>
      
      <form action="Insertpetservlet" method="post">
      <div class="insertdiv">
                     请输入宠物名：<input type="text" name="petname">
                     <br>
                     <br>                    
                     请输入宠物类型： <input type="text" name="pettype">
                     <br>
                     <br> 
                     请输入宠物年龄： <input type="text" name="petyear">
                     <br>
                     <br> 
                     请输入宠物价格：<input type="text" name="petprice">
                     <br>
                     <br> 
                     请输入宠物体型：<input type="text" name="petshape">
                     <br>
                     <br> 
                     请输入宠物健康状况：<input type="text" name="petstatus">
                     <br>
                     <br> 
                     <input class="bu1" type="submit" value="确定">
                     <br>
                     <br> 
                     <input class="bu2" type="button" value="取消" onclick="location.href='hostmain.jsp'">     
      </div>
      </form>
</body>
</html>