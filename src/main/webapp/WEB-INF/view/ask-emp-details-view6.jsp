<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please write your details</h2>
<br><br>
<form:form action="show_details6" modelAttribute="employee">
    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department: <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    Phone number: <from:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Which you want car:
    <br><br>
    BMW <form:radiobutton path="carBrand" value="BMW"/>
    AUDI <form:radiobutton path="carBrand" value="AUDI"/>
    SKODA <form:radiobutton path="carBrand" value="SKODA"/>
    <br><br>
    Foreign Language(s):
    EN: <form:checkbox path="languages" value="English"/>
    DE: <form:checkbox path="languages" value="Deutsch"/>
    FR: <form:checkbox path="languages" value="French"/>
    <input type="submit" value="ok">
</form:form>

</body>

</html>