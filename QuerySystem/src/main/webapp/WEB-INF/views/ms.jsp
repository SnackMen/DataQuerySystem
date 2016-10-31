<%@ page import="com.ws.spring.model.MSColledtionModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ms页面测试</title>
</head>
<body>
    <p>
        ${ms.topText}
    </p>
    <%--要么利用网页连接,要么只能用本地,绝对路径行不通--%>
    <img src="${ms.picCdn}" />
    <p>
        ${ms.underText}
    </p>
</body>
</html>
