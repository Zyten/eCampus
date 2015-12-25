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
        <script type="text/javascript">

            $(document).ready(function () {

                $('#configureGrade').click(function () {
                    if (!$(this).is(':checked')) {
                        $('.conditionally-loaded').hide();
                    }
                    else {
                        $('.conditionally-loaded').show();
                    }
                });
                $('#configureGrade').click();
                $('#configureGrade').prop("checked", false);
            });
        </script>
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
                                        <small>Grading</small>
                                    </h3>
                                </header>
                            </div>

                        </div>
                    </div>
                </section>
                <section class="page container"><br><br><br>
                    <table>
                                        <thead>
                                            <tr>
                                                <td>Bil</td>
                                                <td>Code</td>
                                                <td>Assement</td>
                                                <td>Quiz</td>
                                                <td>Final</td>
                                            </tr>
                                        </thead>

                                        <tbody>
                                            <c:forEach items="${getList}" var="data" varStatus="loop">
                                                <tr>
                                                    <td>${loop.index+1}</td>
                                                    <td>${data.PCodemark}</td>
                                                    <td>${data.PAsmntmark}</td>
                                                    <td>${data.PQuizmark}</td>
                                                    <td>${data.PFinalmark}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>

                                    </table>
                    <form action='${pageContext.request.contextPath}/configuration_grade.htm' method='POST' id='programmeForm' class='form-signin' autocomplete='off'>
                        <table border="0" align="center">
                            <tr>
                                <td>
                                    <table border="0" align="center">
                                        <tr>
                                            <td>Programme Code
                                            </td>
                                            <td> : </td>
                                            <td><select name="pcode">
                                                    <option value="1001">1001</option>
                                                    <option value="1002">1002</option>
                                                    <option value="1003">1003</option>
                                                </select></td>
                                        </tr>
                                        <tr>
                                            <td>Assessment</td>
                                            <td> : </td>
                                            <td><input type="text" name="pasmnt" value="40" size="1"> % </td>
                                        </tr>
                                        <tr>
                                        <tr>
                                            <td>Quiz</td>
                                            <td> : </td>
                                            <td><input type="text" name="pquiz" value="10" size="1"> % </td>
                                        </tr>
                                        <tr>
                                            <td>Final</td>
                                            <td> : </td>
                                            <td><input type="text" name="pfinal" value="50" size="1"> % </td>
                                        </tr>
                                    </table>


                            </tr>
                            <tr align="right">
                                <td colspan="3"><input type="submit" value="Register">&nbsp;&nbsp;<input type="reset" value="Reset"><td>
                            </tr>
                        </table></form>
                    <br>
                    <a href="${pageContext.request.contextPath}/configuration.htm"><button>Back</button></a><br /><br/>
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
