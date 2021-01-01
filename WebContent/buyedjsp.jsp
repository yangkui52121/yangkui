<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <form action="Buyedservlet" method="post">
        <div class="div1">
        请输入宠物名：<input class="tx1" type="text" name="upetname">&nbsp;&nbsp;
          请输入用户名：<input class="tx1" type="text" name="username">
     
          <table class="tb" border="1" style="margin-top:auto;">
             <tr class="tr1">
                <th align="center">用户名</th>
                <th align="center">宠物名</th>
                <th align="center">宠物类型</th>
                <th align="center">已购数量</th>
             </tr>
             
            <tr class="tr2">
                 <td align="center">${upet.username}</td>
                 <td align="center">${upet.upetname}</td>
                 <td align="center">${upet.upettype}</td>
                 <td align="center">${upet.upetnum}</td>                   
             </tr>
          </table>
          <input class="bu1" type="submit" value="查询" >&nbsp;&nbsp;
          <input class="bu2" type="button" value="返回" onclick="location.href='usermain.jsp'">
     </div>
     </form>
</body>
</html>