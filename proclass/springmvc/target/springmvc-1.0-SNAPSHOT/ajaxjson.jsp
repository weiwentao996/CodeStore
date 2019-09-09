<%--
  Created by IntelliJ IDEA.
  User: weiru
  Date: 2019/9/2
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p id="result">

</p>
<button onclick="postInfo()">发送数据</button>
</body>
<script src="jquery/jquery-3.3.1.js"></script>
<script>
    var role = {
        id:1,
        roleName: "马云",
        note:"支付宝"
    }
    function postInfo(){
        $.post({
            url:"byrequestjson.do",
            //dataType:"",服务器响应的时候用
            contentType:"application/json",
            data:JSON.stringify(role),
            success:function (data) {
                $('#result').html(data)
            }
        })
    }

</script>
</html>
