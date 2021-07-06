<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>取药</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${APP_PATH }/static/images/icons/favicon.ico">
    <link rel="apple-touch-icon" href="${APP_PATH }/static/images/icons/favicon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="${APP_PATH }/static/images/icons/favicon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="${APP_PATH }/static/images/icons/favicon-114x114.png">
    <!--Loading bootstrap css-->
    <link type="text/css" rel="stylesheet"
          href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700">
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
    <link type="text/css" rel="stylesheet" href="${APP_PATH }/static/css/awesome-bootstrap-checkbox.css">
    <!-- js -->
    <script src="${APP_PATH }/static/js/jquery.js"></script>
</head>
<body>
<!-- 就诊记录查看的模态框 -->
<!-- Modal -->
<div class="modal fade" id="billGetModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">账单查看</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">患者姓名:</label>
                        <div class="col-sm-4">
                            <input type="text" readonly="readonly" name="customer" class="form-control" id="customer_get_input" />
                        </div>
                        <label class="col-sm-2 control-label">医生:</label>
                        <div class="col-sm-4">
                            <input type="text" readonly="readonly" name="docotor" class="form-control" id="doctor_get_input">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">药品清单:</label>
                        <div class="col-sm-10">
                            <textarea type="text" readonly="readonly" name="cost" class="form-control" id="medicine_get_input" style="height:100px;"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">医疗清单:</label>
                        <div class="col-sm-10">
                            <textarea type="text" readonly="readonly" name="cost" class="form-control" id="hospitalization_get_input" style="height:100px;"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">备注:</label>
                        <div class="col-sm-10">
                            <textarea name="remark" readonly="readonly" class="form-control" id="remark_get_input" style="height:200px;"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label col-md-push-8">费用(元):</label>
                        <div class="col-sm-2 col-md-push-8">
                            <input type="text" readonly="readonly" name="cost" class="form-control" id="cost_get_input">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
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

                    <li class="active"><a href="takeMedicine.jsp"><i class="glyphicon glyphicon-new-window">
                        <div class="icon-bg bg-blue"></div>
                    </i><span class="menu-title">开药</span></a>

                    <li><a href="medicineManage.jsp"><i class="glyphicon glyphicon-shopping-cart">
                        <div class="icon-bg bg-blue"></div>
                    </i><span class="menu-title">药房信息管理</span></a>

                    </li>
                    <li><a href="setting.jsp"><i class="glyphicon glyphicon-cog">
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
        <!--END CHAT FORM-->
        <!--BEGIN PAGE WRAPPER-->
        <div id="page-wrapper">
            <!--BEGIN TITLE & BREADCRUMB PAGE-->
            <div id="title-breadcrumb-option-demo" class="page-title-breadcrumb">
                <div class="page-header pull-left">
                    <div class="page-title">预约记录</div>
                </div>
                <ol class="breadcrumb page-breadcrumb pull-right">
                    <li><i class="fa fa-home"></i>&nbsp;<a href="dashboard.html">Home</a>&nbsp;&nbsp;<i
                            class="fa fa-angle-right"></i>&nbsp;&nbsp;
                    </li>
                    <li class="hidden"><a href="#">Dashboard</a>&nbsp;&nbsp;<i class="fa fa-angle-right"></i>&nbsp;&nbsp;
                    </li>
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
                    <div class="col-md-4 col-md-offset-7">
                        <div class="form-group">
                            <div class="col-sm-6">
                                <input type="text" name="customerName" class="form-control" id="customerName"/>
                            </div>
                            <div class="col-sm-1">
                                <button class="btn btn-primary" id="customerMsg_search_modal_btn">查询</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- 显示表格数据 -->
                <div class="row">
                    <div class="row">
                        <div class="col-md-12">
                            <table class="table table-hover" id="takeMedicine_table">
                                <thead>
                                <tr>
                                    <th>#</th>
                                    <th>患者姓名</th>
                                    <th>就诊医生</th>
                                    <th>账单</th>
                                    <th>时间</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <!-- 显示分页信息 -->
                <div class="row">
                    <!-- 分页文字信息 -->
                    <div class="col-md-6" id="page_info_area"></div>
                    <!-- 分页条信息 -->
                    <div class="col-md-6" id="page_nav_area"></div>
                </div>
            </div>
            <!--END CONTENT-->
        </div>
        <!--END PAGE WRAPPER-->
    </div>
</div>


<script type="text/javascript">

    //1、页面加载完成以后，直接去发送一个ajax请求，要到分页数据
    $(function () {
        //取首页
        to_page(1);
    });

    function to_page(pn) {
        var customerName = $("#customerName").val();
        if (customerName != "") {
            var Url = "${APP_PATH }/takeMedicine/search";
            var data = "pn=" + pn + "&customerName=" + customerName;
        } else {
            var Url = "${APP_PATH }/takeMedicine";
            var data = "pn=" + pn;
        }
        $.ajax({
            url: Url,
            data: data,
            type: "GET",
            success: function (result) {
                //1、解析并显示就诊记录数据
                build_takeMedicine_table(result);
                //2、解析并显示分页信息
                build_page_info(result);
                //3、解析显示分页条数据
                build_page_nav(result);
            }
        });
    };

    function build_takeMedicine_table(result) {
        //清空table表格
        $("#takeMedicine_table tbody").empty();
        var takeMedicine = result.extend.pageInfo.list;
        $.each(takeMedicine, function (index, item) {
            var IdTd = $("<td></td>").append(item.meetId);
            var customerNameTd = $("<td></td>").append(item.customerName);
            var doctorNameTd = $("<td></td>").append(item.doctor.name);
            var moreBtn = $("<button></button>").addClass("btn btn-primary btn-sm more_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-th-list")).append("详细信息");
            //为编辑按钮添加一个自定义的属性，来表示当前员工id
            moreBtn.attr("more-id",item.id);
            var dateTd = $("<td></td>").append(new Date(parseInt(item.date)).toLocaleDateString().replace(/:\d{1,2}$/, ' '));
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-ok")).append("确认");
            //为编辑按钮添加一个自定义的属性，来表示当前预约id
            editBtn.attr("edit-id", item.meetId);
            var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-remove")).append("取消");
            //为删除按钮添加一个自定义的属性，来表示当前预约id
            delBtn.attr("del-id", item.meetId);
            var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
            $("<tr></tr>").append(IdTd)
                .append(customerNameTd)
                .append(doctorNameTd)
                .append(moreBtn)
                .append(dateTd)
                .append(btnTd)
                .appendTo("#takeMedicine_table tbody");
        });
    }

    //解析显示分页信息
    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append(" 当前" + result.extend.pageInfo.pageNum + "页,总" +
            result.extend.pageInfo.pages + "页,总共" + result.extend.pageInfo.total + "条记录");
        totalRecord = result.extend.pageInfo.total;
        currentPage = result.extend.pageInfo.pageNum;
    }

    //解析显示分页条,点击分页要能去下一页....
    function build_page_nav(result) {
        $("#page_nav_area").empty();
        //page_nav_area
        var ul = $("<ul></ul>").addClass("pagination");
        //构建元素
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
        if (result.extend.pageInfo.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        } else {
            //为元素添加点击翻页的事件
            firstPageLi.click(function () {
                to_page(1);
            });
            prePageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum - 1);
            });
        }

        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href", "#"));
        if (result.extend.pageInfo.hasNextPage == false) {
            lastPageLi.addClass("disabled");
            nextPageLi.addClass("disabled");
        } else {
            lastPageLi.click(function () {
                to_page(result.extend.pageInfo.pages);
            });
            nextPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum + 1);
            });
        }

        //添加首页和前一页 的提示
        ul.append(firstPageLi).append(prePageLi);
        //1,2,3 遍历给ul中添加页码提示
        $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if (result.extend.pageInfo.pageNum == item) {
                numLi.addClass("active");
            }
            numLi.click(function () {
                to_page(item);
            });
            ul.append(numLi);
        });
        //添加下一页和末页 的提示
        ul.append(nextPageLi).append(lastPageLi);
        //把ul加入到nav元素
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }

    //根据患者 姓名查询信息
    $("#customerMsg_search_modal_btn").click(function () {
        to_page(1);
    });

    //查看详细信息
    $(document).on("click",".more_btn",function(){
        //查出显示账单信息
        getBill($(this).attr("more-id"));
        $("#billGetModal").modal({
            backdrop:"static"
        });
    });

    //获取就诊记录信息
    function getBill(id){
        $.ajax({
            url:"${APP_PATH}/takeMedicineBill/" + id,
            type:"GET",
            success:function(result){
                var billData = result.extend.bill;
                $("#customer_get_input").val(billData.customerName);
                $("#doctor_get_input").val(billData.doctor.name);
                $("#cost_get_input").val(billData.cost);
                $("#remark_get_input").val(billData.remark);
                $("#date_get_input").val(new Date(parseInt(billData.date)).toLocaleDateString().replace(/:\d{1,2}$/,' '));
                var medicine = "";
                for(var i=0; i<billData.medicineList.length; i++){
                    medicine = medicine + billData.medicineList[i].name + "                     " + billData.medicineList[i].num + "盒&#10";
                }
                $("#medicine_get_input").html(medicine);
                var hospitalization = "";
                for(var j=0; j<billData.hospitalizationList.length; j++){
                    hospitalization = hospitalization + billData.hospitalizationList[j].name + "                      " + billData.hospitalizationList[j].num + "次&#10";
                }
                $("#hospitalization_get_input").html(hospitalization);
            }
        })
    }

    //确认取药
    $(document).on("click",".edit_btn",function(){
        $.ajax({
            url:"${APP_PATH}/takeMedicine/" + $(this).attr("edit-id"),
            type:"GET",
            success:function(result) {
                if(result.code == 100){
                    alert("操作成功!");
                    window.location.href = "${APP_PATH }/ui/pharmacist/takeMedicine.jsp";
                }
            }
        })
    });

    //取消取药
    $(document).on("click",".delete_btn",function(){
        $.ajax({
            url:"${APP_PATH}/cancelMedicine/" + $(this).attr("del-id"),
            type:"GET",
            success:function(result) {
                if(result.code == 100){
                    alert("操作成功!");
                    window.location.href = "${APP_PATH }/ui/pharmacist/takeMedicine.jsp";
                }
            }
        })
    });

</script>
<script src="${APP_PATH }/static/script/jquery-1.10.2.min.js"></script>
<script src="${APP_PATH }/static/script/jquery-migrate-1.2.1.min.js"></script>
<script src="${APP_PATH }/static/script/jquery-ui.js"></script>
<script src="${APP_PATH }/static/script/bootstrap.min.js"></script>
<script src="${APP_PATH }/static/script/bootstrap-hover-dropdown.js"></script>
<script src="${APP_PATH }/static/script/html5shiv.js"></script>
<script src="${APP_PATH }/static/script/respond.min.js"></script>
<script src="${APP_PATH }/static/script/jquery.metisMenu.js"></script>
<script src="${APP_PATH }/static/script/jquery.slimscroll.js"></script>
<script src="${APP_PATH }/static/script/jquery.cookie.js"></script>
<script src="${APP_PATH }/static/script/icheck.min.js"></script>
<script src="${APP_PATH }/static/script/custom.min.js"></script>
<script src="${APP_PATH }/static/script/jquery.news-ticker.js"></script>
<script src="${APP_PATH }/static/script/jquery.menu.js"></script>
<script src="${APP_PATH }/static/script/pace.min.js"></script>
<script src="${APP_PATH }/static/script/holder.js"></script>
<script src="${APP_PATH }/static/script/responsive-tabs.js"></script>
<script src="${APP_PATH }/static/script/jquery.flot.js"></script>
<script src="${APP_PATH }/static/script/jquery.flot.categories.js"></script>
<script src="${APP_PATH }/static/script/jquery.flot.pie.js"></script>
<script src="${APP_PATH }/static/script/jquery.flot.tooltip.js"></script>
<script src="${APP_PATH }/static/script/jquery.flot.resize.js"></script>
<script src="${APP_PATH }/static/script/jquery.flot.fillbetween.js"></script>
<script src="${APP_PATH }/static/script/jquery.flot.stack.js"></script>
<script src="${APP_PATH }/static/script/jquery.flot.spline.js"></script>
<script src="${APP_PATH }/static/script/zabuto_calendar.min.js"></script>
<script src="${APP_PATH }/static/script/index.js"></script>
<!--LOADING SCRIPTS FOR CHARTS-->
<script src="${APP_PATH }/static/script/highcharts.js"></script>
<script src="${APP_PATH }/static/script/data.js"></script>
<script src="${APP_PATH }/static/script/drilldown.js"></script>
<script src="${APP_PATH }/static/script/exporting.js"></script>
<script src="${APP_PATH }/static/script/highcharts-more.js"></script>
<script src="${APP_PATH }/static/script/charts-highchart-pie.js"></script>
<script src="${APP_PATH }/static/script/charts-highchart-more.js"></script>
<!--CORE JAVASCRIPT-->
<script src="${APP_PATH }/static/script/main.js"></script>

</body>
</html>
