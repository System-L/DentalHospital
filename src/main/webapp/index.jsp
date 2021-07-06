<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>牙科医院</title>
	<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
	%>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	<!-- css -->
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link href="${APP_PATH }/static/css/bootstrap.min.css" rel="stylesheet" />
	<link href="${APP_PATH }/static/css/fancybox/jquery.fancybox.css" rel="stylesheet">
	<link href="${APP_PATH }/static/css/flexslider.css" rel="stylesheet" />
	<link href="${APP_PATH }/static/css/style.css" rel="stylesheet" />
	<!-- js -->
	<script src="${APP_PATH }/static/js/jquery.js"></script>
</head>
<body>
<div id="wrapper" class="home-page">
	<!-- start topbar -->
	<header class="topbar">
		<div class="container">
			<div class="row">
				<!-- social icon-->
				<div class="col-sm-3">
				   <ul class="social-network">
					<li><a class="waves-effect waves-dark" href="#"><i class="fa fa-facebook"></i></a></li>
					<li><a class="waves-effect waves-dark" href="#"><i class="fa fa-twitter"></i></a></li>
					<li><a class="waves-effect waves-dark" href="#"><i class="fa fa-linkedin"></i></a></li>
					<li><a class="waves-effect waves-dark" href="#"><i class="fa fa-pinterest"></i></a></li>
					<li><a class="waves-effect waves-dark" href="#"><i class="fa fa-google-plus"></i></a></li>
				</ul>
				</div>
				<!-- login Modal -->
				<div class="modal fade" id="userLoginModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								<h4 class="modal-title">登录</h4>
							</div>
							<div class="modal-body">
								<form class="form-horizontal">
									<div class="form-group">
										<label class="col-sm-3 control-label">用户姓名：</label>
										<div class="col-sm-6">
											<input type="text" name="name" class="form-control" id="name_login_static" />
											<span class="help-block"></span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">用户密码：</label>
										<div class="col-sm-6">
											<input type="password" name="password" class="form-control" id="password_login_static" />
											<span class="help-block"></span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-5 control-label" id="errorMsg" style="color:red;"></label>
									</div>
								</form>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
								<button type="button" class="btn btn-primary" id="user_login_btn">登录</button>
							</div>
						</div>
					</div>
				</div>

				<!-- register Modal -->
				<div class="modal fade" id="userRegisterModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								<h4 class="modal-title">注册</h4>
							</div>
							<div class="modal-body">
								<form class="form-horizontal">
									<div class="form-group">
										<label class="col-sm-3 control-label">用户姓名：</label>
										<div class="col-sm-6">
											<input type="text" name="name" class="form-control" id="name_register_input">
											<span class="help-block"></span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">用户密码：</label>
										<div class="col-sm-6">
											<input type="text" name="password" class="form-control" id="password_register_input">
											<span class="help-block"></span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">性别：</label>
										<div class="col-sm-6">
											<label class="radio-inline">
												<input type="radio" name="sex" id="sex_register_input" value="M" checked="checked"> 男
											</label>
											<label class="radio-inline">
												<input type="radio" name="sex" id="sex2_register_input" value="F"> 女
											</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">年龄：</label>
										<div class="col-sm-6">
											<input type="text" name="age" class="form-control" id="age_register_input">
											<span class="help-block"></span>
										</div>
									</div>
								</form>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
								<button type="button" class="btn btn-primary" id="user_register_btn">注册</button>
							</div>
						</div>
					</div>
				</div>

				<div class="col-sm-9">
					<div class="row">
						<ul class="info" style="list-style: none">
							<li><i class="icon-info-blocks material-icons">perm_phone_msg</i><span>+(0791) 350 6661</span></li>
							<%
								if(session.getAttribute("customerSession") == null){
							%>
							<li><button class="btn btn-warning" id="user_register_modal_btn"><i class="glyphicon glyphicon-pencil"></i><span>注册</span></button></li>
								<li><button class="btn btn-success" id="user_login_modal_btn"><i class="glyphicon glyphicon-user"></i><span>登录</span></button></li>
							<%
								}else{
							%>
								<li><button class="btn btn-warning" id="user_login_out_btn"><i class="glyphicon glyphicon-log-out"></i><span>退出</span></button></li>
							<li><button class="btn btn-success" id="user_center_btn" onclick="javascript:window.location.href='ui/customer/index.jsp';"><i class="glyphicon glyphicon-home"></i><span>个人中心</span></button></li>
							<%
								}
							%>
						</ul>
						<div class="clr"></div>
					</div>
				</div>
				<!-- info -->
			</div>
		</div>
	</header>
	<!-- end topbar -->

	<!-- start header -->
	<header>
        <div class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp"><i class="icon-info-blocks material-icons">account_balance</i>Health <b>Plus</b></a>
                </div>
                <div class="navbar-collapse collapse ">
                    <ul class="nav navbar-nav">
                        <li class="active"><a class="waves-effect waves-dark" href="index.jsp">主页</a></li>
						<li><a class="waves-effect waves-dark" href="company.jsp">公司品牌</a></li>
						<li><a class="waves-effect waves-dark" href="team.jsp">医生团队</a></li>
                        <li><a class="waves-effect waves-dark" href="project.jsp">服务</a></li>
                        <li><a class="waves-effect waves-dark" href="pricing.jsp">收费标准</a></li>
                        <li><a class="waves-effect waves-dark" href="contact.jsp">联系我们</a></li>
                    </ul>
                </div>
            </div>
        </div>
	</header>
	<!-- end header -->

	<section id="banner">
	 
	<!-- Slider -->
        <div id="main-slider" class="flexslider">
            <ul class="slides">
              <li>
                <img src="${APP_PATH }/static/img/slides/1.jpg" alt="" />
                <div class="flex-caption">
                    <h3>医生咨询</h3>
					<p>你可以相信我们</p>
					 
                </div>
              </li>
              <li>
                <img src="${APP_PATH }/static/img/slides/2.jpg" alt="" />
                <div class="flex-caption">
                    <h3>合格的医生</h3>
					<p>你可以相信我们</p>
                </div>
              </li>
            </ul>
        </div>
	<!-- end slider --> 
	</section>  
	<section class="dishes">
		<div class="container">
	 	<div class="row">
			<div class="col-md-12">
				<div class="aligncenter"><h2 class="aligncenter">全天候服务</h2>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt eius magni provident, <br/>doloribus omnis minus ovident, doloribus omnis minus temporibus perferendis nesciunt..</div>
				<br/>
			</div>
		</div>
	
	<div class="row service-v1 margin-bottom-40">
            <div class="col-md-4 md-margin-bottom-40">
					<div class="card small">
                        <div class="card-image">
                             <img class="img-responsive" src="${APP_PATH }/static/img/service1.jpg" alt="">
                            <span class="card-title">医疗咨询</span>
                        </div>
                        <div class="card-content">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt
                            </p>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt
                            </p>
                        </div>
                    </div>        
            </div>
			   <div class="col-md-4 md-margin-bottom-40">
					<div class="card small">
                        <div class="card-image">
                             <img class="img-responsive" src="${APP_PATH }/static/img/service2.jpg" alt="">
                            <span class="card-title">医生团队</span>
                        </div>
                        <div class="card-content">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt
                            </p>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt
                            </p>
                        </div>
                    </div>        
            </div>
			   <div class="col-md-4 md-margin-bottom-40">
					<div class="card small">
                        <div class="card-image">
                             <img class="img-responsive" src="${APP_PATH }/${APP_PATH }/static/img/service3.jpg" alt="">
                            <span class="card-title">经典项目</span>
                        </div>
                        <div class="card-content">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt
                            </p>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt
                            </p>
                        </div>
                    </div>        
            </div> 
        </div>
		</div>
		</section>
	<section class="section-padding gray-bg">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="section-title text-center">
						<h2>关于我们</h2>
						<p>Curabitur aliquet quam id dui posuere blandit. Donec sollicitudin molestie malesuada Pellentesque <br>ipsum id orci porta dapibus. Vivamus suscipit tortor eget felis porttitor volutpat.</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6 col-sm-6">
					<div class="about-text">
						<p>Grids is a responsive Multipurpose Template. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur aliquet quam id dui posuere blandit. Donec sollicitudin molestie malesuada. Pellentesque in ipsum id orci porta dapibus. Vivamus suscipit tortor eget felis porttitor volutpat.</p>

						<ul class="withArrow">
							<li><span class="fa fa-angle-right"></span> Lorem ipsum dolor sit amet</li>
							<li><span class="fa fa-angle-right"></span> consectetur adipiscing elit</li>
							<li><span class="fa fa-angle-right"></span> Curabitur aliquet quam id dui</li>
							<li><span class="fa fa-angle-right"></span> Donec sollicitudin molestie malesuada.</li>
						</ul>
						<a href="#" class="btn btn-primary waves-effect waves-dark old-btn">更多</a>
					</div>
				</div>
				<div class="col-md-6 col-sm-6">
					<div class="about-image">
						<img src="${APP_PATH }/static/img/about.jpg" alt="About Images">
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- start footer -->
	<footer>
	<div class="container">
		<div class="row">
			<div class="col-sm-3" style="border-right:1px solid black">
				<div class="widget">
					<img src="${APP_PATH }/static/img/footer_logo.jpg" alt="Footer Logo">
				</div>
			</div>
			<div class="col-sm-6" style="border-right:1px solid black">
				<div class="widget">
					<!--<h5 class="widgetheading">Quick Links</h5>-->
					<ul class="widgetheading list-inline" style="text-align: center">
						<li><a class="waves-effect waves-dark" href="#">主页</a></li>
						<li><a class="waves-effect waves-dark" href="#">公司品牌</a></li>
						<li><a class="waves-effect waves-dark" href="#">医生团队</a></li>
						<li><a class="waves-effect waves-dark" href="#">服务</a></li>
						<li><a class="waves-effect waves-dark" href="#">收费标准</a></li>
						<li><a class="waves-effect waves-dark" href="#">联系我们</a></li>
					</ul></br>
					<ul class="link-list" style="text-align: center">
						<li>医院地址：杭州市青山湖区广场南路888号</li>
						<li>浙ICP备12345678号 （浙）（杭）医广【2018】第88-88-088号</li>
						<li>浙公网安备 888888888888号</li>
					</ul>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="widget">
					<h5 class="widgetheading">咨询电话</h5>
					<h2>0791- 350 6661</h2>
				</div>
			</div>
		</div>
	</div>
	</footer>
	<!-- end footer -->
</div>
<a href="#" class="scrollup waves-effect waves-dark"><i class="fa fa-angle-up active"></i></a>

<script type="text/javascript">
	//点击登录按钮弹出模态框。
	$("#user_login_modal_btn").click(function(){
		//清空错误信息
		$("#errorMsg").text("");
		//弹出模态框
		$("#userLoginModal").modal({
			backdrop:"static"
		});
	});
	//点击注册按钮弹出模态框。
	$("#user_register_modal_btn").click(function(){
		//弹出模态框
		$("#userRegisterModal").modal({
			backdrop:"static"
		});
	});
	//登录
	$("#user_login_btn").click(function(){
		$.ajax({
			url:"${APP_PATH }/login",
			type:"POST",
			data:{"name":$("#name_login_static").val(),"password":$("#password_login_static").val()},
			success:function(result){
				debugger;
				if(result.code == 100){
					window.location.href = "index.jsp";
				}else{
					$("#errorMsg").text("用户名或密码错误！");
				}
			}
		});
	})
	//登出
	$("#user_login_out_btn").click(function(){
		$.ajax({
			url:"${APP_PATH}/loginOut",
			type:"POST",
			success:function(result){
				window.location.href = "index.jsp";
			}
		})
	})
	//注册
	$("#user_register_btn").click(function(){
		$.ajax({
			url:"${APP_PATH}/register",
			type:"POST",
			data:{},
			success:function(result){
				window.location.href = "index.jsp";
			}
		})
	})
</script>

<!-- javascript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="${APP_PATH }/static/js/jquery.js"></script>
<script src="${APP_PATH }/static/js/jquery.easing.1.3.js"></script>
<script src="${APP_PATH }/static/materialize/js/materialize.min.js"></script>
<script src="${APP_PATH }/static/js/bootstrap.min.js"></script>
<script src="${APP_PATH }/static/js/jquery.fancybox.pack.js"></script>
<script src="${APP_PATH }/static/js/jquery.fancybox-media.js"></script>
<script src="${APP_PATH }/static/js/jquery.flexslider.js"></script>
<script src="${APP_PATH }/static/js/animate.js"></script>
<!-- Vendor Scripts -->
<script src="${APP_PATH }/static/js/modernizr.custom.js"></script>
<script src="${APP_PATH }/static/js/jquery.isotope.min.js"></script>
<script src="${APP_PATH }/static/js/jquery.magnific-popup.min.js"></script>
<script src="${APP_PATH }/static/js/animate.js"></script>
<script src="${APP_PATH }/static/js/custom.js"></script>
</body>
</html>