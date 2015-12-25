<%@include file="taglib.jsp" %> 
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
                                        <small>Register Program</small>
                                    </h3>
                                </header>
                            </div>

                        </div>
                    </div>
                </section>
                <section class="page container"><br>
                    <table border="0" align="center" class="table table-condensed" style="width:500px">
                        <thead>	
                        <th>No</td>
                        <th>Programme Code</th>
                        <th>Programme Name</th>
                        <th>Duration</th>
                        <th colspan="2">Action</th>
                        
                        </thead>
                        <tbody>
                            <c:forEach items="${progList}" var="item" varStatus="loop"><!-- tags from the prefix-->
                                <tr>
                                    <td>${loop.count}</td>
                                    <td>${item.progCodeIDprogramme}</td>
                                    <td>${item.progNameprogramme}</td>
                                    <td>${item.progDurationprogramme}</td>
                                    <td><a href="${pageContext.request.contextPath}/configuration_program_edit.htm?id=${item.progCodeIDprogramme}">Edit</a></td>
                                    <td><a href="${pageContext.request.contextPath}/configuration_program_delete.htm?id=${item.progCodeIDprogramme}">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                        <tfoot>
                            <tr align="right">
                                <td colspan="6"><br><a href="${pageContext.request.contextPath}/configuration_program_add.htm">Add</a></td>
                            </tr>
                        </tfoot>
                    </table><br><br>
                    <a href="${pageContext.request.contextPath}/configuration.htm"><button>Back</button></a><br /><br/>
                </section>
                <!--<tr>
                        <td>No</td>
                        <td>1002</td>
                        <td>Web Application</td>
                        <td>3 Months</td>
                        <td><a href="${pageContext.request.contextPath}/configuration_program_edit.htm">Edit</a></td>
                        <td><a href="#">Delete</a></td>
                </tr>-->


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
