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
        <form action="Shouyiservlet" method="post">
        <div class="div1">
        请输入宠物名：<input class="tx1" type="text" name="petname">
     <br>
          <table class="tb" border="1" style="margin-top:auto;">
             <tr class="tr1">
                <th align="center">宠物名</th>
                <th align="center">宠物收益</th>
                
             </tr>
             
            <tr class="tr2">
                 <td align="center">${pet.petname}</td>
                 <td align="center">${pet.petprofit}</td>
                                   
             </tr>
          </table>
          <input class="bu1" type="submit" value="查询" >&nbsp;&nbsp;
          <input class="bu2" type="button" value="返回" onclick="location.href='hostmain.jsp'">
     </div>
     </form>
</body>
</html>