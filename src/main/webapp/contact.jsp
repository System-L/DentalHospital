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
                        <li><a class="waves-effect waves-dark" href="index.jsp">??????</a></li>
                        <li><a class="waves-effect waves-dark" href="company.jsp">????????????</a></li>
                        <li><a class="waves-effect waves-dark" href="team.html">????????????</a></li>
                        <li><a class="waves-effect waves-dark" href="project.jsp">??????</a></li>
                        <li><a class="waves-effect waves-dark" href="pricing.jsp">????????????</a></li>
                        <li class="active"><a class="waves-effect waves-dark" href="contact.jsp">????????????</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header><!-- end header -->
    <section id="inner-headline">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="pageTitle">????????????</h2>
                </div>
            </div>
        </div>
    </section>
    <section id="content">

        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="about-logo">
                        <h3>??????<span class="color"> ??????</span></h3>
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
                            <label for="name" class=""> ?????? </label>
                            <input type="text" name="name" class="form-control" id="name" required
                                   data-validation-required-message="???????????????"/>
                            <p class="help-block"></p>

                        </div>
                        <div class="input-field">
                            <label for="name" class=""> ???????????? </label>
                            <input type="email" class="form-control" id="email" required
                                   data-validation-required-message="?????????????????????"/>
                        </div>

                        <div class="input-field">
                            <label for="name" class=""> ?????? </label>
                            <textarea rows="10" cols="100" required class="form-control materialize-textarea"
                                      idation-required-message="Please enter your message" minlength="5"
                                      data-validation-minlength-message="Min 5 characters"
                                      maxlength="999" style="resize:none"></textarea>
                        </div>
                        <div id="success"></div> <!-- For success/fail messages -->
                        <button type="submit" class="btn btn-primary waves-effect waves-dark pull-right old-btn">??????</button>
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
                            //?????????????????????????????????
                            function initMap(){
                                createMap();//????????????
                                setMapEvent();//??????????????????
                            }
                            //?????????????????????
                            function createMap(){
                                var map = new BMap.Map("gmap_canvas");//??????????????????????????????????????????
                                var point = new BMap.Point(120.208611,30.207899);//?????????????????????+(012) 345 6789
                                ??????
                                map.centerAndZoom(point,12);//?????????????????????????????????????????????????????????????????????
                                var marker = new BMap.Marker(point);  // ????????????
                                map.addOverlay(marker);
                                infoWindow = new BMap.InfoWindow("<p style='font-weight: bolder; text-align: center'>?????????</p><p style='font-weight: bolder; text-align: center'>?????????</p><p style='font-weight: bolder; text-align: center'>????????????888???</p>", {enableMessage: false,enableCloseOnClick:false});  // ????????????????????????
                                marker.openInfoWindow(infoWindow);
                                window.map = map;//???map?????????????????????
                            }

                            //???????????????????????????
                            function setMapEvent(){
                                map.enableDragging();//???????????????????????????????????????(?????????)
                                map.enableScrollWheelZoom();//??????????????????????????????
                                map.enableDoubleClickZoom();//???????????????????????????????????????(?????????)
                                map.enableKeyboard();//???????????????????????????????????????
                            }
                            initMap();  //????????????????????????
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
                            <li><a class="waves-effect waves-dark" href="#">??????</a></li>
                            <li><a class="waves-effect waves-dark" href="#">????????????</a></li>
                            <li><a class="waves-effect waves-dark" href="#">????????????</a></li>
                            <li><a class="waves-effect waves-dark" href="#">??????</a></li>
                            <li><a class="waves-effect waves-dark" href="#">????????????</a></li>
                            <li><a class="waves-effect waves-dark" href="#">????????????</a></li>
                        </ul>
                        </br>
                        <ul class="link-list" style="text-align: center">
                            <li>????????????????????????????????????????????????888???</li>
                            <li>???ICP???12345678??? ???????????????????????????2018??????88-88-088???</li>
                            <li>??????????????? 888888888888???</li>
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
                        <h5 class="widgetheading">????????????</h5>
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