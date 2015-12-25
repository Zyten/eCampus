<%-- 
    Document   : errorPopup
    Created on : 04-Dec-2015, 14:27:14
    Author     : zyten
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GATES Academy</title>
        <!-- Favicon-->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/portal/img/favicon.ico" />

        <script>
    window.onload = function() {
       alert("Programme already exists.");
       history.back();
    }
</script>
    </head>
</html>
