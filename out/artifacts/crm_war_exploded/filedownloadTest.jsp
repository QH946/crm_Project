<%--
  Created by IntelliJ IDEA.
  User: Dale
  Date: 2022/8/12
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="jquery/jquery-1.11.1-min.js"></script>
    <title>演示文件下载</title>
    <script type="text/javascript">
        $(function () {
            //给"下载"按钮添加单击事件
            $("#fileDownloadBtn").click(function () {
                //发送文件下载的请求
                window.location.href="workbench/activity/fileDownload.do";
            });
        });
    </script>
</head>
<body>
<input type="button" value="下载" id="fileDownloadBtn">
</body>
</html>

