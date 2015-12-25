<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GATES Academy</title>

<!-- Favicon-->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/portal/img/favicon.ico" />

        <link href="${pageContext.request.contextPath}/css/customize-template.css" rel="stylesheet" />
        <script src="${pageContext.request.contextPath}/js/jquery/jquery-1.8.2.min.js" type="text/javascript"></script>
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

                    <div id="app-nav-top-bar" class="nav-collapse">
                        <ul class="nav pull-right">
                            <li>
                                <a href="${pageContext.request.contextPath}/logout.htm">Logout</a>
                            </li>

                        </ul> 
                    </div>
                </div>
            </div>
        </div>

        <div id="body-container">
            <div id="body-content">
                
                    <div class="body-nav body-nav-horizontal body-nav-fixed">
                        <div class="container">
                            <ul>
                               <li>
                                <a href="${pageContext.request.contextPath}/dashboard.htm">
                                    <i class="icon-dashboard icon-large"></i> Dashboard
                                </a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/registration.htm">
                                    <i class="icon-user icon-large"></i> Registration
                                </a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/certificate.htm">
                                    <i class="icon-certificate icon-large"></i> Certificate
                                </a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/configuration.htm">
                                    <i class="icon-cogs icon-large"></i> Configuration
                                </a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/attendance.htm">
                                    <i class="icon-calendar icon-large"></i> Attendance
                                </a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/mark.htm">
                                    <i class="icon-adjust icon-large"></i> Grading
                                </a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/application.htm">
                                    <i class="icon-bar-chart icon-large"></i> Application
                                </a>
                            </li>
                            </ul>
                        </div>
                    </div>
                
                
        <section class="nav nav-page">
        <div class="container">
            <div class="row">
                <div class="span7">
                    <header class="page-header">
                        <h3>Configuration<br/>
                            <small>Add Programme</small>
                        </h3>
                    </header>
                </div>
                
            </div>
        </div>
    </section>
                                        
    <section class="page container"><br><br><br>
        <form role="form" action="${pageContext.request.contextPath}/configuration_program_add.htm" method="post" class="registration-form">
		<table border="0" align="center">
			<tr>
				<td>Programme Code</td>
				<td> : </td>
				<td><input name="pcode" type="text" value=""></td>
			</tr>
			<tr>
				<td>Programme Name</td>
				<td> : </td>
				<td><input name="pname" type="text" value=""></td>
			</tr>
			<tr>
				<td>Course Duration (Months)</td>
				<td> : </td>
				<td><input name="duration" type="text" value=""></td>
			</tr>
			<tr align="right">
                            <td colspan="3"><input type="submit" value="Add"></a>&nbsp;&nbsp;<input type="reset" name="reset" value="Reset"></td>
			</tr>
		</table>
        </form>
    </section>

    

            </div>
        </div>

        <div id="spinner" class="spinner" style="display:none;">
            Loading&hellip;
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
            $('#sample-table').tablesorter();
            $('#datepicker').datepicker();
            $(".chosen").chosen();
        });
    </script>
</body>

</html>
