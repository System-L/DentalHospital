<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>设置</title>
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
    %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${APP_PATH }/static/images/icons/favicon.ico">
    <link rel="apple-touch-icon" href="${APP_PATH }static/images/icons/favicon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="${APP_PATH }static/images/icons/favicon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="${APP_PATH }static/images/icons/favicon-114x114.png">
    <!--Loading bootstrap css-->
    <link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700">
    <link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Oswald:400,700,300">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/jquery-ui-1.10.4.custom.min.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/font-awesome.min.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/animate.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/all.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/main.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/style-responsive.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/zabuto_calendar.min.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/pace.css">
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/styles/jquery.news-ticker.css">
    <!-- js -->
    <script src="${APP_PATH }/static/js/jquery.js"></script>
    <!-- tag -->
    <link rel="stylesheet" type="text/css" href="${APP_PATH }/static/css/tag/jquery.tagsinput.css" />
    <link rel="stylesheet" type="text/css" href="${APP_PATH }/static/css/tag/jquery-ui.css" />
</head>
<body>
<div>
    <!--BEGIN THEME SETTING-->
    <div id="theme-setting">
        <a href="#" data-toggle="dropdown" data-step="1" data-intro="&lt;b&gt;Many styles&lt;/b&gt; and &lt;b&gt;colors&lt;/b&gt; be created for you. Let choose one and enjoy it!"
           data-position="left" class="btn-theme-setting"><i class="fa fa-cog"></i></a>
        <div class="content-theme-setting">
            <select id="list-style" class="form-control">
                <option value="style1">Flat Squared style</option>
                <option value="style2">Flat Rounded style</option>
                <option value="style3" selected="selected">Flat Border style</option>
            </select>
        </div>
    </div>
    <!--END THEME SETTING-->
    <!--BEGIN BACK TO TOP-->
    <a id="totop" href="#"><i class="fa fa-angle-up"></i></a>
    <!--END BACK TO TOP-->
    <!--BEGIN TOPBAR-->
    <div id="header-topbar-option-demo" class="page-header-topbar">
        <nav id="topbar" role="navigation" style="margin-bottom: 0;" data-step="3" class="navbar navbar-default navbar-static-top">
            <div class="navbar-header">
                <button type="button" data-toggle="collapse" data-target=".sidebar-collapse" class="navbar-toggle"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                <a id="logo" href="index.jsp" class="navbar-brand"><span class="fa fa-rocket"></span><span class="logo-text">个人中心</span><span style="display: none" class="logo-text-icon">µ</span></a></div>
            <div class="topbar-main"><a id="menu-toggle" href="#" class="hidden-xs"><i class="fa fa-bars"></i></a>

                <form id="topbar-search" action="" method="" class="hidden-sm hidden-xs">
                    <div class="input-icon right text-white"><a href="#"><i class="fa fa-search"></i></a><input type="text" placeholder="Search here..." class="form-control text-white"/></div>
                </form>
                <div class="news-update-box hidden-xs"><span class="text-uppercase mrm pull-left text-white">News:</span>
                    <ul id="news-update" class="ticker list-unstyled">
                        <li>Welcome to KAdmin - Responsive Multi-Style Admin Template</li>
                        <li>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque.</li>
                    </ul>
                </div>
                <ul class="nav navbar navbar-top-links navbar-right mbn">
                    <li class="dropdown"><a data-hover="dropdown" href="#" class="dropdown-toggle"><i class="fa fa-bell fa-fw"></i><span class="badge badge-green">3</span></a>

                    </li>
                    <li class="dropdown"><a data-hover="dropdown" href="#" class="dropdown-toggle"><i class="fa fa-envelope fa-fw"></i><span class="badge badge-orange">7</span></a>

                    </li>
                    <li class="dropdown"><a data-hover="dropdown" href="#" class="dropdown-toggle"><i class="fa fa-tasks fa-fw"></i><span class="badge badge-yellow">8</span></a>

                    </li>
                    <li class="dropdown topbar-user"><a data-hover="dropdown" href="#" class="dropdown-toggle"><img src="../../static/images/avatar/48.jpg" alt="" class="img-responsive img-circle"/>&nbsp;<span class="hidden-xs">Robert John</span>&nbsp;<span class="caret"></span></a>
                        <ul class="dropdown-menu dropdown-user pull-right">
                            <li><a href="#"><i class="fa fa-user"></i>My Profile</a></li>
                            <li><a href="#"><i class="fa fa-calendar"></i>My Calendar</a></li>
                            <li><a href="#"><i class="fa fa-envelope"></i>My Inbox<span class="badge badge-danger">3</span></a></li>
                            <li><a href="#"><i class="fa fa-tasks"></i>My Tasks<span class="badge badge-success">7</span></a></li>
                            <li class="divider"></li>
                            <li><a href="#"><i class="fa fa-lock"></i>Lock Screen</a></li>
                            <li><a href="Login.html"><i class="fa fa-key"></i>Log Out</a></li>
                        </ul>
                    </li>
                    <li id="topbar-chat" class="hidden-xs"><a href="javascript:void(0)" data-step="4" data-intro="&lt;b&gt;Form chat&lt;/b&gt; keep you connecting with other coworker" data-position="left" class="btn-chat"><i class="fa fa-comments"></i><span class="badge badge-info">3</span></a></li>
                </ul>
            </div>
        </nav>
        <!--BEGIN MODAL CONFIG PORTLET-->
        <div id="modal-config" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" data-dismiss="modal" aria-hidden="true" class="close">
                            &times;</button>
                        <h4 class="modal-title">
                            Modal title</h4>
                    </div>
                    <div class="modal-body">
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifend et nisl eget
                            porta. Curabitur elementum sem molestie nisl varius, eget tempus odio molestie.
                            Nunc vehicula sem arcu, eu pulvinar neque cursus ac. Aliquam ultricies lobortis
                            magna et aliquam. Vestibulum egestas eu urna sed ultricies. Nullam pulvinar dolor
                            vitae quam dictum condimentum. Integer a sodales elit, eu pulvinar leo. Nunc nec
                            aliquam nisi, a mollis neque. Ut vel felis quis tellus hendrerit placerat. Vivamus
                            vel nisl non magna feugiat dignissim sed ut nibh. Nulla elementum, est a pretium
                            hendrerit, arcu risus luctus augue, mattis aliquet orci ligula eget massa. Sed ut
                            ultricies felis.</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" data-dismiss="modal" class="btn btn-default">
                            Close</button>
                        <button type="button" class="btn btn-primary">
                            Save changes</button>
                    </div>
                </div>
            </div>
        </div>
        <!--END MODAL CONFIG PORTLET-->
    </div>
    <!--END TOPBAR-->
    <div id="wrapper">
        <!--BEGIN SIDEBAR MENU-->
        <nav id="sidebar" role="navigation" data-step="2" data-intro="Template has &lt;b&gt;many navigation styles&lt;/b&gt;"
             data-position="right" class="navbar-default navbar-static-side">
            <div class="sidebar-collapse menu-scroll">
                <ul id="side-menu" class="nav">

                    <div class="clearfix"></div>
                    <li><a href="index.jsp"><i class="glyphicon glyphicon-home">
                        <div class="icon-bg bg-orange"></div>
                    </i><span class="menu-title">主页</span></a></li>
                    <li><a href="records.jsp"><i class="glyphicon glyphicon-list-alt">
                        <div class="icon-bg bg-pink"></div>
                    </i><span class="menu-title">我的就诊记录</span></a>

                    </li>
                    <li><a href="meeting.jsp"><i class="glyphicon glyphicon-earphone">
                        <div class="icon-bg bg-violet"></div>
                    </i><span class="menu-title">我的预约</span></a>

                    </li>
                    <li><a href="bill.jsp"><i class="glyphicon glyphicon-usd">
                        <div class="icon-bg bg-blue"></div>
                    </i><span class="menu-title">我的账单</span></a>

                    </li>
                    <li  class="active"><a href="setting.jsp"><i class="glyphicon glyphicon-cog">
                        <div class="icon-bg bg-yellow"></div>
                    </i><span class="menu-title">设置</span></a>

                    </li>
                </ul>
            </div>
        </nav>
        <!--END SIDEBAR MENU-->
        <!--BEGIN CHAT FORM-->
        <div id="chat-form" class="fixed">
            <div class="chat-inner">
                <h2 class="chat-header">
                    <a href="javascript:;" class="chat-form-close pull-right"><i class="glyphicon glyphicon-remove">
                    </i></a><i class="fa fa-user"></i>&nbsp; Chat &nbsp;<span class="badge badge-info">3</span></h2>
                <div id="group-1" class="chat-group">
                    <strong>Favorites</strong><a href="#"><span class="user-status is-online"></span> <small>
                    Verna Morton</small> <span class="badge badge-info">2</span></a><a href="#"><span
                        class="user-status is-online"></span> <small>Delores Blake</small> <span class="badge badge-info is-hidden">
                                    0</span></a><a href="#"><span class="user-status is-busy"></span> <small>Nathaniel Morris</small>
                    <span class="badge badge-info is-hidden">0</span></a><a href="#"><span class="user-status is-idle"></span>
                    <small>Boyd Bridges</small> <span class="badge badge-info is-hidden">0</span></a><a
                        href="#"><span class="user-status is-offline"></span> <small>Meredith Houston</small>
                    <span class="badge badge-info is-hidden">0</span></a></div>
                <div id="group-2" class="chat-group">
                    <strong>Office</strong><a href="#"><span class="user-status is-busy"></span> <small>
                    Ann Scott</small> <span class="badge badge-info is-hidden">0</span></a><a href="#"><span
                        class="user-status is-offline"></span> <small>Sherman Stokes</small> <span class="badge badge-info is-hidden">
                                    0</span></a><a href="#"><span class="user-status is-offline"></span> <small>Florence
                    Pierce</small> <span class="badge badge-info">1</span></a></div>
                <div id="group-3" class="chat-group">
                    <strong>Friends</strong><a href="#"><span class="user-status is-online"></span> <small>
                    Willard Mckenzie</small> <span class="badge badge-info is-hidden">0</span></a><a
                        href="#"><span class="user-status is-busy"></span> <small>Jenny Frazier</small>
                    <span class="badge badge-info is-hidden">0</span></a><a href="#"><span class="user-status is-offline"></span>
                    <small>Chris Stewart</small> <span class="badge badge-info is-hidden">0</span></a><a
                        href="#"><span class="user-status is-offline"></span> <small>Olivia Green</small>
                    <span class="badge badge-info is-hidden">0</span></a></div>
            </div>
            <div id="chat-box" style="top: 400px">
                <div class="chat-box-header">
                    <a href="#" class="chat-box-close pull-right"><i class="glyphicon glyphicon-remove">
                    </i></a><span class="user-status is-online"></span><span class="display-name">Willard
                            Mckenzie</span> <small>Online</small>
                </div>
                <div class="chat-content">
                    <ul class="chat-box-body">
                        <li>
                            <p>
                                <img src="../../static/images/avatar/128.jpg" class="avt" /><span class="user">John Doe</span><span
                                    class="time">09:33</span></p>
                            <p>
                                Hi Swlabs, we have some comments for you.</p>
                        </li>
                        <li class="odd">
                            <p>
                                <img src="../../static/images/avatar/48.jpg" class="avt" /><span class="user">Swlabs</span><span
                                    class="time">09:33</span></p>
                            <p>
                                Hi, we're listening you...</p>
                        </li>
                    </ul>
                </div>
                <div class="chat-textarea">
                    <input placeholder="Type your message" class="form-control" /></div>
            </div>
        </div>
        <div id="page-wrapper">
            <!--BEGIN TITLE & BREADCRUMB PAGE-->
            <div id="title-breadcrumb-option-demo" class="page-title-breadcrumb">
                <div class="page-header pull-left">
                    <div class="page-title">设置</div>
                </div>
                <ol class="breadcrumb page-breadcrumb pull-right">
                    <li><i class="fa fa-home"></i>&nbsp;<a href="dashboard.html">Home</a>&nbsp;&nbsp;<i class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
                    <li class="hidden"><a href="#">Dashboard</a>&nbsp;&nbsp;<i class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
                    <li class="active">Dashboard</li>
                </ol>
                <div class="clearfix">
                </div>
            </div>
            <!--END TITLE & BREADCRUMB PAGE-->
            <!--BEGIN CONTENT-->
            <div class="page-content">
                <!-- 按钮 -->
                <div class="row">
                    <div class="col-md-3 col-md-offset-9">
                        <div class="form-group">
                            <div class="col-sm-1">
                                <button class="btn btn-success" id="set_add_modal_btn">保存</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- 信息修改 -->
                <div class="row">
                    <div class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">姓名：</label>
                            <div class="col-sm-3">
                                <input type="text" name="name" readonly="readonly" class="form-control" id="name_set_static" value="${customerSession.name }" />
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">修改密码：</label>
                            <div class="col-sm-3">
                                <input type="password" name="password" class="form-control" id="password_set_static" value="${customerSession.password }" />
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">再次确认密码：</label>
                            <div class="col-sm-3">
                                <input type="password" name="password1" class="form-control" id="password1_set_static" value="${customerSession.password }" />
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">性别：</label>
                            <div class="col-sm-3">
                                <label name="customer_date" class="control-label" id="sex_set_static">
                                    <c:if test="${ customerSession.sex == 'M' }">
                                        男
                                    </c:if>
                                    <c:if test="${ customerSession.sex == 'F' }">
                                        女
                                    </c:if>
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">过敏药物：</label>
                            <div class="col-sm-2">
                                <select type="text" name="allergy_select" class="form-control" id="allergy_select_static"></select>
                                <span class="help-block"></span>
                            </div>
                            <button class="btn btn-primary col-sm-1" id="allergy_add_btn">添加</button>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-2 col-sm-offset-2" id="allergy_div_static">
                                <input type='text' class='form-control tags' id="allergy_set_static" value="${customerSession.allergyMedicine}" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">入院时间：</label>
                            <div class="col-sm-3">
                                <label name="customer_date" class="control-label" id="date_set_static">${customerSession.customerDate }</label>
                                <span class="help-block"></span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--END CONTENT-->
        </div>
        <!--END PAGE WRAPPER-->
    </div>
</div>

<script type="text/javascript">

    var allergyList = $("#allergy_set_static").val();

    $(function () {
        //获取药品信息
        getMedicine("#allergy_select_static");
        //取病人信息
        getCustomer();

        $("#allergy_set_static").tagsInput({width:'350px;'});
    });

    //取病人信息
    function getCustomer(){
        $.ajax({
            url:"${APP_PATH}/customer",
            type:"GET",
            success:function(result){
                //显示药品信息在下拉列表
                $.each(result.extend.medicine,function(){
                    var optionEle = $("<option></option>").append(this.name).attr("value",this.id);
                    optionEle.appendTo(ele);
                });
            }
        });
    }

    //查出所有的药品信息并显示在下拉列表中
    function getMedicine(ele){
        //清空之前下拉列表的值
        $(ele).empty();
        $.ajax({
            url:"${APP_PATH}/medicine",
            type:"GET",
            success:function(result){
                //显示药品信息在下拉列表
                $.each(result.extend.medicine,function(){
                    var optionEle = $("<option></option>").append(this.name).attr("value",this.id);
                    optionEle.appendTo(ele);
                });
            }
        });
    }

    //添加药品tag
    $("#allergy_add_btn").click(function(){
        debugger;
        //取select中的值
        var allergy = $("#allergy_select_static").find("option:selected").text();
        allergyList = allergyList +  "," + allergy;
        $("#allergy_div_static").html("<input type='text' class='form-control tags' id='allergy_set_static' value='"+ allergyList +"'  />");
        $("#allergy_set_static").tagsInput({width:'350px;'});
    })

    //点击保存
    $("#set_add_modal_btn").click(function(){
        var data = {"password" : $("#password_set_static").val(), "allergyMedicine" : allergyList};
        $.ajax({
            url:"${APP_PATH}/updateCustomer",
            type:"GET",
            data:data,
            success:function(result){
                if(result.code == 100){
                    alert("保存成功！");
                }
            }
        });
    });


</script>

<script src="${APP_PATH}/static/script/jquery-1.10.2.min.js"></script>
<script src="${APP_PATH}/static/script/jquery-migrate-1.2.1.min.js"></script>
<script src="${APP_PATH}/static/script/jquery-ui.js"></script>
<script src="${APP_PATH}/static/script/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/script/bootstrap-hover-dropdown.js"></script>
<script src="${APP_PATH}/static/script/html5shiv.js"></script>
<script src="${APP_PATH}/static/script/respond.min.js"></script>
<script src="${APP_PATH}/static/script/jquery.metisMenu.js"></script>
<script src="${APP_PATH}/static/script/jquery.slimscroll.js"></script>
<script src="${APP_PATH}/static/script/jquery.cookie.js"></script>
<script src="${APP_PATH}/static/script/icheck.min.js"></script>
<script src="${APP_PATH}/static/script/custom.min.js"></script>
<script src="${APP_PATH}/static/script/jquery.news-ticker.js"></script>
<script src="${APP_PATH}/static/script/jquery.menu.js"></script>
<script src="${APP_PATH}/static/script/pace.min.js"></script>
<script src="${APP_PATH}/static/script/holder.js"></script>
<script src="${APP_PATH}/static/script/responsive-tabs.js"></script>
<script src="${APP_PATH}/static/script/jquery.flot.js"></script>
<script src="${APP_PATH}/static/script/jquery.flot.categories.js"></script>
<script src="${APP_PATH}/static/script/jquery.flot.pie.js"></script>
<script src="${APP_PATH}/static/script/jquery.flot.tooltip.js"></script>
<script src="${APP_PATH}/static/script/jquery.flot.resize.js"></script>
<script src="${APP_PATH}/static/script/jquery.flot.fillbetween.js"></script>
<script src="${APP_PATH}/static/script/jquery.flot.stack.js"></script>
<script src="${APP_PATH}/static/script/jquery.flot.spline.js"></script>
<script src="${APP_PATH}/static/script/zabuto_calendar.min.js"></script>
<script src="${APP_PATH}/static/script/index.js"></script>
<!--LOADING SCRIPTS FOR CHARTS-->
<script src="${APP_PATH}/static/script/highcharts.js"></script>
<script src="${APP_PATH}/static/script/data.js"></script>
<script src="${APP_PATH}/static/script/drilldown.js"></script>
<script src="${APP_PATH}/static/script/exporting.js"></script>
<script src="${APP_PATH}/static/script/highcharts-more.js"></script>
<script src="${APP_PATH}/static/script/charts-highchart-pie.js"></script>
<script src="${APP_PATH}/static/script/charts-highchart-more.js"></script>
<!--CORE JAVASCRIPT-->
<script src="${APP_PATH}/static/script/main.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/js/tag/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/js/tag/jquery.tagsinput.js"></script>
<script type='text/javascript' src='${APP_PATH }/static/js/tag/jquery-ui.min.js'></script>
</body>
</html>
