<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="../../static/css/bootstrap.css">
    <title>页面查询</title>
</head>
<body>

    <form:form method="post" action="/search" modelAttribute="dataQuery">
    <div class="row" style="margin-top: 150px;width: 1370px;">
        <%--<div class="form-group col-md-3 col-md-offset-2">--%>
            <%--<label for="dataSdbsno">SDBS NO:</label>--%>
            <%--<form:input path="dataSbdsno" id="dataSdbsno" cssClass="form-control"/>--%>
        <%--</div>--%>

        <div class="form-group col-md-5 col-md-offset-3">
            <label for="dataFormula">Molecular Formula:</label>
            <form:input path="dataFormula" id="dataFormula" cssClass="form-control"/>
            <p>C, H, then the other elements are alphabetical order, "%,*" for the wild card </p>
        </div>
        <div class="col-md-offset-9" style="margin-top: 25px;width:300px">
            <input class="btn btn-primary" type="submit" value="submit">
        </div>
    </div>


    </form:form>

</body>
</html>
