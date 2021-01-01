<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<script type="text/javascript"
	src="js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript">
	   function Cheakaccount(){
		   var hostaccount=$("#regis").val();
		   
		   if(hostaccount==null||hostaccount==""){
               //出现提示
               $("#reg").text("用户名不可为空").css("color","red");
               return;
           }

           //判断长度
           if(hostaccount.length<6||hostaccount.length>10){
               //出现提示
               $("#reg").text("不合法，长度要在6-10之间").css("color","red");
               return;
           }
           
           $.ajax({
        	   type:'post',
        	   url:'Ajaxregisterservlet',
        	   data:{
        		   hostaccount:hostaccount,
        	   },
        	   success:function(flag){
        		   console.log("aaa"+flag);
        		   if(flag==1){
        			   $("#reg").text("用户已存在").css("color","red");
        		   }else{
        			   $("#reg").text("");
        		   }
        		   
        	   },
           })
		   
	   }
	   
	   function cheakpassword(){
		   var password=$("#pass").val();
			   if(password==null||password==""){
	               //出现提示
	               $("#pas").text("密码不可为空").css("color","red");
	               return;
	           }

	           //判断长度
	           if(password.length<8||password.length>12){
	               //出现提示
	               $("#pas").text("不合法，长度要在8-12之间").css("color","red");
	               return;
	           }
	   }
	
	</script>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/register.css" type="text/css" />
</head>
<body>
      <div class="registerdiv1">
         <img  src="image/02.jpg">
         <p >欢迎注册</p>
      </div>
      <form action="Registerservlet" method="post">
      <div class="registerdiv">
                    账号：<input type="text" name="hostaccount" id="regis" onblur="Cheakaccount()"><span id="reg"></span>
           <br>
                    密码：<input type="password" name="hostpassword" id="pass" onblur="cheakpassword()"><span id="pas"></span>
           <br>
                    用户名：<input type="text" name="hostID">
           <br>
                     性别：<input type="radio" name="hostsex" value="男" checked="checked" /> 男 
                      &nbsp;&nbsp;
            <input type="radio" name="hostsex" value="女"  /> 女
            <br>
                    年龄：<input type="text" name="hostyear">
            <br>
                 电话号码：<input type="text" name="hosttelephone">
                 <br>
                 身份选择：<input type="radio" name="select" value="1" checked="checked" /> 管理员
                      &nbsp;&nbsp;
            <input type="radio" name="select" value="2"  /> 普通用户
            <br>
             <input class="bu1"  type="submit" value="立即注册">
             <br>             
             <input class="bu3" type="button" value="取消" onclick="location.href='regandloghead.jsp'">
             
      </div>
      </form>
</body>
</html>