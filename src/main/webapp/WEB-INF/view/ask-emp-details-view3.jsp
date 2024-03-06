<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please write your details</h2>
<br>
<br>
<form:form action="show_details3" modelAttribute="employee">
    Your name:<form:input path="name"/>
    <br>
    <br>
    Your surname:<form:input path="surname"/>
    <br>
    <br>
    Your salary:<form:input path="salary"/>
    <br>
    <br>
    Department: <form:select path="department">
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>

    <form:options items="${employee.departments}"/>

</form:select>
    <input type="submit" value="ok">

</form:form>

</body>

</html>