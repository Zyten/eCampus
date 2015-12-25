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
                        <h3>Registration<br/>
                            <small>Details of New Student</small>
                        </h3>
                    </header>
                </div>
                
            </div>
        </div>
    </section>
    <section class="page container">
		<form action="${pageContext.request.contextPath}/registration_view.htm" method="post">  
		<table border="0" align="center" style="width:430px">
                <c:forEach items="${myList}" var="item">
			<tr>
				<td>Name</td>
				<td> : </td>
                                <td><input type="hidden" name="aname" value="${item.nameApplicant}">${item.nameApplicant}</td>
			</tr>
			<tr>
				<td>NRIC</td>
				<td> : </td>
				<td><input type="hidden" name="nric" value="${item.nricApplicant}">${item.nricApplicant}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td> : </td>
				<td><input type="hidden" name="email" value="${item.emailApplicant}">${item.emailApplicant}</td>
			</tr>
			<tr>
				<td>Race</td>
				<td> : </td>
				<td><input type="hidden" name="race" value="${item.raceApplicant}">${item.raceApplicant}</td>
			</tr>
			<tr>
				<td>Mobile Phone</td>
				<td> : </td>
				<td><input type="hidden" name="phone" value="${item.phoneApplicant}">${item.phoneApplicant}</td>
			</tr>
			<tr>
				<td>Address</td>
				<td> : </td>
				<td><input type="hidden" name="address" value="${item.addressApplicant}">${item.addressApplicant}</td>
			</tr>
			<tr>
				<td>Level Of Education</td>
				<td> : </td>
				<td><input type="hidden" name="edulvl" value="${item.edulvlApplicant}">${item.edulvlApplicant}</td>
			</tr>
			<tr>
				<td>Latest Result</td>
				<td> : </td>
				<td><input type="hidden" name="result" value="${item.resultApplicant}">${item.resultApplicant}</td>
			</tr>
			<tr>
				<td>Programme Code</td>
				<td> : </td>
				<td><input type="hidden" name="pcode" value="${item.pcodeApplicant}">${item.pcodeApplicant}</td>
			</tr>
			<tr>
				<td>Approval</td>
				<td> : </td>
				<td><select name="approve">
				  <option value="1">Approve</option>
				  <option value="2">Decline</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td>  </td>
				<td></td>
			</tr>
			<tr>
				<td colspan="3"><center><input type="submit" value="Update"><br>
				<!--<a href="${pageContext.request.contextPath}/registration_approve.htm">A</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/registration_decline.htm">D</a>--></center></td>
				
			</tr>
                        </c:forEach>
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
                <p>Application Footer</p>
                <div class="disclaimer">
                    <p>This is an example disclaimer. All right reserved.</p>
                    <p>Copyright © keaplogik 2011-2012</p>
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
