<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login.css" type="text/css" />
</head>
<body>
      <div class="logindiv1">
         <img  src="image/02.jpg">
         <p >欢迎注册</p>
      </div>
      <form action="Loginservlet" method="post">
      <div class="logindiv2">
          账号： <input type="text" name="account">
          <br>
          密码：<input type="password" name="password">
          <br>
          身份选择：<input type="radio" name="select" value="1" checked="checked" /> 管理员
                      &nbsp;&nbsp;
            <input type="radio" name="select" value="2"  /> 普通用户
            <br>
           <input class="bu1" type="submit" value="登陆">
           <br>
           <input class="bu2" type="button" value="取消" onclick="location.href='regandloghead.jsp'">
            <br>
           <input class="bu3" type="button" value="没有账号，立即注册" onclick="location.href='register.jsp'">
      </div>
      </form>
</body>
</html>