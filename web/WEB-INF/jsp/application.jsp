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
                                    <h3>Application<br/>
                                        <small>Temp Application page</small>
                                    </h3>
                                </header>
                            </div>

                        </div>
                    </div>
                </section>
                <section class="page container">
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">

                            <form role="form" action="${pageContext.request.contextPath}/application.htm" method="post" class="registration-form">

                                <fieldset align="center">
                                    <div class="form-top">
                                        <div class="form-top-left">
                                            <h3>Step 1 / 3</h3>
                                            <p>Tell us who you are:</p>
                                        </div>
                                        <div class="form-top-right">
                                            <i class="fa fa-user"></i>
                                        </div>
                                    </div>
                                    <div class="form-bottom">
                                        <div class="form-group">
                                            <label class="sr-only" for="form-first-name">First name</label>
                                            <input type="text" name="aname" placeholder="First name" class="form-first-name form-control" id="form-first-name">
                                        </div>
                                        <div class="form-group">
                                            <label class="sr-only" for="form-nric">IC Number</label>
                                            <input type="text" name="nric" placeholder="IC Number" class="form-nric form-control" id="form-nric">
                                        </div>
                                        <div class="form-group">
                                            <label class="sr-only" for="form-email">Email</label>
                                            <input type="text" name="email" placeholder="Email" class="form-email form-control" id="form-email">
                                        </div>
                                    </div>
                                </fieldset>
                                <br><br>
                                <fieldset align="center">
                                    <div class="form-top">
                                        <div class="form-top-left">
                                            <h3>Step 2 / 3</h3>
                                            <p>Background Information:</p>
                                        </div>
                                        <div class="form-top-right">
                                            <i class="fa fa-key"></i>
                                        </div>
                                    </div>
                                    <div class="form-bottom">
                                        <div class="form-group">
                                            <label class="sr-only" for="form-race">Race</label>
                                            <input type="text" name="race" placeholder="race" class="form-race form-control" id="form-race">
                                        </div>
                                        <div class="form-group">
                                            <label class="sr-only" for="form-phone-num">Phone Number</label>
                                            <input type="text" name="phone" placeholder="Phone Number" class="form-phone-num form-control" id="form-phone-num">
                                        </div>
                                        <div class="form-group">
                                            <label class="sr-only" for="form-address">Address</label>
                                            <textarea name="address" placeholder="Address"
                                                      class="form-address form-control" id="form-address"></textarea>
                                        </div>
                                    </div>
                                </fieldset>
                                <br><br>
                                <fieldset align="center">
                                    <div class="form-top">
                                        <div class="form-top-left">
                                            <h3>Step 3 / 3</h3>
                                            <p>Education:</p>
                                        </div>
                                        <div class="form-top-right">
                                            <i class="fa fa-twitter"></i>
                                        </div>
                                    </div>
                                    <div class="form-bottom">
                                        <div class="form-group">
                                            <label for="edulvl">Level of Education</label>
                                            <select name="edulvl" class="form-edu-lvl form-control" id="form-edu-lcl">
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl" value="Sijil Pelajaran Malaysia">Sijil Pelajaran Malaysia</option>
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl">Matrikulasi</option>
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl">Sijil Tinggi Pelajaran Malaysia</option>
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl">Foundation</option>
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl">Diploma</option>
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl">Bachelor's Degree</option>
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl">Master's Degree</option>
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl">Doctorate</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label class="sr-only" for="form-institution">Institution</label>
                                            <input type="text" name="insti" placeholder="Institution" class="form-institution form-control" id="form-institution">
                                        </div>
                                        <div class="form-group">
                                            <label class="sr-only" for="form-results">Grades/CGPA</label>
                                            <input type="text" name="lresult" placeholder="Grades/CGPA" class="form-results form-control" id="form-results">
                                        </div>
                                        <div class="form-group">
                                            <label for="form-google-plus">Programme to apply</label>
                                            <select name="course" class="form-edu-lvl form-control" id="form-edu-lcl">
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl" value="1001">Professional Certificate in 3D Animation</option>
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl" value="1002">Professional Certificate in Front-End Developer</option>
                                                <option class="form-edu-lvl form-control" id="form-edu-lcl" value="1003">Sijil Kemahiran Malaysia Tahap 2</option>
                                            </select>
                                        </div>
                                        <button type="submit" class="btn">apply</button>
                                        <button type="button" class="btn btn-previous">Previous</button>

                                    </div>
                                </fieldset>

                            </form>

                        </div>
                    </div>
                    <br>
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




