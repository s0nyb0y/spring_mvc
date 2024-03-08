<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please write your details</h2>
<br><br>
<form:form action="show_details5" modelAttribute="employee">
    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <br><br>
    Department: <form:select path="department" items="${employee.departments}"/>
    <br><br>
    Witch car you want:
    <br><br>
    BMW <form:radiobutton path="carBrand" value="BMW"/>
    AUDI <form:radiobutton path="carBrand" value="AUDI"/>
    SKODA <form:radiobutton path="carBrand" value="SKODA"/>
    <br><br>
    Foreign Language(s):
    <br><br>
    EN: <form:checkbox path="languages" value="English"/>
    DE: <form:checkbox path="languages" value="Deutsch"/>
    FR: <form:checkbox path="languages" value="French"/>
    <br><br>
    <input type="submit" value="ok">
</form:form>

</body>

</html>