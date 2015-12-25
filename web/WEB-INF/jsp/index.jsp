<%@include file="taglib.jsp" %> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en"><head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>GATES Academy</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <meta name="layout" content="main">
<!-- Favicon-->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/portal/img/favicon.ico" />

        <script type="text/javascript" src="http://www.google.com/jsapi"></script>

        <script src="${pageContext.request.contextPath}/js/jquery/jquery-1.8.2.min.js" type="text/javascript"></script>
        <link href="${pageContext.request.contextPath}/css/customize-template.css" type="text/css" media="screen, projection" rel="stylesheet">

        <style>
        </style>
    </head>
    <body>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <button class="btn btn-navbar" data-toggle="collapse" data-target="#app-nav-top-bar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="" class="brand"> <span>&nbsp;GATES ACADEMY</span></a>
                </div>
            </div>
        </div>
        <div id="body-container">
            <div id="body-content">

               
                <div class="container">

                    <div class="signin-row row">
                        <div class="span4"></div>
                        <div class="span8">
                            <div class="container-signin">
                                <legend>Please Login</legend>
                                <form action="${pageContext.request.contextPath}/login.htm" method="POST" id="loginForm" class="form-signin" autocomplete="off">
                                    <div class="form-inner">
                                        <div class="input-prepend">

                                            <span class="add-on" rel="tooltip" title="Username or E-Mail Address" data-placement="top"><i class="icon-envelope"></i></span>
                                            <input type="text" class="span4" name="username" id="username">
                                        </div>

                                        <div class="input-prepend">

                                            <span class="add-on"><i class="icon-key"></i></span>
                                            <input type="password" class="span4" name="password" id="password">
                                        </div>
                                        <label class="checkbox" for="remember_me">Remember me
                                            <input type="checkbox" id="remember_me">
                                        </label>
                                    </div>
                                    <footer class="signin-actions">
                                        <input class="btn btn-primary" type="submit" id="submit" value="Login">
                                    </footer>
                                </form>
                            </div>
                        </div>
                        <div class="span3"></div>
                    </div>

                </div>


            </div>
        </div>

        <div id="spinner" class="spinner" style="display:none;">
            Loading…
        </div>

    <footer class="application-footer">
        <div class="container">
        
            <div class="disclaimer">
 <p>&copy; 2015 Copyright - GATES Academy.</p>
            </div>
        </div>
    </footer>
    <script type="text/javascript">
        $(function () {
            document.forms['loginForm'].elements['j_username'].focus();
            $('body').addClass('pattern pattern-sandstone');
            $("[rel=tooltip]").tooltip();
        });
    </script>
 



</body></html>

