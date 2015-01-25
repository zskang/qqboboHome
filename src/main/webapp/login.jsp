<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="<%=path%>/img/favicon.ico">
    <title>紫琪宝贝宠物商店管理系统</title>
    <link href="<%=path%>/js_css/bootstrap33/css/bootstrap.css" rel="stylesheet">
    <link href="<%=path%>/js_css/signin.css" rel="stylesheet">
    <script type="text/javascript" src="<%=path%>/js_css/jquery-2.1.3.js"></script>
    <script type="text/javascript" src="<%=path%>/js_css/jquery.bootstrap.js"></script>
    <script type="text/javascript" src="<%=path%>/js_css/bootstrap33/js/bootstrap.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#userName").focus();
            $("#userName").keydown(function (event) {
                if (event.keyCode == 13) {
                    login();
                }
            })
            $("#passWord").keydown(function (event) {
                if (event.keyCode == 13) {
                    login();
                }
            })
        });
        //登录
        function login() {
            var userName = $("#userName").val();
            var passWord = $("#passWord").val();
            $.messager.alert("登录名不能为空!");
            if(!userName){
                $.messager.alert("登录名不能为空!");
            }
            if(!passWord){
                $.messager.alert("密码不能为空!");
            }
            $.post(
                    "/Login", {"userName": userName, "passWord": passWord}, function (result) {
                        if (result == 'OK') {
                            window.location="<%=path%>/admin/layout/main.jsp";
                        }
                    },"json");
        }
    </script>
</head>
<body class="home-template custom-bg" style="background-image: url(/img/gougou.jpg)">
<div class="container">
    <form class="form-signin" role="form" method="POST" id="LoginForm">
        <h2 class="form-signin-heading">请登录</h2>

        <div class="input">
            <input type="username" class="form-control" id="userName" placeholder="请输入用户ID"
                    >
        </div>
        <br/>

        <div class="input" data-showpassword="">
            <input type="password" class="form-control" id="passWord" placeholder="请输入密码"  >
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="1" onclick="saveMe()"> 记住我?
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="login()">登录
        </button>
    </form>
</div>
</body>
</html>
