<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<html>
<body>
<h2>Hello World!</h2>
<a href="test/test01.do">test01</a>
<%--<form:form method="POST" action="/test/test01.do">--%>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <td><form:label path="name">用户名：</form:label></td>--%>
<%--            <td><form:input path="name" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td><form:label path="password">密码：</form:label></td>--%>
<%--            <td><form:password path="password"  /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td colspan="2"><input type="submit" value="登录" /></td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form:form>--%>
<form action="test/test01.do">
    <table>
        <tr>
            <td><label title="username"/></td>
            <td><input name="username" type="text"/></td>
        </tr>
        <tr>
            <td><label title="password"></label></td>
            <td><input name="password" type="password"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录" /></td>
        </tr>
    </table>
</form>
</body>
</html>
