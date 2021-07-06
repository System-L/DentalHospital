<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>医生登录</title>
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
    %>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <link type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,800italic,400,700,800">
    <link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Oswald:400,700,300">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/font-awesome.min.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/animate.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/all.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/main.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/style-responsive.css">
    <!-- js -->
    <script src="${APP_PATH }/static/js/jquery.js"></script>
</head>
<body style="background: url('../../static/images/bg/bg.png') center center fixed;">
    <div class="page-form">
        <div class="panel panel-blue">
            <div class="panel-body pan">
                <div class="form-horizontal">
                <div class="form-body pal">
                    <div class="col-md-12 text-center">
                        <h1 style="margin-top: -90px; font-size: 48px;">
                            医生登录</h1>
                        <br />
                    </div>
                    <div class="form-group">
                        <div class="col-md-3">
                            <img src="../../static/images/avatar/profile-pic.png" class="img-responsive" style="margin-top: -35px;" />
                        </div>
                        <div class="col-md-9 text-center">
                            <h1>
                                欢迎！</h1>
                            <br />
                            <p>
                                Just sign in and we’ll send you on your way</p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputName" class="col-md-3 control-label">
                            用户名：</label>
                        <div class="col-md-9">
                            <div class="input-icon right">
                                <i class="fa fa-user"></i>
                                <input id="inputName" type="text" placeholder="" class="form-control" /></div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword" class="col-md-3 control-label">
                            密码：</label>
                        <div class="col-md-9">
                            <div class="input-icon right">
                                <i class="fa fa-lock"></i>
                                <input id="inputPassword" type="password" placeholder="" class="form-control" /></div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-5 control-label" id="errorMsg" style="color:red;"></label>
                    </div>
                    <div class="form-group mbn">
                        <div class="col-lg-12" align="right">
                            <div class="form-group mbn">
                                <div class="col-lg-3">
                                    &nbsp;
                                </div>
                                <div class="col-lg-9">
                                    <a href="login.jsp" class="btn btn-default">清 空</a>&nbsp;&nbsp;
                                    <button type="submit" class="btn btn-default" id="btn-login">登 录</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                </div>
            </div>
        </div>
        <div class="col-lg-12 text-center">
            <p>
                忘记密码 ?
            </p>
        </div>
    </div>
    <script type="text/javascript">
        $("#btn-login").click(function(){
            $.ajax({
                url:"${APP_PATH }/doctorLogin",
                type:"POST",
                data:{"name":$("#inputName").val(),"password":$("#inputPassword").val()},
                success:function(result){
                    if(result.code == 100){
                        if(result.extend.duty == '药剂师'){
                            window.location.href = "${APP_PATH }/ui/pharmacist/index.jsp";
                        }else{
                            window.location.href = "index.jsp";
                        }
                    }else{
                        $("#errorMsg").text("用户名或密码错误！");
                    }
                }
            });
        });

    </script>
</body>
</html>
