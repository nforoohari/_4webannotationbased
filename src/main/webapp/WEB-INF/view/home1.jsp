<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        Home1.jsp:  ${my_name}
        <%System.out.println("Home1.jsp: getAttribute my_name: " + request.getAttribute("my_name"));%>
    </body>
</html>

