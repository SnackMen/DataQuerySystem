<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.ws.spring.model.SDBSCollectionModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/custom.css">

    <script src="${pageContext.request.contextPath}/static/js/jquery-3.0.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/handledata.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/jquery.dataTables.min.css">
    <script>
        $(document).ready(function(){
            $("#fuzzy").DataTable();
        });
    </script>
</head>
<body>
<div class="row showmessage">
    <div class="col-md-9 col-md-offset-1">

        <form:form method="post" action="" modelAttribute="" id="postForm">
            <table  id="fuzzy">
                <thead>
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
                </thead>
                <%
                    List lists= (List)request.getAttribute("formula");
                    for(int i=0;i<lists.size();i++){
                        SDBSCollectionModel list = (SDBSCollectionModel)lists.get(i);
                %>
                <tr>
                    <td><%=list.getSdbsno()%></td>
                    <td><%=list.getMole_Formula()%></td>
                    <td><%=list.getMole_Weight()%></td>
                    <td>
                        <%
                            if(!list.getMs().equals("N")){
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
                            if(!list.getCnmr().equals("N")){
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
                            if(!list.getHnmr().equals("N")){
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
                            if(!list.getIr().equals("N")){
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
                            if(!list.getRaman().equals("N")){
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
                            if(!list.getEsr().equals("N")){
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
                    <td><%=list.getCompound_Name()%></td>
                </tr>
                <%
                    }
                %>
            </table>
        </form:form>


    </div>
</div>

</body>
</html>
