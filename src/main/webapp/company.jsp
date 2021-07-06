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
    <link rel="stylesheet" href="static/materialize/css/materialize.min.css" media="screen,projection"/>
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
                        <li><a class="waves-effect waves-dark" href="services.html">医生团队</a></li>
                        <li><a class="waves-effect waves-dark" href="project.jsp">服务</a></li>
                        <li><a class="waves-effect waves-dark" href="pricing.jsp">收费标准</a></li>
                        <li><a class="waves-effect waves-dark" href="contact.jsp">联系我们</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header><!-- end header -->
    <section id="inner-headline">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="pageTitle">公司品牌</h2>
                </div>
            </div>
        </div>
    </section>
    <section id="content">
        <section class="section-padding">
            <div class="container">
                <div class="row showcase-section">
                    <div class="col-md-6">
                        <img src="static/img/dev1.png" alt="showcase image">
                    </div>
                    <div class="col-md-6">
                        <div class="about-text">
                            <h3>我们的<span class="color">公司</span></h3>
                            <p>Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium doloremque
                                laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
                                architecto beatae vitae dicta sunt explicabo. Vivamus suscipit tortor eget felis
                                porttitor volutpat. Cras ultricies ligula sed magna dictum porta. Mauris blandit aliquet
                                elit, eget tincidunt nibh pulvinar.</p>
                            <p>Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium doloremque
                                laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
                                architecto beatae vitae dicta sunt explicabo..</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <div class="container">
            <div class="about">
                <div class="row">
                    <div class="col-md-4">
                        <!-- Heading and para -->
                        <div class="block-heading-two">
                            <h3><span>为什么选择我们?</span></h3>
                        </div>
                        <p>Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium doloremque
                            laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
                            architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit
                            aspernatur. <br/><br/>Sed ut perspiciaatis iste natus error sit voluptatem probably haven't
                            heard of them accusamus.</p>
                    </div>
                    <div class="col-md-4">
                        <div class="block-heading-two">
                            <h3><span>我们的方案</span></h3>
                        </div>
                        <!-- Accordion starts -->
                        <div class="panel-group" id="accordion-alt3">
                            <!-- Panel. Use "panel-XXX" class for different colors. Replace "XXX" with color. -->
                            <div class="panel">
                                <!-- Panel heading -->
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3"
                                           href="#collapseOne-alt3">
                                            <i class="fa fa-angle-right"></i> Accordion Heading Text Item # 1
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseOne-alt3" class="panel-collapse collapse">
                                    <!-- Panel body -->
                                    <div class="panel-body">
                                        Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium
                                        doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore
                                        veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
                                        voluptatem quia voluptas
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3"
                                           href="#collapseTwo-alt3">
                                            <i class="fa fa-angle-right"></i> Accordion Heading Text Item # 2
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseTwo-alt3" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium
                                        doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore
                                        veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
                                        voluptatem quia voluptas
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3"
                                           href="#collapseThree-alt3">
                                            <i class="fa fa-angle-right"></i> Accordion Heading Text Item # 3
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseThree-alt3" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium
                                        doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore
                                        veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
                                        voluptatem quia voluptas
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3"
                                           href="#collapseFour-alt3">
                                            <i class="fa fa-angle-right"></i> Accordion Heading Text Item # 4
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseFour-alt3" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium
                                        doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore
                                        veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
                                        voluptatem quia voluptas
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Accordion ends -->

                    </div>

                    <div class="col-md-4">
                        <div class="block-heading-two">
                            <h3><span>我们的专长</span></h3>
                        </div>
                        <h6>Web Development</h6>
                        <div class="progress pb-sm">
                            <!-- White color (progress-bar-white) -->
                            <div class="progress-bar progress-bar-red" role="progressbar" aria-valuenow="40"
                                 aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                <span class="sr-only">40% Complete (success)</span>
                            </div>
                        </div>
                        <h6>Designing</h6>
                        <div class="progress pb-sm">
                            <div class="progress-bar progress-bar-green" role="progressbar" aria-valuenow="60"
                                 aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                <span class="sr-only">40% Complete (success)</span>
                            </div>
                        </div>
                        <h6>User Experience</h6>
                        <div class="progress pb-sm">
                            <div class="progress-bar progress-bar-lblue" role="progressbar" aria-valuenow="80"
                                 aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                <span class="sr-only">40% Complete (success)</span>
                            </div>
                        </div>
                        <h6>Development</h6>
                        <div class="progress pb-sm">
                            <div class="progress-bar progress-bar-yellow" role="progressbar" aria-valuenow="30"
                                 aria-valuemin="0" aria-valuemax="100" style="width: 30%">
                                <span class="sr-only">40% Complete (success)</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="about home-about">
                    <div class="container">

                        <div class="row">
                            <div class="col-md-4">
                                <div class="block-heading-two">
                                    <h3><span>特征</span></h3>
                                </div>
                                <div class="tab-section">
                                    <div class="s12">
                                        <ul class="tabs">
                                            <li class="tab col s4"><a href="#test1" class="waves-effect waves-dark">Test
                                                1</a></li>
                                            <li class="tab col s4"><a class="waves-effect waves-dark active"
                                                                      href="#test2">Test 2</a></li>
                                            <li class="tab col s4"><a href="#test3" class="waves-effect waves-dark">Test
                                                3</a></li>
                                        </ul>
                                    </div>
                                    <div id="test1" class="col s12 container">Ande omnis iste natus error sit voluptatem
                                        accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo
                                        inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo
                                        enim ipsam voluptatem quia voluptas sit aspernatur.
                                    </div>
                                    <div id="test2" class="col s12 container">Terspiciaatis unde omnis iste natus error
                                        sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa
                                        quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt
                                        explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur.
                                    </div>
                                    <div id="test3" class="col s12 container">Perspiciaatis unde omnis iste natus error
                                        sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa
                                        quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt
                                        explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur.
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="block-heading-two">
                                    <h3><span>最新消息</span></h3>
                                </div>
                                <!-- Accordion starts -->
                                <ul class="collapsible" id="accordionSection" data-collapsible="accordion">
                                    <li>
                                        <div class="collapsible-header active"><i
                                                class="material-icons">filter_drama</i>First
                                        </div>
                                        <div class="collapsible-body"><p>Perspiciaatis unde omnis iste natus error Nemo
                                            enim ipsam voluptatem quia voluptas sit aspernatur. sit voluptatem
                                            accusanti</p></div>
                                    </li>
                                    <li>
                                        <div class="collapsible-header"><i class="material-icons">place</i>Second</div>
                                        <div class="collapsible-body"><p>Nemo enim ipsam voluptatem quia voluptas sit
                                            aspernatur. Perspiciaatis unde omnis iste natus error sit voluptatem
                                            accusanti</p></div>
                                    </li>
                                    <li>
                                        <div class="collapsible-header"><i class="material-icons">whatshot</i>Third
                                        </div>
                                        <div class="collapsible-body"><p>Perspiciaatis Nemo enim ipsam voluptatem quia
                                            voluptas sit aspernatur. unde omnis iste natus error sit voluptatem
                                            accusanti</p></div>
                                    </li>
                                </ul>
                                <!-- Accordion ends -->

                            </div>

                            <div class="col-md-4">
                                <div class="block-heading-two">
                                    <h3><span>荣誉</span></h3>
                                </div>
                                <div class="testimonials">
                                    <div class="active item">
                                        <blockquote><p>Lorem ipsum dolor met consectetur adipisicing. Aorem psum dolor
                                            met consectetur adipisicing sit amet, consectetur adipisicing elit, of them
                                            jean shorts sed magna aliqua. Lorem ipsum dolor met.</p></blockquote>
                                        <div class="carousel-info">
                                            <img alt="" src="static/img/team4.jpg" class="pull-left">
                                            <div class="pull-left">
                                                <span class="testimonials-name">Marc Cooper</span>
                                                <span class="testimonials-post">Technical Director</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>

                        <br>
                    </div>
                </div>


                <br>
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