<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.ws.spring.model.SDBSCollectionModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/custom.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.0.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/handledata.js"></script>
</head>
<body>
    <div class="row showmessage">
        <div class="col-md-9 col-md-offset-1">
            <form:form method="post" action="" modelAttribute="" id="postForm">
                <table class="table table-striped">
                    <tr>
                        <th>SDBS No</th>
                        <th>Molecular Formula</th>
                        <th>Molecular Weight</th>
                        <th>MS</th>
                        <th>CNMR</th>
                        <th>HNMR</th>
                        <th>IR</th>
                        <th>Raman</th>
                        <th>ESR</th>
                        <th>Compound Name</th>
                    </tr>
                    <tr>
                        <td id="id">${sdbsno.sdbsno}</td>
                        <td>${sdbsno.mole_Formula}</td>
                        <td>${sdbsno.mole_Weight}</td>
                        <td>
                            <%
                                SDBSCollectionModel sdbsCollectionModel = (SDBSCollectionModel) request.getAttribute("sdbsno");
                                if(!sdbsCollectionModel.getMs().equals("N")){
                            %>
                            <a href="#" class="atn-ms">Y</a>

                            <%
                            }else{
                            %>
                            N
                            <%
                                }
                            %>

                        </td>
                        <td>
                            <%
                                if(!sdbsCollectionModel.getCnmr().equals("N")){
                            %>
                            <a href="#" class="atn-cnmr">Y</a>
                            <%
                            }else{
                            %>
                            N
                            <%
                                }
                            %>
                        </td>
                        <td>
                            <%
                                if(!sdbsCollectionModel.getHnmr().equals("N")){
                            %>
                            <a href="#" class="atn-hnmr">Y</a>
                            <%
                            }else{
                            %>
                            N
                            <%
                                }
                            %>
                        </td>
                        <td>
                            <%
                                if(!sdbsCollectionModel.getIr().equals("N")){
                            %>
                            <a href="#" class="atn-ir">Y</a>
                            <%
                            }else{
                            %>
                            N
                            <%
                                }
                            %>
                        </td>
                        <td>
                            <%
                                if(!sdbsCollectionModel.getRaman().equals("N")){
                            %>
                            <a href="#" class="atn-raman">Y</a>
                            <%
                            }else{
                            %>
                            N
                            <%
                                }
                            %>
                        </td>
                        <td>
                            <%
                                if(!sdbsCollectionModel.getEsr().equals("N")){
                            %>
                            <a href="#" class="atn-esr">Y</a>
                            <%
                            }else{
                            %>
                            N
                            <%
                                }
                            %>
                        </td>
                        <td>${sdbsno.compound_Name}</td>
                    </tr>
                </table>
            </form:form>
    </div>
    </div>

</body>
</html>
