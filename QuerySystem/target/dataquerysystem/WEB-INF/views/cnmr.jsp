<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cnmr页面</title>
</head>
<body>
    <div>
        <p>
            ${cnmr.top_NO}
        </p>
        <p>
            ${cnmr.top_Mhz}
        </p>
        <p>
            ${cnmr.top_gMl}
        </p>
    </div>
    <div>
        <img src="${cnmr.firstPicCdn}" alt="">
    </div>
    <div>
        <img src="${cnmr.secondPicCdn}" alt="">
    </div>
    <div>
        <p>
            ${cnmr.under_Title}
        </p>
        <p>
            ${cnmr.under_Text}
        </p>
    </div>
</body>
</html>
