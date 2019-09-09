<%--
  Created by IntelliJ IDEA.
  User: 86137
  Date: 2019/9/4
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
    <%
        String path = request.getContextPath();// /springmvc
        // http://localhost:8080/springmvc/
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        request.setAttribute("basePath", basePath);
    %>


</head>
<body>


<%--<form action="/ssm/user/login.do" method="post">--%>
    <%--<p>${error}</p>--%>

    <%--<input type="text" name="username"> <br/>--%>
    <%--<input type="text" name="pwd"> <br/>--%>
    <%--<input type="submit" value="登陆">--%>

    <%--<p><% session.removeAttribute("error");%></p>--%>
<%--</form>--%>


<form action="#" method="post">
    <p id="tip"></p>
<input type="text" name="username"> <br/>
<input type="text" name="pwd"> <br/>
<input type="button" value="登陆" onclick="login()">
</form>


<script src="${basePath}jquery/jquery-3.4.1.js"></script>
<script>
    function login(){
        // 用户名与密码的基本验证
        $.post({
            <%--url:"${basePath}user/ddd.do",--%>
            url:"${basePath}user/login.do",
            data:$('form').serialize(),
            dataType:"json",
            success:function (data) {

                 if(data.code == 0){
                     window.location.href="${basePath}home.jsp"
                 } else {
                     // 根据服务端返回，可使用其提示信息，也可以自定义
                     $('#tip').text(data.message)
                 }
            }
        })
    }


</script>
</body>
</html>

