<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/writecomment.css" type="text/css">
</head>
<body>
       <%@ include file="head.jsp" %>
       <form action="Writecommentservlet" method="post">
       <div class="div1">
          <img alt="" src="image/05.jpeg">
          <br>
                     请输入你想要评价的宠物名 ：<input class="tx1" type="text" name="petname">
                     <br>
                     <br>
                                                           评论： <textarea class="tx2" name="petcomment"></textarea>
                     <br>
                     <input class="bu1" type="submit" value="评论">&nbsp;&nbsp;
                     <input class="bu2" type="button" value="返回" onclick="location.href='usermain.jsp'">
       
       </div>
       </form>
</body>
</html>