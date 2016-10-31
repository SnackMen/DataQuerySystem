<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hnmr测试页面</title>
</head>
<body>
    <div>
        <p>
            ${hnmr.top_NO}
        </p>
        <p>
            ${hnmr.top_Mhz}
        </p>
        <p>
            ${hnmr.top_gMl}
        </p>
    </div>
    <div>
        <img src="${hnmr.firstPicCdn}" alt="">
    </div>
    <div>
        <img src="${hnmr.secondPicCdn}" alt="">
    </div>
    <div>
        <p>
            ${hnmr.under_Title}
        </p>
        <p>
            ${hnmr.under_Text}
        </p>
    </div>
</body>
</html>
