<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>页面查询</title>
</head>
<body>
<div style="margin-top: 100px;margin-left: 200px ">
    <form:form method="post" action="/test" modelAttribute="dataQuery">
        SDBS NO:
        <form:input path="dataSbdsno"/>

        Molecular Formula:
        <form:input path="dataFormula" />

        <input type="submit" value="submit">
    </form:form>
</div>

</body>
</html>
