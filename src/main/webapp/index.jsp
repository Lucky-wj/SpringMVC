<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="command" class="com.bob.bean.UserInfo" scope="request"></jsp:useBean>
<html>
<body>
<h2>Hello World!</h2>
<a href="test/test01.do">test01</a>
<form:form method="POST" action="test/test01.do">
    <table>
        <tr>
            <td><form:label path="username">用户名：</form:label></td>
            <td><form:input path="username" /></td>
        </tr>
        <tr>
            <td><form:label path="password">密码：</form:label></td>
            <td><form:password path="password"  /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录" /></td>
        </tr>
    </table>
</form:form>
<form action="userinfo/add.do">
    <table>
        <tr>
            <td><label title="username">username</label></td>
            <td><label>
                <input name="username" type="text"/>
            </label></td>
        </tr>
        <tr>
            <td><label title="password">password</label></td>
            <td><label>
                <input name="password" type="password"/>
            </label></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"/></td>
        </tr>
    </table>
</form>
</body>
</html>