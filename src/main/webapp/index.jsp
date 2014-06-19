<%--
 * 
 * @author Shengzhao Li
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h3>spring-oauth works!</h3>

<p>
    <a href="${contextPath}/logout.do">Logout</a>
</p>

<div>
    操作说明:
    <ol>
        <li>
            菜单 User 是不需要Oauth 验证即可访问的, <br/>
            但菜单 Unity 与 Mobile 需要Oauth 验证后才能访问.
        </li>
        <li>
            在项目的 others目录里有 oauth_test.txt文件, 里面有测试的URL地址(包括浏览器与客户端的),
            若想访问 Unity 与 Mobile, 则先用基于浏览器的测试URL 访问,等验证通过后即可访问.
        </li>
    </ol>
</div>
<br/>
菜单
<ul>
    <li>
        <a href="${contextPath}/user/overview.htm">User</a>
    </li>
    <li>
        <a href="${contextPath}/unity/dashboard.htm">Unity</a>
    </li>
    <li>
        <a href="${contextPath}/m/dashboard.htm">Mobile</a>
    </li>
</ul>
</body>
</html>