<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/comment.css" type="text/css">
</head>
<body>
      <div class="main">
        <%@ include file="head.jsp" %>
        <div class="div1">
        <img alt="" src="image/05.jpeg">
                  
           <table class="tb1" border="1" cellspacing="0" class="tb1">
              <tr class="tr1">
                 <th width="150px" align="center">宠物名</th>
                 <th width="400px" align="center">宠物评论</th>
                               
              </tr>
              <c:forEach items="${pb.list }" var="pet">
              <tr>
                 <td width="150px" align="center">${pet.petname}</td>
                 <td width="400px" align="center">${pet.petcomment}</td>            
              </tr>
              </c:forEach>
           </table>
           <br>
           <br>
        </div>
        
        <!-- 分页导航 -->
        <div class="page">
            <ul>
              <c:if test="${pb.currpage==1 }">
                 <li><a href="javascript:;">上一页</a></li>
              </c:if>
              
              <c:if test="${pb.currpage!=1 }">
                 <li><a href="Commentpageservley?currpage=${pb.currpage-1}">上一页</a></li>
              </c:if>
               
               
               <c:if test="${pb.currpage==pb.totalpage }">
                    <li><a href="javascript:;">下一页</a></li>
               </c:if>
               
               <c:if test="${pb.currpage!=pb.totalpage }">
                    <li><a href="Commentpageservley?currpage=${pb.currpage+1}">下一页</a></li>
               </c:if>
            </ul>
        
               <input class="bu1" type="button" value="返回" onclick="location.href='hostmain.jsp'">
        </div>
             
    </div>
</body>
</html>