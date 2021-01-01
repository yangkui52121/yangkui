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
     <form action="Cheakandbuyservlet" method="post">
     <div class="div1">
          请输入宠物名：<input class="tx1" type="text" name="petname">
          <table class="tb" border="1" style="margin-top:auto;">
             <tr class="tr1">
                <th align="center">宠物名</th>
                <th align="center">宠物类型</th>
                <th align="center">宠物年龄</th>
                <th align="center">宠物价格</th>
                <th align="center">宠物体型</th>
                <th align="center">宠物健康状态</th>
             </tr>
             
             <tr class="tr2">
                 <td align="center">${pet.petname }</td>
                 <td align="center">${pet.pettype }</td>
                 <td align="center">${pet.petyear }</td>
                 <td align="center">${pet.petprice }</td>
                 <td align="center">${pet.petshape }</td> 
                 <td align="center">${pet.petstatus }</td>                       
             </tr>
          </table>
          <input class="bu1" type="submit" value="查询" >&nbsp;&nbsp;
          <input class="bu2" type="button" value="返回" onclick="location.href='usermain.jsp'">
     </div>
     </form>
</body>
</html>