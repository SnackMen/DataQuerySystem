<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>页面测试</title>
</head>
<body>
<form:form method="post" action="/test" modelAttribute="dataQuery">
    SDBS NO: <form:input path="dataSbdsno"/>

    <input type="submit" value="submit">
</form:form>
</body>
</html>