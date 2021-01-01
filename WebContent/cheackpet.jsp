<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/cheakpet.css" type="text/css">
</head>
<body>
    <div class="main">
        <div class="div1">
        <%@ include file="head.jsp" %>
        <img alt="" src="image/05.jpeg">
        <caption>宠物信息</caption>
           <table border="1" cellspacing="0" class="tb1">
              <tr class="tr1">
                 <th width="150px" align="center">宠物名</th>
                 <th width="100px" align="center">宠物类型</th>
                 <th width="100px" align="center">宠物年龄</th>
                 <th width="150px" align="center">宠物价格</th>
                 <th width="100px" align="center">宠物体型</th>
                 <th width="150px" align="center">宠物健康状况</th>               
              </tr>
              <c:forEach items="${pb.list }" var="pet">
              <tr>
                 <td width="150px" align="center">${pet.petname}</td>
                 <td width="100px" align="center">${pet.pettype}</td>
                 <td width="100px" align="center">${pet.petyear}</td>
                 <td width="150px" align="center">${pet.petprice}</td>
                 <td width="100px" align="center">${pet.petshape}</td>
                 <td width="150px" align="center">${pet.petstatus}</td>
              
              </tr>
              </c:forEach>
           </table>
        </div>
        
        <!-- 分页导航 -->
        <div class="page">
            <ul>
              <c:if test="${pb.currpage==1 }">
                 <li><a href="javascript:;">上一页</a></li>
              </c:if>
              
              <c:if test="${pb.currpage!=1 }">
                 <li><a href="Pageservlet?currpage=${pb.currpage-1}">上一页</a></li>
              </c:if>
               
               <br>
               
               <c:if test="${pb.currpage==pb.totalpage }">
                    <li><a href="javascript:;">下一页</a></li>
               </c:if>
               
               <c:if test="${pb.currpage!=pb.totalpage }">
                    <li><a href="Pageservlet?currpage=${pb.currpage+1}">下一页</a></li>
               </c:if>
            </ul>
                  <input type="button" width="200px" value="返回" onclick="location.href='hostmain.jsp'">
        </div>
      
    
    
    </div>
</body>
</html>