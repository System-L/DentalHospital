<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <!-- css -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="materialize/css/materialize.min.css" media="screen,projection"/>
    <link href="static/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="static/css/fancybox/jquery.fancybox.css" rel="stylesheet">
    <link href="static/css/flexslider.css" rel="stylesheet"/>
    <link href="static/css/style.css" rel="stylesheet"/>

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>
<body>
<div id="wrapper">
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
                <div class="col-sm-9">
                    <div class="row">
                        <ul class="info">

                            <li>
                                <i class="icon-info-blocks material-icons">perm_phone_msg</i><span>+(012) 345 6789</span>
                            </li>
                        </ul>
                        <div class="clr"></div>
                    </div>
                </div>
                <!-- info -->

            </div>
        </div>
    </header>

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
                    <a class="navbar-brand" href="index.jsp"><i
                            class="icon-info-blocks material-icons">account_balance</i>Health <b>Plus</b></a>
                </div>
                <div class="navbar-collapse collapse ">
                    <ul class="nav navbar-nav">
                        <li><a class="waves-effect waves-dark" href="index.jsp">主页</a></li>
                        <li><a class="waves-effect waves-dark" href="company.jsp">公司品牌</a></li>
                        <li><a class="waves-effect waves-dark" href="team.html">医生团队</a></li>
                        <li><a class="waves-effect waves-dark" href="project.jsp">服务</a></li>
                        <li><a class="waves-effect waves-dark" href="pricing.jsp">收费标准</a></li>
                        <li class="active"><a class="waves-effect waves-dark" href="contact.jsp">联系我们</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header><!-- end header -->
    <section id="inner-headline">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="pageTitle">联系我们</h2>
                </div>
            </div>
        </div>
    </section>
    <section id="content">

        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="about-logo">
                        <h3>联系<span class="color"> 方式</span></h3>
                        <p>Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium doloremque
                            laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
                            architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas</p>
                        <p>Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium doloremque
                            laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
                            architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <p></p>

                    <!-- Form itself -->
                    <form name="sentMessage" id="contactForm" novalidate>
                        <div class="input-field">
                            <label for="name" class=""> 姓名 </label>
                            <input type="text" name="name" class="form-control" id="name" required
                                   data-validation-required-message="请输入姓名"/>
                            <p class="help-block"></p>

                        </div>
                        <div class="input-field">
                            <label for="name" class=""> 电子邮箱 </label>
                            <input type="email" class="form-control" id="email" required
                                   data-validation-required-message="请输入电子邮箱"/>
                        </div>

                        <div class="input-field">
                            <label for="name" class=""> 内容 </label>
                            <textarea rows="10" cols="100" required class="form-control materialize-textarea"
                                      idation-required-message="Please enter your message" minlength="5"
                                      data-validation-minlength-message="Min 5 characters"
                                      maxlength="999" style="resize:none"></textarea>
                        </div>
                        <div id="success"></div> <!-- For success/fail messages -->
                        <button type="submit" class="btn btn-primary waves-effect waves-dark pull-right old-btn">发送</button>
                        <br/>
                    </form>
                </div>
                <div class="col-md-6">
                    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=FrWDoK3GtVlKXR8wIVzPzdwmZXdVYy93"></script>
                    <div style="overflow:hidden;height:500px;width:600px;">
                        <div id="gmap_canvas" style="height:500px;width:600px;"></div>
                        <style>#gmap_canvas img {
                            max-width: none !important;
                            background: none !important
                        }</style>
                    <script type="text/javascript">
                            //创建和初始化地图函数：
                            function initMap(){
                                createMap();//创建地图
                                setMapEvent();//设置地图事件
                            }
                            //创建地图函数：
                            function createMap(){
                                var map = new BMap.Map("gmap_canvas");//在百度地图容器中创建一个地图
                                var point = new BMap.Point(120.208611,30.207899);//定义一个中心点+(012) 345 6789
                                坐标
                                map.centerAndZoom(point,12);//设定地图的中心点和坐标并将地图显示在地图容器中
                                var marker = new BMap.Marker(point);  // 创建标注
                                map.addOverlay(marker);
                                infoWindow = new BMap.InfoWindow("<p style='font-weight: bolder; text-align: center'>杭州市</p><p style='font-weight: bolder; text-align: center'>萧山区</p><p style='font-weight: bolder; text-align: center'>广场南路888号</p>", {enableMessage: false,enableCloseOnClick:false});  // 创建信息窗口对象
                                marker.openInfoWindow(infoWindow);
                                window.map = map;//将map变量存储在全局
                            }

                            //地图事件设置函数：
                            function setMapEvent(){
                                map.enableDragging();//启用地图拖拽事件，默认启用(可不写)
                                map.enableScrollWheelZoom();//启用地图滚轮放大缩小
                                map.enableDoubleClickZoom();//启用鼠标双击放大，默认启用(可不写)
                                map.enableKeyboard();//启用键盘上下左右键移动地图
                            }
                            initMap();  //创建和初始化地图
                    </script>
                </div>
            </div>
        </div>
        </div>
    </section>
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-sm-3" style="border-right:1px solid black">
                    <div class="widget">
                        <img src="static/img/footer_logo.jpg" alt="Footer Logo">
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
                        </ul>
                        </br>
                        <ul class="link-list" style="text-align: center">
                            <li>医院地址：杭州市青山湖区广场南路888号</li>
                            <li>浙ICP备12345678号 （浙）（杭）医广【2018】第88-88-088号</li>
                            <li>浙公网安备 888888888888号</li>
                        </ul>
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-sm-3">-->
                        <!--<div class="widget">-->
                        <!--<h5 class="widgetheading">Latest posts</h5>-->
                        <!--<ul class="link-list">-->
                        <!--<li><a class="waves-effect waves-dark" href="#">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></li>-->
                        <!--<li><a class="waves-effect waves-dark" href="#">Pellentesque et pulvinar enim. Quisque at tempor ligula</a></li>-->
                        <!--<li><a class="waves-effect waves-dark" href="#">Natus error sit voluptatem accusantium doloremque</a></li>-->
                        <!--</ul>-->
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="widget">
                        <h5 class="widgetheading">咨询电话</h5>
                        <h2>0791-3509666311</h2>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</div>
<a href="#" class="scrollup waves-effect waves-dark"><i class="fa fa-angle-up active"></i></a>
<!-- javascript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="static/js/jquery.js"></script>
<script src="static/js/jquery.easing.1.3.js"></script>
<script src="static/materialize/js/materialize.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script src="static/js/jquery.fancybox.pack.js"></script>
<script src="static/js/jquery.fancybox-media.js"></script>
<script src="static/js/jquery.flexslider.js"></script>
<script src="static/js/animate.js"></script>
<!-- Vendor Scripts -->
<script src="static/js/modernizr.custom.js"></script>
<script src="static/js/jquery.isotope.min.js"></script>
<script src="static/js/jquery.magnific-popup.min.js"></script>
<script src="static/js/animate.js"></script>
<script src="static/js/custom.js"></script>
</body>
</html>