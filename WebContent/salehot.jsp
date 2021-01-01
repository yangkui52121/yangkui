<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/salehot.css" type="text/css">
</head>
<body>
       <%@ include file="head.jsp" %>
       <form action="Salehotservlet" method="post">
       <div class="div1">
           <img alt="" src="image/05.jpeg">
           <br>
                     宠物名：<input class="tx1" type="text" value=${sale.petname }>
                     <br>
                   销售数量：<input class="tx2" type="text" value=${sale.petsalenumber }>
                   <br>
                   热销<input type="radio" name="saleselect" value="热销">
                   &nbsp;&nbsp;
                滞销<input type="radio" name="saleselect" value="滞销"> 
                <br>    
                <input class="bu1" type="submit" value="查询"> &nbsp;&nbsp;
                <input class="bu2" type="button" value="返回" onclick="location.href='hostmain.jsp'">
                  
       </div>
       </form>

</body>
</html>